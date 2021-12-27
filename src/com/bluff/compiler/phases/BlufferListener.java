// Generated from src/com/bluff/compiler/grammar/Bluffer.g4 by ANTLR 4.9.3
package com.bluff.compiler.phases;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BlufferParser}.
 */
public interface BlufferListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BlufferParser#programBody}.
	 * @param ctx the parse tree
	 */
	void enterProgramBody(BlufferParser.ProgramBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#programBody}.
	 * @param ctx the parse tree
	 */
	void exitProgramBody(BlufferParser.ProgramBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#programBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProgramBodyDeclaration(BlufferParser.ProgramBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#programBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProgramBodyDeclaration(BlufferParser.ProgramBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void enterMemberDecl(BlufferParser.MemberDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void exitMemberDecl(BlufferParser.MemberDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(BlufferParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(BlufferParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(BlufferParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(BlufferParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(BlufferParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(BlufferParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(BlufferParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(BlufferParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#methodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaratorRest(BlufferParser.MethodDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#methodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaratorRest(BlufferParser.MethodDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#voidMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterVoidMethodDeclaratorRest(BlufferParser.VoidMethodDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#voidMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitVoidMethodDeclaratorRest(BlufferParser.VoidMethodDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(BlufferParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(BlufferParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(BlufferParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(BlufferParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(BlufferParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(BlufferParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#constantDeclaratorsRest}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaratorsRest(BlufferParser.ConstantDeclaratorsRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#constantDeclaratorsRest}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaratorsRest(BlufferParser.ConstantDeclaratorsRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#constantDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaratorRest(BlufferParser.ConstantDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#constantDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaratorRest(BlufferParser.ConstantDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(BlufferParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(BlufferParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(BlufferParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(BlufferParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(BlufferParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(BlufferParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(BlufferParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(BlufferParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(BlufferParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(BlufferParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(BlufferParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(BlufferParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(BlufferParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(BlufferParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(BlufferParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(BlufferParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#formalParameterDecls}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDecls(BlufferParser.FormalParameterDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#formalParameterDecls}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDecls(BlufferParser.FormalParameterDeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#formalParameterDeclsRest}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDeclsRest(BlufferParser.FormalParameterDeclsRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#formalParameterDeclsRest}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDeclsRest(BlufferParser.FormalParameterDeclsRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(BlufferParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(BlufferParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(BlufferParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(BlufferParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(BlufferParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(BlufferParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(BlufferParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(BlufferParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(BlufferParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(BlufferParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(BlufferParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(BlufferParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#variableModifiers}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifiers(BlufferParser.VariableModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#variableModifiers}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifiers(BlufferParser.VariableModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BlufferParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BlufferParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(BlufferParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(BlufferParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#switchBlockStatementGroups}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroups(BlufferParser.SwitchBlockStatementGroupsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#switchBlockStatementGroups}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroups(BlufferParser.SwitchBlockStatementGroupsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(BlufferParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(BlufferParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(BlufferParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(BlufferParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(BlufferParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(BlufferParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(BlufferParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(BlufferParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(BlufferParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(BlufferParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(BlufferParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(BlufferParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(BlufferParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(BlufferParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(BlufferParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(BlufferParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(BlufferParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(BlufferParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(BlufferParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(BlufferParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BlufferParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BlufferParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(BlufferParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(BlufferParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(BlufferParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(BlufferParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(BlufferParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(BlufferParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(BlufferParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(BlufferParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(BlufferParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(BlufferParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(BlufferParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(BlufferParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(BlufferParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(BlufferParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(BlufferParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(BlufferParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(BlufferParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(BlufferParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(BlufferParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(BlufferParser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(BlufferParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(BlufferParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void enterShiftOp(BlufferParser.ShiftOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#shiftOp}.
	 * @param ctx the parse tree
	 */
	void exitShiftOp(BlufferParser.ShiftOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(BlufferParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(BlufferParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(BlufferParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(BlufferParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(BlufferParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(BlufferParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(BlufferParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(BlufferParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(BlufferParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(BlufferParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(BlufferParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(BlufferParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#identifierSuffix}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSuffix(BlufferParser.IdentifierSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#identifierSuffix}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSuffix(BlufferParser.IdentifierSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(BlufferParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(BlufferParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(BlufferParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(BlufferParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(BlufferParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(BlufferParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(BlufferParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(BlufferParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(BlufferParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(BlufferParser.ArgumentsContext ctx);
}