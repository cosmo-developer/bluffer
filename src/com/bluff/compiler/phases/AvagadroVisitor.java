// Generated from src/com/bluff/compiler/grammar/Avagadro.g4 by ANTLR 4.9.3
package com.bluff.compiler.phases;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AvagadroParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AvagadroVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AvagadroParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(AvagadroParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvagadroParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(AvagadroParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvagadroParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(AvagadroParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvagadroParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(AvagadroParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvagadroParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(AvagadroParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvagadroParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AvagadroParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvagadroParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AvagadroParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvagadroParser#declVarInitialize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclVarInitialize(AvagadroParser.DeclVarInitializeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvagadroParser#createNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateNewArray(AvagadroParser.CreateNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvagadroParser#createConstantNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateConstantNewArray(AvagadroParser.CreateConstantNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvagadroParser#declVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclVar(AvagadroParser.DeclVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvagadroParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(AvagadroParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AvagadroParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AvagadroParser.ExpressionContext ctx);
}