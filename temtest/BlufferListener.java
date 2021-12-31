// Generated from Bluffer.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BlufferParser}.
 */
public interface BlufferListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BlufferParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(BlufferParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(BlufferParser.StatementListContext ctx);
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
	 * Enter a parse tree produced by {@link BlufferParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(BlufferParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(BlufferParser.ArrayTypeContext ctx);
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
	 * Enter a parse tree produced by {@link BlufferParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(BlufferParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(BlufferParser.ParametersContext ctx);
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
	 * Enter a parse tree produced by {@link BlufferParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(BlufferParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(BlufferParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#declVarInitialize}.
	 * @param ctx the parse tree
	 */
	void enterDeclVarInitialize(BlufferParser.DeclVarInitializeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#declVarInitialize}.
	 * @param ctx the parse tree
	 */
	void exitDeclVarInitialize(BlufferParser.DeclVarInitializeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#declareAndCreateNewArray}.
	 * @param ctx the parse tree
	 */
	void enterDeclareAndCreateNewArray(BlufferParser.DeclareAndCreateNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#declareAndCreateNewArray}.
	 * @param ctx the parse tree
	 */
	void exitDeclareAndCreateNewArray(BlufferParser.DeclareAndCreateNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#declareArray}.
	 * @param ctx the parse tree
	 */
	void enterDeclareArray(BlufferParser.DeclareArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#declareArray}.
	 * @param ctx the parse tree
	 */
	void exitDeclareArray(BlufferParser.DeclareArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#declareAndCreateArrayConstant}.
	 * @param ctx the parse tree
	 */
	void enterDeclareAndCreateArrayConstant(BlufferParser.DeclareAndCreateArrayConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#declareAndCreateArrayConstant}.
	 * @param ctx the parse tree
	 */
	void exitDeclareAndCreateArrayConstant(BlufferParser.DeclareAndCreateArrayConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#declareArrayAndAssign}.
	 * @param ctx the parse tree
	 */
	void enterDeclareArrayAndAssign(BlufferParser.DeclareArrayAndAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#declareArrayAndAssign}.
	 * @param ctx the parse tree
	 */
	void exitDeclareArrayAndAssign(BlufferParser.DeclareArrayAndAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#declVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclVar(BlufferParser.DeclVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#declVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclVar(BlufferParser.DeclVarContext ctx);
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
	 * Enter a parse tree produced by {@link BlufferParser#equExp}.
	 * @param ctx the parse tree
	 */
	void enterEquExp(BlufferParser.EquExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#equExp}.
	 * @param ctx the parse tree
	 */
	void exitEquExp(BlufferParser.EquExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#relExp}.
	 * @param ctx the parse tree
	 */
	void enterRelExp(BlufferParser.RelExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#relExp}.
	 * @param ctx the parse tree
	 */
	void exitRelExp(BlufferParser.RelExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#addExp}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(BlufferParser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#addExp}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(BlufferParser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(BlufferParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(BlufferParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link BlufferParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(BlufferParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(BlufferParser.FactorContext ctx);
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
	 * Enter a parse tree produced by {@link BlufferParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(BlufferParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlufferParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(BlufferParser.MethodCallContext ctx);
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
}