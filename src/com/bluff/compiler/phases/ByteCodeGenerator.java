/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.compiler.phases;

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
import com.bluff.expr.MethodCallExpression;
import com.bluff.expr.MethodDeclarationExpression;
import com.bluff.expr.ParameterExpression;
import com.bluff.expr.RelExpression;
import com.bluff.expr.StatementExpression;
import com.bluff.expr.StatementListExpression;
import com.bluff.expr.TermExpression;
import com.bluff.expr.WhileExpression;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class ByteCodeGenerator {

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object visit(DeclVariableInitializedExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object visit(TermExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object visit(WhileExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object visit(MethodDeclarationExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
