// Generated from Bluffer.g4 by ANTLR 4.9.3
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
		RULE_primitiveType = 4, RULE_parameters = 5, RULE_block = 6, RULE_statement = 7, 
		RULE_assignment = 8, RULE_declVarInitialize = 9, RULE_declareAndCreateNewArray = 10, 
		RULE_declareArray = 11, RULE_declareAndCreateArrayConstant = 12, RULE_declareArrayAndAssign = 13, 
		RULE_declVar = 14, RULE_parExpression = 15, RULE_expression = 16, RULE_equExp = 17, 
		RULE_relExp = 18, RULE_addExp = 19, RULE_term = 20, RULE_factor = 21, 
		RULE_selector = 22, RULE_methodCall = 23, RULE_arguments = 24, RULE_literal = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"statementList", "methodDeclaration", "type", "arrayType", "primitiveType", 
			"parameters", "block", "statement", "assignment", "declVarInitialize", 
			"declareAndCreateNewArray", "declareArray", "declareAndCreateArrayConstant", 
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statementList);
		int _la;
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
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
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING) | (1L << VOID))) != 0)) {
					{
					{
					setState(53);
					methodDeclaration();
					}
					}
					setState(58);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(61);
				match(VOID);
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case STRING:
				{
				setState(64);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(62);
					type();
					}
					break;
				case 2:
					{
					setState(63);
					arrayType();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(68);
			match(Identifier);
			setState(69);
			match(LPAREN);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(70);
				parameters();
				}
			}

			setState(73);
			match(RPAREN);
			setState(74);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
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
			setState(79);
			match(LBRACK);
			setState(80);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(BlufferParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(BlufferParser.Identifier, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<ArrayTypeContext> arrayType() {
			return getRuleContexts(ArrayTypeContext.class);
		}
		public ArrayTypeContext arrayType(int i) {
			return getRuleContext(ArrayTypeContext.class,i);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(84);
				type();
				}
				break;
			case 2:
				{
				setState(85);
				arrayType();
				}
				break;
			}
			setState(88);
			match(Identifier);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(89);
				match(COMMA);
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(90);
					type();
					}
					break;
				case 2:
					{
					setState(91);
					arrayType();
					}
					break;
				}
				setState(94);
				match(Identifier);
				}
				}
				setState(100);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(LBRACE);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << IF) | (1L << INT) | (1L << STRING) | (1L << RETURN) | (1L << WHILE) | (1L << LBRACE) | (1L << SEMI) | (1L << Identifier))) != 0)) {
				{
				{
				setState(102);
				statement();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				declVarInitialize();
				setState(113);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				declareAndCreateNewArray();
				setState(116);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				declareArrayAndAssign();
				setState(119);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
				declareAndCreateArrayConstant();
				setState(122);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(124);
				declareArray();
				setState(125);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(127);
				methodCall();
				setState(128);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(130);
				declVar();
				setState(131);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(133);
				match(IF);
				setState(134);
				parExpression();
				setState(135);
				statement();
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(136);
					match(ELSE);
					setState(137);
					statement();
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(140);
				match(WHILE);
				setState(141);
				parExpression();
				setState(142);
				statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(144);
				match(RETURN);
				setState(149);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SEMI:
					{
					setState(145);
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
					setState(146);
					expression();
					setState(147);
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
				setState(151);
				assignment();
				setState(152);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(Identifier);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(157);
				match(LBRACK);
				setState(158);
				expression();
				setState(159);
				match(RBRACK);
				}
			}

			setState(163);
			match(ASSIGN);
			setState(164);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterDeclVarInitialize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitDeclVarInitialize(this);
		}
	}

	public final DeclVarInitializeContext declVarInitialize() throws RecognitionException {
		DeclVarInitializeContext _localctx = new DeclVarInitializeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declVarInitialize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			type();
			setState(167);
			match(Identifier);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterDeclareAndCreateNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitDeclareAndCreateNewArray(this);
		}
	}

	public final DeclareAndCreateNewArrayContext declareAndCreateNewArray() throws RecognitionException {
		DeclareAndCreateNewArrayContext _localctx = new DeclareAndCreateNewArrayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declareAndCreateNewArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			arrayType();
			setState(172);
			match(Identifier);
			setState(173);
			match(ASSIGN);
			setState(174);
			match(NEW);
			setState(175);
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
			setState(176);
			match(LBRACK);
			setState(177);
			expression();
			setState(178);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterDeclareArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitDeclareArray(this);
		}
	}

	public final DeclareArrayContext declareArray() throws RecognitionException {
		DeclareArrayContext _localctx = new DeclareArrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declareArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			arrayType();
			setState(181);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterDeclareAndCreateArrayConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitDeclareAndCreateArrayConstant(this);
		}
	}

	public final DeclareAndCreateArrayConstantContext declareAndCreateArrayConstant() throws RecognitionException {
		DeclareAndCreateArrayConstantContext _localctx = new DeclareAndCreateArrayConstantContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declareAndCreateArrayConstant);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			arrayType();
			setState(184);
			match(Identifier);
			setState(185);
			match(ASSIGN);
			setState(186);
			match(LBRACE);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << LPAREN) | (1L << ADD) | (1L << SUB) | (1L << Identifier))) != 0)) {
				{
				setState(187);
				expression();
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(188);
						match(COMMA);
						setState(189);
						expression();
						}
						} 
					}
					setState(194);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(195);
					match(COMMA);
					}
				}

				}
			}

			setState(200);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterDeclareArrayAndAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitDeclareArrayAndAssign(this);
		}
	}

	public final DeclareArrayAndAssignContext declareArrayAndAssign() throws RecognitionException {
		DeclareArrayAndAssignContext _localctx = new DeclareArrayAndAssignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declareArrayAndAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			arrayType();
			setState(203);
			match(Identifier);
			setState(204);
			match(ASSIGN);
			setState(205);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterDeclVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitDeclVar(this);
		}
	}

	public final DeclVarContext declVar() throws RecognitionException {
		DeclVarContext _localctx = new DeclVarContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			primitiveType();
			setState(208);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(LPAREN);
			setState(211);
			expression();
			setState(212);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterEquExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitEquExp(this);
		}
	}

	public final EquExpContext equExp() throws RecognitionException {
		EquExpContext _localctx = new EquExpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_equExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			relExp();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				{
				setState(217);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(218);
				relExp();
				}
				}
				setState(223);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterRelExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitRelExp(this);
		}
	}

	public final RelExpContext relExp() throws RecognitionException {
		RelExpContext _localctx = new RelExpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			addExp();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) {
				{
				{
				setState(225);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(226);
				addExp();
				}
				}
				setState(231);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterAddExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitAddExp(this);
		}
	}

	public final AddExpContext addExp() throws RecognitionException {
		AddExpContext _localctx = new AddExpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_addExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			term();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(233);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(234);
				term();
				}
				}
				setState(239);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			factor();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) {
				{
				{
				setState(241);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(242);
				factor();
				}
				}
				setState(247);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_factor);
		int _la;
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(SUB);
				setState(249);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(ADD);
				setState(251);
				factor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				methodCall();
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK || _la==DOT) {
					{
					setState(253);
					selector();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				parExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(258);
				match(Identifier);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK || _la==DOT) {
					{
					setState(259);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_selector);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(DOT);
				setState(265);
				match(Identifier);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(LBRACK);
				setState(267);
				expression();
				setState(268);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_methodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(Identifier);
			setState(273);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(LPAREN);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << LPAREN) | (1L << ADD) | (1L << SUB) | (1L << Identifier))) != 0)) {
				{
				setState(276);
				expression();
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(277);
					match(COMMA);
					setState(278);
					expression();
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(286);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlufferListener ) ((BlufferListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0125\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\5\2>\n\2\3\3\3\3"+
		"\3\3\5\3C\n\3\5\3E\n\3\3\3\3\3\3\3\5\3J\n\3\3\3\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\7\3\7\5\7Y\n\7\3\7\3\7\3\7\3\7\5\7_\n\7\3\7\3\7\7"+
		"\7c\n\7\f\7\16\7f\13\7\3\b\3\b\7\bj\n\b\f\b\16\bm\13\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008d\n\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0098\n\t\3\t\3\t\3\t\5\t\u009d\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00a4\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u00c1\n\16\f\16\16\16\u00c4\13\16\3\16\5\16\u00c7\n\16\5\16\u00c9"+
		"\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\7\23\u00de\n\23\f\23\16\23\u00e1\13\23"+
		"\3\24\3\24\3\24\7\24\u00e6\n\24\f\24\16\24\u00e9\13\24\3\25\3\25\3\25"+
		"\7\25\u00ee\n\25\f\25\16\25\u00f1\13\25\3\26\3\26\3\26\7\26\u00f6\n\26"+
		"\f\26\16\26\u00f9\13\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0101\n\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0107\n\27\5\27\u0109\n\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u0111\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32"+
		"\u011a\n\32\f\32\16\32\u011d\13\32\5\32\u011f\n\32\3\32\3\32\3\33\3\33"+
		"\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\2\t\5\2\4\4\6\6\b\b\5\2\3\4\6\6\b\t\4\2  ##\4\2\36\37!\"\3\2$%\3\2&("+
		"\3\2\16\22\2\u0133\2=\3\2\2\2\4D\3\2\2\2\6N\3\2\2\2\bP\3\2\2\2\nT\3\2"+
		"\2\2\fX\3\2\2\2\16g\3\2\2\2\20\u009c\3\2\2\2\22\u009e\3\2\2\2\24\u00a8"+
		"\3\2\2\2\26\u00ad\3\2\2\2\30\u00b6\3\2\2\2\32\u00b9\3\2\2\2\34\u00cc\3"+
		"\2\2\2\36\u00d1\3\2\2\2 \u00d4\3\2\2\2\"\u00d8\3\2\2\2$\u00da\3\2\2\2"+
		"&\u00e2\3\2\2\2(\u00ea\3\2\2\2*\u00f2\3\2\2\2,\u0108\3\2\2\2.\u0110\3"+
		"\2\2\2\60\u0112\3\2\2\2\62\u0115\3\2\2\2\64\u0122\3\2\2\2\66>\7\32\2\2"+
		"\679\5\4\3\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;>\3\2\2\2<:\3\2"+
		"\2\2=\66\3\2\2\2=:\3\2\2\2>\3\3\2\2\2?E\7\f\2\2@C\5\6\4\2AC\5\b\5\2B@"+
		"\3\2\2\2BA\3\2\2\2CE\3\2\2\2D?\3\2\2\2DB\3\2\2\2EF\3\2\2\2FG\7)\2\2GI"+
		"\7\24\2\2HJ\5\f\7\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\25\2\2LM\5\16\b"+
		"\2M\5\3\2\2\2NO\5\n\6\2O\7\3\2\2\2PQ\t\2\2\2QR\7\30\2\2RS\7\31\2\2S\t"+
		"\3\2\2\2TU\t\3\2\2U\13\3\2\2\2VY\5\6\4\2WY\5\b\5\2XV\3\2\2\2XW\3\2\2\2"+
		"YZ\3\2\2\2Zd\7)\2\2[^\7\33\2\2\\_\5\6\4\2]_\5\b\5\2^\\\3\2\2\2^]\3\2\2"+
		"\2_`\3\2\2\2`a\7)\2\2ac\3\2\2\2b[\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2"+
		"\2e\r\3\2\2\2fd\3\2\2\2gk\7\26\2\2hj\5\20\t\2ih\3\2\2\2jm\3\2\2\2ki\3"+
		"\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\7\27\2\2o\17\3\2\2\2p\u009d\7\32"+
		"\2\2q\u009d\5\16\b\2rs\5\24\13\2st\7\32\2\2t\u009d\3\2\2\2uv\5\26\f\2"+
		"vw\7\32\2\2w\u009d\3\2\2\2xy\5\34\17\2yz\7\32\2\2z\u009d\3\2\2\2{|\5\32"+
		"\16\2|}\7\32\2\2}\u009d\3\2\2\2~\177\5\30\r\2\177\u0080\7\32\2\2\u0080"+
		"\u009d\3\2\2\2\u0081\u0082\5\60\31\2\u0082\u0083\7\32\2\2\u0083\u009d"+
		"\3\2\2\2\u0084\u0085\5\36\20\2\u0085\u0086\7\32\2\2\u0086\u009d\3\2\2"+
		"\2\u0087\u0088\7\7\2\2\u0088\u0089\5 \21\2\u0089\u008c\5\20\t\2\u008a"+
		"\u008b\7\5\2\2\u008b\u008d\5\20\t\2\u008c\u008a\3\2\2\2\u008c\u008d\3"+
		"\2\2\2\u008d\u009d\3\2\2\2\u008e\u008f\7\r\2\2\u008f\u0090\5 \21\2\u0090"+
		"\u0091\5\20\t\2\u0091\u009d\3\2\2\2\u0092\u0097\7\13\2\2\u0093\u0098\7"+
		"\32\2\2\u0094\u0095\5\"\22\2\u0095\u0096\7\32\2\2\u0096\u0098\3\2\2\2"+
		"\u0097\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0098\u009d\3\2\2\2\u0099\u009a"+
		"\5\22\n\2\u009a\u009b\7\32\2\2\u009b\u009d\3\2\2\2\u009cp\3\2\2\2\u009c"+
		"q\3\2\2\2\u009cr\3\2\2\2\u009cu\3\2\2\2\u009cx\3\2\2\2\u009c{\3\2\2\2"+
		"\u009c~\3\2\2\2\u009c\u0081\3\2\2\2\u009c\u0084\3\2\2\2\u009c\u0087\3"+
		"\2\2\2\u009c\u008e\3\2\2\2\u009c\u0092\3\2\2\2\u009c\u0099\3\2\2\2\u009d"+
		"\21\3\2\2\2\u009e\u00a3\7)\2\2\u009f\u00a0\7\30\2\2\u00a0\u00a1\5\"\22"+
		"\2\u00a1\u00a2\7\31\2\2\u00a2\u00a4\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\35\2\2\u00a6\u00a7\5"+
		"\"\22\2\u00a7\23\3\2\2\2\u00a8\u00a9\5\6\4\2\u00a9\u00aa\7)\2\2\u00aa"+
		"\u00ab\7\35\2\2\u00ab\u00ac\5\"\22\2\u00ac\25\3\2\2\2\u00ad\u00ae\5\b"+
		"\5\2\u00ae\u00af\7)\2\2\u00af\u00b0\7\35\2\2\u00b0\u00b1\7\n\2\2\u00b1"+
		"\u00b2\t\2\2\2\u00b2\u00b3\7\30\2\2\u00b3\u00b4\5\"\22\2\u00b4\u00b5\7"+
		"\31\2\2\u00b5\27\3\2\2\2\u00b6\u00b7\5\b\5\2\u00b7\u00b8\7)\2\2\u00b8"+
		"\31\3\2\2\2\u00b9\u00ba\5\b\5\2\u00ba\u00bb\7)\2\2\u00bb\u00bc\7\35\2"+
		"\2\u00bc\u00c8\7\26\2\2\u00bd\u00c2\5\"\22\2\u00be\u00bf\7\33\2\2\u00bf"+
		"\u00c1\5\"\22\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3"+
		"\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"\u00c7\7\33\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3"+
		"\2\2\2\u00c8\u00bd\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\7\27\2\2\u00cb\33\3\2\2\2\u00cc\u00cd\5\b\5\2\u00cd\u00ce\7)\2"+
		"\2\u00ce\u00cf\7\35\2\2\u00cf\u00d0\5\"\22\2\u00d0\35\3\2\2\2\u00d1\u00d2"+
		"\5\n\6\2\u00d2\u00d3\7)\2\2\u00d3\37\3\2\2\2\u00d4\u00d5\7\24\2\2\u00d5"+
		"\u00d6\5\"\22\2\u00d6\u00d7\7\25\2\2\u00d7!\3\2\2\2\u00d8\u00d9\5$\23"+
		"\2\u00d9#\3\2\2\2\u00da\u00df\5&\24\2\u00db\u00dc\t\4\2\2\u00dc\u00de"+
		"\5&\24\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0%\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e7\5(\25\2"+
		"\u00e3\u00e4\t\5\2\2\u00e4\u00e6\5(\25\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\'\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00ef\5*\26\2\u00eb\u00ec\t\6\2\2\u00ec\u00ee\5*"+
		"\26\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0)\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f7\5,\27\2"+
		"\u00f3\u00f4\t\7\2\2\u00f4\u00f6\5,\27\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9"+
		"\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8+\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00fb\7%\2\2\u00fb\u0109\5,\27\2\u00fc\u00fd\7$\2"+
		"\2\u00fd\u0109\5,\27\2\u00fe\u0100\5\60\31\2\u00ff\u0101\5.\30\2\u0100"+
		"\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0109\3\2\2\2\u0102\u0109\5 "+
		"\21\2\u0103\u0109\5\64\33\2\u0104\u0106\7)\2\2\u0105\u0107\5.\30\2\u0106"+
		"\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u00fa\3\2"+
		"\2\2\u0108\u00fc\3\2\2\2\u0108\u00fe\3\2\2\2\u0108\u0102\3\2\2\2\u0108"+
		"\u0103\3\2\2\2\u0108\u0104\3\2\2\2\u0109-\3\2\2\2\u010a\u010b\7\34\2\2"+
		"\u010b\u0111\7)\2\2\u010c\u010d\7\30\2\2\u010d\u010e\5\"\22\2\u010e\u010f"+
		"\7\31\2\2\u010f\u0111\3\2\2\2\u0110\u010a\3\2\2\2\u0110\u010c\3\2\2\2"+
		"\u0111/\3\2\2\2\u0112\u0113\7)\2\2\u0113\u0114\5\62\32\2\u0114\61\3\2"+
		"\2\2\u0115\u011e\7\24\2\2\u0116\u011b\5\"\22\2\u0117\u0118\7\33\2\2\u0118"+
		"\u011a\5\"\22\2\u0119\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3"+
		"\2\2\2\u011b\u011c\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011e"+
		"\u0116\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7\25"+
		"\2\2\u0121\63\3\2\2\2\u0122\u0123\t\b\2\2\u0123\65\3\2\2\2\34:=BDIX^d"+
		"k\u008c\u0097\u009c\u00a3\u00c2\u00c6\u00c8\u00df\u00e7\u00ef\u00f7\u0100"+
		"\u0106\u0108\u0110\u011b\u011e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}