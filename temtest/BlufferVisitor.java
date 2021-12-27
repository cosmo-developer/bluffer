// Generated from Bluffer.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BlufferParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BlufferVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BlufferParser#programBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramBody(BlufferParser.ProgramBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#programBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramBodyDeclaration(BlufferParser.ProgramBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#memberDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDecl(BlufferParser.MemberDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(BlufferParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(BlufferParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(BlufferParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(BlufferParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#methodDeclaratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaratorRest(BlufferParser.MethodDeclaratorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#voidMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidMethodDeclaratorRest(BlufferParser.VoidMethodDeclaratorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(BlufferParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(BlufferParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(BlufferParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#constantDeclaratorsRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaratorsRest(BlufferParser.ConstantDeclaratorsRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#constantDeclaratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaratorRest(BlufferParser.ConstantDeclaratorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(BlufferParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(BlufferParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(BlufferParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(BlufferParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(BlufferParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(BlufferParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(BlufferParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(BlufferParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#formalParameterDecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterDecls(BlufferParser.FormalParameterDeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#formalParameterDeclsRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterDeclsRest(BlufferParser.FormalParameterDeclsRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(BlufferParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(BlufferParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(BlufferParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(BlufferParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(BlufferParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(BlufferParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#variableModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifiers(BlufferParser.VariableModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(BlufferParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(BlufferParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#switchBlockStatementGroups}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroups(BlufferParser.SwitchBlockStatementGroupsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(BlufferParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(BlufferParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(BlufferParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(BlufferParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(BlufferParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(BlufferParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(BlufferParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(BlufferParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(BlufferParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(BlufferParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BlufferParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(BlufferParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(BlufferParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(BlufferParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(BlufferParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(BlufferParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(BlufferParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(BlufferParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(BlufferParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(BlufferParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOp(BlufferParser.RelationalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(BlufferParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#shiftOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftOp(BlufferParser.ShiftOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(BlufferParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(BlufferParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(BlufferParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(BlufferParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(BlufferParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(BlufferParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#identifierSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSuffix(BlufferParser.IdentifierSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(BlufferParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(BlufferParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(BlufferParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(BlufferParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(BlufferParser.ArgumentsContext ctx);
}