// Generated from src/com/bluff/compiler/grammar/Bluffer.g4 by ANTLR 4.9.3
package com.bluff.compiler.phases;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BlufferLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, BOOLEAN=4, BREAK=5, BYTE=6, CASE=7, CHAR=8, CONTINUE=9, 
		DEFAULT=10, DO=11, DOUBLE=12, ELSE=13, FINAL=14, FLOAT=15, FOR=16, IF=17, 
		INT=18, STRING=19, LONG=20, NEW=21, RETURN=22, SHORT=23, SWITCH=24, TRANSIENT=25, 
		VOID=26, WHILE=27, IntegerLiteral=28, FloatingPointLiteral=29, BooleanLiteral=30, 
		CharacterLiteral=31, StringLiteral=32, NullLiteral=33, LPAREN=34, RPAREN=35, 
		LBRACE=36, RBRACE=37, LBRACK=38, RBRACK=39, SEMI=40, COMMA=41, DOT=42, 
		ASSIGN=43, GT=44, LT=45, BANG=46, TILDE=47, QUESTION=48, COLON=49, EQUAL=50, 
		LE=51, GE=52, NOTEQUAL=53, AND=54, OR=55, INC=56, DEC=57, ADD=58, SUB=59, 
		MUL=60, DIV=61, BITAND=62, BITOR=63, CARET=64, MOD=65, ADD_ASSIGN=66, 
		SUB_ASSIGN=67, MUL_ASSIGN=68, DIV_ASSIGN=69, AND_ASSIGN=70, OR_ASSIGN=71, 
		XOR_ASSIGN=72, MOD_ASSIGN=73, LSHIFT_ASSIGN=74, RSHIFT_ASSIGN=75, URSHIFT_ASSIGN=76, 
		Identifier=77, AT=78, ELLIPSIS=79, WS=80, COMMENT=81, LINE_COMMENT=82;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "BOOLEAN", "BREAK", "BYTE", "CASE", "CHAR", "CONTINUE", 
			"DEFAULT", "DO", "DOUBLE", "ELSE", "FINAL", "FLOAT", "FOR", "IF", "INT", 
			"STRING", "LONG", "NEW", "RETURN", "SHORT", "SWITCH", "TRANSIENT", "VOID", 
			"WHILE", "IntegerLiteral", "DecimalIntegerLiteral", "HexIntegerLiteral", 
			"OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", 
			"Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore", 
			"Underscores", "HexNumeral", "HexDigits", "HexDigit", "HexDigitsAndUnderscores", 
			"HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", "OctalDigit", 
			"OctalDigitsAndUnderscores", "OctalDigitOrUnderscore", "BinaryNumeral", 
			"BinaryDigits", "BinaryDigit", "BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", 
			"FloatingPointLiteral", "DecimalFloatingPointLiteral", "ExponentPart", 
			"ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", 
			"HexSignificand", "BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", 
			"CharacterLiteral", "SingleCharacter", "StringLiteral", "StringCharacters", 
			"StringCharacter", "EscapeSequence", "OctalEscape", "ZeroToThree", "NullLiteral", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
			"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", 
			"JavaLetter", "JavaLetterOrDigit", "AT", "ELLIPSIS", "WS", "COMMENT", 
			"LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'jitter'", "'this'", "'class'", "'bool'", "'break'", "'byte'", 
			"'case'", "'char'", "'continue'", "'default'", "'do'", "'double'", "'else'", 
			"'final'", "'float'", "'for'", "'if'", "'int'", "'string'", "'long'", 
			"'new'", "'return'", "'short'", "'switch'", "'transient'", "'void'", 
			"'while'", null, null, null, null, null, "'null'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
			"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
			"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", 
			"'>>='", "'>>>='", null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "BOOLEAN", "BREAK", "BYTE", "CASE", "CHAR", "CONTINUE", 
			"DEFAULT", "DO", "DOUBLE", "ELSE", "FINAL", "FLOAT", "FOR", "IF", "INT", 
			"STRING", "LONG", "NEW", "RETURN", "SHORT", "SWITCH", "TRANSIENT", "VOID", 
			"WHILE", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
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


	    


	public BlufferLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bluffer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 120:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 121:
			return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2T\u034f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u01a2\n\35\3\36\3\36\5\36"+
		"\u01a6\n\36\3\37\3\37\5\37\u01aa\n\37\3 \3 \5 \u01ae\n \3!\3!\5!\u01b2"+
		"\n!\3\"\3\"\3#\3#\3#\5#\u01b9\n#\3#\3#\3#\5#\u01be\n#\5#\u01c0\n#\3$\3"+
		"$\5$\u01c4\n$\3$\5$\u01c7\n$\3%\3%\5%\u01cb\n%\3&\3&\3\'\6\'\u01d0\n\'"+
		"\r\'\16\'\u01d1\3(\3(\5(\u01d6\n(\3)\6)\u01d9\n)\r)\16)\u01da\3*\3*\3"+
		"*\3*\3+\3+\5+\u01e3\n+\3+\5+\u01e6\n+\3,\3,\3-\6-\u01eb\n-\r-\16-\u01ec"+
		"\3.\3.\5.\u01f1\n.\3/\3/\5/\u01f5\n/\3/\3/\3\60\3\60\5\60\u01fb\n\60\3"+
		"\60\5\60\u01fe\n\60\3\61\3\61\3\62\6\62\u0203\n\62\r\62\16\62\u0204\3"+
		"\63\3\63\5\63\u0209\n\63\3\64\3\64\3\64\3\64\3\65\3\65\5\65\u0211\n\65"+
		"\3\65\5\65\u0214\n\65\3\66\3\66\3\67\6\67\u0219\n\67\r\67\16\67\u021a"+
		"\38\38\58\u021f\n8\39\39\59\u0223\n9\3:\3:\3:\5:\u0228\n:\3:\5:\u022b"+
		"\n:\3:\5:\u022e\n:\3:\3:\3:\5:\u0233\n:\3:\5:\u0236\n:\3:\3:\3:\5:\u023b"+
		"\n:\3:\3:\3:\5:\u0240\n:\3;\3;\3;\3<\3<\3=\5=\u0248\n=\3=\3=\3>\3>\3?"+
		"\3?\3@\3@\3@\5@\u0253\n@\3A\3A\5A\u0257\nA\3A\3A\3A\5A\u025c\nA\3A\3A"+
		"\5A\u0260\nA\3B\3B\3B\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0270\nD\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\5E\u027a\nE\3F\3F\3G\3G\5G\u0280\nG\3G\3G\3H\6H"+
		"\u0285\nH\rH\16H\u0286\3I\3I\5I\u028b\nI\3J\3J\3J\5J\u0290\nJ\3K\3K\3"+
		"K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u029d\nK\3L\3L\3M\3M\3M\3M\3M\3N\3N\3O\3"+
		"O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3"+
		"[\3[\3\\\3\\\3]\3]\3^\3^\3^\3_\3_\3_\3`\3`\3`\3a\3a\3a\3b\3b\3b\3c\3c"+
		"\3c\3d\3d\3d\3e\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m"+
		"\3n\3n\3n\3o\3o\3o\3p\3p\3p\3q\3q\3q\3r\3r\3r\3s\3s\3s\3t\3t\3t\3u\3u"+
		"\3u\3v\3v\3v\3v\3w\3w\3w\3w\3x\3x\3x\3x\3x\3y\3y\7y\u0315\ny\fy\16y\u0318"+
		"\13y\3z\3z\3z\3z\3z\3z\5z\u0320\nz\3{\3{\3{\3{\3{\3{\5{\u0328\n{\3|\3"+
		"|\3}\3}\3}\3}\3~\6~\u0331\n~\r~\16~\u0332\3~\3~\3\177\3\177\3\177\3\177"+
		"\7\177\u033b\n\177\f\177\16\177\u033e\13\177\3\177\3\177\3\177\3\177\3"+
		"\177\3\u0080\3\u0080\3\u0080\3\u0080\7\u0080\u0349\n\u0080\f\u0080\16"+
		"\u0080\u034c\13\u0080\3\u0080\3\u0080\3\u033c\2\u0081\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\2=\2?\2A\2C\2E\2G\2"+
		"I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\37s\2u\2"+
		"w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087 \u0089!\u008b\2\u008d"+
		"\"\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099#\u009b$\u009d%\u009f"+
		"&\u00a1\'\u00a3(\u00a5)\u00a7*\u00a9+\u00ab,\u00ad-\u00af.\u00b1/\u00b3"+
		"\60\u00b5\61\u00b7\62\u00b9\63\u00bb\64\u00bd\65\u00bf\66\u00c1\67\u00c3"+
		"8\u00c59\u00c7:\u00c9;\u00cb<\u00cd=\u00cf>\u00d1?\u00d3@\u00d5A\u00d7"+
		"B\u00d9C\u00dbD\u00ddE\u00dfF\u00e1G\u00e3H\u00e5I\u00e7J\u00e9K\u00eb"+
		"L\u00edM\u00efN\u00f1O\u00f3\2\u00f5\2\u00f7P\u00f9Q\u00fbR\u00fdS\u00ff"+
		"T\3\2\30\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63"+
		"\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\4\2))^^\4\2$$^^\n\2$$))^^ddhhppt"+
		"tvv\3\2\62\65\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2"+
		"\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u035d"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2q\3"+
		"\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008d\3\2\2\2\2\u0099\3\2\2\2"+
		"\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2"+
		"\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5"+
		"\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2"+
		"\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7"+
		"\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2"+
		"\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9"+
		"\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2"+
		"\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb"+
		"\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f7\3\2\2"+
		"\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2\2\3\u0101"+
		"\3\2\2\2\5\u0108\3\2\2\2\7\u010d\3\2\2\2\t\u0113\3\2\2\2\13\u0118\3\2"+
		"\2\2\r\u011e\3\2\2\2\17\u0123\3\2\2\2\21\u0128\3\2\2\2\23\u012d\3\2\2"+
		"\2\25\u0136\3\2\2\2\27\u013e\3\2\2\2\31\u0141\3\2\2\2\33\u0148\3\2\2\2"+
		"\35\u014d\3\2\2\2\37\u0153\3\2\2\2!\u0159\3\2\2\2#\u015d\3\2\2\2%\u0160"+
		"\3\2\2\2\'\u0164\3\2\2\2)\u016b\3\2\2\2+\u0170\3\2\2\2-\u0174\3\2\2\2"+
		"/\u017b\3\2\2\2\61\u0181\3\2\2\2\63\u0188\3\2\2\2\65\u0192\3\2\2\2\67"+
		"\u0197\3\2\2\29\u01a1\3\2\2\2;\u01a3\3\2\2\2=\u01a7\3\2\2\2?\u01ab\3\2"+
		"\2\2A\u01af\3\2\2\2C\u01b3\3\2\2\2E\u01bf\3\2\2\2G\u01c1\3\2\2\2I\u01ca"+
		"\3\2\2\2K\u01cc\3\2\2\2M\u01cf\3\2\2\2O\u01d5\3\2\2\2Q\u01d8\3\2\2\2S"+
		"\u01dc\3\2\2\2U\u01e0\3\2\2\2W\u01e7\3\2\2\2Y\u01ea\3\2\2\2[\u01f0\3\2"+
		"\2\2]\u01f2\3\2\2\2_\u01f8\3\2\2\2a\u01ff\3\2\2\2c\u0202\3\2\2\2e\u0208"+
		"\3\2\2\2g\u020a\3\2\2\2i\u020e\3\2\2\2k\u0215\3\2\2\2m\u0218\3\2\2\2o"+
		"\u021e\3\2\2\2q\u0222\3\2\2\2s\u023f\3\2\2\2u\u0241\3\2\2\2w\u0244\3\2"+
		"\2\2y\u0247\3\2\2\2{\u024b\3\2\2\2}\u024d\3\2\2\2\177\u024f\3\2\2\2\u0081"+
		"\u025f\3\2\2\2\u0083\u0261\3\2\2\2\u0085\u0264\3\2\2\2\u0087\u026f\3\2"+
		"\2\2\u0089\u0279\3\2\2\2\u008b\u027b\3\2\2\2\u008d\u027d\3\2\2\2\u008f"+
		"\u0284\3\2\2\2\u0091\u028a\3\2\2\2\u0093\u028f\3\2\2\2\u0095\u029c\3\2"+
		"\2\2\u0097\u029e\3\2\2\2\u0099\u02a0\3\2\2\2\u009b\u02a5\3\2\2\2\u009d"+
		"\u02a7\3\2\2\2\u009f\u02a9\3\2\2\2\u00a1\u02ab\3\2\2\2\u00a3\u02ad\3\2"+
		"\2\2\u00a5\u02af\3\2\2\2\u00a7\u02b1\3\2\2\2\u00a9\u02b3\3\2\2\2\u00ab"+
		"\u02b5\3\2\2\2\u00ad\u02b7\3\2\2\2\u00af\u02b9\3\2\2\2\u00b1\u02bb\3\2"+
		"\2\2\u00b3\u02bd\3\2\2\2\u00b5\u02bf\3\2\2\2\u00b7\u02c1\3\2\2\2\u00b9"+
		"\u02c3\3\2\2\2\u00bb\u02c5\3\2\2\2\u00bd\u02c8\3\2\2\2\u00bf\u02cb\3\2"+
		"\2\2\u00c1\u02ce\3\2\2\2\u00c3\u02d1\3\2\2\2\u00c5\u02d4\3\2\2\2\u00c7"+
		"\u02d7\3\2\2\2\u00c9\u02da\3\2\2\2\u00cb\u02dd\3\2\2\2\u00cd\u02df\3\2"+
		"\2\2\u00cf\u02e1\3\2\2\2\u00d1\u02e3\3\2\2\2\u00d3\u02e5\3\2\2\2\u00d5"+
		"\u02e7\3\2\2\2\u00d7\u02e9\3\2\2\2\u00d9\u02eb\3\2\2\2\u00db\u02ed\3\2"+
		"\2\2\u00dd\u02f0\3\2\2\2\u00df\u02f3\3\2\2\2\u00e1\u02f6\3\2\2\2\u00e3"+
		"\u02f9\3\2\2\2\u00e5\u02fc\3\2\2\2\u00e7\u02ff\3\2\2\2\u00e9\u0302\3\2"+
		"\2\2\u00eb\u0305\3\2\2\2\u00ed\u0309\3\2\2\2\u00ef\u030d\3\2\2\2\u00f1"+
		"\u0312\3\2\2\2\u00f3\u031f\3\2\2\2\u00f5\u0327\3\2\2\2\u00f7\u0329\3\2"+
		"\2\2\u00f9\u032b\3\2\2\2\u00fb\u0330\3\2\2\2\u00fd\u0336\3\2\2\2\u00ff"+
		"\u0344\3\2\2\2\u0101\u0102\7l\2\2\u0102\u0103\7k\2\2\u0103\u0104\7v\2"+
		"\2\u0104\u0105\7v\2\2\u0105\u0106\7g\2\2\u0106\u0107\7t\2\2\u0107\4\3"+
		"\2\2\2\u0108\u0109\7v\2\2\u0109\u010a\7j\2\2\u010a\u010b\7k\2\2\u010b"+
		"\u010c\7u\2\2\u010c\6\3\2\2\2\u010d\u010e\7e\2\2\u010e\u010f\7n\2\2\u010f"+
		"\u0110\7c\2\2\u0110\u0111\7u\2\2\u0111\u0112\7u\2\2\u0112\b\3\2\2\2\u0113"+
		"\u0114\7d\2\2\u0114\u0115\7q\2\2\u0115\u0116\7q\2\2\u0116\u0117\7n\2\2"+
		"\u0117\n\3\2\2\2\u0118\u0119\7d\2\2\u0119\u011a\7t\2\2\u011a\u011b\7g"+
		"\2\2\u011b\u011c\7c\2\2\u011c\u011d\7m\2\2\u011d\f\3\2\2\2\u011e\u011f"+
		"\7d\2\2\u011f\u0120\7{\2\2\u0120\u0121\7v\2\2\u0121\u0122\7g\2\2\u0122"+
		"\16\3\2\2\2\u0123\u0124\7e\2\2\u0124\u0125\7c\2\2\u0125\u0126\7u\2\2\u0126"+
		"\u0127\7g\2\2\u0127\20\3\2\2\2\u0128\u0129\7e\2\2\u0129\u012a\7j\2\2\u012a"+
		"\u012b\7c\2\2\u012b\u012c\7t\2\2\u012c\22\3\2\2\2\u012d\u012e\7e\2\2\u012e"+
		"\u012f\7q\2\2\u012f\u0130\7p\2\2\u0130\u0131\7v\2\2\u0131\u0132\7k\2\2"+
		"\u0132\u0133\7p\2\2\u0133\u0134\7w\2\2\u0134\u0135\7g\2\2\u0135\24\3\2"+
		"\2\2\u0136\u0137\7f\2\2\u0137\u0138\7g\2\2\u0138\u0139\7h\2\2\u0139\u013a"+
		"\7c\2\2\u013a\u013b\7w\2\2\u013b\u013c\7n\2\2\u013c\u013d\7v\2\2\u013d"+
		"\26\3\2\2\2\u013e\u013f\7f\2\2\u013f\u0140\7q\2\2\u0140\30\3\2\2\2\u0141"+
		"\u0142\7f\2\2\u0142\u0143\7q\2\2\u0143\u0144\7w\2\2\u0144\u0145\7d\2\2"+
		"\u0145\u0146\7n\2\2\u0146\u0147\7g\2\2\u0147\32\3\2\2\2\u0148\u0149\7"+
		"g\2\2\u0149\u014a\7n\2\2\u014a\u014b\7u\2\2\u014b\u014c\7g\2\2\u014c\34"+
		"\3\2\2\2\u014d\u014e\7h\2\2\u014e\u014f\7k\2\2\u014f\u0150\7p\2\2\u0150"+
		"\u0151\7c\2\2\u0151\u0152\7n\2\2\u0152\36\3\2\2\2\u0153\u0154\7h\2\2\u0154"+
		"\u0155\7n\2\2\u0155\u0156\7q\2\2\u0156\u0157\7c\2\2\u0157\u0158\7v\2\2"+
		"\u0158 \3\2\2\2\u0159\u015a\7h\2\2\u015a\u015b\7q\2\2\u015b\u015c\7t\2"+
		"\2\u015c\"\3\2\2\2\u015d\u015e\7k\2\2\u015e\u015f\7h\2\2\u015f$\3\2\2"+
		"\2\u0160\u0161\7k\2\2\u0161\u0162\7p\2\2\u0162\u0163\7v\2\2\u0163&\3\2"+
		"\2\2\u0164\u0165\7u\2\2\u0165\u0166\7v\2\2\u0166\u0167\7t\2\2\u0167\u0168"+
		"\7k\2\2\u0168\u0169\7p\2\2\u0169\u016a\7i\2\2\u016a(\3\2\2\2\u016b\u016c"+
		"\7n\2\2\u016c\u016d\7q\2\2\u016d\u016e\7p\2\2\u016e\u016f\7i\2\2\u016f"+
		"*\3\2\2\2\u0170\u0171\7p\2\2\u0171\u0172\7g\2\2\u0172\u0173\7y\2\2\u0173"+
		",\3\2\2\2\u0174\u0175\7t\2\2\u0175\u0176\7g\2\2\u0176\u0177\7v\2\2\u0177"+
		"\u0178\7w\2\2\u0178\u0179\7t\2\2\u0179\u017a\7p\2\2\u017a.\3\2\2\2\u017b"+
		"\u017c\7u\2\2\u017c\u017d\7j\2\2\u017d\u017e\7q\2\2\u017e\u017f\7t\2\2"+
		"\u017f\u0180\7v\2\2\u0180\60\3\2\2\2\u0181\u0182\7u\2\2\u0182\u0183\7"+
		"y\2\2\u0183\u0184\7k\2\2\u0184\u0185\7v\2\2\u0185\u0186\7e\2\2\u0186\u0187"+
		"\7j\2\2\u0187\62\3\2\2\2\u0188\u0189\7v\2\2\u0189\u018a\7t\2\2\u018a\u018b"+
		"\7c\2\2\u018b\u018c\7p\2\2\u018c\u018d\7u\2\2\u018d\u018e\7k\2\2\u018e"+
		"\u018f\7g\2\2\u018f\u0190\7p\2\2\u0190\u0191\7v\2\2\u0191\64\3\2\2\2\u0192"+
		"\u0193\7x\2\2\u0193\u0194\7q\2\2\u0194\u0195\7k\2\2\u0195\u0196\7f\2\2"+
		"\u0196\66\3\2\2\2\u0197\u0198\7y\2\2\u0198\u0199\7j\2\2\u0199\u019a\7"+
		"k\2\2\u019a\u019b\7n\2\2\u019b\u019c\7g\2\2\u019c8\3\2\2\2\u019d\u01a2"+
		"\5;\36\2\u019e\u01a2\5=\37\2\u019f\u01a2\5? \2\u01a0\u01a2\5A!\2\u01a1"+
		"\u019d\3\2\2\2\u01a1\u019e\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a0\3\2"+
		"\2\2\u01a2:\3\2\2\2\u01a3\u01a5\5E#\2\u01a4\u01a6\5C\"\2\u01a5\u01a4\3"+
		"\2\2\2\u01a5\u01a6\3\2\2\2\u01a6<\3\2\2\2\u01a7\u01a9\5S*\2\u01a8\u01aa"+
		"\5C\"\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa>\3\2\2\2\u01ab\u01ad"+
		"\5]/\2\u01ac\u01ae\5C\"\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"@\3\2\2\2\u01af\u01b1\5g\64\2\u01b0\u01b2\5C\"\2\u01b1\u01b0\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2B\3\2\2\2\u01b3\u01b4\t\2\2\2\u01b4D\3\2\2\2\u01b5"+
		"\u01c0\7\62\2\2\u01b6\u01bd\5K&\2\u01b7\u01b9\5G$\2\u01b8\u01b7\3\2\2"+
		"\2\u01b8\u01b9\3\2\2\2\u01b9\u01be\3\2\2\2\u01ba\u01bb\5Q)\2\u01bb\u01bc"+
		"\5G$\2\u01bc\u01be\3\2\2\2\u01bd\u01b8\3\2\2\2\u01bd\u01ba\3\2\2\2\u01be"+
		"\u01c0\3\2\2\2\u01bf\u01b5\3\2\2\2\u01bf\u01b6\3\2\2\2\u01c0F\3\2\2\2"+
		"\u01c1\u01c6\5I%\2\u01c2\u01c4\5M\'\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4"+
		"\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\5I%\2\u01c6\u01c3\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7H\3\2\2\2\u01c8\u01cb\7\62\2\2\u01c9\u01cb\5K&\2\u01ca"+
		"\u01c8\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cbJ\3\2\2\2\u01cc\u01cd\t\3\2\2"+
		"\u01cdL\3\2\2\2\u01ce\u01d0\5O(\2\u01cf\u01ce\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2N\3\2\2\2\u01d3\u01d6"+
		"\5I%\2\u01d4\u01d6\7a\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6"+
		"P\3\2\2\2\u01d7\u01d9\7a\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01dbR\3\2\2\2\u01dc\u01dd\7\62\2\2"+
		"\u01dd\u01de\t\4\2\2\u01de\u01df\5U+\2\u01dfT\3\2\2\2\u01e0\u01e5\5W,"+
		"\2\u01e1\u01e3\5Y-\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4"+
		"\3\2\2\2\u01e4\u01e6\5W,\2\u01e5\u01e2\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"V\3\2\2\2\u01e7\u01e8\t\5\2\2\u01e8X\3\2\2\2\u01e9\u01eb\5[.\2\u01ea\u01e9"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"Z\3\2\2\2\u01ee\u01f1\5W,\2\u01ef\u01f1\7a\2\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01ef\3\2\2\2\u01f1\\\3\2\2\2\u01f2\u01f4\7\62\2\2\u01f3\u01f5\5Q)\2"+
		"\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7"+
		"\5_\60\2\u01f7^\3\2\2\2\u01f8\u01fd\5a\61\2\u01f9\u01fb\5c\62\2\u01fa"+
		"\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\5a"+
		"\61\2\u01fd\u01fa\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe`\3\2\2\2\u01ff\u0200"+
		"\t\6\2\2\u0200b\3\2\2\2\u0201\u0203\5e\63\2\u0202\u0201\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205d\3\2\2\2"+
		"\u0206\u0209\5a\61\2\u0207\u0209\7a\2\2\u0208\u0206\3\2\2\2\u0208\u0207"+
		"\3\2\2\2\u0209f\3\2\2\2\u020a\u020b\7\62\2\2\u020b\u020c\t\7\2\2\u020c"+
		"\u020d\5i\65\2\u020dh\3\2\2\2\u020e\u0213\5k\66\2\u020f\u0211\5m\67\2"+
		"\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214"+
		"\5k\66\2\u0213\u0210\3\2\2\2\u0213\u0214\3\2\2\2\u0214j\3\2\2\2\u0215"+
		"\u0216\t\b\2\2\u0216l\3\2\2\2\u0217\u0219\5o8\2\u0218\u0217\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021bn\3\2\2\2"+
		"\u021c\u021f\5k\66\2\u021d\u021f\7a\2\2\u021e\u021c\3\2\2\2\u021e\u021d"+
		"\3\2\2\2\u021fp\3\2\2\2\u0220\u0223\5s:\2\u0221\u0223\5\177@\2\u0222\u0220"+
		"\3\2\2\2\u0222\u0221\3\2\2\2\u0223r\3\2\2\2\u0224\u0225\5G$\2\u0225\u0227"+
		"\7\60\2\2\u0226\u0228\5G$\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u022a\3\2\2\2\u0229\u022b\5u;\2\u022a\u0229\3\2\2\2\u022a\u022b\3\2\2"+
		"\2\u022b\u022d\3\2\2\2\u022c\u022e\5}?\2\u022d\u022c\3\2\2\2\u022d\u022e"+
		"\3\2\2\2\u022e\u0240\3\2\2\2\u022f\u0230\7\60\2\2\u0230\u0232\5G$\2\u0231"+
		"\u0233\5u;\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235\3\2\2"+
		"\2\u0234\u0236\5}?\2\u0235\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0240"+
		"\3\2\2\2\u0237\u0238\5G$\2\u0238\u023a\5u;\2\u0239\u023b\5}?\2\u023a\u0239"+
		"\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u0240\3\2\2\2\u023c\u023d\5G$\2\u023d"+
		"\u023e\5}?\2\u023e\u0240\3\2\2\2\u023f\u0224\3\2\2\2\u023f\u022f\3\2\2"+
		"\2\u023f\u0237\3\2\2\2\u023f\u023c\3\2\2\2\u0240t\3\2\2\2\u0241\u0242"+
		"\5w<\2\u0242\u0243\5y=\2\u0243v\3\2\2\2\u0244\u0245\t\t\2\2\u0245x\3\2"+
		"\2\2\u0246\u0248\5{>\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249"+
		"\3\2\2\2\u0249\u024a\5G$\2\u024az\3\2\2\2\u024b\u024c\t\n\2\2\u024c|\3"+
		"\2\2\2\u024d\u024e\t\13\2\2\u024e~\3\2\2\2\u024f\u0250\5\u0081A\2\u0250"+
		"\u0252\5\u0083B\2\u0251\u0253\5}?\2\u0252\u0251\3\2\2\2\u0252\u0253\3"+
		"\2\2\2\u0253\u0080\3\2\2\2\u0254\u0256\5S*\2\u0255\u0257\7\60\2\2\u0256"+
		"\u0255\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0260\3\2\2\2\u0258\u0259\7\62"+
		"\2\2\u0259\u025b\t\4\2\2\u025a\u025c\5U+\2\u025b\u025a\3\2\2\2\u025b\u025c"+
		"\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\7\60\2\2\u025e\u0260\5U+\2\u025f"+
		"\u0254\3\2\2\2\u025f\u0258\3\2\2\2\u0260\u0082\3\2\2\2\u0261\u0262\5\u0085"+
		"C\2\u0262\u0263\5y=\2\u0263\u0084\3\2\2\2\u0264\u0265\t\f\2\2\u0265\u0086"+
		"\3\2\2\2\u0266\u0267\7v\2\2\u0267\u0268\7t\2\2\u0268\u0269\7w\2\2\u0269"+
		"\u0270\7g\2\2\u026a\u026b\7h\2\2\u026b\u026c\7c\2\2\u026c\u026d\7n\2\2"+
		"\u026d\u026e\7u\2\2\u026e\u0270\7g\2\2\u026f\u0266\3\2\2\2\u026f\u026a"+
		"\3\2\2\2\u0270\u0088\3\2\2\2\u0271\u0272\7)\2\2\u0272\u0273\5\u008bF\2"+
		"\u0273\u0274\7)\2\2\u0274\u027a\3\2\2\2\u0275\u0276\7)\2\2\u0276\u0277"+
		"\5\u0093J\2\u0277\u0278\7)\2\2\u0278\u027a\3\2\2\2\u0279\u0271\3\2\2\2"+
		"\u0279\u0275\3\2\2\2\u027a\u008a\3\2\2\2\u027b\u027c\n\r\2\2\u027c\u008c"+
		"\3\2\2\2\u027d\u027f\7$\2\2\u027e\u0280\5\u008fH\2\u027f\u027e\3\2\2\2"+
		"\u027f\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\7$\2\2\u0282\u008e"+
		"\3\2\2\2\u0283\u0285\5\u0091I\2\u0284\u0283\3\2\2\2\u0285\u0286\3\2\2"+
		"\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0090\3\2\2\2\u0288\u028b"+
		"\n\16\2\2\u0289\u028b\5\u0093J\2\u028a\u0288\3\2\2\2\u028a\u0289\3\2\2"+
		"\2\u028b\u0092\3\2\2\2\u028c\u028d\7^\2\2\u028d\u0290\t\17\2\2\u028e\u0290"+
		"\5\u0095K\2\u028f\u028c\3\2\2\2\u028f\u028e\3\2\2\2\u0290\u0094\3\2\2"+
		"\2\u0291\u0292\7^\2\2\u0292\u029d\5a\61\2\u0293\u0294\7^\2\2\u0294\u0295"+
		"\5a\61\2\u0295\u0296\5a\61\2\u0296\u029d\3\2\2\2\u0297\u0298\7^\2\2\u0298"+
		"\u0299\5\u0097L\2\u0299\u029a\5a\61\2\u029a\u029b\5a\61\2\u029b\u029d"+
		"\3\2\2\2\u029c\u0291\3\2\2\2\u029c\u0293\3\2\2\2\u029c\u0297\3\2\2\2\u029d"+
		"\u0096\3\2\2\2\u029e\u029f\t\20\2\2\u029f\u0098\3\2\2\2\u02a0\u02a1\7"+
		"p\2\2\u02a1\u02a2\7w\2\2\u02a2\u02a3\7n\2\2\u02a3\u02a4\7n\2\2\u02a4\u009a"+
		"\3\2\2\2\u02a5\u02a6\7*\2\2\u02a6\u009c\3\2\2\2\u02a7\u02a8\7+\2\2\u02a8"+
		"\u009e\3\2\2\2\u02a9\u02aa\7}\2\2\u02aa\u00a0\3\2\2\2\u02ab\u02ac\7\177"+
		"\2\2\u02ac\u00a2\3\2\2\2\u02ad\u02ae\7]\2\2\u02ae\u00a4\3\2\2\2\u02af"+
		"\u02b0\7_\2\2\u02b0\u00a6\3\2\2\2\u02b1\u02b2\7=\2\2\u02b2\u00a8\3\2\2"+
		"\2\u02b3\u02b4\7.\2\2\u02b4\u00aa\3\2\2\2\u02b5\u02b6\7\60\2\2\u02b6\u00ac"+
		"\3\2\2\2\u02b7\u02b8\7?\2\2\u02b8\u00ae\3\2\2\2\u02b9\u02ba\7@\2\2\u02ba"+
		"\u00b0\3\2\2\2\u02bb\u02bc\7>\2\2\u02bc\u00b2\3\2\2\2\u02bd\u02be\7#\2"+
		"\2\u02be\u00b4\3\2\2\2\u02bf\u02c0\7\u0080\2\2\u02c0\u00b6\3\2\2\2\u02c1"+
		"\u02c2\7A\2\2\u02c2\u00b8\3\2\2\2\u02c3\u02c4\7<\2\2\u02c4\u00ba\3\2\2"+
		"\2\u02c5\u02c6\7?\2\2\u02c6\u02c7\7?\2\2\u02c7\u00bc\3\2\2\2\u02c8\u02c9"+
		"\7>\2\2\u02c9\u02ca\7?\2\2\u02ca\u00be\3\2\2\2\u02cb\u02cc\7@\2\2\u02cc"+
		"\u02cd\7?\2\2\u02cd\u00c0\3\2\2\2\u02ce\u02cf\7#\2\2\u02cf\u02d0\7?\2"+
		"\2\u02d0\u00c2\3\2\2\2\u02d1\u02d2\7(\2\2\u02d2\u02d3\7(\2\2\u02d3\u00c4"+
		"\3\2\2\2\u02d4\u02d5\7~\2\2\u02d5\u02d6\7~\2\2\u02d6\u00c6\3\2\2\2\u02d7"+
		"\u02d8\7-\2\2\u02d8\u02d9\7-\2\2\u02d9\u00c8\3\2\2\2\u02da\u02db\7/\2"+
		"\2\u02db\u02dc\7/\2\2\u02dc\u00ca\3\2\2\2\u02dd\u02de\7-\2\2\u02de\u00cc"+
		"\3\2\2\2\u02df\u02e0\7/\2\2\u02e0\u00ce\3\2\2\2\u02e1\u02e2\7,\2\2\u02e2"+
		"\u00d0\3\2\2\2\u02e3\u02e4\7\61\2\2\u02e4\u00d2\3\2\2\2\u02e5\u02e6\7"+
		"(\2\2\u02e6\u00d4\3\2\2\2\u02e7\u02e8\7~\2\2\u02e8\u00d6\3\2\2\2\u02e9"+
		"\u02ea\7`\2\2\u02ea\u00d8\3\2\2\2\u02eb\u02ec\7\'\2\2\u02ec\u00da\3\2"+
		"\2\2\u02ed\u02ee\7-\2\2\u02ee\u02ef\7?\2\2\u02ef\u00dc\3\2\2\2\u02f0\u02f1"+
		"\7/\2\2\u02f1\u02f2\7?\2\2\u02f2\u00de\3\2\2\2\u02f3\u02f4\7,\2\2\u02f4"+
		"\u02f5\7?\2\2\u02f5\u00e0\3\2\2\2\u02f6\u02f7\7\61\2\2\u02f7\u02f8\7?"+
		"\2\2\u02f8\u00e2\3\2\2\2\u02f9\u02fa\7(\2\2\u02fa\u02fb\7?\2\2\u02fb\u00e4"+
		"\3\2\2\2\u02fc\u02fd\7~\2\2\u02fd\u02fe\7?\2\2\u02fe\u00e6\3\2\2\2\u02ff"+
		"\u0300\7`\2\2\u0300\u0301\7?\2\2\u0301\u00e8\3\2\2\2\u0302\u0303\7\'\2"+
		"\2\u0303\u0304\7?\2\2\u0304\u00ea\3\2\2\2\u0305\u0306\7>\2\2\u0306\u0307"+
		"\7>\2\2\u0307\u0308\7?\2\2\u0308\u00ec\3\2\2\2\u0309\u030a\7@\2\2\u030a"+
		"\u030b\7@\2\2\u030b\u030c\7?\2\2\u030c\u00ee\3\2\2\2\u030d\u030e\7@\2"+
		"\2\u030e\u030f\7@\2\2\u030f\u0310\7@\2\2\u0310\u0311\7?\2\2\u0311\u00f0"+
		"\3\2\2\2\u0312\u0316\5\u00f3z\2\u0313\u0315\5\u00f5{\2\u0314\u0313\3\2"+
		"\2\2\u0315\u0318\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317"+
		"\u00f2\3\2\2\2\u0318\u0316\3\2\2\2\u0319\u0320\t\21\2\2\u031a\u031b\n"+
		"\22\2\2\u031b\u0320\6z\2\2\u031c\u031d\t\23\2\2\u031d\u031e\t\24\2\2\u031e"+
		"\u0320\6z\3\2\u031f\u0319\3\2\2\2\u031f\u031a\3\2\2\2\u031f\u031c\3\2"+
		"\2\2\u0320\u00f4\3\2\2\2\u0321\u0328\t\25\2\2\u0322\u0323\n\22\2\2\u0323"+
		"\u0328\6{\4\2\u0324\u0325\t\23\2\2\u0325\u0326\t\24\2\2\u0326\u0328\6"+
		"{\5\2\u0327\u0321\3\2\2\2\u0327\u0322\3\2\2\2\u0327\u0324\3\2\2\2\u0328"+
		"\u00f6\3\2\2\2\u0329\u032a\7B\2\2\u032a\u00f8\3\2\2\2\u032b\u032c\7\60"+
		"\2\2\u032c\u032d\7\60\2\2\u032d\u032e\7\60\2\2\u032e\u00fa\3\2\2\2\u032f"+
		"\u0331\t\26\2\2\u0330\u032f\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0330\3"+
		"\2\2\2\u0332\u0333\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335\b~\2\2\u0335"+
		"\u00fc\3\2\2\2\u0336\u0337\7\61\2\2\u0337\u0338\7,\2\2\u0338\u033c\3\2"+
		"\2\2\u0339\u033b\13\2\2\2\u033a\u0339\3\2\2\2\u033b\u033e\3\2\2\2\u033c"+
		"\u033d\3\2\2\2\u033c\u033a\3\2\2\2\u033d\u033f\3\2\2\2\u033e\u033c\3\2"+
		"\2\2\u033f\u0340\7,\2\2\u0340\u0341\7\61\2\2\u0341\u0342\3\2\2\2\u0342"+
		"\u0343\b\177\2\2\u0343\u00fe\3\2\2\2\u0344\u0345\7\61\2\2\u0345\u0346"+
		"\7\61\2\2\u0346\u034a\3\2\2\2\u0347\u0349\n\27\2\2\u0348\u0347\3\2\2\2"+
		"\u0349\u034c\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034d"+
		"\3\2\2\2\u034c\u034a\3\2\2\2\u034d\u034e\b\u0080\2\2\u034e\u0100\3\2\2"+
		"\28\2\u01a1\u01a5\u01a9\u01ad\u01b1\u01b8\u01bd\u01bf\u01c3\u01c6\u01ca"+
		"\u01d1\u01d5\u01da\u01e2\u01e5\u01ec\u01f0\u01f4\u01fa\u01fd\u0204\u0208"+
		"\u0210\u0213\u021a\u021e\u0222\u0227\u022a\u022d\u0232\u0235\u023a\u023f"+
		"\u0247\u0252\u0256\u025b\u025f\u026f\u0279\u027f\u0286\u028a\u028f\u029c"+
		"\u0316\u031f\u0327\u0332\u033c\u034a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}