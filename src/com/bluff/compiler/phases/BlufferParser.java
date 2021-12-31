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
		RULE_expression = 17, RULE_equExp = 18, RULE_relExp = 19, RULE_addExp = 20, 
		RULE_term = 21, RULE_factor = 22, RULE_selector = 23, RULE_methodCall = 24, 
		RULE_arguments = 25, RULE_literal = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"statementList", "methodDeclaration", "type", "arrayType", "primitiveType", 
			"primitiveOrArray", "parameters", "block", "statement", "assignment", 
			"declVarInitialize", "declareAndCreateNewArray", "declareArray", "declareAndCreateArrayConstant", 
			"declareArrayAndAssign", "declVar", "parExpression", "expression", "equExp", 
			"relExp", "addExp", "term", "factor", "selector", "methodCall", "arguments", 
			"literal"
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
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
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
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VOID))) != 0)) {
					{
					{
					setState(55);
					methodDeclaration();
					}
					}
					setState(60);
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
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(63);
				match(VOID);
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case STRING:
				{
				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(64);
					type();
					}
					break;
				case 2:
					{
					setState(65);
					arrayType();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(70);
			match(Identifier);
			setState(71);
			match(LPAREN);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(72);
				parameters();
				}
			}

			setState(75);
			match(RPAREN);
			setState(76);
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
			setState(78);
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
			setState(80);
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
			setState(81);
			match(LBRACK);
			setState(82);
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
			setState(84);
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
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(86);
				declVar();
				}
				break;
			case 2:
				{
				setState(87);
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
			setState(90);
			primitiveOrArray();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(91);
				match(COMMA);
				setState(92);
				primitiveOrArray();
				}
				}
				setState(97);
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
			setState(98);
			match(LBRACE);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << IF) | (1L << INT) | (1L << STRING) | (1L << RETURN) | (1L << WHILE) | (1L << LBRACE) | (1L << SEMI) | (1L << Identifier))) != 0)) {
				{
				{
				setState(99);
				statement();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
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
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				declVarInitialize();
				setState(110);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				declareAndCreateNewArray();
				setState(113);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				declareArrayAndAssign();
				setState(116);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(118);
				declareAndCreateArrayConstant();
				setState(119);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
				declareArray();
				setState(122);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(124);
				methodCall();
				setState(125);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(127);
				declVar();
				setState(128);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(130);
				match(IF);
				setState(131);
				parExpression();
				setState(132);
				statement();
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(133);
					match(ELSE);
					setState(134);
					statement();
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(137);
				match(WHILE);
				setState(138);
				parExpression();
				setState(139);
				statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(141);
				match(RETURN);
				setState(146);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SEMI:
					{
					setState(142);
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
					setState(143);
					expression();
					setState(144);
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
				setState(148);
				assignment();
				setState(149);
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
			setState(153);
			match(Identifier);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(154);
				match(LBRACK);
				setState(155);
				expression();
				setState(156);
				match(RBRACK);
				}
			}

			setState(160);
			match(ASSIGN);
			setState(161);
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
			setState(163);
			type();
			setState(164);
			match(Identifier);
			setState(165);
			match(ASSIGN);
			setState(166);
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
			setState(168);
			arrayType();
			setState(169);
			match(Identifier);
			setState(170);
			match(ASSIGN);
			setState(171);
			match(NEW);
			setState(172);
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
			setState(173);
			match(LBRACK);
			setState(174);
			expression();
			setState(175);
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
			setState(177);
			arrayType();
			setState(178);
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
			setState(180);
			arrayType();
			setState(181);
			match(Identifier);
			setState(182);
			match(ASSIGN);
			setState(183);
			match(LBRACE);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << LPAREN) | (1L << ADD) | (1L << SUB) | (1L << Identifier))) != 0)) {
				{
				setState(184);
				expression();
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(185);
						match(COMMA);
						setState(186);
						expression();
						}
						} 
					}
					setState(191);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(192);
					match(COMMA);
					}
				}

				}
			}

			setState(197);
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
			setState(199);
			arrayType();
			setState(200);
			match(Identifier);
			setState(201);
			match(ASSIGN);
			setState(202);
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
			setState(204);
			primitiveType();
			setState(205);
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
			setState(207);
			match(LPAREN);
			setState(208);
			expression();
			setState(209);
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
			setState(211);
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
		public List<TerminalNode> NOTEQUAL() { return getTokens(BlufferParser.NOTEQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(BlufferParser.NOTEQUAL, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(BlufferParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(BlufferParser.EQUAL, i);
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
			setState(213);
			relExp();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				{
				setState(214);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(215);
				relExp();
				}
				}
				setState(220);
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

	public static class RelExpContext extends ParserRuleContext {
		public List<AddExpContext> addExp() {
			return getRuleContexts(AddExpContext.class);
		}
		public AddExpContext addExp(int i) {
			return getRuleContext(AddExpContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(BlufferParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(BlufferParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(BlufferParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(BlufferParser.GT, i);
		}
		public List<TerminalNode> GE() { return getTokens(BlufferParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(BlufferParser.GE, i);
		}
		public List<TerminalNode> LE() { return getTokens(BlufferParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(BlufferParser.LE, i);
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
		enterRule(_localctx, 38, RULE_relExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			addExp();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) {
				{
				{
				setState(222);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(223);
				addExp();
				}
				}
				setState(228);
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

	public static class AddExpContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(BlufferParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(BlufferParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(BlufferParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(BlufferParser.SUB, i);
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
		enterRule(_localctx, 40, RULE_addExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			term();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(230);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(231);
				term();
				}
				}
				setState(236);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(BlufferParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(BlufferParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(BlufferParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(BlufferParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(BlufferParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(BlufferParser.MOD, i);
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
		enterRule(_localctx, 42, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			factor();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(238);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(239);
				factor();
				}
				}
				setState(244);
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
		enterRule(_localctx, 44, RULE_factor);
		int _la;
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(SUB);
				setState(246);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(ADD);
				setState(248);
				factor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				methodCall();
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK || _la==DOT) {
					{
					setState(250);
					selector();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				parExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				match(Identifier);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK || _la==DOT) {
					{
					setState(256);
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
		enterRule(_localctx, 46, RULE_selector);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(DOT);
				setState(262);
				match(Identifier);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(LBRACK);
				setState(264);
				expression();
				setState(265);
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
		enterRule(_localctx, 48, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(Identifier);
			setState(270);
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
		enterRule(_localctx, 50, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(LPAREN);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << LPAREN) | (1L << ADD) | (1L << SUB) | (1L << Identifier))) != 0)) {
				{
				setState(273);
				expression();
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(274);
					match(COMMA);
					setState(275);
					expression();
					}
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(283);
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
		enterRule(_localctx, 52, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0122\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\5\2@\n"+
		"\2\3\3\3\3\3\3\5\3E\n\3\5\3G\n\3\3\3\3\3\3\3\5\3L\n\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\5\7[\n\7\3\b\3\b\3\b\7\b`\n\b\f\b"+
		"\16\bc\13\b\3\t\3\t\7\tg\n\t\f\t\16\tj\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008a\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u0095\n\n\3\n\3\n\3\n\5\n\u009a\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00a1\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7"+
		"\17\u00be\n\17\f\17\16\17\u00c1\13\17\3\17\5\17\u00c4\n\17\5\17\u00c6"+
		"\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\7\24\u00db\n\24\f\24\16\24\u00de\13\24"+
		"\3\25\3\25\3\25\7\25\u00e3\n\25\f\25\16\25\u00e6\13\25\3\26\3\26\3\26"+
		"\7\26\u00eb\n\26\f\26\16\26\u00ee\13\26\3\27\3\27\3\27\7\27\u00f3\n\27"+
		"\f\27\16\27\u00f6\13\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00fe\n\30"+
		"\3\30\3\30\3\30\3\30\5\30\u0104\n\30\5\30\u0106\n\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\5\31\u010e\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33"+
		"\u0117\n\33\f\33\16\33\u011a\13\33\5\33\u011c\n\33\3\33\3\33\3\34\3\34"+
		"\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\66\2\t\5\2\4\4\6\6\b\b\5\2\3\4\6\6\b\t\4\2  ##\4\2\36\37!\"\3\2$%\3\2"+
		"&(\3\2\16\22\2\u012e\2?\3\2\2\2\4F\3\2\2\2\6P\3\2\2\2\bR\3\2\2\2\nV\3"+
		"\2\2\2\fZ\3\2\2\2\16\\\3\2\2\2\20d\3\2\2\2\22\u0099\3\2\2\2\24\u009b\3"+
		"\2\2\2\26\u00a5\3\2\2\2\30\u00aa\3\2\2\2\32\u00b3\3\2\2\2\34\u00b6\3\2"+
		"\2\2\36\u00c9\3\2\2\2 \u00ce\3\2\2\2\"\u00d1\3\2\2\2$\u00d5\3\2\2\2&\u00d7"+
		"\3\2\2\2(\u00df\3\2\2\2*\u00e7\3\2\2\2,\u00ef\3\2\2\2.\u0105\3\2\2\2\60"+
		"\u010d\3\2\2\2\62\u010f\3\2\2\2\64\u0112\3\2\2\2\66\u011f\3\2\2\28@\7"+
		"\32\2\29;\5\4\3\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=@\3\2\2\2><"+
		"\3\2\2\2?8\3\2\2\2?<\3\2\2\2@\3\3\2\2\2AG\7\f\2\2BE\5\6\4\2CE\5\b\5\2"+
		"DB\3\2\2\2DC\3\2\2\2EG\3\2\2\2FA\3\2\2\2FD\3\2\2\2GH\3\2\2\2HI\7)\2\2"+
		"IK\7\24\2\2JL\5\16\b\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\25\2\2NO\5\20"+
		"\t\2O\5\3\2\2\2PQ\5\n\6\2Q\7\3\2\2\2RS\t\2\2\2ST\7\30\2\2TU\7\31\2\2U"+
		"\t\3\2\2\2VW\t\3\2\2W\13\3\2\2\2X[\5 \21\2Y[\5\32\16\2ZX\3\2\2\2ZY\3\2"+
		"\2\2[\r\3\2\2\2\\a\5\f\7\2]^\7\33\2\2^`\5\f\7\2_]\3\2\2\2`c\3\2\2\2a_"+
		"\3\2\2\2ab\3\2\2\2b\17\3\2\2\2ca\3\2\2\2dh\7\26\2\2eg\5\22\n\2fe\3\2\2"+
		"\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\27\2\2l\21\3"+
		"\2\2\2m\u009a\7\32\2\2n\u009a\5\20\t\2op\5\26\f\2pq\7\32\2\2q\u009a\3"+
		"\2\2\2rs\5\30\r\2st\7\32\2\2t\u009a\3\2\2\2uv\5\36\20\2vw\7\32\2\2w\u009a"+
		"\3\2\2\2xy\5\34\17\2yz\7\32\2\2z\u009a\3\2\2\2{|\5\32\16\2|}\7\32\2\2"+
		"}\u009a\3\2\2\2~\177\5\62\32\2\177\u0080\7\32\2\2\u0080\u009a\3\2\2\2"+
		"\u0081\u0082\5 \21\2\u0082\u0083\7\32\2\2\u0083\u009a\3\2\2\2\u0084\u0085"+
		"\7\7\2\2\u0085\u0086\5\"\22\2\u0086\u0089\5\22\n\2\u0087\u0088\7\5\2\2"+
		"\u0088\u008a\5\22\n\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u009a"+
		"\3\2\2\2\u008b\u008c\7\r\2\2\u008c\u008d\5\"\22\2\u008d\u008e\5\22\n\2"+
		"\u008e\u009a\3\2\2\2\u008f\u0094\7\13\2\2\u0090\u0095\7\32\2\2\u0091\u0092"+
		"\5$\23\2\u0092\u0093\7\32\2\2\u0093\u0095\3\2\2\2\u0094\u0090\3\2\2\2"+
		"\u0094\u0091\3\2\2\2\u0095\u009a\3\2\2\2\u0096\u0097\5\24\13\2\u0097\u0098"+
		"\7\32\2\2\u0098\u009a\3\2\2\2\u0099m\3\2\2\2\u0099n\3\2\2\2\u0099o\3\2"+
		"\2\2\u0099r\3\2\2\2\u0099u\3\2\2\2\u0099x\3\2\2\2\u0099{\3\2\2\2\u0099"+
		"~\3\2\2\2\u0099\u0081\3\2\2\2\u0099\u0084\3\2\2\2\u0099\u008b\3\2\2\2"+
		"\u0099\u008f\3\2\2\2\u0099\u0096\3\2\2\2\u009a\23\3\2\2\2\u009b\u00a0"+
		"\7)\2\2\u009c\u009d\7\30\2\2\u009d\u009e\5$\23\2\u009e\u009f\7\31\2\2"+
		"\u009f\u00a1\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a3\7\35\2\2\u00a3\u00a4\5$\23\2\u00a4\25\3\2\2\2\u00a5"+
		"\u00a6\5\6\4\2\u00a6\u00a7\7)\2\2\u00a7\u00a8\7\35\2\2\u00a8\u00a9\5$"+
		"\23\2\u00a9\27\3\2\2\2\u00aa\u00ab\5\b\5\2\u00ab\u00ac\7)\2\2\u00ac\u00ad"+
		"\7\35\2\2\u00ad\u00ae\7\n\2\2\u00ae\u00af\t\2\2\2\u00af\u00b0\7\30\2\2"+
		"\u00b0\u00b1\5$\23\2\u00b1\u00b2\7\31\2\2\u00b2\31\3\2\2\2\u00b3\u00b4"+
		"\5\b\5\2\u00b4\u00b5\7)\2\2\u00b5\33\3\2\2\2\u00b6\u00b7\5\b\5\2\u00b7"+
		"\u00b8\7)\2\2\u00b8\u00b9\7\35\2\2\u00b9\u00c5\7\26\2\2\u00ba\u00bf\5"+
		"$\23\2\u00bb\u00bc\7\33\2\2\u00bc\u00be\5$\23\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c3\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\7\33\2\2\u00c3\u00c2\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00ba\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\27\2\2\u00c8\35\3\2\2\2\u00c9\u00ca"+
		"\5\b\5\2\u00ca\u00cb\7)\2\2\u00cb\u00cc\7\35\2\2\u00cc\u00cd\5$\23\2\u00cd"+
		"\37\3\2\2\2\u00ce\u00cf\5\n\6\2\u00cf\u00d0\7)\2\2\u00d0!\3\2\2\2\u00d1"+
		"\u00d2\7\24\2\2\u00d2\u00d3\5$\23\2\u00d3\u00d4\7\25\2\2\u00d4#\3\2\2"+
		"\2\u00d5\u00d6\5&\24\2\u00d6%\3\2\2\2\u00d7\u00dc\5(\25\2\u00d8\u00d9"+
		"\t\4\2\2\u00d9\u00db\5(\25\2\u00da\u00d8\3\2\2\2\u00db\u00de\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\'\3\2\2\2\u00de\u00dc\3\2\2\2"+
		"\u00df\u00e4\5*\26\2\u00e0\u00e1\t\5\2\2\u00e1\u00e3\5*\26\2\u00e2\u00e0"+
		"\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		")\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ec\5,\27\2\u00e8\u00e9\t\6\2\2"+
		"\u00e9\u00eb\5,\27\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed+\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f4\5.\30\2\u00f0\u00f1\t\7\2\2\u00f1\u00f3\5.\30\2\u00f2\u00f0\3\2"+
		"\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"-\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7%\2\2\u00f8\u0106\5.\30\2\u00f9"+
		"\u00fa\7$\2\2\u00fa\u0106\5.\30\2\u00fb\u00fd\5\62\32\2\u00fc\u00fe\5"+
		"\60\31\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0106\3\2\2\2\u00ff"+
		"\u0106\5\"\22\2\u0100\u0106\5\66\34\2\u0101\u0103\7)\2\2\u0102\u0104\5"+
		"\60\31\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105"+
		"\u00f7\3\2\2\2\u0105\u00f9\3\2\2\2\u0105\u00fb\3\2\2\2\u0105\u00ff\3\2"+
		"\2\2\u0105\u0100\3\2\2\2\u0105\u0101\3\2\2\2\u0106/\3\2\2\2\u0107\u0108"+
		"\7\34\2\2\u0108\u010e\7)\2\2\u0109\u010a\7\30\2\2\u010a\u010b\5$\23\2"+
		"\u010b\u010c\7\31\2\2\u010c\u010e\3\2\2\2\u010d\u0107\3\2\2\2\u010d\u0109"+
		"\3\2\2\2\u010e\61\3\2\2\2\u010f\u0110\7)\2\2\u0110\u0111\5\64\33\2\u0111"+
		"\63\3\2\2\2\u0112\u011b\7\24\2\2\u0113\u0118\5$\23\2\u0114\u0115\7\33"+
		"\2\2\u0115\u0117\5$\23\2\u0116\u0114\3\2\2\2\u0117\u011a\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011b\u0113\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011e\7\25\2\2\u011e\65\3\2\2\2\u011f\u0120\t\b\2\2\u0120\67\3\2\2\2"+
		"\33<?DFKZah\u0089\u0094\u0099\u00a0\u00bf\u00c3\u00c5\u00dc\u00e4\u00ec"+
		"\u00f4\u00fd\u0103\u0105\u010d\u0118\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}