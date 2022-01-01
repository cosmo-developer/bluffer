// Generated from src/com/bluff/compiler/grammar/Bluffer.g4 by ANTLR 4.9.3
package com.bluff.compiler.phases;
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
	 * Visit a parse tree produced by {@link BlufferParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(BlufferParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(BlufferParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(BlufferParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(BlufferParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(BlufferParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#primitiveOrArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveOrArray(BlufferParser.PrimitiveOrArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(BlufferParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(BlufferParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(BlufferParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(BlufferParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#declVarInitialize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclVarInitialize(BlufferParser.DeclVarInitializeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#declareAndCreateNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareAndCreateNewArray(BlufferParser.DeclareAndCreateNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#declareArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareArray(BlufferParser.DeclareArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#declareAndCreateArrayConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareAndCreateArrayConstant(BlufferParser.DeclareAndCreateArrayConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#declareArrayAndAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareArrayAndAssign(BlufferParser.DeclareArrayAndAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#declVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclVar(BlufferParser.DeclVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(BlufferParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(BlufferParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#equExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquExp(BlufferParser.EquExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#equSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquSymbol(BlufferParser.EquSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#relExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExp(BlufferParser.RelExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#relSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelSymbol(BlufferParser.RelSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#addExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(BlufferParser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#addSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSymbol(BlufferParser.AddSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(BlufferParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#termSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermSymbol(BlufferParser.TermSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(BlufferParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(BlufferParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(BlufferParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(BlufferParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BlufferParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(BlufferParser.LiteralContext ctx);
}