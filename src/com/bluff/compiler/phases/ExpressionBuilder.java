/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.compiler.phases;

import com.bluff.SymbolTable;
import com.bluff.expr.BlockExpression;
import com.bluff.expr.ElseExpression;
import com.bluff.expr.Expression;
import com.bluff.expr.IfExpression;
import com.bluff.expr.MethodDeclarationExpression;
import com.bluff.expr.ParameterExpression;
import com.bluff.expr.ReturnExpression;
import com.bluff.expr.StatementListExpression;
import com.bluff.expr.WhileExpression;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class ExpressionBuilder extends BlufferBaseVisitor<Expression> {

    public final SymbolTable gtable;
    SymbolTable ctable;

    public ExpressionBuilder() {
        gtable = new SymbolTable(null);
        ctable = gtable;
    }

    public SymbolTable curr() {
        return ctable;
    }

    public void setCurr(SymbolTable table) {
        this.ctable = table;
    }

    @Override
    public Expression visitLiteral(BlufferParser.LiteralContext ctx) {
        return super.visitLiteral(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitArguments(BlufferParser.ArgumentsContext ctx) {
        return super.visitArguments(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitMethodCall(BlufferParser.MethodCallContext ctx) {
        return super.visitMethodCall(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitSelector(BlufferParser.SelectorContext ctx) {
        return super.visitSelector(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitFactor(BlufferParser.FactorContext ctx) {
        return super.visitFactor(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitTerm(BlufferParser.TermContext ctx) {
        return super.visitTerm(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitAddExp(BlufferParser.AddExpContext ctx) {
        return super.visitAddExp(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitRelExp(BlufferParser.RelExpContext ctx) {
        return super.visitRelExp(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitEquExp(BlufferParser.EquExpContext ctx) {
        return super.visitEquExp(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitExpression(BlufferParser.ExpressionContext ctx) {
        return super.visitExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitParExpression(BlufferParser.ParExpressionContext ctx) {
        return super.visitParExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitDeclVar(BlufferParser.DeclVarContext ctx) {
        return super.visitDeclVar(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitDeclareArrayAndAssign(BlufferParser.DeclareArrayAndAssignContext ctx) {
        return super.visitDeclareArrayAndAssign(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitDeclareAndCreateArrayConstant(BlufferParser.DeclareAndCreateArrayConstantContext ctx) {
        return super.visitDeclareAndCreateArrayConstant(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitDeclareArray(BlufferParser.DeclareArrayContext ctx) {
        return super.visitDeclareArray(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitDeclareAndCreateNewArray(BlufferParser.DeclareAndCreateNewArrayContext ctx) {
        return super.visitDeclareAndCreateNewArray(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitDeclVarInitialize(BlufferParser.DeclVarInitializeContext ctx) {
        return super.visitDeclVarInitialize(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitAssignment(BlufferParser.AssignmentContext ctx) {
        
        return super.visitAssignment(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    public static ParseTree chooseNotNull(ParseTree... objects) {
        for (ParseTree o : objects) {
            if (o != null) {
                return o;
            }
        }
        return null;
    }

    @Override
    public Expression visitStatement(BlufferParser.StatementContext ctx) {
        Expression toReturn = null;
        if (ctx.WHILE() != null) {
            Expression condition = this.visit(ctx.parExpression());
            SymbolTable table = new SymbolTable(curr());
            setCurr(table);
            Expression statement = this.visit(ctx.statement(0));
            setCurr(table.parent);
            toReturn = new WhileExpression(condition, statement, table);
        } else if (ctx.IF() != null) {
            SymbolTable table = new SymbolTable(curr());
            setCurr(table);
            Expression statement = this.visit(ctx.statement(0));
            setCurr(table.parent);
            toReturn = new ElseExpression(statement, table);
        } else if (ctx.ELSE() != null) {
            Expression condition = this.visit(ctx.parExpression());
            SymbolTable table = new SymbolTable(curr());
            setCurr(table);
            Expression statement = this.visit(ctx.statement(0));
            setCurr(table.parent);
            toReturn = new IfExpression(condition, statement, table);
        } else if (ctx.RETURN() != null) {
            if (ctx.expression() != null) {
                toReturn = new ReturnExpression(this.visit(ctx.expression()));
            } else {
                toReturn = new ReturnExpression(null);
            }
        } else {
            ParseTree toBeChoosed = chooseNotNull(ctx.block(), ctx.assignment(), ctx.declVar(),
                    ctx.declVarInitialize(), ctx.declareAndCreateArrayConstant(),
                    ctx.declareAndCreateNewArray(), ctx.declareArray(), ctx.declareArrayAndAssign(),
                    ctx.methodCall(), ctx.parExpression());
            toReturn = this.visit(toBeChoosed);
        }

        return toReturn;
    }

    @Override
    public Expression visitBlock(BlufferParser.BlockContext ctx) {
        ArrayList<Expression> expressionList = new ArrayList<>();
        ctx.statement().forEach((sctx) -> {
            expressionList.add(this.visit(sctx));
        });
        return new BlockExpression(expressionList);
    }

    @Override
    public Expression visitParameters(BlufferParser.ParametersContext ctx) {
        HashMap<String, Pair<String, Token>> params = new HashMap<>();
        List<BlufferParser.PrimitiveOrArrayContext> param = ctx.primitiveOrArray();
        param.forEach((pctx) -> {
            if (pctx.declVar() != null) {
                params.put(pctx.declVar().Identifier().getSymbol().getText(),
                        new Pair(pctx.declVar().primitiveType().getText(),
                                pctx.declVar().Identifier().getSymbol()));
            } else if (pctx.declareArray() != null) {
                params.put(pctx.declareArray().Identifier().getSymbol().getText(),
                        new Pair(pctx.declareArray().arrayType().getText(),
                                pctx.declareArray().Identifier().getSymbol()));
            }
        });
        return new ParameterExpression(params); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitMethodDeclaration(BlufferParser.MethodDeclarationContext ctx) {
        String returnType = null;
        if (ctx.VOID() != null) {
            returnType = "void";
        } else if (ctx.arrayType() != null) {
            returnType = "[" + ctx.arrayType().start.getText();
        } else if (ctx.type() != null) {
            returnType = ctx.type().primitiveType().start.getText();
        }
        Token identifier = ctx.Identifier().getSymbol();
        SymbolTable table = new SymbolTable(curr());
        ParameterExpression params = null;
        if (ctx.parameters() != null) {
            params = (ParameterExpression) this.visit(ctx.parameters());
            Set<String> keySet = params.parameters.keySet();
            for (String type : keySet) {
                table.addSymbol(params.parameters.get(type).b, type, null);
            }
        }
        setCurr(table);
        BlockExpression body = (BlockExpression) this.visit(ctx.block());
        setCurr(table.parent);
        return new MethodDeclarationExpression(returnType, identifier, params, body, table); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitStatementList(BlufferParser.StatementListContext ctx) {
        ArrayList<MethodDeclarationExpression> methods = new ArrayList<>();
        ctx.methodDeclaration().forEach((mdctx) -> {
            methods.add((MethodDeclarationExpression) this.visit(mdctx));
        });
        return new StatementListExpression(methods); //To change body of generated methods, choose Tools | Templates.
    }

}
