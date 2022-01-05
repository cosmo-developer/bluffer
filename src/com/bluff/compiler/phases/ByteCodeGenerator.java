/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.compiler.phases;

import com.bluff.SymbolTable;
import com.bluff.expr.*;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.Token;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import static org.objectweb.asm.Opcodes.ACC_PUBLIC;
import static org.objectweb.asm.Opcodes.ACC_STATIC;
import static org.objectweb.asm.Opcodes.V1_8;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.commons.GeneratorAdapter;
import org.objectweb.asm.commons.Method;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class ByteCodeGenerator {

    GeneratorAdapter currentAdapter;
    ClassWriter cw;
    SymbolTable gtable;
    final int GEN_FLAG = ACC_PUBLIC + ACC_STATIC;
    final String className;
    String currentMethodName = "";
    Stack<Expression> currentBuilding;
    final File wholeFile;

    public ByteCodeGenerator(String className,File wholeFile, SymbolTable table) {
        cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        this.gtable = table;
        cw.visit(V1_8, ACC_PUBLIC, className, null, "java/lang/Object", null);
        this.className = className;
        this.currentBuilding = new Stack();
        this.wholeFile=wholeFile;
    }

    public int offset(SymbolTable.Symbol sym) {
        if (this.currentMethodName.equals("main")) {
            return sym.lidx + 1;
        } else {
            return sym.lidx;
        }
    }

    public static String performEscaping(String anyliteral, byte[] source, int curpos, int line, int col) {

        String result = anyliteral
                .replace("\\n", "\n")
                .replace("\\b", "\b")
                .replace("\\r", "\r")
                .replace("\\f", "\f")
                .replace("\\\"", "\"")
                .replace("\\\\", "\\");
        if (anyliteral.charAt(0) == '\'') {
            result = result.replace("\\'", "'");
        }
        return result.substring(1, result.length() - 1);
    }

    public Object visit(StringLiteralExpression se) {
        String escaped = performEscaping(se.value, null, 0, 0, 0);
        this.currentAdapter.push(escaped);
        return "String";
    }

    public Object visit(BooleanLiteralExpression be) {
        this.currentAdapter.push(be.value);
        return "boolean";
    }

    public Object visit(IdentifierExpression ie) {
        Token identifier = ie.identifier;
        SymbolTable.Symbol symbol = gtable.getSymbol(identifier);
        symbol.extra = symbol.extra == null ? "" : symbol.extra;
        if (ie.lengthSelector) {
            if (!symbol.extra.equals("arg")) {
                this.currentAdapter.loadLocal(this.offset(symbol));
            } else {
                this.currentAdapter.loadArg(this.offset(symbol));
            }
            if (!symbol.type.equals("string")) {
                this.currentAdapter.arrayLength();
            } else {
                this.currentAdapter.invokeVirtual(Type.getType(String.class),
                        Method.getMethod("int length()")
                );
            }
            return "int";
        } else if (ie.arraySelector != null) {
            if (!symbol.extra.equals("arg")) {
                this.currentAdapter.loadLocal(this.offset(symbol));
            } else {
                this.currentAdapter.loadArg(this.offset(symbol));
            }
            ie.arraySelector.accept(this);
            if (null != symbol.type) {
                switch (symbol.type) {
                    case "int[]":
                        this.currentAdapter.arrayLoad(Type.INT_TYPE);
                        break;
                    case "float[]":
                        this.currentAdapter.arrayLoad(Type.FLOAT_TYPE);
                        break;
                    case "char[]":
                        this.currentAdapter.arrayLoad(Type.CHAR_TYPE);
                        break;
                    case "string":
                        this.currentAdapter.invokeVirtual(Type.getType(String.class),
                                Method.getMethod("char charAt(int)")
                        );
                        return "char";
                    default:
                        break;
                }
            }
            return symbol.type.replace("[", "").replace("]", "");
        } else {
            if (symbol.extra != null) {
                if (symbol.extra.equals("arg")) {
                    this.currentAdapter.loadArg(this.offset(symbol));
                } else {
                    this.currentAdapter.loadLocal(this.offset(symbol));
                }
            } else {
                this.currentAdapter.loadLocal(this.offset(symbol));
            }
        }
        return symbol.type.equals("string") ? "String" : symbol.type;
    }

    public Object visit(FloatLiteralExpression fe) {
        this.currentAdapter.push(fe.value);
        return "float";
    }

    public Object visit(IntegeralLiteralExpression ie) {
        this.currentAdapter.push(ie.value);
        return "int";
    }

    public Object visit(CharLiteralExpression ce) {
        this.currentAdapter.push((byte) ce.value);
        return "char";
    }

    public Type getType(String type) {
        switch (type) {
            case "void":
                return Type.VOID_TYPE;
            case "int":
                return Type.INT_TYPE;
            case "float":
                return Type.FLOAT_TYPE;
            case "float[]":
                return Type.getType(float[].class);
            case "char":
                return Type.CHAR_TYPE;
            case "bool":
                return Type.BOOLEAN_TYPE;
            case "boolean":
                return Type.BOOLEAN_TYPE;
            case "string":
                return Type.getType(String.class);
            case "String":
                return Type.getType(String.class);
            case "int[]":
                return Type.getType(int[].class);
            case "char[]":
                return Type.getType(char[].class);
            default:
                return null;
        }
    }

    public Object visit(AddExpression aThis) {
        int ctx = 0;
        Object accept = aThis.exps.get(ctx++).accept(this);
        for (String operation : aThis.operators) {
            Object accept1 = aThis.exps.get(ctx++).accept(this);
            if ("+".equals(operation)) {
                this.currentAdapter.math(Opcodes.IADD, getType((String) accept));
            } else if ("-".equals(operation)) {
                this.currentAdapter.math(Opcodes.ISUB, getType((String) accept));
            }
        }
        return accept;
    }

    public Object visit(ArgumentExpression aThis) {
        ArrayList<Object> types = new ArrayList<>();
        aThis.arguments.forEach((ex) -> {
            String type = (String) ex.accept(this);
            types.add(type.equals("bool") ? "boolean" : type.equals("string") ? "String" : type);
        });
        return types;
    }

    public Object visit(AssignmentExpression aThis) {
        Token identifier = aThis.identifier;
        SymbolTable.Symbol symbol = gtable.getSymbol(identifier);
        symbol.extra = symbol.extra == null ? "" : symbol.extra;
        if (symbol.extra != null) {
            if (aThis.arraySelector == null) {
                aThis.initializer.accept(this);
                if (symbol.extra.equals("arg")) {
                    this.currentAdapter.storeArg(this.offset(symbol));
                } else {
                    this.currentAdapter.storeLocal(this.offset(symbol));
                }
            } else {
                if (symbol.extra.equals("arg")) {
                    this.currentAdapter.loadArg(this.offset(symbol));
                    aThis.arraySelector.accept(this);
                    aThis.initializer.accept(this);
                    this.currentAdapter.arrayStore(getType(symbol.type.replace("[]", "")));
                } else {
                    this.currentAdapter.loadLocal(this.offset(symbol));
                    aThis.arraySelector.accept(this);
                    aThis.initializer.accept(this);
                    this.currentAdapter.arrayStore(getType(symbol.type.replace("[]", "")));
                }
            }
        }
        return null;
    }

    public Object visit(BlockExpression aThis) {
        Object f = null;

        for (Expression e : aThis.statements) {
            f = e.accept(this);
        }
        return f;
    }

    public Object visit(DeclVariableInitializedExpression aThis) {
        SymbolTable.Symbol symbol = gtable.getSymbol(aThis.identifier);
        aThis.initialize.accept(this);
        if (null != aThis.type) {
            this.currentAdapter.newLocal(getType(symbol.type));
            this.currentAdapter.storeLocal(this.offset(symbol), getType(symbol.type));
        }
        return null;
    }

    public Object visit(DeclareAndCreateArrayConstantExpression aThis) {
        Token identifier = aThis.identifier;
        SymbolTable.Symbol symbol = gtable.getSymbol(identifier);
        this.currentAdapter.push(aThis.intiailizers.size());
        int newLocal = this.currentAdapter.newLocal(getType(aThis.arrayType + "[]"));
        this.currentAdapter.newArray(getType(aThis.arrayType));
        int idx = 0;
        for (Expression e : aThis.intiailizers) {
            this.currentAdapter.dup();
            this.currentAdapter.push(idx++);
            e.accept(this);
            this.currentAdapter.arrayStore(getType(aThis.arrayType));
        }
        this.currentAdapter.storeLocal(this.offset(symbol));
//        System.exit(-1);
        return null;
    }

    public Object visit(DeclareAndCreateNewArrayExpression aThis) {
        Token identifier = aThis.identifier;
        SymbolTable.Symbol symbol = gtable.getSymbol(identifier);
        aThis.size.accept(this);
        if (null != symbol.type) {
            switch (symbol.type) {
                case "int[]":
                    this.currentAdapter.newLocal(Type.getType(int[].class));
                    this.currentAdapter.newArray(Type.INT_TYPE);
                    this.currentAdapter.storeLocal(this.offset(symbol));
                    break;
                case "float[]":
                    this.currentAdapter.newLocal(Type.getType(float[].class));
                    this.currentAdapter.newArray(Type.FLOAT_TYPE);
                    this.currentAdapter.storeLocal(this.offset(symbol));
                    break;
                case "char[]":
                    this.currentAdapter.newLocal(Type.getType(char[].class));
                    this.currentAdapter.newArray(Type.CHAR_TYPE);
                    this.currentAdapter.storeLocal(this.offset(symbol));
                    break;
                default:
                    break;
            }
        }
        return null;
    }

    public Object visit(DeclareArrayAndAssignExpression aThis) {
        Token identifier = aThis.identifier;
        SymbolTable.Symbol symbol = gtable.getSymbol(identifier);
        this.currentAdapter.newLocal(getType(aThis.arrayType + "[]"));
        aThis.initializer.accept(this);
        this.currentAdapter.storeLocal(this.offset(symbol));
        return null;
    }

    public Object visit(DeclareArrayExpression aThis) {
        try {
            throw new Exception("Uninitialized variable:"
                    + aThis.identifier.getText()
                    + ",at line:" + aThis.identifier.getLine() + ",column:"
                    + aThis.identifier.getCharPositionInLine());
        } catch (Exception ex) {
            Logger.getLogger(ByteCodeGenerator.class.getName()).log(Level.INFO, null, ex);
        }
        return null;
    }

    public Object visit(DeclareVariableExpression aThis) {
        try {
            throw new Exception("Uninitialized variable:"
                    + aThis.identifier.getText()
                    + ",at line:" + aThis.identifier.getLine() + ",column:"
                    + aThis.identifier.getCharPositionInLine());
        } catch (Exception ex) {
            Logger.getLogger(ByteCodeGenerator.class.getName()).log(Level.INFO, null, ex);
        }
        return null;
    }

    public Object visit(ElseExpression aThis) {
        this.currentAdapter.visitLabel(aThis.start);
        aThis.expression.accept(this);
        this.currentAdapter.visitLabel(aThis.end);
        return null;
    }

    public Object visit(EquExpression aThis) {
        int ctx = 0;
        Object accept = aThis.exps.get(ctx++).accept(this);
        for (String operation : aThis.operators) {
            Label start = new Label();
            Label divider = new Label();
            Label end = new Label();
            Object accept1 = aThis.exps.get(ctx++).accept(this);
            if ("==".equals(operation)) {
                this.currentAdapter.visitLabel(start);
                this.currentAdapter.ifCmp(getType((String) accept), Opcodes.IFEQ, divider);
                this.currentAdapter.push(false);
                this.currentAdapter.goTo(end);
                this.currentAdapter.visitLabel(divider);
                this.currentAdapter.push(true);
                this.currentAdapter.visitLabel(end);
            } else if ("!=".equals(operation)) {
                this.currentAdapter.visitLabel(start);
                this.currentAdapter.ifCmp(getType((String) accept), Opcodes.IFNE, divider);
                this.currentAdapter.push(false);
                this.currentAdapter.goTo(end);
                this.currentAdapter.visitLabel(divider);
                this.currentAdapter.push(true);
                this.currentAdapter.visitLabel(end);
            }
        }
        return "boolean";
    }

    public Object visit(FactorExpression aThis) {
        Object accept = aThis.anyOne.accept(this);
        if (accept != null) {
            if ("int".equals(accept)) {
                if (aThis.unaryOperator.equals("-")) {
                    this.currentAdapter.push(-1);
                } else {
                    this.currentAdapter.push(1);
                }
            } else if ("float".equals(accept)) {
                if (aThis.unaryOperator.equals("-")) {
                    this.currentAdapter.push(-1.0f);
                } else {
                    this.currentAdapter.push(1.0f);
                }
            } else if ("char".equals(accept)) {
                if (aThis.unaryOperator.equals("-")) {
                    this.currentAdapter.push(-1);
                } else {
                    this.currentAdapter.push(1);
                }
            }
            this.currentAdapter.math(Opcodes.IMUL, getType((String) accept));
        }
//        System.exit(0);
        return accept;
    }

    //Here is stack required to handle if expression
    public Object visit(IfExpression aThis) {
        this.currentAdapter.visitLabel(aThis.start);
        ElseExpression elsee = (ElseExpression) aThis.elseExpression;
        aThis.condition.accept(this);
        this.currentAdapter.push(true);
        if (!aThis.elseIfExpression.isEmpty()) {
            this.currentAdapter.ifICmp(Opcodes.IFNE, aThis.elseIfExpression.get(0).start);
        } else if (elsee != null) {
            this.currentAdapter.ifICmp(Opcodes.IFNE, elsee.start);
        } else {
            this.currentAdapter.ifICmp(Opcodes.IFNE, aThis.end);
        }
        aThis.statement.accept(this);
        this.currentAdapter.goTo(aThis.end);
        if (!aThis.elseIfExpression.isEmpty()) {
            aThis.elseIfExpression.forEach((eie) -> {
                eie.accept(this);
            });
        }
        if (aThis.elseExpression != null) {
            aThis.elseExpression.accept(this);
        }
        this.currentAdapter.visitLabel(aThis.end);
        return null;
    }

    public Object visit(MethodCallExpression aThis) {
        Token identifier = aThis.identifier;
        if (identifier.getText().equals("println")) {
            this.currentAdapter.getStatic(Type.getType(System.class), "out", Type.getType(PrintStream.class));
            ArrayList<Object> accept = (ArrayList<Object>) aThis.args.accept(this);
            this.currentAdapter.invokeVirtual(Type.getType(PrintStream.class),
                    Method.getMethod("void println (" + accept.get(0) + ")"));
            return "int";
        } else if (identifier.getText().equals("print")) {
            this.currentAdapter.getStatic(Type.getType(System.class), "out", Type.getType(PrintStream.class));
            ArrayList<Object> accept = (ArrayList<Object>) aThis.args.accept(this);
            this.currentAdapter.invokeVirtual(Type.getType(PrintStream.class),
                    Method.getMethod("void print (" + accept.get(0) + ")"));
            return "int";
        } else {
            SymbolTable.Symbol symbol = gtable.getSymbol(aThis.identifier);
            String[] split = symbol.type.split(";");
            String argtypes = "";
            for (int i = 0; i < split.length - 1; i++) {
                argtypes += split[i];
                if (i < split.length - 2) {
                    argtypes += ",";
                }
            }
            argtypes = "(" + argtypes + ")";
            argtypes = split[split.length - 1].replace("(", "").replace(")", "") + " " + symbol.id.getText() + " " + argtypes;
            aThis.args.accept(this);
            Method m = Method.getMethod(argtypes.replace("bool", "boolean").replace("string", "String"));
            this.currentAdapter.invokeStatic(Type.getType(this.className),
                    m);
            if (aThis.lengthSelector) {
                String tip = Type.getType(m.getReturnType().getClassName()
                        .replace("[", "").replace("]", "")).toString();
                if (!tip.equals("java.lang.String")) {
                    this.currentAdapter.arrayLength();
                } else {
                    this.currentAdapter.invokeVirtual(Type.getType(String.class),
                            Method.getMethod("int length()")
                    );
                }

                return "int";
            } else if (aThis.arraySelector != null) {
                aThis.arraySelector.accept(this);
                String tip = Type.getType(m.getReturnType().getClassName()
                        .replace("[", "").replace("]", "")).toString();
                System.out.println("rEturn type:" + tip);
                if (null != tip) {
                    switch (tip) {
                        case "int":
                            this.currentAdapter.arrayLoad(Type.INT_TYPE);
                            break;
                        case "char":
                            this.currentAdapter.arrayLoad(Type.CHAR_TYPE);
                            break;
                        case "float":
                            this.currentAdapter.arrayLoad(Type.FLOAT_TYPE);
                            break;
                        case "java.lang.String":
                            this.currentAdapter.invokeVirtual(Type.getType(String.class),
                                    Method.getMethod("char charAt(int)")
                            );
                            return "char";
                        default:
                            break;
                    }
                }
                return m.getReturnType().getClassName();
            }
            return m.getReturnType().getClassName();
        }
    }

    public Object visit(ParameterExpression aThis) {
        return null;
    }

    public Object visit(RelExpression aThis) {
        int ctx = 0;
        Object accept = aThis.exps.get(ctx++).accept(this);
        for (String operation : aThis.operators) {
            Label start = new Label();
            Label divider = new Label();
            Label end = new Label();
            Object accept1 = aThis.exps.get(ctx++).accept(this);
            if (null != operation) {
                switch (operation) {
                    case "<":
                        this.currentAdapter.visitLabel(start);
                        this.currentAdapter.ifCmp(getType((String) accept), Opcodes.IFLT, divider);
                        this.currentAdapter.push(false);
                        this.currentAdapter.goTo(end);
                        this.currentAdapter.visitLabel(divider);
                        this.currentAdapter.push(true);
                        this.currentAdapter.visitLabel(end);
                        break;
                    case ">":
                        this.currentAdapter.visitLabel(start);
                        this.currentAdapter.ifCmp(getType((String) accept), Opcodes.IFGT, divider);
                        this.currentAdapter.push(false);
                        this.currentAdapter.goTo(end);
                        this.currentAdapter.visitLabel(divider);
                        this.currentAdapter.push(true);
                        this.currentAdapter.visitLabel(end);
                        break;
                    case ">=":
                        this.currentAdapter.visitLabel(start);
                        this.currentAdapter.ifCmp(getType((String) accept), Opcodes.IFGE, divider);
                        this.currentAdapter.push(false);
                        this.currentAdapter.goTo(end);
                        this.currentAdapter.visitLabel(divider);
                        this.currentAdapter.push(true);
                        this.currentAdapter.visitLabel(end);
                        break;
                    case "<=":
                        this.currentAdapter.visitLabel(start);
                        this.currentAdapter.ifCmp(getType((String) accept), Opcodes.IFLE, divider);
                        this.currentAdapter.push(false);
                        this.currentAdapter.goTo(end);
                        this.currentAdapter.visitLabel(divider);
                        this.currentAdapter.push(true);
                        this.currentAdapter.visitLabel(end);
                        break;
                    default:
                        break;
                }
            }
        }
        return "boolean";
    }

    public Object visit(StatementExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object visit(StatementListExpression aThis) {
        aThis.statements.forEach((mde) -> {
            mde.accept(this);
        });
        cw.visitEnd();
        try {
            String fileformation=wholeFile.getParent()==null?"":wholeFile.getParent()+"/";
            System.out.println(fileformation);
            try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(
                    fileformation+className+".class"))) {
                
                bos.write(cw.toByteArray());
                bos.flush();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ByteCodeGenerator.class.getName()).log(Level.FINEST, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ByteCodeGenerator.class.getName()).log(Level.FINEST, null, ex);
        }
        return null;
    }

    public Object visit(TermExpression aThis) {
        int ctx = 0;
        Object accept = aThis.exps.get(ctx++).accept(this);
        for (String operation : aThis.operators) {
            Object accept1 = aThis.exps.get(ctx++).accept(this);
            if ("*".equals(operation)) {
                this.currentAdapter.math(Opcodes.IMUL, getType((String) accept));
            } else if ("/".equals(operation)) {
                this.currentAdapter.math(Opcodes.IDIV, getType((String) accept));
            }
        }
        return accept;
    }

    public Object visit(WhileExpression aThis) {
        this.currentAdapter.visitLabel(aThis.start);
        aThis.condition.accept(this);
        this.currentAdapter.push(true);
        this.currentAdapter.ifICmp(Opcodes.IFNE, aThis.end);
        aThis.statement.accept(this);
        this.currentAdapter.goTo(aThis.start);
        this.currentAdapter.visitLabel(aThis.end);
        return null;
    }

    public Object visit(MethodDeclarationExpression aThis) {
        SymbolTable.Symbol symbol = gtable.getSymbol(aThis.identifier);
        if (symbol.id.getText().equals("main") && symbol.type.equals("(void)")) {
            this.currentMethodName = "main";
            //Main Function Generator
            Method m = Method.getMethod("void main (String[])");
            this.currentAdapter = new GeneratorAdapter(GEN_FLAG, m, null, null, cw);
            this.gtable = aThis.table;
            this.currentAdapter.visitLabel(aThis.start);
            if (aThis.parameters != null) {
                aThis.parameters.accept(this);
            }
            aThis.body.accept(this);
            this.currentAdapter.visitLabel(aThis.end);
            this.gtable = this.gtable.parent;
            this.currentAdapter.returnValue();
            this.currentAdapter.endMethod();
        } else {
            this.currentMethodName = "";
            String[] split = symbol.type.split(";");
            String argtypes = "";
            for (int i = 0; i < split.length - 1; i++) {
                argtypes += split[i];
                if (i < split.length - 2) {
                    argtypes += ",";
                }
            }
            argtypes = "(" + argtypes + ")";
            argtypes = split[split.length - 1].replace("(", "").replace(")", "") + " " + symbol.id.getText() + " " + argtypes;
            Method m = Method.getMethod(argtypes.replace("bool", "boolean").replace("string", "String"));
            this.currentAdapter = new GeneratorAdapter(GEN_FLAG, m, null, null, cw);
            this.gtable = aThis.table;
            if (aThis.parameters != null) {
                aThis.parameters.accept(this);
            }
            aThis.body.accept(this);
            this.gtable = this.gtable.parent;
            if (split[split.length - 1].equals("(void)")) {
                this.currentAdapter.returnValue();
            }
            this.currentAdapter.endMethod();
        }

        return null;
    }

    public Object visit(ReturnExpression aThis) {
        if (aThis.toReturn != null) {
            aThis.toReturn.accept(this);
            this.currentAdapter.returnValue();
        } else {
            this.currentAdapter.returnValue();
        }
        return null;
    }

    public Object visit(ParExpression aThis) {

        return aThis.exp.accept(this);
    }

    public Object visit(ElseIfExpression aThis) {
        this.currentAdapter.visitLabel(aThis.start);
        aThis.condition.accept(this);
        this.currentAdapter.push(true);

        if (aThis.parent.elseIfExpression.indexOf(aThis) == aThis.parent.elseIfExpression.size() - 1) {
            if (aThis.parent.elseExpression != null) {
                ElseExpression ee = (ElseExpression) aThis.parent.elseExpression;
                this.currentAdapter.ifICmp(Opcodes.IFNE, ee.start);
            } else {
                this.currentAdapter.ifICmp(Opcodes.IFNE, aThis.parent.end);
            }
        } else {
            Label nextElseIfLabel = aThis.parent.elseIfExpression.get(
                    aThis.parent.elseIfExpression.indexOf(aThis) + 1
            ).start;
            this.currentAdapter.ifICmp(Opcodes.IFNE, nextElseIfLabel);
        }
        aThis.statement.accept(this);
        this.currentAdapter.goTo(aThis.parent.end);
        this.currentAdapter.visitLabel(aThis.end);
        return null;
    }

}
