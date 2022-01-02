/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.compiler.phases;

import com.bluff.SymbolTable;
import com.bluff.expr.AddExpression;
import com.bluff.expr.ArgumentExpression;
import com.bluff.expr.AssignmentExpression;
import com.bluff.expr.BlockExpression;
import com.bluff.expr.BooleanLiteralExpression;
import com.bluff.expr.CharLiteralExpression;
import com.bluff.expr.DeclVariableInitializedExpression;
import com.bluff.expr.DeclareAndCreateArrayConstantExpression;
import com.bluff.expr.DeclareAndCreateNewArrayExpression;
import com.bluff.expr.DeclareArrayAndAssignExpression;
import com.bluff.expr.DeclareArrayExpression;
import com.bluff.expr.DeclareVariableExpression;
import com.bluff.expr.ElseExpression;
import com.bluff.expr.EquExpression;
import com.bluff.expr.FactorExpression;
import com.bluff.expr.FloatLiteralExpression;
import com.bluff.expr.IdentifierExpression;
import com.bluff.expr.IfExpression;
import com.bluff.expr.IntegeralLiteralExpression;
import com.bluff.expr.MethodCallExpression;
import com.bluff.expr.MethodDeclarationExpression;
import com.bluff.expr.ParameterExpression;
import com.bluff.expr.RelExpression;
import com.bluff.expr.ReturnExpression;
import com.bluff.expr.StatementExpression;
import com.bluff.expr.StatementListExpression;
import com.bluff.expr.StringLiteralExpression;
import com.bluff.expr.TermExpression;
import com.bluff.expr.WhileExpression;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.Token;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import static org.objectweb.asm.Opcodes.ACC_PUBLIC;
import static org.objectweb.asm.Opcodes.ACC_STATIC;
import static org.objectweb.asm.Opcodes.V1_8;
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
    Label endMark;
    String currentMethodName = "";

    public ByteCodeGenerator(String className, SymbolTable table) {
        cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        this.gtable = table;
        cw.visit(V1_8, ACC_PUBLIC, className, null, "java/lang/Object", null);
        this.className = className;
        this.endMark = new Label();
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
        if (ie.lengthSelector) {
            this.currentAdapter.loadLocal(this.offset(symbol));
            this.currentAdapter.arrayLength();
            return "int";
        } else if (ie.arraySelector != null) {
            this.currentAdapter.loadLocal(this.offset(symbol));
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
                    default:
                        break;
                }
            }
        } else {
            if (symbol.extra != null) {
                if (symbol.extra.equals("arg")) {
                    this.currentAdapter.loadArg(symbol.lidx);
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

    public Object visit(AddExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        aThis.initializer.accept(this);
        this.currentAdapter.storeArg(this.offset(symbol));
        return null;
    }

    public Object visit(BlockExpression aThis) {
        aThis.statements.forEach((e) -> {
            e.accept(this);
        });
        return null;
    }

    public Object visit(DeclVariableInitializedExpression aThis) {
        SymbolTable.Symbol symbol = gtable.getSymbol(aThis.identifier);
        aThis.initialize.accept(this);
        if (null != aThis.type) {
            switch (aThis.type) {
                case "int":
                    this.currentAdapter.newLocal(Type.INT_TYPE);
                    this.currentAdapter.storeLocal(this.offset(symbol), Type.INT_TYPE);
                    break;
                case "string":
                    this.currentAdapter.newLocal(Type.getType(String.class));
                    this.currentAdapter.storeLocal(this.offset(symbol), Type.getType(String.class));
                    break;
                case "float":
                    this.currentAdapter.newLocal(Type.FLOAT_TYPE);
                    this.currentAdapter.storeLocal(this.offset(symbol), Type.FLOAT_TYPE);
                    break;
                case "char":
                    this.currentAdapter.newLocal(Type.CHAR_TYPE);
                    this.currentAdapter.storeLocal(this.offset(symbol), Type.CHAR_TYPE);
                    break;
                case "bool":
                    this.currentAdapter.newLocal(Type.BOOLEAN_TYPE);
                    this.currentAdapter.storeLocal(this.offset(symbol), Type.BOOLEAN_TYPE);
                default:
                    break;
            }
        }
        return null;
    }

    public Object visit(DeclareAndCreateArrayConstantExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
                    this.currentAdapter.newArray(Type.FLOAT_TYPE);
                    this.currentAdapter.storeLocal(this.offset(symbol));
                    break;
                default:
                    break;
            }
        }
        return null;
    }

    public Object visit(DeclareArrayAndAssignExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object visit(DeclareArrayExpression aThis) {
        try {
            throw new Exception("Uninitialized variable:"
                    + aThis.identifier.getText()
                    + ",at line:"+aThis.identifier.getLine()+",column:"
                    +aThis.identifier.getCharPositionInLine());
        } catch (Exception ex) {
            Logger.getLogger(ByteCodeGenerator.class.getName()).log(Level.INFO, null, ex);
        }
        return null;
    }

    public Object visit(DeclareVariableExpression aThis)  {
        try {
            throw new Exception("Uninitialized variable:"
                    + aThis.identifier.getText()
                    + ",at line:"+aThis.identifier.getLine()+",column:"
                    +aThis.identifier.getCharPositionInLine());
        } catch (Exception ex) {
            Logger.getLogger(ByteCodeGenerator.class.getName()).log(Level.INFO, null, ex);
        }
        return null;
    }

    public Object visit(ElseExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object visit(EquExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object visit(FactorExpression aThis) {
        return null;
    }

    public Object visit(IfExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object visit(MethodCallExpression aThis) {
        Token identifier = aThis.identifier;
        if (identifier.getText().equals("println")) {
            this.currentAdapter.getStatic(Type.getType(System.class), "out", Type.getType(PrintStream.class));
            ArrayList<Object> accept = (ArrayList<Object>) aThis.args.accept(this);
            this.currentAdapter.invokeVirtual(Type.getType(PrintStream.class),
                    Method.getMethod("void println (" + accept.get(0) + ")"));
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
            if (aThis.lengthSelector){
                this.currentAdapter.arrayLength();
                return "int";
            }else if(aThis.arraySelector!=null){
                aThis.arraySelector.accept(this);
                String tip=Type.getType(m.getReturnType().getClassName()
                        .replace("[", "").replace("]", "")).toString();
                if (null != tip)switch (tip) {
                    case "int":
                        this.currentAdapter.arrayLoad(Type.INT_TYPE);
                        break;
                    case "char":
                        this.currentAdapter.arrayLoad(Type.CHAR_TYPE);
                        break;
                    case "float":
                        this.currentAdapter.arrayLoad(Type.FLOAT_TYPE);
                        break;
                    default:
                        break;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(className + ".class"))) {
                bos.write(cw.toByteArray());
                bos.flush();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ByteCodeGenerator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ByteCodeGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Object visit(TermExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object visit(WhileExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object visit(MethodDeclarationExpression aThis) {
        SymbolTable.Symbol symbol = gtable.getSymbol(aThis.identifier);
        if (symbol.id.getText().equals("main") && symbol.type.equals("(void)")) {
            this.currentMethodName = "main";
            //Main Function Generator
            Method m = Method.getMethod("void main (String[])");
            this.currentAdapter = new GeneratorAdapter(GEN_FLAG, m, null, null, cw);
            this.gtable = aThis.table;
            if (aThis.parameters != null) {
                aThis.parameters.accept(this);
            }
            aThis.body.accept(this);

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
            this.currentAdapter.returnValue();
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

}
