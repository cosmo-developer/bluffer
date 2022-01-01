// Generated from src/com/bluff/compiler/grammar/Bluffer.g4 by ANTLR 4.9.3
package com.bluff.compiler.phases;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BlufferParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, CHAR=2, ELSE=3, FLOAT=4, IF=5, INT=6, STRING=7, NEW=8, RETURN=9, 
		VOID=10, WHILE=11, IntegerLiteral=12, FloatingPointLiteral=13, BooleanLiteral=14, 
		CharacterLiteral=15, StringLiteral=16, NullLiteral=17, LPAREN=18, RPAREN=19, 
		LBRACE=20, RBRACE=21, LBRACK=22, RBRACK=23, SEMI=24, COMMA=25, DOT=26, 
		ASSIGN=27, GT=28, LT=29, EQUAL=30, LE=31, GE=32, NOTEQUAL=33, ADD=34, 
		SUB=35, MUL=36, DIV=37, MOD=38, Identifier=39, WS=40, COMMENT=41, LINE_COMMENT=42;
	public static final int
		RULE_statementList = 0, RULE_methodDeclaration = 1, RULE_type = 2, RULE_arrayType = 3, 
		RULE_primitiveType = 4, RULE_primitiveOrArray = 5, RULE_parameters = 6, 
		RULE_block = 7, RULE_statement = 8, RULE_assignment = 9, RULE_declVarInitialize = 10, 
		RULE_declareAndCreateNewArray = 11, RULE_declareArray = 12, RULE_declareAndCreateArrayConstant = 13, 
		RULE_declareArrayAndAssign = 14, RULE_declVar = 15, RULE_parExpression = 16, 
		RULE_expression = 17, RULE_equExp = 18, RULE_equSymbol = 19, RULE_relExp = 20, 
		RULE_relSymbol = 21, RULE_addExp = 22, RULE_addSymbol = 23, RULE_term = 24, 
		RULE_termSymbol = 25, RULE_factor = 26, RULE_selector = 27, RULE_methodCall = 28, 
		RULE_arguments = 29, RULE_literal = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"statementList", "methodDeclaration", "type", "arrayType", "primitiveType", 
			"primitiveOrArray", "parameters", "block", "statement", "assignment", 
			"declVarInitialize", "declareAndCreateNewArray", "declareArray", "declareAndCreateArrayConstant", 
			"declareArrayAndAssign", "declVar", "parExpression", "expression", "equExp", 
			"equSymbol", "relExp", "relSymbol", "addExp", "addSymbol", "term", "termSymbol", 
			"factor", "selector", "methodCall", "arguments", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bool'", "'char'", "'else'", "'float'", "'if'", "'int'", "'string'", 
			"'new'", "'return'", "'void'", "'while'", null, null, null, null, null, 
			"'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
			"'='", "'>'", "'<'", "'=='", "'<='", "'>='", "'!='", "'+'", "'-'", "'*'", 
			"'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "CHAR", "ELSE", "FLOAT", "IF", "INT", "STRING", "NEW", 
			"RETURN", "VOID", "WHILE", "IntegerLiteral", "FloatingPointLiteral", 
			"BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "ASSIGN", "GT", "LT", "EQUAL", "LE", "GE", "NOTEQUAL", "ADD", 
			"SUB", "MUL", "DIV", "MOD", "Identifier", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Bluffer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BlufferParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatementListContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(BlufferParser.SEMI, 0); }
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statementList);
		int _la;
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(SEMI);
				}
				break;
			case EOF:
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case STRING:
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VOID))) != 0)) {
					{
					{
					setState(63);
					methodDeclaration();
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BlufferParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(BlufferParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BlufferParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode VOID() { return getToken(BlufferParser.VOID, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(71);
				match(VOID);
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case STRING:
				{
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(72);
					type();
					}
					break;
				case 2:
					{
					setState(73);
					arrayType();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(78);
			match(Identifier);
			setState(79);
			match(LPAREN);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(80);
				parameters();
				}
			}

			setState(83);
			match(RPAREN);
			setState(84);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			primitiveType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(BlufferParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(BlufferParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(BlufferParser.INT, 0); }
		public TerminalNode LBRACK() { return getToken(BlufferParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(BlufferParser.RBRACK, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << FLOAT) | (1L << INT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(89);
			match(LBRACK);
			setState(90);
			match(RBRACK);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(BlufferParser.BOOLEAN, 0); }
		public TerminalNode FLOAT() { return getToken(BlufferParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(BlufferParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(BlufferParser.INT, 0); }
		public TerminalNode STRING() { return getToken(BlufferParser.STRING, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveOrArrayContext extends ParserRuleContext {
		public DeclVarContext declVar() {
			return getRuleContext(DeclVarContext.class,0);
		}
		public DeclareArrayContext declareArray() {
			return getRuleContext(DeclareArrayContext.class,0);
		}
		public PrimitiveOrArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveOrArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitPrimitiveOrArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveOrArrayContext primitiveOrArray() throws RecognitionException {
		PrimitiveOrArrayContext _localctx = new PrimitiveOrArrayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_primitiveOrArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(94);
				declVar();
				}
				break;
			case 2:
				{
				setState(95);
				declareArray();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public List<PrimitiveOrArrayContext> primitiveOrArray() {
			return getRuleContexts(PrimitiveOrArrayContext.class);
		}
		public PrimitiveOrArrayContext primitiveOrArray(int i) {
			return getRuleContext(PrimitiveOrArrayContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BlufferParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BlufferParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			primitiveOrArray();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(99);
				match(COMMA);
				setState(100);
				primitiveOrArray();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(BlufferParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BlufferParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(LBRACE);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << IF) | (1L << INT) | (1L << STRING) | (1L << RETURN) | (1L << WHILE) | (1L << LBRACE) | (1L << SEMI) | (1L << Identifier))) != 0)) {
				{
				{
				setState(107);
				statement();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(BlufferParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DeclVarInitializeContext declVarInitialize() {
			return getRuleContext(DeclVarInitializeContext.class,0);
		}
		public DeclareAndCreateNewArrayContext declareAndCreateNewArray() {
			return getRuleContext(DeclareAndCreateNewArrayContext.class,0);
		}
		public DeclareArrayAndAssignContext declareArrayAndAssign() {
			return getRuleContext(DeclareArrayAndAssignContext.class,0);
		}
		public DeclareAndCreateArrayConstantContext declareAndCreateArrayConstant() {
			return getRuleContext(DeclareAndCreateArrayConstantContext.class,0);
		}
		public DeclareArrayContext declareArray() {
			return getRuleContext(DeclareArrayContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public DeclVarContext declVar() {
			return getRuleContext(DeclVarContext.class,0);
		}
		public TerminalNode IF() { return getToken(BlufferParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(BlufferParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(BlufferParser.WHILE, 0); }
		public TerminalNode RETURN() { return getToken(BlufferParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				declVarInitialize();
				setState(118);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				declareAndCreateNewArray();
				setState(121);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				declareArrayAndAssign();
				setState(124);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				declareAndCreateArrayConstant();
				setState(127);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(129);
				declareArray();
				setState(130);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(132);
				methodCall();
				setState(133);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(135);
				declVar();
				setState(136);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(138);
				match(IF);
				setState(139);
				parExpression();
				setState(140);
				statement();
				setState(143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(141);
					match(ELSE);
					setState(142);
					statement();
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(145);
				match(WHILE);
				setState(146);
				parExpression();
				setState(147);
				statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(149);
				match(RETURN);
				setState(154);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SEMI:
					{
					setState(150);
					match(SEMI);
					}
					break;
				case IntegerLiteral:
				case FloatingPointLiteral:
				case BooleanLiteral:
				case CharacterLiteral:
				case StringLiteral:
				case LPAREN:
				case ADD:
				case SUB:
				case Identifier:
					{
					setState(151);
					expression();
					setState(152);
					match(SEMI);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(156);
				assignment();
				setState(157);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BlufferParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(BlufferParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(BlufferParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(BlufferParser.RBRACK, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(Identifier);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(162);
				match(LBRACK);
				setState(163);
				expression();
				setState(164);
				match(RBRACK);
				}
			}

			setState(168);
			match(ASSIGN);
			setState(169);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclVarInitializeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(BlufferParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(BlufferParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclVarInitializeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declVarInitialize; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitDeclVarInitialize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclVarInitializeContext declVarInitialize() throws RecognitionException {
		DeclVarInitializeContext _localctx = new DeclVarInitializeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declVarInitialize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			type();
			setState(172);
			match(Identifier);
			setState(173);
			match(ASSIGN);
			setState(174);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareAndCreateNewArrayContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(BlufferParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(BlufferParser.ASSIGN, 0); }
		public TerminalNode NEW() { return getToken(BlufferParser.NEW, 0); }
		public TerminalNode FLOAT() { return getToken(BlufferParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(BlufferParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(BlufferParser.INT, 0); }
		public TerminalNode LBRACK() { return getToken(BlufferParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(BlufferParser.RBRACK, 0); }
		public DeclareAndCreateNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareAndCreateNewArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitDeclareAndCreateNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareAndCreateNewArrayContext declareAndCreateNewArray() throws RecognitionException {
		DeclareAndCreateNewArrayContext _localctx = new DeclareAndCreateNewArrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declareAndCreateNewArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			arrayType();
			setState(177);
			match(Identifier);
			setState(178);
			match(ASSIGN);
			setState(179);
			match(NEW);
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << FLOAT) | (1L << INT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(181);
			match(LBRACK);
			setState(182);
			expression();
			setState(183);
			match(RBRACK);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareArrayContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(BlufferParser.Identifier, 0); }
		public DeclareArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitDeclareArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareArrayContext declareArray() throws RecognitionException {
		DeclareArrayContext _localctx = new DeclareArrayContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declareArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			arrayType();
			setState(186);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareAndCreateArrayConstantContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(BlufferParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(BlufferParser.ASSIGN, 0); }
		public TerminalNode LBRACE() { return getToken(BlufferParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BlufferParser.RBRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BlufferParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BlufferParser.COMMA, i);
		}
		public DeclareAndCreateArrayConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareAndCreateArrayConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitDeclareAndCreateArrayConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareAndCreateArrayConstantContext declareAndCreateArrayConstant() throws RecognitionException {
		DeclareAndCreateArrayConstantContext _localctx = new DeclareAndCreateArrayConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declareAndCreateArrayConstant);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			arrayType();
			setState(189);
			match(Identifier);
			setState(190);
			match(ASSIGN);
			setState(191);
			match(LBRACE);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << LPAREN) | (1L << ADD) | (1L << SUB) | (1L << Identifier))) != 0)) {
				{
				setState(192);
				expression();
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(193);
						match(COMMA);
						setState(194);
						expression();
						}
						} 
					}
					setState(199);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(200);
					match(COMMA);
					}
				}

				}
			}

			setState(205);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareArrayAndAssignContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(BlufferParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(BlufferParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclareArrayAndAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareArrayAndAssign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitDeclareArrayAndAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareArrayAndAssignContext declareArrayAndAssign() throws RecognitionException {
		DeclareArrayAndAssignContext _localctx = new DeclareArrayAndAssignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declareArrayAndAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			arrayType();
			setState(208);
			match(Identifier);
			setState(209);
			match(ASSIGN);
			setState(210);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclVarContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(BlufferParser.Identifier, 0); }
		public DeclVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declVar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitDeclVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclVarContext declVar() throws RecognitionException {
		DeclVarContext _localctx = new DeclVarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			primitiveType();
			setState(213);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(BlufferParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BlufferParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(LPAREN);
			setState(216);
			expression();
			setState(217);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public EquExpContext equExp() {
			return getRuleContext(EquExpContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			equExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquExpContext extends ParserRuleContext {
		public List<RelExpContext> relExp() {
			return getRuleContexts(RelExpContext.class);
		}
		public RelExpContext relExp(int i) {
			return getRuleContext(RelExpContext.class,i);
		}
		public List<EquSymbolContext> equSymbol() {
			return getRuleContexts(EquSymbolContext.class);
		}
		public EquSymbolContext equSymbol(int i) {
			return getRuleContext(EquSymbolContext.class,i);
		}
		public EquExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitEquExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquExpContext equExp() throws RecognitionException {
		EquExpContext _localctx = new EquExpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_equExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			relExp();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				{
				setState(222);
				equSymbol();
				setState(223);
				relExp();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquSymbolContext extends ParserRuleContext {
		public TerminalNode NOTEQUAL() { return getToken(BlufferParser.NOTEQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(BlufferParser.EQUAL, 0); }
		public EquSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equSymbol; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitEquSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquSymbolContext equSymbol() throws RecognitionException {
		EquSymbolContext _localctx = new EquSymbolContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_equSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelExpContext extends ParserRuleContext {
		public List<AddExpContext> addExp() {
			return getRuleContexts(AddExpContext.class);
		}
		public AddExpContext addExp(int i) {
			return getRuleContext(AddExpContext.class,i);
		}
		public List<RelSymbolContext> relSymbol() {
			return getRuleContexts(RelSymbolContext.class);
		}
		public RelSymbolContext relSymbol(int i) {
			return getRuleContext(RelSymbolContext.class,i);
		}
		public RelExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitRelExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelExpContext relExp() throws RecognitionException {
		RelExpContext _localctx = new RelExpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_relExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			addExp();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) {
				{
				{
				setState(233);
				relSymbol();
				setState(234);
				addExp();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelSymbolContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(BlufferParser.LT, 0); }
		public TerminalNode GT() { return getToken(BlufferParser.GT, 0); }
		public TerminalNode GE() { return getToken(BlufferParser.GE, 0); }
		public TerminalNode LE() { return getToken(BlufferParser.LE, 0); }
		public RelSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relSymbol; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitRelSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelSymbolContext relSymbol() throws RecognitionException {
		RelSymbolContext _localctx = new RelSymbolContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_relSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddExpContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AddSymbolContext> addSymbol() {
			return getRuleContexts(AddSymbolContext.class);
		}
		public AddSymbolContext addSymbol(int i) {
			return getRuleContext(AddSymbolContext.class,i);
		}
		public AddExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitAddExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExpContext addExp() throws RecognitionException {
		AddExpContext _localctx = new AddExpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_addExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			term();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(244);
				addSymbol();
				setState(245);
				term();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddSymbolContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(BlufferParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(BlufferParser.SUB, 0); }
		public AddSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSymbol; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitAddSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSymbolContext addSymbol() throws RecognitionException {
		AddSymbolContext _localctx = new AddSymbolContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_addSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TermSymbolContext> termSymbol() {
			return getRuleContexts(TermSymbolContext.class);
		}
		public TermSymbolContext termSymbol(int i) {
			return getRuleContext(TermSymbolContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			factor();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(255);
				termSymbol();
				setState(256);
				factor();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermSymbolContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(BlufferParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(BlufferParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(BlufferParser.MOD, 0); }
		public TermSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termSymbol; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitTermSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermSymbolContext termSymbol() throws RecognitionException {
		TermSymbolContext _localctx = new TermSymbolContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_termSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(BlufferParser.SUB, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode ADD() { return getToken(BlufferParser.ADD, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(BlufferParser.Identifier, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_factor);
		int _la;
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(SUB);
				setState(266);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(ADD);
				setState(268);
				factor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				methodCall();
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK || _la==DOT) {
					{
					setState(270);
					selector();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				parExpression();
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK || _la==DOT) {
					{
					setState(274);
					selector();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
				literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(278);
				match(Identifier);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK || _la==DOT) {
					{
					setState(279);
					selector();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(BlufferParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(BlufferParser.Identifier, 0); }
		public TerminalNode LBRACK() { return getToken(BlufferParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(BlufferParser.RBRACK, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_selector);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(DOT);
				setState(285);
				match(Identifier);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(LBRACK);
				setState(287);
				expression();
				setState(288);
				match(RBRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BlufferParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(Identifier);
			setState(293);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(BlufferParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BlufferParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BlufferParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BlufferParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(LPAREN);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << LPAREN) | (1L << ADD) | (1L << SUB) | (1L << Identifier))) != 0)) {
				{
				setState(296);
				expression();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(297);
					match(COMMA);
					setState(298);
					expression();
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(306);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode FloatingPointLiteral() { return getToken(BlufferParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(BlufferParser.CharacterLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(BlufferParser.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(BlufferParser.StringLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(BlufferParser.IntegerLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0139\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\7\2C\n\2\f\2\16\2F\13\2\5\2H\n\2\3\3\3\3\3\3\5\3M\n\3\5\3O\n\3\3"+
		"\3\3\3\3\3\5\3T\n\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\5\7c\n\7\3\b\3\b\3\b\7\bh\n\b\f\b\16\bk\13\b\3\t\3\t\7\to\n\t\f\t\16"+
		"\tr\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0092\n"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009d\n\n\3\n\3\n\3\n\5\n\u00a2"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00a9\n\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u00c6\n\17\f\17\16\17\u00c9\13\17\3\17"+
		"\5\17\u00cc\n\17\5\17\u00ce\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00e4"+
		"\n\24\f\24\16\24\u00e7\13\24\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00ef"+
		"\n\26\f\26\16\26\u00f2\13\26\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00fa"+
		"\n\30\f\30\16\30\u00fd\13\30\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u0105"+
		"\n\32\f\32\16\32\u0108\13\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5"+
		"\34\u0112\n\34\3\34\3\34\5\34\u0116\n\34\3\34\3\34\3\34\5\34\u011b\n\34"+
		"\5\34\u011d\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0125\n\35\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\7\37\u012e\n\37\f\37\16\37\u0131\13\37\5"+
		"\37\u0133\n\37\3\37\3\37\3 \3 \3 \2\2!\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>\2\t\5\2\4\4\6\6\b\b\5\2\3\4\6\6\b\t\4"+
		"\2  ##\4\2\36\37!\"\3\2$%\3\2&(\3\2\16\22\2\u0142\2G\3\2\2\2\4N\3\2\2"+
		"\2\6X\3\2\2\2\bZ\3\2\2\2\n^\3\2\2\2\fb\3\2\2\2\16d\3\2\2\2\20l\3\2\2\2"+
		"\22\u00a1\3\2\2\2\24\u00a3\3\2\2\2\26\u00ad\3\2\2\2\30\u00b2\3\2\2\2\32"+
		"\u00bb\3\2\2\2\34\u00be\3\2\2\2\36\u00d1\3\2\2\2 \u00d6\3\2\2\2\"\u00d9"+
		"\3\2\2\2$\u00dd\3\2\2\2&\u00df\3\2\2\2(\u00e8\3\2\2\2*\u00ea\3\2\2\2,"+
		"\u00f3\3\2\2\2.\u00f5\3\2\2\2\60\u00fe\3\2\2\2\62\u0100\3\2\2\2\64\u0109"+
		"\3\2\2\2\66\u011c\3\2\2\28\u0124\3\2\2\2:\u0126\3\2\2\2<\u0129\3\2\2\2"+
		">\u0136\3\2\2\2@H\7\32\2\2AC\5\4\3\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3"+
		"\2\2\2EH\3\2\2\2FD\3\2\2\2G@\3\2\2\2GD\3\2\2\2H\3\3\2\2\2IO\7\f\2\2JM"+
		"\5\6\4\2KM\5\b\5\2LJ\3\2\2\2LK\3\2\2\2MO\3\2\2\2NI\3\2\2\2NL\3\2\2\2O"+
		"P\3\2\2\2PQ\7)\2\2QS\7\24\2\2RT\5\16\b\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2"+
		"UV\7\25\2\2VW\5\20\t\2W\5\3\2\2\2XY\5\n\6\2Y\7\3\2\2\2Z[\t\2\2\2[\\\7"+
		"\30\2\2\\]\7\31\2\2]\t\3\2\2\2^_\t\3\2\2_\13\3\2\2\2`c\5 \21\2ac\5\32"+
		"\16\2b`\3\2\2\2ba\3\2\2\2c\r\3\2\2\2di\5\f\7\2ef\7\33\2\2fh\5\f\7\2ge"+
		"\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\17\3\2\2\2ki\3\2\2\2lp\7\26\2"+
		"\2mo\5\22\n\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2"+
		"\2\2st\7\27\2\2t\21\3\2\2\2u\u00a2\7\32\2\2v\u00a2\5\20\t\2wx\5\26\f\2"+
		"xy\7\32\2\2y\u00a2\3\2\2\2z{\5\30\r\2{|\7\32\2\2|\u00a2\3\2\2\2}~\5\36"+
		"\20\2~\177\7\32\2\2\177\u00a2\3\2\2\2\u0080\u0081\5\34\17\2\u0081\u0082"+
		"\7\32\2\2\u0082\u00a2\3\2\2\2\u0083\u0084\5\32\16\2\u0084\u0085\7\32\2"+
		"\2\u0085\u00a2\3\2\2\2\u0086\u0087\5:\36\2\u0087\u0088\7\32\2\2\u0088"+
		"\u00a2\3\2\2\2\u0089\u008a\5 \21\2\u008a\u008b\7\32\2\2\u008b\u00a2\3"+
		"\2\2\2\u008c\u008d\7\7\2\2\u008d\u008e\5\"\22\2\u008e\u0091\5\22\n\2\u008f"+
		"\u0090\7\5\2\2\u0090\u0092\5\22\n\2\u0091\u008f\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u00a2\3\2\2\2\u0093\u0094\7\r\2\2\u0094\u0095\5\"\22\2\u0095"+
		"\u0096\5\22\n\2\u0096\u00a2\3\2\2\2\u0097\u009c\7\13\2\2\u0098\u009d\7"+
		"\32\2\2\u0099\u009a\5$\23\2\u009a\u009b\7\32\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u0098\3\2\2\2\u009c\u0099\3\2\2\2\u009d\u00a2\3\2\2\2\u009e\u009f\5\24"+
		"\13\2\u009f\u00a0\7\32\2\2\u00a0\u00a2\3\2\2\2\u00a1u\3\2\2\2\u00a1v\3"+
		"\2\2\2\u00a1w\3\2\2\2\u00a1z\3\2\2\2\u00a1}\3\2\2\2\u00a1\u0080\3\2\2"+
		"\2\u00a1\u0083\3\2\2\2\u00a1\u0086\3\2\2\2\u00a1\u0089\3\2\2\2\u00a1\u008c"+
		"\3\2\2\2\u00a1\u0093\3\2\2\2\u00a1\u0097\3\2\2\2\u00a1\u009e\3\2\2\2\u00a2"+
		"\23\3\2\2\2\u00a3\u00a8\7)\2\2\u00a4\u00a5\7\30\2\2\u00a5\u00a6\5$\23"+
		"\2\u00a6\u00a7\7\31\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\35\2\2\u00ab\u00ac\5"+
		"$\23\2\u00ac\25\3\2\2\2\u00ad\u00ae\5\6\4\2\u00ae\u00af\7)\2\2\u00af\u00b0"+
		"\7\35\2\2\u00b0\u00b1\5$\23\2\u00b1\27\3\2\2\2\u00b2\u00b3\5\b\5\2\u00b3"+
		"\u00b4\7)\2\2\u00b4\u00b5\7\35\2\2\u00b5\u00b6\7\n\2\2\u00b6\u00b7\t\2"+
		"\2\2\u00b7\u00b8\7\30\2\2\u00b8\u00b9\5$\23\2\u00b9\u00ba\7\31\2\2\u00ba"+
		"\31\3\2\2\2\u00bb\u00bc\5\b\5\2\u00bc\u00bd\7)\2\2\u00bd\33\3\2\2\2\u00be"+
		"\u00bf\5\b\5\2\u00bf\u00c0\7)\2\2\u00c0\u00c1\7\35\2\2\u00c1\u00cd\7\26"+
		"\2\2\u00c2\u00c7\5$\23\2\u00c3\u00c4\7\33\2\2\u00c4\u00c6\5$\23\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cc\7\33\2\2\u00cb"+
		"\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00c2\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7\27\2\2\u00d0"+
		"\35\3\2\2\2\u00d1\u00d2\5\b\5\2\u00d2\u00d3\7)\2\2\u00d3\u00d4\7\35\2"+
		"\2\u00d4\u00d5\5$\23\2\u00d5\37\3\2\2\2\u00d6\u00d7\5\n\6\2\u00d7\u00d8"+
		"\7)\2\2\u00d8!\3\2\2\2\u00d9\u00da\7\24\2\2\u00da\u00db\5$\23\2\u00db"+
		"\u00dc\7\25\2\2\u00dc#\3\2\2\2\u00dd\u00de\5&\24\2\u00de%\3\2\2\2\u00df"+
		"\u00e5\5*\26\2\u00e0\u00e1\5(\25\2\u00e1\u00e2\5*\26\2\u00e2\u00e4\3\2"+
		"\2\2\u00e3\u00e0\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\'\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\t\4\2\2"+
		"\u00e9)\3\2\2\2\u00ea\u00f0\5.\30\2\u00eb\u00ec\5,\27\2\u00ec\u00ed\5"+
		".\30\2\u00ed\u00ef\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1+\3\2\2\2\u00f2\u00f0\3\2\2\2"+
		"\u00f3\u00f4\t\5\2\2\u00f4-\3\2\2\2\u00f5\u00fb\5\62\32\2\u00f6\u00f7"+
		"\5\60\31\2\u00f7\u00f8\5\62\32\2\u00f8\u00fa\3\2\2\2\u00f9\u00f6\3\2\2"+
		"\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc/"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\t\6\2\2\u00ff\61\3\2\2\2\u0100"+
		"\u0106\5\66\34\2\u0101\u0102\5\64\33\2\u0102\u0103\5\66\34\2\u0103\u0105"+
		"\3\2\2\2\u0104\u0101\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\63\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\t\7\2"+
		"\2\u010a\65\3\2\2\2\u010b\u010c\7%\2\2\u010c\u011d\5\66\34\2\u010d\u010e"+
		"\7$\2\2\u010e\u011d\5\66\34\2\u010f\u0111\5:\36\2\u0110\u0112\58\35\2"+
		"\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u011d\3\2\2\2\u0113\u0115"+
		"\5\"\22\2\u0114\u0116\58\35\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2"+
		"\u0116\u011d\3\2\2\2\u0117\u011d\5> \2\u0118\u011a\7)\2\2\u0119\u011b"+
		"\58\35\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c"+
		"\u010b\3\2\2\2\u011c\u010d\3\2\2\2\u011c\u010f\3\2\2\2\u011c\u0113\3\2"+
		"\2\2\u011c\u0117\3\2\2\2\u011c\u0118\3\2\2\2\u011d\67\3\2\2\2\u011e\u011f"+
		"\7\34\2\2\u011f\u0125\7)\2\2\u0120\u0121\7\30\2\2\u0121\u0122\5$\23\2"+
		"\u0122\u0123\7\31\2\2\u0123\u0125\3\2\2\2\u0124\u011e\3\2\2\2\u0124\u0120"+
		"\3\2\2\2\u01259\3\2\2\2\u0126\u0127\7)\2\2\u0127\u0128\5<\37\2\u0128;"+
		"\3\2\2\2\u0129\u0132\7\24\2\2\u012a\u012f\5$\23\2\u012b\u012c\7\33\2\2"+
		"\u012c\u012e\5$\23\2\u012d\u012b\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d"+
		"\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0132"+
		"\u012a\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7\25"+
		"\2\2\u0135=\3\2\2\2\u0136\u0137\t\b\2\2\u0137?\3\2\2\2\34DGLNSbip\u0091"+
		"\u009c\u00a1\u00a8\u00c7\u00cb\u00cd\u00e5\u00f0\u00fb\u0106\u0111\u0115"+
		"\u011a\u011c\u0124\u012f\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}