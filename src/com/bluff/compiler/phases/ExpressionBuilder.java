/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.compiler.phases;

import com.bluff.SymbolTable;
import com.bluff.TriPair;
import com.bluff.expr.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class ExpressionBuilder extends BlufferBaseVisitor<Expression> {

    public final SymbolTable gtable;
    SymbolTable ctable;
    Stack<IfExpression> ifStack;
    Stack<ElseExpression> elseStack;

    public ExpressionBuilder() {
        gtable = new SymbolTable(null);
        ctable = gtable;
        ifStack = new Stack();
        elseStack = new Stack();
    }

    public SymbolTable curr() {
        return ctable;
    }

    public void setCurr(SymbolTable table) {
        this.ctable = table;
    }

    @Override
    public Expression visitLiteral(BlufferParser.LiteralContext ctx) {
        if (ctx.BooleanLiteral() != null) {
            Token k = ctx.BooleanLiteral().getSymbol();
            boolean value = k.getText().equals("true");
            return new BooleanLiteralExpression(value, k.getLine(), k.getCharPositionInLine());
        } else if (ctx.StringLiteral() != null) {
            Token k = ctx.StringLiteral().getSymbol();
            return new StringLiteralExpression(k.getText(), k.getLine(), k.getCharPositionInLine());
        } else if (ctx.IntegerLiteral() != null) {
            Token k = ctx.IntegerLiteral().getSymbol();
            return new IntegeralLiteralExpression(Integer.parseInt(k.getText()), k.getLine(), k.getCharPositionInLine());
        } else if (ctx.CharacterLiteral() != null) {
            Token k = ctx.CharacterLiteral().getSymbol();
            String val = ByteCodeGenerator.performEscaping(k.getText(), null, 0, 0, 0);
            return new CharLiteralExpression(val.charAt(0), k.getLine(), k.getCharPositionInLine());
        } else if (ctx.FloatingPointLiteral() != null) {
            Token k = ctx.FloatingPointLiteral().getSymbol();
            return new FloatLiteralExpression(Float.parseFloat(k.getText()), k.getLine(), k.getCharPositionInLine());
        }
        return super.visitLiteral(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitArguments(BlufferParser.ArgumentsContext ctx) {
        ArrayList<Expression> args = new ArrayList<>();
        ctx.expression().forEach((ectx) -> {
            args.add(this.visit(ectx));
        });
        return new ArgumentExpression(args);
    }

    @Override
    public Expression visitMethodCall(BlufferParser.MethodCallContext ctx) {
        Token identifier = ctx.Identifier().getSymbol();
        Expression visit = this.visit(ctx.arguments());
        return new MethodCallExpression(identifier, (ArgumentExpression) visit);
    }

    @Override
    public Expression visitSelector(BlufferParser.SelectorContext ctx) {
        return super.visitSelector(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitFactor(BlufferParser.FactorContext ctx) {
        TerminalNode operator;
        if ((operator = chooseNotNull(ctx.ADD(), ctx.SUB())) != null) {
            return new FactorExpression(
                    operator.getSymbol().getText(), this.visit(ctx.factor()),
                    false, null, null
            );
        }
        if (ctx.methodCall() != null) {
            MethodCallExpression mcall = (MethodCallExpression) this.visit(ctx.methodCall());
            if (ctx.selector() != null) {
                if (ctx.selector().DOT() != null) {
                    if (!ctx.selector().Identifier().getSymbol().getText().equals("length")) {
                        System.err.println("." + ctx.selector().Identifier().getSymbol().getText() + " is not a access property");
                    } else {
                        mcall.lengthSelector = true;
                    }
                } else {
                    mcall.arraySelector = this.visit(ctx.selector().expression());
                }
            }
            return mcall;
        } else if (ctx.Identifier() != null) {
            IdentifierExpression identifier = new IdentifierExpression(ctx.Identifier().getSymbol());
            if (ctx.selector() != null) {
                if (ctx.selector().DOT() != null) {
                    if (!ctx.selector().Identifier().getSymbol().getText().equals("length")) {
                        System.err.println("." + ctx.selector().Identifier().getSymbol().getText() + " is not a access property");
                    } else {
                        identifier.lengthSelector = true;
                    }
                } else {
                    identifier.arraySelector = this.visit(ctx.selector().expression());
                }
            }
            return identifier;
        } else if (ctx.parExpression() != null) {
            ParExpression parExpression = new ParExpression(this.visit(ctx.parExpression().expression()));
            if (ctx.selector() != null) {
                if (ctx.selector().DOT() != null) {
                    if (!ctx.selector().Identifier().getSymbol().getText().equals("length")) {
                        System.err.println("." + ctx.selector().Identifier().getSymbol().getText() + " is not a access property");
                    } else {
                        parExpression.lengthSelector = true;
                    }
                } else {
                    parExpression.arraySelector = this.visit(ctx.selector().expression());
                }
            }
            return parExpression;
        } else if (ctx.literal() != null) {
            return this.visit(ctx.literal());
        }
        return null;
    }

    @Override
    public Expression visitTerm(BlufferParser.TermContext ctx) {
        List<BlufferParser.TermSymbolContext> relSymbol = ctx.termSymbol();
        if (relSymbol.isEmpty()) {
            return this.visit(ctx.factor(0));
        }
        ArrayList<Expression> exps = new ArrayList<>();
        ArrayList<String> operations = new ArrayList<>();
        int ctr = 0;
        exps.add(this.visit(ctx.factor(ctr++)));
        for (BlufferParser.TermSymbolContext sym : ctx.termSymbol()) {
            String operator = chooseNotNull(
                    sym.DIV(), sym.MOD(),
                    sym.MUL()
            ).getSymbol().getText();
            exps.add(this.visit(ctx.factor(ctr++)));
            operations.add(operator);
        }
        return new TermExpression(exps, operations);
    }

    @Override
    public Expression visitAddExp(BlufferParser.AddExpContext ctx) {
        List<BlufferParser.AddSymbolContext> relSymbol = ctx.addSymbol();
        if (relSymbol.isEmpty()) {
            return this.visit(ctx.term(0));
        }
        ArrayList<Expression> exps = new ArrayList<>();
        ArrayList<String> operations = new ArrayList<>();
        int ctr = 0;
        exps.add(this.visit(ctx.term(ctr++)));
        for (BlufferParser.AddSymbolContext sym : ctx.addSymbol()) {
            String operator = chooseNotNull(
                    sym.ADD(), sym.SUB()
            ).getSymbol().getText();

            exps.add(this.visit(ctx.term(ctr++)));
            operations.add(operator);
        }
        return new AddExpression(exps, operations);
    }

    @Override
    public Expression visitRelExp(BlufferParser.RelExpContext ctx) {
        List<BlufferParser.RelSymbolContext> relSymbol = ctx.relSymbol();
        if (relSymbol.isEmpty()) {
            return this.visit(ctx.addExp(0));
        }
        ArrayList<Expression> exps = new ArrayList<>();
        ArrayList<String> operations = new ArrayList<>();
        int ctr = 0;
        for (BlufferParser.RelSymbolContext sym : ctx.relSymbol()) {
            String operator = chooseNotNull(
                    sym.GE(), sym.GT(), sym.LE(),
                    sym.LT()
            ).getSymbol().getText();
            exps.add(this.visit(ctx.addExp(ctr++)));
            exps.add(this.visit(ctx.addExp(ctr++)));
            operations.add(operator);
        }
        return new RelExpression(exps, operations);
    }

    @Override
    public Expression visitEquExp(BlufferParser.EquExpContext ctx) {
        List<BlufferParser.EquSymbolContext> equSymbol = ctx.equSymbol();

        if (equSymbol.isEmpty()) {
            return this.visit(ctx.relExp(0));
        }
        ArrayList<Expression> exps = new ArrayList<>();
        ArrayList<String> operations = new ArrayList<>();
        int ctr = 0;
        exps.add(this.visit(ctx.relExp(ctr++)));
        for (BlufferParser.EquSymbolContext sym : equSymbol) {
            String operator = chooseNotNull(sym.EQUAL(), sym.NOTEQUAL()).getSymbol().getText();
            exps.add(this.visit(ctx.relExp(ctr++)));
            operations.add(operator);
        }
        return new EquExpression(exps, operations);
    }

    @Override
    public Expression visitExpression(BlufferParser.ExpressionContext ctx) {
        return this.visit(ctx.equExp());
    }

    @Override
    public Expression visitParExpression(BlufferParser.ParExpressionContext ctx) {
        return this.visit(ctx.expression());
    }

    @Override
    public Expression visitDeclVar(BlufferParser.DeclVarContext ctx) {
        String type = chooseNotNull(
                ctx.primitiveType().BOOLEAN(),
                ctx.primitiveType().CHAR(),
                ctx.primitiveType().FLOAT(),
                ctx.primitiveType().INT(),
                ctx.primitiveType().STRING()
        ).getSymbol().getText();
        Token identifier = ctx.Identifier().getSymbol();
        curr().addSymbol(identifier, type, null);
        return new DeclareVariableExpression(type, identifier);
    }

    @Override
    public Expression visitDeclareArrayAndAssign(BlufferParser.DeclareArrayAndAssignContext ctx) {
        Token identifier = ctx.Identifier().getSymbol();
        String type = chooseNotNull(ctx.arrayType().CHAR(),
                ctx.arrayType().FLOAT(), ctx.arrayType().INT()).getSymbol().getText();
        Expression e = this.visit(ctx.expression());
        curr().addSymbol(identifier, type + "[]", null);
        return new DeclareArrayAndAssignExpression(type, identifier, e);

    }

    @Override
    public Expression visitDeclareAndCreateArrayConstant(BlufferParser.DeclareAndCreateArrayConstantContext ctx) {
        ArrayList<Expression> initializers = new ArrayList<>();
        Token identifier = ctx.Identifier().getSymbol();
        String type = chooseNotNull(ctx.arrayType().CHAR(),
                ctx.arrayType().FLOAT(), ctx.arrayType().INT()).getSymbol().getText();
        ctx.expression().forEach((ectx) -> {
            initializers.add(this.visit(ectx));
        });
        curr().addSymbol(identifier, type + "[]", null);
        return new DeclareAndCreateArrayConstantExpression(type, identifier, initializers);
    }

    @Override
    public Expression visitDeclareArray(BlufferParser.DeclareArrayContext ctx) {
        String createType = chooseNotNull(
                ctx.arrayType().CHAR(), ctx.arrayType().FLOAT(),
                ctx.arrayType().INT()
        ).getSymbol().getText();
        Token identifier = ctx.Identifier().getSymbol();
        curr().addSymbol(identifier, createType + "[]", null);
        return new DeclareArrayExpression(createType, identifier);
    }

    @Override
    public Expression visitDeclareAndCreateNewArray(BlufferParser.DeclareAndCreateNewArrayContext ctx) {
        String specifiedType = chooseNotNull(
                ctx.CHAR(), ctx.FLOAT(), ctx.INT()
        ).getSymbol().getText();
        String createType = chooseNotNull(
                ctx.arrayType().CHAR(), ctx.arrayType().FLOAT(),
                ctx.arrayType().INT()
        ).getSymbol().getText();
        if (!specifiedType.equals(createType)) {
            System.err.printf("%s[] can't converted into %s[]\n%s\n", specifiedType, createType, ctx.getText());
            try {
                throw new Exception("Something bad here");
            } catch (Exception ex) {
                Logger.getLogger(ExpressionBuilder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Token identifier = ctx.Identifier().getSymbol();
        curr().addSymbol(identifier, specifiedType + "[]", null);
        return new DeclareAndCreateNewArrayExpression(
                createType, identifier, specifiedType, this.visit(ctx.expression())
        );

    }

    public static TerminalNode chooseNotNull(TerminalNode... nodes) {
        for (TerminalNode node : nodes) {
            if (node != null) {
                return node;
            }
        }

        return null;
    }

    @Override
    public Expression visitDeclVarInitialize(BlufferParser.DeclVarInitializeContext ctx) {
        Token identifier = ctx.Identifier().getSymbol();
        String type = chooseNotNull(ctx.type().primitiveType().BOOLEAN(),
                ctx.type().primitiveType().CHAR(), ctx.type().primitiveType().FLOAT(),
                ctx.type().primitiveType().INT(), ctx.type().primitiveType().STRING()).getSymbol().getText();

        curr().addSymbol(identifier, type, "");
        return new DeclVariableInitializedExpression(type, identifier, this.visit(ctx.expression()));
    }

    @Override
    public Expression visitAssignment(BlufferParser.AssignmentContext ctx) {
        Token identifier = ctx.Identifier().getSymbol();
        if (ctx.expression().size() == 1) {
            return new AssignmentExpression(identifier, null, this.visit(ctx.expression(0)));
        } else {
            return new AssignmentExpression(identifier, this.visit(ctx.expression(0)), this.visit(ctx.expression(1)));
        }
    }

    public static ParseTree chooseNotNull(ParseTree... objects) {
        for (ParseTree o : objects) {
            if (o != null) {
                return o;
            }
        }
        return null;
    }

    void buildElseIfExpression(BlufferParser.StatementContext ctx) {
        if (ctx.ELSE() != null) {
            if (ctx.statement(1).IF() != null) {
                ElseIfExpression eie = new ElseIfExpression(this.visit(ctx.statement(1).parExpression()),
                        this.visit(ctx.statement(1).statement(0)), null, null);
                eie.parent = this.ifStack.peek();
                this.ifStack.peek().elseIfExpression.add(eie);
                this.buildElseIfExpression(ctx.statement(1));
            } else {
                Expression elseSt = this.visit(ctx.statement(1));
                ElseExpression exp = new ElseExpression(elseSt, null);
                exp.parent = (IfExpression) this.ifStack.peek();
                this.ifStack.pop().elseExpression = exp;
            }
        }else{
            this.ifStack.pop();
        }
    }

    @Override
    public Expression visitStatement(BlufferParser.StatementContext ctx) {
        Expression toReturn = null;
        if (ctx.WHILE() != null) {
            Expression condition = this.visit(ctx.parExpression());
            Expression statement = this.visit(ctx.statement(0));
            toReturn = new WhileExpression(condition, statement, null);
        } else if (ctx.IF() != null) {
            Expression condition = this.visit(ctx.parExpression());
            Expression statement = this.visit(ctx.statement(0));
            toReturn = new IfExpression(condition, statement, null, null);
            this.ifStack.push((IfExpression) toReturn);
            this.buildElseIfExpression(ctx);

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
    
    //Almost done fix this to generate right order function arguments
    //replace HashMap with others
    @Override
    public Expression visitParameters(BlufferParser.ParametersContext ctx) {
         ArrayList<TriPair<String,String,Token>> params=new ArrayList<>();
        List<BlufferParser.PrimitiveOrArrayContext> param = ctx.primitiveOrArray();
        
        
        param.forEach((pctx) -> {
            if (pctx.declVar() != null) {
                params.add(new TriPair(pctx.declVar().Identifier().getSymbol().getText(),
                    pctx.declVar().primitiveType().getText(),pctx.declVar().Identifier().getSymbol()));
                
            } else if (pctx.declareArray() != null) {
                params.add(new TriPair(
                        pctx.declareArray().Identifier().getSymbol().getText(),
                        pctx.declareArray().arrayType().getText(),
                        pctx.declareArray().Identifier().getSymbol()
                ));
            }
        });
//        System.out.println(params);
        return new ParameterExpression(params); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitMethodDeclaration(BlufferParser.MethodDeclarationContext ctx) {
        String returnType = null;
        if (ctx.VOID() != null) {
            returnType = "void";
        } else if (ctx.arrayType() != null) {
            returnType = ctx.arrayType().start.getText() + "[]";
        } else if (ctx.type() != null) {
            returnType = ctx.type().primitiveType().start.getText();
        }
        Token identifier = ctx.Identifier().getSymbol();
        SymbolTable table = new SymbolTable(curr());
        String args = "";
        ParameterExpression params = null;
        if (ctx.parameters() != null) {
            params = (ParameterExpression) this.visit(ctx.parameters());
            ArrayList<TriPair<String, String, Token>> pkc = params.parameters;
            for (TriPair<String,String,Token> type : pkc) {
                args += type.b + ";";
                table.addSymbol(type.c, type.b, "arg");
            }
        }
        args += "(" + returnType + ")";
        gtable.addSymbol(identifier, args, "method");
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
