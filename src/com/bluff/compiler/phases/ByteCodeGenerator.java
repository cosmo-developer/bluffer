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
import com.bluff.expr.CharLiteralExpression;
import com.bluff.expr.DeclVariableInitializedExpression;
import com.bluff.expr.DeclareAndCreateArrayConstantExpression;
import com.bluff.expr.DeclareAndCreateNewArrayExpression;
import com.bluff.expr.DeclareArrayAndAssignExpression;
import com.bluff.expr.DeclareArrayExpression;
import com.bluff.expr.DeclareVariableExpression;
import com.bluff.expr.ElseExpression;
import com.bluff.expr.EquExpression;
import com.bluff.expr.Expression;
import com.bluff.expr.FactorExpression;
import com.bluff.expr.FloatLiteralExpression;
import com.bluff.expr.IdentifierExpression;
import com.bluff.expr.IfExpression;
import com.bluff.expr.IntegeralLiteralExpression;
import com.bluff.expr.MethodCallExpression;
import com.bluff.expr.MethodDeclarationExpression;
import com.bluff.expr.ParameterExpression;
import com.bluff.expr.RelExpression;
import com.bluff.expr.StatementExpression;
import com.bluff.expr.StatementListExpression;
import com.bluff.expr.StringLiteralExpression;
import com.bluff.expr.TermExpression;
import com.bluff.expr.WhileExpression;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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

    public ByteCodeGenerator(String className, SymbolTable table) {
        cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        this.gtable = table;
        cw.visit(V1_8, ACC_PUBLIC, className, null, "java/lang/Object", null);
        this.className = className;
        this.endMark = new Label();
    }

    public Object visit(Expression exp) {
        if (exp instanceof AddExpression) {
            return this.visit((AddExpression) exp);
        } else if (exp instanceof AssignmentExpression) {
            return this.visit((AssignmentExpression) exp);
        } else if (exp instanceof BlockExpression) {
            return this.visit((BlockExpression) exp);
        } else if (exp instanceof DeclareVariableExpression) {
            return this.visit((DeclareVariableExpression) exp);
        } else if (exp instanceof DeclVariableInitializedExpression) {
            return this.visit((DeclVariableInitializedExpression) exp);
        } else if (exp instanceof DeclareAndCreateArrayConstantExpression) {
            return this.visit((DeclareAndCreateArrayConstantExpression) exp);
        } else if (exp instanceof DeclareAndCreateNewArrayExpression) {
            return this.visit((DeclareAndCreateNewArrayExpression) exp);
        } else if (exp instanceof DeclareArrayAndAssignExpression) {
            return this.visit((DeclareArrayAndAssignExpression) exp);
        } else if (exp instanceof DeclareArrayExpression) {
            return this.visit((DeclareArrayExpression) exp);
        } else if (exp instanceof ElseExpression) {
            return this.visit((ElseExpression) exp);
        } else if (exp instanceof EquExpression) {
            return this.visit((EquExpression) exp);
        } else if (exp instanceof FactorExpression) {
            return this.visit((FactorExpression) exp);
        } else if (exp instanceof IfExpression) {
            return this.visit((IfExpression) exp);
        } else if (exp instanceof MethodCallExpression) {
            return this.visit((MethodCallExpression) exp);
        } else if (exp instanceof MethodDeclarationExpression) {
            return this.visit((MethodDeclarationExpression) exp);
        } else if (exp instanceof ParameterExpression) {
            return this.visit((ParameterExpression) exp);
        } else if (exp instanceof RelExpression) {
            return this.visit((RelExpression) exp);
        } else if (exp instanceof StatementExpression) {
            return this.visit((StatementExpression) exp);
        } else if (exp instanceof StatementListExpression) {
            return this.visit((StatementListExpression) exp);
        } else if (exp instanceof TermExpression) {
            return this.visit((TermExpression) exp);
        } else if (exp instanceof WhileExpression) {
            return this.visit((WhileExpression) exp);
        } else if (exp instanceof StringLiteralExpression) {
            return this.visit((StringLiteralExpression) exp);
        } else if (exp instanceof FloatLiteralExpression) {
            return this.visit((FloatLiteralExpression) exp);
        } else if (exp instanceof IntegeralLiteralExpression) {
            return this.visit((IntegeralLiteralExpression) exp);
        } else if (exp instanceof CharLiteralExpression) {
            return this.visit((CharLiteralExpression) exp);
        }

        return null;
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
        return result;
    }

    public Object visit(StringLiteralExpression se) {
        String escaped = performEscaping(se.value, null, 0, 0, 0);
        this.currentAdapter.push(escaped);
        return null;
    }

    public Object visit(IdentifierExpression ie) {
        Token identifier = ie.identifier;
        SymbolTable.Symbol symbol = gtable.getSymbol(identifier);
        if (ie.lengthSelector) {
            this.currentAdapter.loadLocal(symbol.lidx);
            this.currentAdapter.arrayLength();
        } else if (ie.arraySelector != null) {
            this.currentAdapter.loadLocal(symbol.lidx);
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
                    this.currentAdapter.loadLocal(symbol.lidx);
                }
            } else {
                this.currentAdapter.loadLocal(symbol.lidx);
            }
        }
        return null;
    }

    public Object visit(FloatLiteralExpression fe) {
        this.currentAdapter.push(fe.value);
        return null;
    }

    public Object visit(IntegeralLiteralExpression ie) {
        this.currentAdapter.push(ie.value);
        return null;
    }

    public Object visit(CharLiteralExpression ce) {
        this.currentAdapter.push((byte) ce.value);
        return null;
    }

    public Object visit(AddExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object visit(ArgumentExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object visit(AssignmentExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object visit(BlockExpression aThis) {
        aThis.statements.forEach((e) -> {
            this.visit(e);
        });
        return null;
    }

    public Object visit(DeclVariableInitializedExpression aThis) {
        SymbolTable.Symbol symbol = gtable.getSymbol(aThis.identifier);
        aThis.initialize.accept(this);
        System.out.println(symbol.lidx);
        if (null != aThis.type) {
            switch (aThis.type) {
                case "int":
                    this.currentAdapter.newLocal(Type.INT_TYPE);
                    this.currentAdapter.storeLocal(symbol.lidx, Type.INT_TYPE);
                    break;
                case "string":
                    System.out.println(this.currentAdapter.newLocal(Type.getType(String.class)));
                    this.currentAdapter.storeLocal(symbol.lidx, Type.getType(String.class));
                    break;
                case "float":
                    this.currentAdapter.newLocal(Type.FLOAT_TYPE);
                    this.currentAdapter.storeLocal(symbol.lidx, Type.FLOAT_TYPE);
                    break;
                case "char":
                    this.currentAdapter.newLocal(Type.CHAR_TYPE);
                    this.currentAdapter.storeLocal(symbol.lidx, Type.CHAR_TYPE);
                    break;
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
                    this.currentAdapter.storeLocal(symbol.lidx);
                    break;
                case "float[]":
                    this.currentAdapter.newLocal(Type.getType(float[].class));
                    this.currentAdapter.newArray(Type.FLOAT_TYPE);
                    this.currentAdapter.storeLocal(symbol.lidx);
                    break;
                case "char[]":
                    this.currentAdapter.newLocal(Type.getType(char[].class));
                    this.currentAdapter.newArray(Type.FLOAT_TYPE);
                    this.currentAdapter.storeLocal(symbol.lidx);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object visit(DeclareVariableExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            this.visit(mde);
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
            //Main Function Generator
            Method m = Method.getMethod("void main (String[])");
            this.currentAdapter = new GeneratorAdapter(GEN_FLAG, m, null, null, cw);
            this.gtable = aThis.table;
            if (aThis.parameters != null) {
                aThis.parameters.accept(this);
            }
            this.visit((BlockExpression) aThis.body);

            this.gtable = this.gtable.parent;
            this.currentAdapter.returnValue();
            this.currentAdapter.endMethod();
        } else {
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
            Method m = Method.getMethod(argtypes);
            this.currentAdapter = new GeneratorAdapter(GEN_FLAG, m, null, null, cw);
            this.gtable = aThis.table;
            if (aThis.parameters != null) {
                aThis.parameters.accept(this);
            }
            this.visit((BlockExpression) aThis.body);
            this.gtable = this.gtable.parent;
            this.currentAdapter.returnValue();
            this.currentAdapter.endMethod();
        }
        return null;
    }

}
