// Generated from src/com/bluff/compiler/grammar/Avagadro.g4 by ANTLR 4.9.3
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
public class AvagadroParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, CHAR=2, ELSE=3, FLOAT=4, IF=5, INT=6, STRING=7, NEW=8, RETURN=9, 
		VOID=10, WHILE=11, LENGTH=12, IntegerLiteral=13, FloatingPointLiteral=14, 
		BooleanLiteral=15, CharacterLiteral=16, StringLiteral=17, NullLiteral=18, 
		LPAREN=19, RPAREN=20, LBRACE=21, RBRACE=22, LBRACK=23, RBRACK=24, SEMI=25, 
		COMMA=26, DOT=27, ASSIGN=28, GT=29, LT=30, EQUAL=31, LE=32, GE=33, NOTEQUAL=34, 
		ADD=35, SUB=36, MUL=37, DIV=38, MOD=39, Identifier=40, WS=41, COMMENT=42, 
		LINE_COMMENT=43;
	public static final int
		RULE_statementList = 0, RULE_methodDeclaration = 1, RULE_type = 2, RULE_primitiveType = 3, 
		RULE_parameters = 4, RULE_block = 5, RULE_statement = 6, RULE_declVarInitialize = 7, 
		RULE_createNewArray = 8, RULE_createConstantNewArray = 9, RULE_declVar = 10, 
		RULE_parExpression = 11, RULE_expression = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"statementList", "methodDeclaration", "type", "primitiveType", "parameters", 
			"block", "statement", "declVarInitialize", "createNewArray", "createConstantNewArray", 
			"declVar", "parExpression", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bool'", "'char'", "'else'", "'float'", "'if'", "'int'", "'string'", 
			"'new'", "'return'", "'void'", "'while'", "'length'", null, null, null, 
			null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
			"','", "'.'", "'='", "'>'", "'<'", "'=='", "'<='", "'>='", "'!='", "'+'", 
			"'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "CHAR", "ELSE", "FLOAT", "IF", "INT", "STRING", "NEW", 
			"RETURN", "VOID", "WHILE", "LENGTH", "IntegerLiteral", "FloatingPointLiteral", 
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
	public String getGrammarFileName() { return "Avagadro.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AvagadroParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatementListContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(AvagadroParser.SEMI, 0); }
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
			if ( visitor instanceof AvagadroVisitor ) return ((AvagadroVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statementList);
		int _la;
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(SEMI);
				}
				break;
			case EOF:
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT) | (1L << VOID))) != 0)) {
					{
					{
					setState(27);
					methodDeclaration();
					}
					}
					setState(32);
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
		public TerminalNode Identifier() { return getToken(AvagadroParser.Identifier, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode VOID() { return getToken(AvagadroParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvagadroVisitor ) return ((AvagadroVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(35);
				match(VOID);
				}
				break;
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case INT:
				{
				setState(36);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(39);
			match(Identifier);
			setState(40);
			parameters();
			setState(41);
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
		public TerminalNode LBRACK() { return getToken(AvagadroParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(AvagadroParser.RBRACK, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvagadroVisitor ) return ((AvagadroVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			primitiveType();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(44);
				match(LBRACK);
				setState(45);
				match(RBRACK);
				}
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
		public TerminalNode BOOLEAN() { return getToken(AvagadroParser.BOOLEAN, 0); }
		public TerminalNode FLOAT() { return getToken(AvagadroParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(AvagadroParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(AvagadroParser.INT, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvagadroVisitor ) return ((AvagadroVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT))) != 0)) ) {
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
		public TerminalNode LPAREN() { return getToken(AvagadroParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AvagadroParser.RPAREN, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(AvagadroParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AvagadroParser.Identifier, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvagadroVisitor ) return ((AvagadroVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(LPAREN);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT))) != 0)) {
				{
				{
				setState(51);
				type();
				setState(52);
				match(Identifier);
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AvagadroParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AvagadroParser.RBRACE, 0); }
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
			if ( visitor instanceof AvagadroVisitor ) return ((AvagadroVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(LBRACE);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << IF) | (1L << INT) | (1L << WHILE))) != 0)) {
				{
				{
				setState(62);
				statement();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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
		public DeclVarInitializeContext declVarInitialize() {
			return getRuleContext(DeclVarInitializeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AvagadroParser.SEMI, 0); }
		public CreateNewArrayContext createNewArray() {
			return getRuleContext(CreateNewArrayContext.class,0);
		}
		public CreateConstantNewArrayContext createConstantNewArray() {
			return getRuleContext(CreateConstantNewArrayContext.class,0);
		}
		public DeclVarContext declVar() {
			return getRuleContext(DeclVarContext.class,0);
		}
		public TerminalNode IF() { return getToken(AvagadroParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AvagadroParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(AvagadroParser.WHILE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvagadroVisitor ) return ((AvagadroVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				declVarInitialize();
				setState(71);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				createNewArray();
				setState(74);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				createConstantNewArray();
				setState(77);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				declVar();
				setState(80);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				match(IF);
				setState(83);
				parExpression();
				setState(84);
				statement();
				setState(87);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(85);
					match(ELSE);
					setState(86);
					statement();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				match(WHILE);
				setState(90);
				parExpression();
				setState(91);
				statement();
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

	public static class DeclVarInitializeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AvagadroParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(AvagadroParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclVarInitializeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declVarInitialize; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvagadroVisitor ) return ((AvagadroVisitor<? extends T>)visitor).visitDeclVarInitialize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclVarInitializeContext declVarInitialize() throws RecognitionException {
		DeclVarInitializeContext _localctx = new DeclVarInitializeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declVarInitialize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			primitiveType();
			setState(96);
			match(Identifier);
			setState(97);
			match(ASSIGN);
			setState(98);
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

	public static class CreateNewArrayContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AvagadroParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(AvagadroParser.ASSIGN, 0); }
		public TerminalNode NEW() { return getToken(AvagadroParser.NEW, 0); }
		public TerminalNode FLOAT() { return getToken(AvagadroParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(AvagadroParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(AvagadroParser.INT, 0); }
		public TerminalNode LBRACK() { return getToken(AvagadroParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(AvagadroParser.RBRACK, 0); }
		public CreateNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createNewArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvagadroVisitor ) return ((AvagadroVisitor<? extends T>)visitor).visitCreateNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateNewArrayContext createNewArray() throws RecognitionException {
		CreateNewArrayContext _localctx = new CreateNewArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_createNewArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			type();
			setState(101);
			match(Identifier);
			setState(102);
			match(ASSIGN);
			setState(103);
			match(NEW);
			setState(104);
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
			setState(105);
			match(LBRACK);
			setState(106);
			expression();
			setState(107);
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

	public static class CreateConstantNewArrayContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AvagadroParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(AvagadroParser.ASSIGN, 0); }
		public TerminalNode LBRACE() { return getToken(AvagadroParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AvagadroParser.RBRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AvagadroParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AvagadroParser.COMMA, i);
		}
		public CreateConstantNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createConstantNewArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvagadroVisitor ) return ((AvagadroVisitor<? extends T>)visitor).visitCreateConstantNewArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateConstantNewArrayContext createConstantNewArray() throws RecognitionException {
		CreateConstantNewArrayContext _localctx = new CreateConstantNewArrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_createConstantNewArray);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			type();
			setState(110);
			match(Identifier);
			setState(111);
			match(ASSIGN);
			setState(112);
			match(LBRACE);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FloatingPointLiteral) {
				{
				setState(113);
				expression();
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(114);
						match(COMMA);
						setState(115);
						expression();
						}
						} 
					}
					setState(120);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(121);
					match(COMMA);
					}
				}

				}
			}

			setState(126);
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

	public static class DeclVarContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AvagadroParser.Identifier, 0); }
		public DeclVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declVar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvagadroVisitor ) return ((AvagadroVisitor<? extends T>)visitor).visitDeclVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclVarContext declVar() throws RecognitionException {
		DeclVarContext _localctx = new DeclVarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			primitiveType();
			setState(129);
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
		public TerminalNode LPAREN() { return getToken(AvagadroParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AvagadroParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvagadroVisitor ) return ((AvagadroVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(LPAREN);
			setState(132);
			expression();
			setState(133);
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
		public TerminalNode FloatingPointLiteral() { return getToken(AvagadroParser.FloatingPointLiteral, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AvagadroVisitor ) return ((AvagadroVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(FloatingPointLiteral);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u008c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\5\2$"+
		"\n\2\3\3\3\3\5\3(\n\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4\61\n\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\7\69\n\6\f\6\16\6<\13\6\3\6\3\6\3\7\3\7\7\7B\n\7\f\7\16"+
		"\7E\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\bZ\n\b\3\b\3\b\3\b\3\b\5\b`\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\7\13w\n\13\f\13\16\13z\13\13\3\13\5\13}\n\13\5\13\177\n\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\2\4\5\2\3\4\6\6\b\b\5\2\4\4\6\6\b\b\2\u008d\2#\3\2\2\2\4"+
		"\'\3\2\2\2\6-\3\2\2\2\b\62\3\2\2\2\n\64\3\2\2\2\f?\3\2\2\2\16_\3\2\2\2"+
		"\20a\3\2\2\2\22f\3\2\2\2\24o\3\2\2\2\26\u0082\3\2\2\2\30\u0085\3\2\2\2"+
		"\32\u0089\3\2\2\2\34$\7\33\2\2\35\37\5\4\3\2\36\35\3\2\2\2\37\"\3\2\2"+
		"\2 \36\3\2\2\2 !\3\2\2\2!$\3\2\2\2\" \3\2\2\2#\34\3\2\2\2# \3\2\2\2$\3"+
		"\3\2\2\2%(\7\f\2\2&(\5\6\4\2\'%\3\2\2\2\'&\3\2\2\2()\3\2\2\2)*\7*\2\2"+
		"*+\5\n\6\2+,\5\f\7\2,\5\3\2\2\2-\60\5\b\5\2./\7\31\2\2/\61\7\32\2\2\60"+
		".\3\2\2\2\60\61\3\2\2\2\61\7\3\2\2\2\62\63\t\2\2\2\63\t\3\2\2\2\64:\7"+
		"\25\2\2\65\66\5\6\4\2\66\67\7*\2\2\679\3\2\2\28\65\3\2\2\29<\3\2\2\2:"+
		"8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\26\2\2>\13\3\2\2\2?C\7\27"+
		"\2\2@B\5\16\b\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3"+
		"\2\2\2FG\7\30\2\2G\r\3\2\2\2HI\5\20\t\2IJ\7\33\2\2J`\3\2\2\2KL\5\22\n"+
		"\2LM\7\33\2\2M`\3\2\2\2NO\5\24\13\2OP\7\33\2\2P`\3\2\2\2QR\5\26\f\2RS"+
		"\7\33\2\2S`\3\2\2\2TU\7\7\2\2UV\5\30\r\2VY\5\16\b\2WX\7\5\2\2XZ\5\16\b"+
		"\2YW\3\2\2\2YZ\3\2\2\2Z`\3\2\2\2[\\\7\r\2\2\\]\5\30\r\2]^\5\16\b\2^`\3"+
		"\2\2\2_H\3\2\2\2_K\3\2\2\2_N\3\2\2\2_Q\3\2\2\2_T\3\2\2\2_[\3\2\2\2`\17"+
		"\3\2\2\2ab\5\b\5\2bc\7*\2\2cd\7\36\2\2de\5\32\16\2e\21\3\2\2\2fg\5\6\4"+
		"\2gh\7*\2\2hi\7\36\2\2ij\7\n\2\2jk\t\3\2\2kl\7\31\2\2lm\5\32\16\2mn\7"+
		"\32\2\2n\23\3\2\2\2op\5\6\4\2pq\7*\2\2qr\7\36\2\2r~\7\27\2\2sx\5\32\16"+
		"\2tu\7\34\2\2uw\5\32\16\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y|\3"+
		"\2\2\2zx\3\2\2\2{}\7\34\2\2|{\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~s\3\2\2\2"+
		"~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7\30\2\2\u0081\25\3\2\2\2"+
		"\u0082\u0083\5\b\5\2\u0083\u0084\7*\2\2\u0084\27\3\2\2\2\u0085\u0086\7"+
		"\25\2\2\u0086\u0087\5\32\16\2\u0087\u0088\7\26\2\2\u0088\31\3\2\2\2\u0089"+
		"\u008a\7\20\2\2\u008a\33\3\2\2\2\r #\'\60:CY_x|~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}