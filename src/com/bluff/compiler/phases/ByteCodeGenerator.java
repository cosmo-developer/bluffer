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
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.objectweb.asm.ClassWriter;
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
    final int GEN_FLAG=ACC_PUBLIC+ACC_STATIC;
    final String className;
    public ByteCodeGenerator(String className, SymbolTable table) {
        cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        this.gtable = table;
        cw.visit(V1_8, ACC_PUBLIC, className, null, "java/lang/Object", null);
        this.className=className;
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
        }

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
        Object visit = this.visit(aThis.initialize);
        if (visit==null){
            if (aThis.initialize instanceof StringLiteralExpression){
                StringLiteralExpression sle=(StringLiteralExpression) aThis.initialize;
                this.currentAdapter.newLocal(Type.getType(String.class));
                this.currentAdapter.push(sle.value);
                this.currentAdapter.storeLocal(symbol.lidx+1, Type.getType(String.class));
            }else if(aThis.initialize instanceof IntegeralLiteralExpression){
                IntegeralLiteralExpression ile=(IntegeralLiteralExpression) aThis.initialize;
                this.currentAdapter.newLocal(Type.INT_TYPE);
                this.currentAdapter.push(ile.value);
                this.currentAdapter.storeLocal(symbol.lidx+1,Type.INT_TYPE);
            }
        }
        return null;
    }

    public Object visit(DeclareAndCreateArrayConstantExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object visit(DeclareAndCreateNewArrayExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object visit(IfExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object visit(MethodCallExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object visit(ParameterExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(className+".class"))) {
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
            Method m=Method.getMethod("void main (String[])");
            this.currentAdapter=new GeneratorAdapter(GEN_FLAG,m,null,null,cw);
            this.gtable=aThis.table;
            this.visit((BlockExpression)aThis.body);
            
            this.gtable=this.gtable.parent;
            this.currentAdapter.returnValue();
            this.currentAdapter.endMethod();
        }else{
            String[] split = symbol.type.split(";");
            String argtypes="";
            for (int i=0;i<split.length-1;i++){
                argtypes+=split[i];
                if (i<split.length-2)
                   argtypes+=",";
            }
            argtypes="("+argtypes+")";
            argtypes=split[split.length-1].replace("(", "").replace(")", "")+" "+symbol.id.getText()+" "+argtypes;
            Method m=Method.getMethod(argtypes);
            this.currentAdapter=new GeneratorAdapter(GEN_FLAG,m,null,null,cw);
            this.gtable=aThis.table;
            this.visit((BlockExpression)aThis.body);
            this.gtable=this.gtable.parent;
            this.currentAdapter.returnValue();
            this.currentAdapter.endMethod();
        }
        return null;
    }

}
