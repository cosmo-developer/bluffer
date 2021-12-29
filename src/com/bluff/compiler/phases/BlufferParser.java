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
		T__0=1, T__1=2, T__2=3, T__3=4, BOOLEAN=5, BREAK=6, BYTE=7, CASE=8, CHAR=9, 
		CONTINUE=10, DEFAULT=11, DO=12, DOUBLE=13, ELSE=14, FINAL=15, FLOAT=16, 
		FOR=17, IF=18, INT=19, LONG=20, NEW=21, RETURN=22, SHORT=23, SWITCH=24, 
		TRANSIENT=25, VOID=26, WHILE=27, IntegerLiteral=28, FloatingPointLiteral=29, 
		BooleanLiteral=30, CharacterLiteral=31, StringLiteral=32, NullLiteral=33, 
		LPAREN=34, RPAREN=35, LBRACE=36, RBRACE=37, LBRACK=38, RBRACK=39, SEMI=40, 
		COMMA=41, DOT=42, ASSIGN=43, GT=44, LT=45, BANG=46, TILDE=47, QUESTION=48, 
		COLON=49, EQUAL=50, LE=51, GE=52, NOTEQUAL=53, AND=54, OR=55, INC=56, 
		DEC=57, ADD=58, SUB=59, MUL=60, DIV=61, BITAND=62, BITOR=63, CARET=64, 
		MOD=65, ADD_ASSIGN=66, SUB_ASSIGN=67, MUL_ASSIGN=68, DIV_ASSIGN=69, AND_ASSIGN=70, 
		OR_ASSIGN=71, XOR_ASSIGN=72, MOD_ASSIGN=73, LSHIFT_ASSIGN=74, RSHIFT_ASSIGN=75, 
		URSHIFT_ASSIGN=76, Identifier=77, AT=78, ELLIPSIS=79, WS=80, COMMENT=81, 
		LINE_COMMENT=82;
	public static final int
		RULE_programBody = 0, RULE_programBodyDeclaration = 1, RULE_memberDecl = 2, 
		RULE_memberDeclaration = 3, RULE_methodDeclaration = 4, RULE_fieldDeclaration = 5, 
		RULE_methodDeclaratorRest = 6, RULE_voidMethodDeclaratorRest = 7, RULE_constantDeclarator = 8, 
		RULE_variableDeclarators = 9, RULE_variableDeclarator = 10, RULE_constantDeclaratorsRest = 11, 
		RULE_constantDeclaratorRest = 12, RULE_variableDeclaratorId = 13, RULE_variableInitializer = 14, 
		RULE_arrayInitializer = 15, RULE_modifier = 16, RULE_type = 17, RULE_primitiveType = 18, 
		RULE_formalParameters = 19, RULE_formalParameterDecls = 20, RULE_formalParameterDeclsRest = 21, 
		RULE_methodBody = 22, RULE_literal = 23, RULE_block = 24, RULE_blockStatement = 25, 
		RULE_localVariableDeclarationStatement = 26, RULE_localVariableDeclaration = 27, 
		RULE_statement = 28, RULE_formalParameter = 29, RULE_switchBlockStatementGroups = 30, 
		RULE_switchBlockStatementGroup = 31, RULE_switchLabel = 32, RULE_forControl = 33, 
		RULE_forInit = 34, RULE_enhancedForControl = 35, RULE_forUpdate = 36, 
		RULE_parExpression = 37, RULE_expressionList = 38, RULE_statementExpression = 39, 
		RULE_constantExpression = 40, RULE_expression = 41, RULE_assignmentOperator = 42, 
		RULE_conditionalExpression = 43, RULE_conditionalOrExpression = 44, RULE_conditionalAndExpression = 45, 
		RULE_inclusiveOrExpression = 46, RULE_exclusiveOrExpression = 47, RULE_andExpression = 48, 
		RULE_equalityExpression = 49, RULE_relationalExpression = 50, RULE_relationalOp = 51, 
		RULE_shiftExpression = 52, RULE_shiftOp = 53, RULE_additiveExpression = 54, 
		RULE_multiplicativeExpression = 55, RULE_unaryExpression = 56, RULE_unaryExpressionNotPlusMinus = 57, 
		RULE_castExpression = 58, RULE_primary = 59, RULE_identifierSuffix = 60, 
		RULE_creator = 61, RULE_createdName = 62, RULE_arrayCreatorRest = 63, 
		RULE_selector = 64, RULE_arguments = 65;
	private static String[] makeRuleNames() {
		return new String[] {
			"programBody", "programBodyDeclaration", "memberDecl", "memberDeclaration", 
			"methodDeclaration", "fieldDeclaration", "methodDeclaratorRest", "voidMethodDeclaratorRest", 
			"constantDeclarator", "variableDeclarators", "variableDeclarator", "constantDeclaratorsRest", 
			"constantDeclaratorRest", "variableDeclaratorId", "variableInitializer", 
			"arrayInitializer", "modifier", "type", "primitiveType", "formalParameters", 
			"formalParameterDecls", "formalParameterDeclsRest", "methodBody", "literal", 
			"block", "blockStatement", "localVariableDeclarationStatement", "localVariableDeclaration", 
			"statement", "formalParameter", "switchBlockStatementGroups", "switchBlockStatementGroup", 
			"switchLabel", "forControl", "forInit", "enhancedForControl", "forUpdate", 
			"parExpression", "expressionList", "statementExpression", "constantExpression", 
			"expression", "assignmentOperator", "conditionalExpression", "conditionalOrExpression", 
			"conditionalAndExpression", "inclusiveOrExpression", "exclusiveOrExpression", 
			"andExpression", "equalityExpression", "relationalExpression", "relationalOp", 
			"shiftExpression", "shiftOp", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "unaryExpressionNotPlusMinus", "castExpression", "primary", 
			"identifierSuffix", "creator", "createdName", "arrayCreatorRest", "selector", 
			"arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bool'", "'string'", "'this'", "'class'", "'boolean'", "'break'", 
			"'byte'", "'case'", "'char'", "'continue'", "'default'", "'do'", "'double'", 
			"'else'", "'final'", "'float'", "'for'", "'if'", "'int'", "'long'", "'new'", 
			"'return'", "'short'", "'switch'", "'transient'", "'void'", "'while'", 
			null, null, null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", 
			"':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", 
			"'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", 
			"'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", 
			null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "BOOLEAN", "BREAK", "BYTE", "CASE", "CHAR", 
			"CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "FINAL", "FLOAT", "FOR", 
			"IF", "INT", "LONG", "NEW", "RETURN", "SHORT", "SWITCH", "TRANSIENT", 
			"VOID", "WHILE", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
			"CharacterLiteral", "StringLiteral", "NullLiteral", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", 
			"GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", 
			"NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", 
			"BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "AT", "ELLIPSIS", "WS", 
			"COMMENT", "LINE_COMMENT"
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

	public static class ProgramBodyContext extends ParserRuleContext {
		public List<ProgramBodyDeclarationContext> programBodyDeclaration() {
			return getRuleContexts(ProgramBodyDeclarationContext.class);
		}
		public ProgramBodyDeclarationContext programBodyDeclaration(int i) {
			return getRuleContext(ProgramBodyDeclarationContext.class,i);
		}
		public ProgramBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitProgramBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramBodyContext programBody() throws RecognitionException {
		ProgramBodyContext _localctx = new ProgramBodyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << VOID) | (1L << SEMI))) != 0)) {
				{
				{
				setState(132);
				programBodyDeclaration();
				}
				}
				setState(137);
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

	public static class ProgramBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(BlufferParser.SEMI, 0); }
		public MemberDeclContext memberDecl() {
			return getRuleContext(MemberDeclContext.class,0);
		}
		public ProgramBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programBodyDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitProgramBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramBodyDeclarationContext programBodyDeclaration() throws RecognitionException {
		ProgramBodyDeclarationContext _localctx = new ProgramBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programBodyDeclaration);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(SEMI);
				}
				break;
			case T__0:
			case T__1:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				memberDecl();
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

	public static class MemberDeclContext extends ParserRuleContext {
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public TerminalNode VOID() { return getToken(BlufferParser.VOID, 0); }
		public TerminalNode Identifier() { return getToken(BlufferParser.Identifier, 0); }
		public VoidMethodDeclaratorRestContext voidMethodDeclaratorRest() {
			return getRuleContext(VoidMethodDeclaratorRestContext.class,0);
		}
		public MemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitMemberDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclContext memberDecl() throws RecognitionException {
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_memberDecl);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				memberDeclaration();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(VOID);
				setState(144);
				match(Identifier);
				setState(145);
				voidMethodDeclaratorRest();
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_memberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			type();
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(149);
				methodDeclaration();
				}
				break;
			case 2:
				{
				setState(150);
				fieldDeclaration();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BlufferParser.Identifier, 0); }
		public MethodDeclaratorRestContext methodDeclaratorRest() {
			return getRuleContext(MethodDeclaratorRestContext.class,0);
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
		enterRule(_localctx, 8, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(Identifier);
			setState(154);
			methodDeclaratorRest();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(BlufferParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			variableDeclarators();
			setState(157);
			match(SEMI);
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

	public static class MethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(BlufferParser.SEMI, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(BlufferParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(BlufferParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(BlufferParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(BlufferParser.RBRACK, i);
		}
		public MethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaratorRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclaratorRestContext methodDeclaratorRest() throws RecognitionException {
		MethodDeclaratorRestContext _localctx = new MethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			formalParameters();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(160);
				match(LBRACK);
				setState(161);
				match(RBRACK);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(167);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(168);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VoidMethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(BlufferParser.SEMI, 0); }
		public VoidMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidMethodDeclaratorRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitVoidMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidMethodDeclaratorRestContext voidMethodDeclaratorRest() throws RecognitionException {
		VoidMethodDeclaratorRestContext _localctx = new VoidMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_voidMethodDeclaratorRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			formalParameters();
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(172);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(173);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BlufferParser.Identifier, 0); }
		public ConstantDeclaratorRestContext constantDeclaratorRest() {
			return getRuleContext(ConstantDeclaratorRestContext.class,0);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constantDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(Identifier);
			setState(177);
			constantDeclaratorRest();
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BlufferParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BlufferParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			variableDeclarator();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(180);
				match(COMMA);
				setState(181);
				variableDeclarator();
				}
				}
				setState(186);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(BlufferParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			variableDeclaratorId();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(188);
				match(ASSIGN);
				setState(189);
				variableInitializer();
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

	public static class ConstantDeclaratorsRestContext extends ParserRuleContext {
		public ConstantDeclaratorRestContext constantDeclaratorRest() {
			return getRuleContext(ConstantDeclaratorRestContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(BlufferParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BlufferParser.COMMA, i);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public ConstantDeclaratorsRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaratorsRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitConstantDeclaratorsRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorsRestContext constantDeclaratorsRest() throws RecognitionException {
		ConstantDeclaratorsRestContext _localctx = new ConstantDeclaratorsRestContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constantDeclaratorsRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			constantDeclaratorRest();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(193);
				match(COMMA);
				setState(194);
				constantDeclarator();
				}
				}
				setState(199);
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

	public static class ConstantDeclaratorRestContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(BlufferParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(BlufferParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(BlufferParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(BlufferParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(BlufferParser.RBRACK, i);
		}
		public ConstantDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaratorRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitConstantDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorRestContext constantDeclaratorRest() throws RecognitionException {
		ConstantDeclaratorRestContext _localctx = new ConstantDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constantDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(200);
				match(LBRACK);
				setState(201);
				match(RBRACK);
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			match(ASSIGN);
			setState(208);
			variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BlufferParser.Identifier, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(BlufferParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(BlufferParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(BlufferParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(BlufferParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(Identifier);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(211);
				match(LBRACK);
				setState(212);
				match(RBRACK);
				}
				}
				setState(217);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableInitializer);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				arrayInitializer();
				}
				break;
			case T__2:
			case NEW:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				expression();
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(BlufferParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BlufferParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BlufferParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BlufferParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(LBRACE);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << NEW) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
				{
				setState(223);
				variableInitializer();
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(224);
						match(COMMA);
						setState(225);
						variableInitializer();
						}
						} 
					}
					setState(230);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(231);
					match(COMMA);
					}
				}

				}
			}

			setState(236);
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

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(BlufferParser.FINAL, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_modifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(238);
			match(FINAL);
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

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(BlufferParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(BlufferParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(BlufferParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(BlufferParser.RBRACK, i);
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
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			primitiveType();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(241);
				match(LBRACK);
				setState(242);
				match(RBRACK);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(BlufferParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(BlufferParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(BlufferParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(BlufferParser.INT, 0); }
		public TerminalNode LONG() { return getToken(BlufferParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(BlufferParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(BlufferParser.DOUBLE, 0); }
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
		enterRule(_localctx, 36, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
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

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(BlufferParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BlufferParser.RPAREN, 0); }
		public FormalParameterDeclsContext formalParameterDecls() {
			return getRuleContext(FormalParameterDeclsContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(LPAREN);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) {
				{
				setState(251);
				formalParameterDecls();
				}
			}

			setState(254);
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

	public static class FormalParameterDeclsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalParameterDeclsRestContext formalParameterDeclsRest() {
			return getRuleContext(FormalParameterDeclsRestContext.class,0);
		}
		public FormalParameterDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDecls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitFormalParameterDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterDeclsContext formalParameterDecls() throws RecognitionException {
		FormalParameterDeclsContext _localctx = new FormalParameterDeclsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_formalParameterDecls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			type();
			setState(257);
			formalParameterDeclsRest();
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

	public static class FormalParameterDeclsRestContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(BlufferParser.COMMA, 0); }
		public FormalParameterDeclsContext formalParameterDecls() {
			return getRuleContext(FormalParameterDeclsContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(BlufferParser.ELLIPSIS, 0); }
		public FormalParameterDeclsRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDeclsRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitFormalParameterDeclsRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterDeclsRestContext formalParameterDeclsRest() throws RecognitionException {
		FormalParameterDeclsRestContext _localctx = new FormalParameterDeclsRestContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_formalParameterDeclsRest);
		int _la;
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				variableDeclaratorId();
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(260);
					match(COMMA);
					setState(261);
					formalParameterDecls();
					}
				}

				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(ELLIPSIS);
				setState(265);
				variableDeclaratorId();
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(BlufferParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(BlufferParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(BlufferParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(BlufferParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(BlufferParser.BooleanLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(BlufferParser.NullLiteral, 0); }
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
		enterRule(_localctx, 46, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(BlufferParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(BlufferParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
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
		enterRule(_localctx, 48, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(LBRACE);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SWITCH) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
				{
				{
				setState(273);
				blockStatement();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_blockStatement);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				localVariableDeclarationStatement();
				}
				break;
			case T__2:
			case BREAK:
			case CONTINUE:
			case DO:
			case FOR:
			case IF:
			case NEW:
			case RETURN:
			case SWITCH:
			case WHILE:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LBRACE:
			case SEMI:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				statement();
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(BlufferParser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			localVariableDeclaration();
			setState(286);
			match(SEMI);
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			type();
			setState(289);
			variableDeclarators();
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		public TerminalNode FOR() { return getToken(BlufferParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(BlufferParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BlufferParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(BlufferParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(BlufferParser.DO, 0); }
		public TerminalNode SEMI() { return getToken(BlufferParser.SEMI, 0); }
		public TerminalNode SWITCH() { return getToken(BlufferParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(BlufferParser.LBRACE, 0); }
		public SwitchBlockStatementGroupsContext switchBlockStatementGroups() {
			return getRuleContext(SwitchBlockStatementGroupsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(BlufferParser.RBRACE, 0); }
		public TerminalNode RETURN() { return getToken(BlufferParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(BlufferParser.BREAK, 0); }
		public TerminalNode Identifier() { return getToken(BlufferParser.Identifier, 0); }
		public TerminalNode CONTINUE() { return getToken(BlufferParser.CONTINUE, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(BlufferParser.COLON, 0); }
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
		enterRule(_localctx, 56, RULE_statement);
		int _la;
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(IF);
				setState(293);
				parExpression();
				setState(294);
				statement();
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(295);
					match(ELSE);
					setState(296);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				match(FOR);
				setState(300);
				match(LPAREN);
				setState(301);
				forControl();
				setState(302);
				match(RPAREN);
				setState(303);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				match(WHILE);
				setState(306);
				parExpression();
				setState(307);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(309);
				match(DO);
				setState(310);
				statement();
				setState(311);
				match(WHILE);
				setState(312);
				parExpression();
				setState(313);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(315);
				match(SWITCH);
				setState(316);
				parExpression();
				setState(317);
				match(LBRACE);
				setState(318);
				switchBlockStatementGroups();
				setState(319);
				match(RBRACE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(321);
				match(RETURN);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << NEW) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(322);
					expression();
					}
				}

				setState(325);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(326);
				match(BREAK);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(327);
					match(Identifier);
					}
				}

				setState(330);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(331);
				match(CONTINUE);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(332);
					match(Identifier);
					}
				}

				setState(335);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(336);
				match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(337);
				statementExpression();
				setState(338);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(340);
				match(Identifier);
				setState(341);
				match(COLON);
				setState(342);
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

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			type();
			setState(346);
			variableDeclaratorId();
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

	public static class SwitchBlockStatementGroupsContext extends ParserRuleContext {
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public SwitchBlockStatementGroupsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroups; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitSwitchBlockStatementGroups(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupsContext switchBlockStatementGroups() throws RecognitionException {
		SwitchBlockStatementGroupsContext _localctx = new SwitchBlockStatementGroupsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_switchBlockStatementGroups);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(348);
				switchBlockStatementGroup();
				}
				}
				setState(353);
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_switchBlockStatementGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(355); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(354);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(357); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << RETURN) | (1L << SHORT) | (1L << SWITCH) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
				{
				{
				setState(359);
				blockStatement();
				}
				}
				setState(364);
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(BlufferParser.CASE, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(BlufferParser.COLON, 0); }
		public TerminalNode DEFAULT() { return getToken(BlufferParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_switchLabel);
		try {
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(CASE);
				setState(366);
				constantExpression();
				setState(367);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(DEFAULT);
				setState(370);
				match(COLON);
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

	public static class ForControlContext extends ParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(BlufferParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(BlufferParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_forControl);
		int _la;
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(374);
					forInit();
					}
				}

				setState(377);
				match(SEMI);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << NEW) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(378);
					expression();
					}
				}

				setState(381);
				match(SEMI);
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << NEW) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
					{
					setState(382);
					forUpdate();
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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_forInit);
		try {
			setState(389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				localVariableDeclaration();
				}
				break;
			case T__2:
			case NEW:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				expressionList();
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

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(BlufferParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(BlufferParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_enhancedForControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			type();
			setState(392);
			match(Identifier);
			setState(393);
			match(COLON);
			setState(394);
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

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			expressionList();
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
		enterRule(_localctx, 74, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(LPAREN);
			setState(399);
			expression();
			setState(400);
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

	public static class ExpressionListContext extends ParserRuleContext {
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
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			expression();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(403);
				match(COMMA);
				setState(404);
				expression();
				}
				}
				setState(409);
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

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 82, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			conditionalExpression();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (ASSIGN - 43)) | (1L << (ADD_ASSIGN - 43)) | (1L << (SUB_ASSIGN - 43)) | (1L << (MUL_ASSIGN - 43)) | (1L << (DIV_ASSIGN - 43)) | (1L << (AND_ASSIGN - 43)) | (1L << (OR_ASSIGN - 43)) | (1L << (XOR_ASSIGN - 43)) | (1L << (MOD_ASSIGN - 43)) | (1L << (LSHIFT_ASSIGN - 43)) | (1L << (RSHIFT_ASSIGN - 43)) | (1L << (URSHIFT_ASSIGN - 43)))) != 0)) {
				{
				setState(415);
				assignmentOperator();
				setState(416);
				expression();
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(BlufferParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(BlufferParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(BlufferParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(BlufferParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(BlufferParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(BlufferParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(BlufferParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(BlufferParser.XOR_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(BlufferParser.MOD_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(BlufferParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(BlufferParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(BlufferParser.URSHIFT_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_la = _input.LA(1);
			if ( !(((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (ASSIGN - 43)) | (1L << (ADD_ASSIGN - 43)) | (1L << (SUB_ASSIGN - 43)) | (1L << (MUL_ASSIGN - 43)) | (1L << (DIV_ASSIGN - 43)) | (1L << (AND_ASSIGN - 43)) | (1L << (OR_ASSIGN - 43)) | (1L << (XOR_ASSIGN - 43)) | (1L << (MOD_ASSIGN - 43)) | (1L << (LSHIFT_ASSIGN - 43)) | (1L << (RSHIFT_ASSIGN - 43)) | (1L << (URSHIFT_ASSIGN - 43)))) != 0)) ) {
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(BlufferParser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(BlufferParser.COLON, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			conditionalOrExpression();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(423);
				match(QUESTION);
				setState(424);
				expression();
				setState(425);
				match(COLON);
				setState(426);
				conditionalExpression();
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

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(BlufferParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(BlufferParser.OR, i);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			conditionalAndExpression();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(431);
				match(OR);
				setState(432);
				conditionalAndExpression();
				}
				}
				setState(437);
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

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(BlufferParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(BlufferParser.AND, i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			inclusiveOrExpression();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(439);
				match(AND);
				setState(440);
				inclusiveOrExpression();
				}
				}
				setState(445);
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

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(BlufferParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(BlufferParser.BITOR, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			exclusiveOrExpression();
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(447);
				match(BITOR);
				setState(448);
				exclusiveOrExpression();
				}
				}
				setState(453);
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

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(BlufferParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(BlufferParser.CARET, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			andExpression();
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(455);
				match(CARET);
				setState(456);
				andExpression();
				}
				}
				setState(461);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(BlufferParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(BlufferParser.BITAND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			equalityExpression();
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(463);
				match(BITAND);
				setState(464);
				equalityExpression();
				}
				}
				setState(469);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(BlufferParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(BlufferParser.EQUAL, i);
		}
		public List<TerminalNode> NOTEQUAL() { return getTokens(BlufferParser.NOTEQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(BlufferParser.NOTEQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			relationalExpression();
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				{
				setState(471);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(472);
				relationalExpression();
				}
				}
				setState(477);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<RelationalOpContext> relationalOp() {
			return getRuleContexts(RelationalOpContext.class);
		}
		public RelationalOpContext relationalOp(int i) {
			return getRuleContext(RelationalOpContext.class,i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			shiftExpression();
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LE) | (1L << GE))) != 0)) {
				{
				{
				setState(479);
				relationalOp();
				setState(480);
				shiftExpression();
				}
				}
				setState(486);
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

	public static class RelationalOpContext extends ParserRuleContext {
		public TerminalNode LE() { return getToken(BlufferParser.LE, 0); }
		public TerminalNode GE() { return getToken(BlufferParser.GE, 0); }
		public TerminalNode LT() { return getToken(BlufferParser.LT, 0); }
		public TerminalNode GT() { return getToken(BlufferParser.GT, 0); }
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitRelationalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_relationalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
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

	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<ShiftOpContext> shiftOp() {
			return getRuleContexts(ShiftOpContext.class);
		}
		public ShiftOpContext shiftOp(int i) {
			return getRuleContext(ShiftOpContext.class,i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			additiveExpression();
			setState(495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(490);
					shiftOp();
					setState(491);
					additiveExpression();
					}
					} 
				}
				setState(497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	public static class ShiftOpContext extends ParserRuleContext {
		public Token t1;
		public Token t2;
		public Token t3;
		public List<TerminalNode> LT() { return getTokens(BlufferParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(BlufferParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(BlufferParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(BlufferParser.GT, i);
		}
		public ShiftOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitShiftOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftOpContext shiftOp() throws RecognitionException {
		ShiftOpContext _localctx = new ShiftOpContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_shiftOp);
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				((ShiftOpContext)_localctx).t1 = match(LT);
				setState(499);
				((ShiftOpContext)_localctx).t2 = match(LT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				((ShiftOpContext)_localctx).t1 = match(GT);
				setState(501);
				((ShiftOpContext)_localctx).t2 = match(GT);
				setState(502);
				((ShiftOpContext)_localctx).t3 = match(GT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(503);
				((ShiftOpContext)_localctx).t1 = match(GT);
				setState(504);
				((ShiftOpContext)_localctx).t2 = match(GT);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(BlufferParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(BlufferParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(BlufferParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(BlufferParser.SUB, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			multiplicativeExpression();
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(508);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(509);
				multiplicativeExpression();
				}
				}
				setState(514);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
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
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			unaryExpression();
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (MUL - 60)) | (1L << (DIV - 60)) | (1L << (MOD - 60)))) != 0)) {
				{
				{
				setState(516);
				_la = _input.LA(1);
				if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (MUL - 60)) | (1L << (DIV - 60)) | (1L << (MOD - 60)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(517);
				unaryExpression();
				}
				}
				setState(522);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(BlufferParser.ADD, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(BlufferParser.SUB, 0); }
		public TerminalNode INC() { return getToken(BlufferParser.INC, 0); }
		public TerminalNode DEC() { return getToken(BlufferParser.DEC, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_unaryExpression);
		try {
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				match(ADD);
				setState(524);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				match(SUB);
				setState(526);
				unaryExpression();
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 3);
				{
				setState(527);
				match(INC);
				setState(528);
				unaryExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 4);
				{
				setState(529);
				match(DEC);
				setState(530);
				unaryExpression();
				}
				break;
			case T__2:
			case NEW:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(531);
				unaryExpressionNotPlusMinus();
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

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public TerminalNode TILDE() { return getToken(BlufferParser.TILDE, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(BlufferParser.BANG, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public TerminalNode INC() { return getToken(BlufferParser.INC, 0); }
		public TerminalNode DEC() { return getToken(BlufferParser.DEC, 0); }
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitUnaryExpressionNotPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_unaryExpressionNotPlusMinus);
		int _la;
		try {
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				match(TILDE);
				setState(535);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				match(BANG);
				setState(537);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(538);
				castExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(539);
				primary();
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK || _la==DOT) {
					{
					{
					setState(540);
					selector();
					}
					}
					setState(545);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INC || _la==DEC) {
					{
					setState(546);
					_la = _input.LA(1);
					if ( !(_la==INC || _la==DEC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
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

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(BlufferParser.LPAREN, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BlufferParser.RPAREN, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_castExpression);
		try {
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				match(LPAREN);
				setState(552);
				primitiveType();
				setState(553);
				match(RPAREN);
				setState(554);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				match(LPAREN);
				setState(559);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case BYTE:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SHORT:
					{
					setState(557);
					type();
					}
					break;
				case T__2:
				case NEW:
				case IntegerLiteral:
				case FloatingPointLiteral:
				case BooleanLiteral:
				case CharacterLiteral:
				case StringLiteral:
				case NullLiteral:
				case LPAREN:
				case BANG:
				case TILDE:
				case INC:
				case DEC:
				case ADD:
				case SUB:
				case Identifier:
					{
					setState(558);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(561);
				match(RPAREN);
				setState(562);
				unaryExpressionNotPlusMinus();
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

	public static class PrimaryContext extends ParserRuleContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode NEW() { return getToken(BlufferParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(BlufferParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(BlufferParser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(BlufferParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(BlufferParser.DOT, i);
		}
		public IdentifierSuffixContext identifierSuffix() {
			return getRuleContext(IdentifierSuffixContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_primary);
		int _la;
		try {
			int _alt;
			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				parExpression();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				match(T__2);
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(568);
					arguments();
					}
				}

				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
				literal();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 4);
				{
				setState(572);
				match(NEW);
				setState(573);
				creator();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(574);
				match(Identifier);
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(575);
						match(DOT);
						setState(576);
						match(Identifier);
						}
						} 
					}
					setState(581);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				setState(583);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(582);
					identifierSuffix();
					}
					break;
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

	public static class IdentifierSuffixContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(BlufferParser.DOT, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(BlufferParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(BlufferParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(BlufferParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(BlufferParser.RBRACK, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode NEW() { return getToken(BlufferParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public IdentifierSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSuffix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitIdentifierSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSuffixContext identifierSuffix() throws RecognitionException {
		IdentifierSuffixContext _localctx = new IdentifierSuffixContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_identifierSuffix);
		int _la;
		try {
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(589); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(587);
					match(LBRACK);
					setState(588);
					match(RBRACK);
					}
					}
					setState(591); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACK );
				setState(593);
				match(DOT);
				setState(594);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				match(LBRACK);
				setState(596);
				expression();
				setState(597);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(599);
				arguments();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(600);
				match(DOT);
				setState(601);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(602);
				match(DOT);
				setState(603);
				match(NEW);
				setState(604);
				creator();
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

	public static class CreatorContext extends ParserRuleContext {
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_creator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			createdName();
			{
			setState(608);
			arrayCreatorRest();
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

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(BlufferParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(BlufferParser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(BlufferParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(BlufferParser.DOT, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_createdName);
		int _la;
		try {
			setState(619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				match(Identifier);
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(611);
					match(DOT);
					setState(612);
					match(Identifier);
					}
					}
					setState(617);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__0:
			case T__1:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(618);
				primitiveType();
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

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(BlufferParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(BlufferParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(BlufferParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(BlufferParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlufferVisitor ) return ((BlufferVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(LBRACK);
			setState(649);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(622);
				match(RBRACK);
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(623);
					match(LBRACK);
					setState(624);
					match(RBRACK);
					}
					}
					setState(629);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(630);
				arrayInitializer();
				}
				break;
			case T__2:
			case NEW:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				{
				setState(631);
				expression();
				setState(632);
				match(RBRACK);
				setState(639);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(633);
						match(LBRACK);
						setState(634);
						expression();
						setState(635);
						match(RBRACK);
						}
						} 
					}
					setState(641);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(642);
						match(LBRACK);
						setState(643);
						match(RBRACK);
						}
						} 
					}
					setState(648);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(BlufferParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(BlufferParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode NEW() { return getToken(BlufferParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
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
		enterRule(_localctx, 128, RULE_selector);
		int _la;
		try {
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				match(DOT);
				setState(652);
				match(Identifier);
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(653);
					arguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				match(DOT);
				setState(657);
				match(NEW);
				setState(658);
				creator();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(659);
				match(LBRACK);
				setState(660);
				expression();
				setState(661);
				match(RBRACK);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(BlufferParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BlufferParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
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
		enterRule(_localctx, 130, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(LPAREN);
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << NEW) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << BANG) | (1L << TILDE) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB))) != 0) || _la==Identifier) {
				{
				setState(666);
				expressionList();
				}
			}

			setState(669);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3T\u02a2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\7\2\u0088\n\2\f\2\16\2\u008b"+
		"\13\2\3\3\3\3\5\3\u008f\n\3\3\4\3\4\3\4\3\4\5\4\u0095\n\4\3\5\3\5\3\5"+
		"\5\5\u009a\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\7\b\u00a5\n\b\f\b\16"+
		"\b\u00a8\13\b\3\b\3\b\5\b\u00ac\n\b\3\t\3\t\3\t\5\t\u00b1\n\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\7\13\u00b9\n\13\f\13\16\13\u00bc\13\13\3\f\3\f\3\f"+
		"\5\f\u00c1\n\f\3\r\3\r\3\r\7\r\u00c6\n\r\f\r\16\r\u00c9\13\r\3\16\3\16"+
		"\7\16\u00cd\n\16\f\16\16\16\u00d0\13\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\7\17\u00d8\n\17\f\17\16\17\u00db\13\17\3\20\3\20\5\20\u00df\n\20\3\21"+
		"\3\21\3\21\3\21\7\21\u00e5\n\21\f\21\16\21\u00e8\13\21\3\21\5\21\u00eb"+
		"\n\21\5\21\u00ed\n\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\7\23\u00f6\n"+
		"\23\f\23\16\23\u00f9\13\23\3\24\3\24\3\25\3\25\5\25\u00ff\n\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u0109\n\27\3\27\3\27\5\27\u010d"+
		"\n\27\3\30\3\30\3\31\3\31\3\32\3\32\7\32\u0115\n\32\f\32\16\32\u0118\13"+
		"\32\3\32\3\32\3\33\3\33\5\33\u011e\n\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u012c\n\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u0146\n\36\3\36\3\36\3\36\5\36\u014b\n"+
		"\36\3\36\3\36\3\36\5\36\u0150\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u015a\n\36\3\37\3\37\3\37\3 \7 \u0160\n \f \16 \u0163\13 \3"+
		"!\6!\u0166\n!\r!\16!\u0167\3!\7!\u016b\n!\f!\16!\u016e\13!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u0176\n\"\3#\3#\5#\u017a\n#\3#\3#\5#\u017e\n#\3#\3#\5"+
		"#\u0182\n#\5#\u0184\n#\3$\3$\5$\u0188\n$\3%\3%\3%\3%\3%\3&\3&\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\7(\u0198\n(\f(\16(\u019b\13(\3)\3)\3*\3*\3+\3+\3+\3"+
		"+\5+\u01a5\n+\3,\3,\3-\3-\3-\3-\3-\3-\5-\u01af\n-\3.\3.\3.\7.\u01b4\n"+
		".\f.\16.\u01b7\13.\3/\3/\3/\7/\u01bc\n/\f/\16/\u01bf\13/\3\60\3\60\3\60"+
		"\7\60\u01c4\n\60\f\60\16\60\u01c7\13\60\3\61\3\61\3\61\7\61\u01cc\n\61"+
		"\f\61\16\61\u01cf\13\61\3\62\3\62\3\62\7\62\u01d4\n\62\f\62\16\62\u01d7"+
		"\13\62\3\63\3\63\3\63\7\63\u01dc\n\63\f\63\16\63\u01df\13\63\3\64\3\64"+
		"\3\64\3\64\7\64\u01e5\n\64\f\64\16\64\u01e8\13\64\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\7\66\u01f0\n\66\f\66\16\66\u01f3\13\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\5\67\u01fc\n\67\38\38\38\78\u0201\n8\f8\168\u0204\138"+
		"\39\39\39\79\u0209\n9\f9\169\u020c\139\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u0217"+
		"\n:\3;\3;\3;\3;\3;\3;\3;\7;\u0220\n;\f;\16;\u0223\13;\3;\5;\u0226\n;\5"+
		";\u0228\n;\3<\3<\3<\3<\3<\3<\3<\3<\5<\u0232\n<\3<\3<\3<\5<\u0237\n<\3"+
		"=\3=\3=\5=\u023c\n=\3=\3=\3=\3=\3=\3=\7=\u0244\n=\f=\16=\u0247\13=\3="+
		"\5=\u024a\n=\5=\u024c\n=\3>\3>\6>\u0250\n>\r>\16>\u0251\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\5>\u0260\n>\3?\3?\3?\3@\3@\3@\7@\u0268\n@\f@\16"+
		"@\u026b\13@\3@\5@\u026e\n@\3A\3A\3A\3A\7A\u0274\nA\fA\16A\u0277\13A\3"+
		"A\3A\3A\3A\3A\3A\3A\7A\u0280\nA\fA\16A\u0283\13A\3A\3A\7A\u0287\nA\fA"+
		"\16A\u028a\13A\5A\u028c\nA\3B\3B\3B\5B\u0291\nB\3B\3B\3B\3B\3B\3B\3B\5"+
		"B\u029a\nB\3C\3C\5C\u029e\nC\3C\3C\3C\2\2D\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\2\n\t\2\3\4\t\t\13\13\17\17\22\22\25\26\31\31\3\2"+
		"\36#\4\2--DN\4\2\64\64\67\67\4\2./\65\66\3\2<=\4\2>?CC\3\2:;\2\u02bd\2"+
		"\u0089\3\2\2\2\4\u008e\3\2\2\2\6\u0094\3\2\2\2\b\u0096\3\2\2\2\n\u009b"+
		"\3\2\2\2\f\u009e\3\2\2\2\16\u00a1\3\2\2\2\20\u00ad\3\2\2\2\22\u00b2\3"+
		"\2\2\2\24\u00b5\3\2\2\2\26\u00bd\3\2\2\2\30\u00c2\3\2\2\2\32\u00ce\3\2"+
		"\2\2\34\u00d4\3\2\2\2\36\u00de\3\2\2\2 \u00e0\3\2\2\2\"\u00f0\3\2\2\2"+
		"$\u00f2\3\2\2\2&\u00fa\3\2\2\2(\u00fc\3\2\2\2*\u0102\3\2\2\2,\u010c\3"+
		"\2\2\2.\u010e\3\2\2\2\60\u0110\3\2\2\2\62\u0112\3\2\2\2\64\u011d\3\2\2"+
		"\2\66\u011f\3\2\2\28\u0122\3\2\2\2:\u0159\3\2\2\2<\u015b\3\2\2\2>\u0161"+
		"\3\2\2\2@\u0165\3\2\2\2B\u0175\3\2\2\2D\u0183\3\2\2\2F\u0187\3\2\2\2H"+
		"\u0189\3\2\2\2J\u018e\3\2\2\2L\u0190\3\2\2\2N\u0194\3\2\2\2P\u019c\3\2"+
		"\2\2R\u019e\3\2\2\2T\u01a0\3\2\2\2V\u01a6\3\2\2\2X\u01a8\3\2\2\2Z\u01b0"+
		"\3\2\2\2\\\u01b8\3\2\2\2^\u01c0\3\2\2\2`\u01c8\3\2\2\2b\u01d0\3\2\2\2"+
		"d\u01d8\3\2\2\2f\u01e0\3\2\2\2h\u01e9\3\2\2\2j\u01eb\3\2\2\2l\u01fb\3"+
		"\2\2\2n\u01fd\3\2\2\2p\u0205\3\2\2\2r\u0216\3\2\2\2t\u0227\3\2\2\2v\u0236"+
		"\3\2\2\2x\u024b\3\2\2\2z\u025f\3\2\2\2|\u0261\3\2\2\2~\u026d\3\2\2\2\u0080"+
		"\u026f\3\2\2\2\u0082\u0299\3\2\2\2\u0084\u029b\3\2\2\2\u0086\u0088\5\4"+
		"\3\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\3\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008f\7*\2\2"+
		"\u008d\u008f\5\6\4\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\5\3"+
		"\2\2\2\u0090\u0095\5\b\5\2\u0091\u0092\7\34\2\2\u0092\u0093\7O\2\2\u0093"+
		"\u0095\5\20\t\2\u0094\u0090\3\2\2\2\u0094\u0091\3\2\2\2\u0095\7\3\2\2"+
		"\2\u0096\u0099\5$\23\2\u0097\u009a\5\n\6\2\u0098\u009a\5\f\7\2\u0099\u0097"+
		"\3\2\2\2\u0099\u0098\3\2\2\2\u009a\t\3\2\2\2\u009b\u009c\7O\2\2\u009c"+
		"\u009d\5\16\b\2\u009d\13\3\2\2\2\u009e\u009f\5\24\13\2\u009f\u00a0\7*"+
		"\2\2\u00a0\r\3\2\2\2\u00a1\u00a6\5(\25\2\u00a2\u00a3\7(\2\2\u00a3\u00a5"+
		"\7)\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\5."+
		"\30\2\u00aa\u00ac\7*\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\17\3\2\2\2\u00ad\u00b0\5(\25\2\u00ae\u00b1\5.\30\2\u00af\u00b1\7*\2\2"+
		"\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\21\3\2\2\2\u00b2\u00b3"+
		"\7O\2\2\u00b3\u00b4\5\32\16\2\u00b4\23\3\2\2\2\u00b5\u00ba\5\26\f\2\u00b6"+
		"\u00b7\7+\2\2\u00b7\u00b9\5\26\f\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\25\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bd\u00c0\5\34\17\2\u00be\u00bf\7-\2\2\u00bf\u00c1\5\36\20"+
		"\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\27\3\2\2\2\u00c2\u00c7"+
		"\5\32\16\2\u00c3\u00c4\7+\2\2\u00c4\u00c6\5\22\n\2\u00c5\u00c3\3\2\2\2"+
		"\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\31"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7(\2\2\u00cb\u00cd\7)\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7-\2\2\u00d2"+
		"\u00d3\5\36\20\2\u00d3\33\3\2\2\2\u00d4\u00d9\7O\2\2\u00d5\u00d6\7(\2"+
		"\2\u00d6\u00d8\7)\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\35\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00df\5 \21\2\u00dd\u00df\5T+\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2"+
		"\2\u00df\37\3\2\2\2\u00e0\u00ec\7&\2\2\u00e1\u00e6\5\36\20\2\u00e2\u00e3"+
		"\7+\2\2\u00e3\u00e5\5\36\20\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2"+
		"\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9\u00eb\7+\2\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00e1\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00ef\7\'\2\2\u00ef!\3\2\2\2\u00f0\u00f1\7\21\2\2\u00f1#\3"+
		"\2\2\2\u00f2\u00f7\5&\24\2\u00f3\u00f4\7(\2\2\u00f4\u00f6\7)\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8%\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\t\2\2\2\u00fb\'\3"+
		"\2\2\2\u00fc\u00fe\7$\2\2\u00fd\u00ff\5*\26\2\u00fe\u00fd\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7%\2\2\u0101)\3\2\2\2\u0102"+
		"\u0103\5$\23\2\u0103\u0104\5,\27\2\u0104+\3\2\2\2\u0105\u0108\5\34\17"+
		"\2\u0106\u0107\7+\2\2\u0107\u0109\5*\26\2\u0108\u0106\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u010d\3\2\2\2\u010a\u010b\7Q\2\2\u010b\u010d\5\34\17\2"+
		"\u010c\u0105\3\2\2\2\u010c\u010a\3\2\2\2\u010d-\3\2\2\2\u010e\u010f\5"+
		"\62\32\2\u010f/\3\2\2\2\u0110\u0111\t\3\2\2\u0111\61\3\2\2\2\u0112\u0116"+
		"\7&\2\2\u0113\u0115\5\64\33\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2"+
		"\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0119\u011a\7\'\2\2\u011a\63\3\2\2\2\u011b\u011e\5\66\34\2\u011c"+
		"\u011e\5:\36\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\65\3\2\2"+
		"\2\u011f\u0120\58\35\2\u0120\u0121\7*\2\2\u0121\67\3\2\2\2\u0122\u0123"+
		"\5$\23\2\u0123\u0124\5\24\13\2\u01249\3\2\2\2\u0125\u015a\5\62\32\2\u0126"+
		"\u0127\7\24\2\2\u0127\u0128\5L\'\2\u0128\u012b\5:\36\2\u0129\u012a\7\20"+
		"\2\2\u012a\u012c\5:\36\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u015a\3\2\2\2\u012d\u012e\7\23\2\2\u012e\u012f\7$\2\2\u012f\u0130\5D"+
		"#\2\u0130\u0131\7%\2\2\u0131\u0132\5:\36\2\u0132\u015a\3\2\2\2\u0133\u0134"+
		"\7\35\2\2\u0134\u0135\5L\'\2\u0135\u0136\5:\36\2\u0136\u015a\3\2\2\2\u0137"+
		"\u0138\7\16\2\2\u0138\u0139\5:\36\2\u0139\u013a\7\35\2\2\u013a\u013b\5"+
		"L\'\2\u013b\u013c\7*\2\2\u013c\u015a\3\2\2\2\u013d\u013e\7\32\2\2\u013e"+
		"\u013f\5L\'\2\u013f\u0140\7&\2\2\u0140\u0141\5> \2\u0141\u0142\7\'\2\2"+
		"\u0142\u015a\3\2\2\2\u0143\u0145\7\30\2\2\u0144\u0146\5T+\2\u0145\u0144"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u015a\7*\2\2\u0148"+
		"\u014a\7\b\2\2\u0149\u014b\7O\2\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014c\3\2\2\2\u014c\u015a\7*\2\2\u014d\u014f\7\f\2\2\u014e"+
		"\u0150\7O\2\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2"+
		"\2\2\u0151\u015a\7*\2\2\u0152\u015a\7*\2\2\u0153\u0154\5P)\2\u0154\u0155"+
		"\7*\2\2\u0155\u015a\3\2\2\2\u0156\u0157\7O\2\2\u0157\u0158\7\63\2\2\u0158"+
		"\u015a\5:\36\2\u0159\u0125\3\2\2\2\u0159\u0126\3\2\2\2\u0159\u012d\3\2"+
		"\2\2\u0159\u0133\3\2\2\2\u0159\u0137\3\2\2\2\u0159\u013d\3\2\2\2\u0159"+
		"\u0143\3\2\2\2\u0159\u0148\3\2\2\2\u0159\u014d\3\2\2\2\u0159\u0152\3\2"+
		"\2\2\u0159\u0153\3\2\2\2\u0159\u0156\3\2\2\2\u015a;\3\2\2\2\u015b\u015c"+
		"\5$\23\2\u015c\u015d\5\34\17\2\u015d=\3\2\2\2\u015e\u0160\5@!\2\u015f"+
		"\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162?\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0166\5B\"\2\u0165\u0164"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u016c\3\2\2\2\u0169\u016b\5\64\33\2\u016a\u0169\3\2\2\2\u016b\u016e\3"+
		"\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016dA\3\2\2\2\u016e\u016c"+
		"\3\2\2\2\u016f\u0170\7\n\2\2\u0170\u0171\5R*\2\u0171\u0172\7\63\2\2\u0172"+
		"\u0176\3\2\2\2\u0173\u0174\7\r\2\2\u0174\u0176\7\63\2\2\u0175\u016f\3"+
		"\2\2\2\u0175\u0173\3\2\2\2\u0176C\3\2\2\2\u0177\u0184\5H%\2\u0178\u017a"+
		"\5F$\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017d\7*\2\2\u017c\u017e\5T+\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2"+
		"\2\u017e\u017f\3\2\2\2\u017f\u0181\7*\2\2\u0180\u0182\5J&\2\u0181\u0180"+
		"\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0177\3\2\2\2\u0183"+
		"\u0179\3\2\2\2\u0184E\3\2\2\2\u0185\u0188\58\35\2\u0186\u0188\5N(\2\u0187"+
		"\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188G\3\2\2\2\u0189\u018a\5$\23\2"+
		"\u018a\u018b\7O\2\2\u018b\u018c\7\63\2\2\u018c\u018d\5T+\2\u018dI\3\2"+
		"\2\2\u018e\u018f\5N(\2\u018fK\3\2\2\2\u0190\u0191\7$\2\2\u0191\u0192\5"+
		"T+\2\u0192\u0193\7%\2\2\u0193M\3\2\2\2\u0194\u0199\5T+\2\u0195\u0196\7"+
		"+\2\2\u0196\u0198\5T+\2\u0197\u0195\3\2\2\2\u0198\u019b\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019aO\3\2\2\2\u019b\u0199\3\2\2\2"+
		"\u019c\u019d\5T+\2\u019dQ\3\2\2\2\u019e\u019f\5T+\2\u019fS\3\2\2\2\u01a0"+
		"\u01a4\5X-\2\u01a1\u01a2\5V,\2\u01a2\u01a3\5T+\2\u01a3\u01a5\3\2\2\2\u01a4"+
		"\u01a1\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5U\3\2\2\2\u01a6\u01a7\t\4\2\2"+
		"\u01a7W\3\2\2\2\u01a8\u01ae\5Z.\2\u01a9\u01aa\7\62\2\2\u01aa\u01ab\5T"+
		"+\2\u01ab\u01ac\7\63\2\2\u01ac\u01ad\5X-\2\u01ad\u01af\3\2\2\2\u01ae\u01a9"+
		"\3\2\2\2\u01ae\u01af\3\2\2\2\u01afY\3\2\2\2\u01b0\u01b5\5\\/\2\u01b1\u01b2"+
		"\79\2\2\u01b2\u01b4\5\\/\2\u01b3\u01b1\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5"+
		"\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6[\3\2\2\2\u01b7\u01b5\3\2\2\2"+
		"\u01b8\u01bd\5^\60\2\u01b9\u01ba\78\2\2\u01ba\u01bc\5^\60\2\u01bb\u01b9"+
		"\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"]\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c5\5`\61\2\u01c1\u01c2\7A\2\2\u01c2"+
		"\u01c4\5`\61\2\u01c3\u01c1\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2"+
		"\2\2\u01c5\u01c6\3\2\2\2\u01c6_\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01cd"+
		"\5b\62\2\u01c9\u01ca\7B\2\2\u01ca\u01cc\5b\62\2\u01cb\u01c9\3\2\2\2\u01cc"+
		"\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01cea\3\2\2\2"+
		"\u01cf\u01cd\3\2\2\2\u01d0\u01d5\5d\63\2\u01d1\u01d2\7@\2\2\u01d2\u01d4"+
		"\5d\63\2\u01d3\u01d1\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6c\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01dd\5f\64\2"+
		"\u01d9\u01da\t\5\2\2\u01da\u01dc\5f\64\2\u01db\u01d9\3\2\2\2\u01dc\u01df"+
		"\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01dee\3\2\2\2\u01df"+
		"\u01dd\3\2\2\2\u01e0\u01e6\5j\66\2\u01e1\u01e2\5h\65\2\u01e2\u01e3\5j"+
		"\66\2\u01e3\u01e5\3\2\2\2\u01e4\u01e1\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7g\3\2\2\2\u01e8\u01e6\3\2\2\2"+
		"\u01e9\u01ea\t\6\2\2\u01eai\3\2\2\2\u01eb\u01f1\5n8\2\u01ec\u01ed\5l\67"+
		"\2\u01ed\u01ee\5n8\2\u01ee\u01f0\3\2\2\2\u01ef\u01ec\3\2\2\2\u01f0\u01f3"+
		"\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2k\3\2\2\2\u01f3"+
		"\u01f1\3\2\2\2\u01f4\u01f5\7/\2\2\u01f5\u01fc\7/\2\2\u01f6\u01f7\7.\2"+
		"\2\u01f7\u01f8\7.\2\2\u01f8\u01fc\7.\2\2\u01f9\u01fa\7.\2\2\u01fa\u01fc"+
		"\7.\2\2\u01fb\u01f4\3\2\2\2\u01fb\u01f6\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc"+
		"m\3\2\2\2\u01fd\u0202\5p9\2\u01fe\u01ff\t\7\2\2\u01ff\u0201\5p9\2\u0200"+
		"\u01fe\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2"+
		"\2\2\u0203o\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u020a\5r:\2\u0206\u0207"+
		"\t\b\2\2\u0207\u0209\5r:\2\u0208\u0206\3\2\2\2\u0209\u020c\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020bq\3\2\2\2\u020c\u020a\3\2\2\2"+
		"\u020d\u020e\7<\2\2\u020e\u0217\5r:\2\u020f\u0210\7=\2\2\u0210\u0217\5"+
		"r:\2\u0211\u0212\7:\2\2\u0212\u0217\5r:\2\u0213\u0214\7;\2\2\u0214\u0217"+
		"\5r:\2\u0215\u0217\5t;\2\u0216\u020d\3\2\2\2\u0216\u020f\3\2\2\2\u0216"+
		"\u0211\3\2\2\2\u0216\u0213\3\2\2\2\u0216\u0215\3\2\2\2\u0217s\3\2\2\2"+
		"\u0218\u0219\7\61\2\2\u0219\u0228\5r:\2\u021a\u021b\7\60\2\2\u021b\u0228"+
		"\5r:\2\u021c\u0228\5v<\2\u021d\u0221\5x=\2\u021e\u0220\5\u0082B\2\u021f"+
		"\u021e\3\2\2\2\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2"+
		"\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u0226\t\t\2\2\u0225"+
		"\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228\3\2\2\2\u0227\u0218\3\2"+
		"\2\2\u0227\u021a\3\2\2\2\u0227\u021c\3\2\2\2\u0227\u021d\3\2\2\2\u0228"+
		"u\3\2\2\2\u0229\u022a\7$\2\2\u022a\u022b\5&\24\2\u022b\u022c\7%\2\2\u022c"+
		"\u022d\5r:\2\u022d\u0237\3\2\2\2\u022e\u0231\7$\2\2\u022f\u0232\5$\23"+
		"\2\u0230\u0232\5T+\2\u0231\u022f\3\2\2\2\u0231\u0230\3\2\2\2\u0232\u0233"+
		"\3\2\2\2\u0233\u0234\7%\2\2\u0234\u0235\5t;\2\u0235\u0237\3\2\2\2\u0236"+
		"\u0229\3\2\2\2\u0236\u022e\3\2\2\2\u0237w\3\2\2\2\u0238\u024c\5L\'\2\u0239"+
		"\u023b\7\5\2\2\u023a\u023c\5\u0084C\2\u023b\u023a\3\2\2\2\u023b\u023c"+
		"\3\2\2\2\u023c\u024c\3\2\2\2\u023d\u024c\5\60\31\2\u023e\u023f\7\27\2"+
		"\2\u023f\u024c\5|?\2\u0240\u0245\7O\2\2\u0241\u0242\7,\2\2\u0242\u0244"+
		"\7O\2\2\u0243\u0241\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u024a\5z"+
		">\2\u0249\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\3\2\2\2\u024b"+
		"\u0238\3\2\2\2\u024b\u0239\3\2\2\2\u024b\u023d\3\2\2\2\u024b\u023e\3\2"+
		"\2\2\u024b\u0240\3\2\2\2\u024cy\3\2\2\2\u024d\u024e\7(\2\2\u024e\u0250"+
		"\7)\2\2\u024f\u024d\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u024f\3\2\2\2\u0251"+
		"\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\7,\2\2\u0254\u0260\7\6"+
		"\2\2\u0255\u0256\7(\2\2\u0256\u0257\5T+\2\u0257\u0258\7)\2\2\u0258\u0260"+
		"\3\2\2\2\u0259\u0260\5\u0084C\2\u025a\u025b\7,\2\2\u025b\u0260\7\5\2\2"+
		"\u025c\u025d\7,\2\2\u025d\u025e\7\27\2\2\u025e\u0260\5|?\2\u025f\u024f"+
		"\3\2\2\2\u025f\u0255\3\2\2\2\u025f\u0259\3\2\2\2\u025f\u025a\3\2\2\2\u025f"+
		"\u025c\3\2\2\2\u0260{\3\2\2\2\u0261\u0262\5~@\2\u0262\u0263\5\u0080A\2"+
		"\u0263}\3\2\2\2\u0264\u0269\7O\2\2\u0265\u0266\7,\2\2\u0266\u0268\7O\2"+
		"\2\u0267\u0265\3\2\2\2\u0268\u026b\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a"+
		"\3\2\2\2\u026a\u026e\3\2\2\2\u026b\u0269\3\2\2\2\u026c\u026e\5&\24\2\u026d"+
		"\u0264\3\2\2\2\u026d\u026c\3\2\2\2\u026e\177\3\2\2\2\u026f\u028b\7(\2"+
		"\2\u0270\u0275\7)\2\2\u0271\u0272\7(\2\2\u0272\u0274\7)\2\2\u0273\u0271"+
		"\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2\2\2\u0275\u0276\3\2\2\2\u0276"+
		"\u0278\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u028c\5 \21\2\u0279\u027a\5T"+
		"+\2\u027a\u0281\7)\2\2\u027b\u027c\7(\2\2\u027c\u027d\5T+\2\u027d\u027e"+
		"\7)\2\2\u027e\u0280\3\2\2\2\u027f\u027b\3\2\2\2\u0280\u0283\3\2\2\2\u0281"+
		"\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0288\3\2\2\2\u0283\u0281\3\2"+
		"\2\2\u0284\u0285\7(\2\2\u0285\u0287\7)\2\2\u0286\u0284\3\2\2\2\u0287\u028a"+
		"\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028c\3\2\2\2\u028a"+
		"\u0288\3\2\2\2\u028b\u0270\3\2\2\2\u028b\u0279\3\2\2\2\u028c\u0081\3\2"+
		"\2\2\u028d\u028e\7,\2\2\u028e\u0290\7O\2\2\u028f\u0291\5\u0084C\2\u0290"+
		"\u028f\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u029a\3\2\2\2\u0292\u0293\7,"+
		"\2\2\u0293\u0294\7\27\2\2\u0294\u029a\5|?\2\u0295\u0296\7(\2\2\u0296\u0297"+
		"\5T+\2\u0297\u0298\7)\2\2\u0298\u029a\3\2\2\2\u0299\u028d\3\2\2\2\u0299"+
		"\u0292\3\2\2\2\u0299\u0295\3\2\2\2\u029a\u0083\3\2\2\2\u029b\u029d\7$"+
		"\2\2\u029c\u029e\5N(\2\u029d\u029c\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f"+
		"\3\2\2\2\u029f\u02a0\7%\2\2\u02a0\u0085\3\2\2\2I\u0089\u008e\u0094\u0099"+
		"\u00a6\u00ab\u00b0\u00ba\u00c0\u00c7\u00ce\u00d9\u00de\u00e6\u00ea\u00ec"+
		"\u00f7\u00fe\u0108\u010c\u0116\u011d\u012b\u0145\u014a\u014f\u0159\u0161"+
		"\u0167\u016c\u0175\u0179\u017d\u0181\u0183\u0187\u0199\u01a4\u01ae\u01b5"+
		"\u01bd\u01c5\u01cd\u01d5\u01dd\u01e6\u01f1\u01fb\u0202\u020a\u0216\u0221"+
		"\u0225\u0227\u0231\u0236\u023b\u0245\u0249\u024b\u0251\u025f\u0269\u026d"+
		"\u0275\u0281\u0288\u028b\u0290\u0299\u029d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}