/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.expr;

import com.bluff.SymbolTable;
import com.bluff.compiler.phases.BlufferBaseVisitor;
import com.bluff.compiler.phases.BlufferParser;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class AntlrToExpression extends BlufferBaseVisitor<Expression>{
    public final SymbolTable globalSymbolTable;
    public SymbolTable currentSymbolTable;
    public int finalOrnormal=1;//even means final and odd means normal
    public final ArrayList<Expression> expressions;
    public AntlrToExpression(){
        this.globalSymbolTable=new SymbolTable(null);
        expressions=new ArrayList<>();
        this.currentSymbolTable=globalSymbolTable;
    }
    public void setCurrentTable(SymbolTable table){
        this.currentSymbolTable=table;
    }
    public SymbolTable getCurrentTable(){
        return this.currentSymbolTable;
    }
    @Override
    public Expression visitArguments(BlufferParser.ArgumentsContext ctx) {
        return super.visitArguments(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitSelector(BlufferParser.SelectorContext ctx) {
        return super.visitSelector(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitArrayCreatorRest(BlufferParser.ArrayCreatorRestContext ctx) {
        return super.visitArrayCreatorRest(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitCreatedName(BlufferParser.CreatedNameContext ctx) {
        System.out.println(ctx.getText());
        return super.visitCreatedName(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitCreator(BlufferParser.CreatorContext ctx) {
        return super.visitCreator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitIdentifierSuffix(BlufferParser.IdentifierSuffixContext ctx) {
        return super.visitIdentifierSuffix(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitPrimary(BlufferParser.PrimaryContext ctx) {
        return super.visitPrimary(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitCastExpression(BlufferParser.CastExpressionContext ctx) {
        return super.visitCastExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitUnaryExpressionNotPlusMinus(BlufferParser.UnaryExpressionNotPlusMinusContext ctx) {
        return super.visitUnaryExpressionNotPlusMinus(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitUnaryExpression(BlufferParser.UnaryExpressionContext ctx) {
        return super.visitUnaryExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitMultiplicativeExpression(BlufferParser.MultiplicativeExpressionContext ctx) {
        return super.visitMultiplicativeExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitAdditiveExpression(BlufferParser.AdditiveExpressionContext ctx) {
        return super.visitAdditiveExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitShiftOp(BlufferParser.ShiftOpContext ctx) {
        return super.visitShiftOp(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitShiftExpression(BlufferParser.ShiftExpressionContext ctx) {
        return super.visitShiftExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitRelationalOp(BlufferParser.RelationalOpContext ctx) {
        return super.visitRelationalOp(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitRelationalExpression(BlufferParser.RelationalExpressionContext ctx) {
        return super.visitRelationalExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitEqualityExpression(BlufferParser.EqualityExpressionContext ctx) {
        return super.visitEqualityExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitAndExpression(BlufferParser.AndExpressionContext ctx) {
        return super.visitAndExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitExclusiveOrExpression(BlufferParser.ExclusiveOrExpressionContext ctx) {
        return super.visitExclusiveOrExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitInclusiveOrExpression(BlufferParser.InclusiveOrExpressionContext ctx) {
        return super.visitInclusiveOrExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitConditionalAndExpression(BlufferParser.ConditionalAndExpressionContext ctx) {
        return super.visitConditionalAndExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitConditionalOrExpression(BlufferParser.ConditionalOrExpressionContext ctx) {
        return super.visitConditionalOrExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitConditionalExpression(BlufferParser.ConditionalExpressionContext ctx) {
        return super.visitConditionalExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitAssignmentOperator(BlufferParser.AssignmentOperatorContext ctx) {
        return super.visitAssignmentOperator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitExpression(BlufferParser.ExpressionContext ctx) {
        return super.visitExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitConstantExpression(BlufferParser.ConstantExpressionContext ctx) {
        return super.visitConstantExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitStatementExpression(BlufferParser.StatementExpressionContext ctx) {
        return super.visitStatementExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitExpressionList(BlufferParser.ExpressionListContext ctx) {
        return super.visitExpressionList(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitParExpression(BlufferParser.ParExpressionContext ctx) {
        return super.visitParExpression(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitForUpdate(BlufferParser.ForUpdateContext ctx) {
        return super.visitForUpdate(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitEnhancedForControl(BlufferParser.EnhancedForControlContext ctx) {
        return super.visitEnhancedForControl(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitForInit(BlufferParser.ForInitContext ctx) {
        return super.visitForInit(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitForControl(BlufferParser.ForControlContext ctx) {
        return super.visitForControl(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitSwitchLabel(BlufferParser.SwitchLabelContext ctx) {
        return super.visitSwitchLabel(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitSwitchBlockStatementGroup(BlufferParser.SwitchBlockStatementGroupContext ctx) {
        return super.visitSwitchBlockStatementGroup(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitSwitchBlockStatementGroups(BlufferParser.SwitchBlockStatementGroupsContext ctx) {
        return super.visitSwitchBlockStatementGroups(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitFormalParameter(BlufferParser.FormalParameterContext ctx) {
        return super.visitFormalParameter(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitStatement(BlufferParser.StatementContext ctx) {
        return super.visitStatement(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitLocalVariableDeclaration(BlufferParser.LocalVariableDeclarationContext ctx) {
        return super.visitLocalVariableDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitLocalVariableDeclarationStatement(BlufferParser.LocalVariableDeclarationStatementContext ctx) {
        return super.visitLocalVariableDeclarationStatement(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitBlockStatement(BlufferParser.BlockStatementContext ctx) {
        return super.visitBlockStatement(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitBlock(BlufferParser.BlockContext ctx) {
        return super.visitBlock(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitLiteral(BlufferParser.LiteralContext ctx) {
        return super.visitLiteral(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitMethodBody(BlufferParser.MethodBodyContext ctx) {
        return super.visitMethodBody(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitFormalParameterDeclsRest(BlufferParser.FormalParameterDeclsRestContext ctx) {
        return super.visitFormalParameterDeclsRest(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitFormalParameterDecls(BlufferParser.FormalParameterDeclsContext ctx) {
        return super.visitFormalParameterDecls(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitFormalParameters(BlufferParser.FormalParametersContext ctx) {
        return super.visitFormalParameters(ctx); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public Expression visitPrimitiveType(BlufferParser.PrimitiveTypeContext ctx) {
        return super.visitPrimitiveType(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitType(BlufferParser.TypeContext ctx) {
        return super.visitType(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitModifier(BlufferParser.ModifierContext ctx) {
        return super.visitModifier(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitArrayInitializer(BlufferParser.ArrayInitializerContext ctx) {
        return super.visitArrayInitializer(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitVariableInitializer(BlufferParser.VariableInitializerContext ctx) {
        return super.visitVariableInitializer(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitVariableDeclaratorId(BlufferParser.VariableDeclaratorIdContext ctx) {
        return super.visitVariableDeclaratorId(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitConstantDeclaratorRest(BlufferParser.ConstantDeclaratorRestContext ctx) {
        return super.visitConstantDeclaratorRest(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitConstantDeclaratorsRest(BlufferParser.ConstantDeclaratorsRestContext ctx) {
        return super.visitConstantDeclaratorsRest(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitVariableDeclarator(BlufferParser.VariableDeclaratorContext ctx) {
        return super.visitVariableDeclarator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitVariableDeclarators(BlufferParser.VariableDeclaratorsContext ctx) {
        return super.visitVariableDeclarators(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitConstantDeclarator(BlufferParser.ConstantDeclaratorContext ctx) {
        return super.visitConstantDeclarator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitVoidMethodDeclaratorRest(BlufferParser.VoidMethodDeclaratorRestContext ctx) {
        System.out.println(ctx);
        return null;
    }

    @Override
    public Expression visitMethodDeclaratorRest(BlufferParser.MethodDeclaratorRestContext ctx) {
        return super.visitMethodDeclaratorRest(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitFieldDeclaration(BlufferParser.FieldDeclarationContext ctx) {
        return super.visitFieldDeclaration(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression visitMethodDeclaration(BlufferParser.MethodDeclarationContext ctx) {
        BlufferParser.MethodDeclaratorRestContext declarator = ctx.methodDeclaratorRest();
        BlufferParser.FormalParametersContext parameters = declarator.formalParameters();
        BlufferParser.MethodBodyContext methodBody = declarator.methodBody();
        BlufferParser.BlockContext block = methodBody.block();
        List<BlufferParser.BlockStatementContext> blockStatement = block.blockStatement();
        SymbolTable table=new SymbolTable(this.getCurrentTable());
        
        return null;
    }

    @Override
    public Expression visitMemberDeclaration(BlufferParser.MemberDeclarationContext ctx) {
        if (ctx.methodDeclaration()!=null){
            this.visit(ctx.methodDeclaration());
        }
        return null;
    }

    @Override
    public Expression visitMemberDecl(BlufferParser.MemberDeclContext ctx) {
        
        return null;
    }
    
    @Override
    public Expression visitProgramBodyDeclaration(BlufferParser.ProgramBodyDeclarationContext ctx) {
        if (ctx.SEMI()!=null)return null;
        
        return null;
    }
}
