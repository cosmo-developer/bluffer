// Generated from Bluffer.g4 by ANTLR 4.9.3
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, BOOLEAN=6, BREAK=7, BYTE=8, CASE=9, 
		CHAR=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, FINAL=16, 
		FLOAT=17, FOR=18, IF=19, INT=20, LONG=21, NEW=22, RETURN=23, SHORT=24, 
		SWITCH=25, TRANSIENT=26, VOID=27, WHILE=28, IntegerLiteral=29, FloatingPointLiteral=30, 
		BooleanLiteral=31, CharacterLiteral=32, StringLiteral=33, NullLiteral=34, 
		LPAREN=35, RPAREN=36, LBRACE=37, RBRACE=38, LBRACK=39, RBRACK=40, SEMI=41, 
		COMMA=42, DOT=43, ASSIGN=44, GT=45, LT=46, BANG=47, TILDE=48, QUESTION=49, 
		COLON=50, EQUAL=51, LE=52, GE=53, NOTEQUAL=54, AND=55, OR=56, INC=57, 
		DEC=58, ADD=59, SUB=60, MUL=61, DIV=62, BITAND=63, BITOR=64, CARET=65, 
		MOD=66, ADD_ASSIGN=67, SUB_ASSIGN=68, MUL_ASSIGN=69, DIV_ASSIGN=70, AND_ASSIGN=71, 
		OR_ASSIGN=72, XOR_ASSIGN=73, MOD_ASSIGN=74, LSHIFT_ASSIGN=75, RSHIFT_ASSIGN=76, 
		URSHIFT_ASSIGN=77, Identifier=78, AT=79, ELLIPSIS=80, WS=81, COMMENT=82, 
		LINE_COMMENT=83;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "BOOLEAN", "BREAK", "BYTE", "CASE", 
			"CHAR", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "FINAL", "FLOAT", 
			"FOR", "IF", "INT", "LONG", "NEW", "RETURN", "SHORT", "SWITCH", "TRANSIENT", 
			"VOID", "WHILE", "IntegerLiteral", "DecimalIntegerLiteral", "HexIntegerLiteral", 
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
			null, "'static'", "'bool'", "'string'", "'this'", "'class'", "'boolean'", 
			"'break'", "'byte'", "'case'", "'char'", "'continue'", "'default'", "'do'", 
			"'double'", "'else'", "'final'", "'float'", "'for'", "'if'", "'int'", 
			"'long'", "'new'", "'return'", "'short'", "'switch'", "'transient'", 
			"'void'", "'while'", null, null, null, null, null, "'null'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", 
			"'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
			"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", 
			"'>>='", "'>>>='", null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "BOOLEAN", "BREAK", "BYTE", "CASE", 
			"CHAR", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "FINAL", "FLOAT", 
			"FOR", "IF", "INT", "LONG", "NEW", "RETURN", "SHORT", "SWITCH", "TRANSIENT", 
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
		case 121:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 122:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2U\u0359\b\1\4\2\t"+
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
		"\4\u0081\t\u0081\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\5\36\u01ac\n\36\3\37\3\37\5\37\u01b0\n\37\3 \3 \5 \u01b4"+
		"\n \3!\3!\5!\u01b8\n!\3\"\3\"\5\"\u01bc\n\"\3#\3#\3$\3$\3$\5$\u01c3\n"+
		"$\3$\3$\3$\5$\u01c8\n$\5$\u01ca\n$\3%\3%\5%\u01ce\n%\3%\5%\u01d1\n%\3"+
		"&\3&\5&\u01d5\n&\3\'\3\'\3(\6(\u01da\n(\r(\16(\u01db\3)\3)\5)\u01e0\n"+
		")\3*\6*\u01e3\n*\r*\16*\u01e4\3+\3+\3+\3+\3,\3,\5,\u01ed\n,\3,\5,\u01f0"+
		"\n,\3-\3-\3.\6.\u01f5\n.\r.\16.\u01f6\3/\3/\5/\u01fb\n/\3\60\3\60\5\60"+
		"\u01ff\n\60\3\60\3\60\3\61\3\61\5\61\u0205\n\61\3\61\5\61\u0208\n\61\3"+
		"\62\3\62\3\63\6\63\u020d\n\63\r\63\16\63\u020e\3\64\3\64\5\64\u0213\n"+
		"\64\3\65\3\65\3\65\3\65\3\66\3\66\5\66\u021b\n\66\3\66\5\66\u021e\n\66"+
		"\3\67\3\67\38\68\u0223\n8\r8\168\u0224\39\39\59\u0229\n9\3:\3:\5:\u022d"+
		"\n:\3;\3;\3;\5;\u0232\n;\3;\5;\u0235\n;\3;\5;\u0238\n;\3;\3;\3;\5;\u023d"+
		"\n;\3;\5;\u0240\n;\3;\3;\3;\5;\u0245\n;\3;\3;\3;\5;\u024a\n;\3<\3<\3<"+
		"\3=\3=\3>\5>\u0252\n>\3>\3>\3?\3?\3@\3@\3A\3A\3A\5A\u025d\nA\3B\3B\5B"+
		"\u0261\nB\3B\3B\3B\5B\u0266\nB\3B\3B\5B\u026a\nB\3C\3C\3C\3D\3D\3E\3E"+
		"\3E\3E\3E\3E\3E\3E\3E\5E\u027a\nE\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0284\nF"+
		"\3G\3G\3H\3H\5H\u028a\nH\3H\3H\3I\6I\u028f\nI\rI\16I\u0290\3J\3J\5J\u0295"+
		"\nJ\3K\3K\3K\5K\u029a\nK\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u02a7\nL"+
		"\3M\3M\3N\3N\3N\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V"+
		"\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3_\3`\3`\3`\3"+
		"a\3a\3a\3b\3b\3b\3c\3c\3c\3d\3d\3d\3e\3e\3e\3f\3f\3f\3g\3g\3h\3h\3i\3"+
		"i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3o\3p\3p\3p\3q\3q\3q\3r\3r\3r\3"+
		"s\3s\3s\3t\3t\3t\3u\3u\3u\3v\3v\3v\3w\3w\3w\3w\3x\3x\3x\3x\3y\3y\3y\3"+
		"y\3y\3z\3z\7z\u031f\nz\fz\16z\u0322\13z\3{\3{\3{\3{\3{\3{\5{\u032a\n{"+
		"\3|\3|\3|\3|\3|\3|\5|\u0332\n|\3}\3}\3~\3~\3~\3~\3\177\6\177\u033b\n\177"+
		"\r\177\16\177\u033c\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\7\u0080"+
		"\u0345\n\u0080\f\u0080\16\u0080\u0348\13\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u0353\n\u0081"+
		"\f\u0081\16\u0081\u0356\13\u0081\3\u0081\3\u0081\3\u0346\2\u0082\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37=\2?"+
		"\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m"+
		"\2o\2q\2s u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089"+
		"!\u008b\"\u008d\2\u008f#\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b"+
		"$\u009d%\u009f&\u00a1\'\u00a3(\u00a5)\u00a7*\u00a9+\u00ab,\u00ad-\u00af"+
		".\u00b1/\u00b3\60\u00b5\61\u00b7\62\u00b9\63\u00bb\64\u00bd\65\u00bf\66"+
		"\u00c1\67\u00c38\u00c59\u00c7:\u00c9;\u00cb<\u00cd=\u00cf>\u00d1?\u00d3"+
		"@\u00d5A\u00d7B\u00d9C\u00dbD\u00ddE\u00dfF\u00e1G\u00e3H\u00e5I\u00e7"+
		"J\u00e9K\u00ebL\u00edM\u00efN\u00f1O\u00f3P\u00f5\2\u00f7\2\u00f9Q\u00fb"+
		"R\u00fdS\u00ffT\u0101U\3\2\30\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2"+
		"\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\4\2))^^\4\2"+
		"$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01"+
		"\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4"+
		"\2\f\f\17\17\2\u0367\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2s\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2"+
		"\2\u008f\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1"+
		"\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2"+
		"\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3"+
		"\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2"+
		"\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5"+
		"\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2"+
		"\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7"+
		"\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2"+
		"\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9"+
		"\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2"+
		"\2\2\u00f3\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff"+
		"\3\2\2\2\2\u0101\3\2\2\2\3\u0103\3\2\2\2\5\u010a\3\2\2\2\7\u010f\3\2\2"+
		"\2\t\u0116\3\2\2\2\13\u011b\3\2\2\2\r\u0121\3\2\2\2\17\u0129\3\2\2\2\21"+
		"\u012f\3\2\2\2\23\u0134\3\2\2\2\25\u0139\3\2\2\2\27\u013e\3\2\2\2\31\u0147"+
		"\3\2\2\2\33\u014f\3\2\2\2\35\u0152\3\2\2\2\37\u0159\3\2\2\2!\u015e\3\2"+
		"\2\2#\u0164\3\2\2\2%\u016a\3\2\2\2\'\u016e\3\2\2\2)\u0171\3\2\2\2+\u0175"+
		"\3\2\2\2-\u017a\3\2\2\2/\u017e\3\2\2\2\61\u0185\3\2\2\2\63\u018b\3\2\2"+
		"\2\65\u0192\3\2\2\2\67\u019c\3\2\2\29\u01a1\3\2\2\2;\u01ab\3\2\2\2=\u01ad"+
		"\3\2\2\2?\u01b1\3\2\2\2A\u01b5\3\2\2\2C\u01b9\3\2\2\2E\u01bd\3\2\2\2G"+
		"\u01c9\3\2\2\2I\u01cb\3\2\2\2K\u01d4\3\2\2\2M\u01d6\3\2\2\2O\u01d9\3\2"+
		"\2\2Q\u01df\3\2\2\2S\u01e2\3\2\2\2U\u01e6\3\2\2\2W\u01ea\3\2\2\2Y\u01f1"+
		"\3\2\2\2[\u01f4\3\2\2\2]\u01fa\3\2\2\2_\u01fc\3\2\2\2a\u0202\3\2\2\2c"+
		"\u0209\3\2\2\2e\u020c\3\2\2\2g\u0212\3\2\2\2i\u0214\3\2\2\2k\u0218\3\2"+
		"\2\2m\u021f\3\2\2\2o\u0222\3\2\2\2q\u0228\3\2\2\2s\u022c\3\2\2\2u\u0249"+
		"\3\2\2\2w\u024b\3\2\2\2y\u024e\3\2\2\2{\u0251\3\2\2\2}\u0255\3\2\2\2\177"+
		"\u0257\3\2\2\2\u0081\u0259\3\2\2\2\u0083\u0269\3\2\2\2\u0085\u026b\3\2"+
		"\2\2\u0087\u026e\3\2\2\2\u0089\u0279\3\2\2\2\u008b\u0283\3\2\2\2\u008d"+
		"\u0285\3\2\2\2\u008f\u0287\3\2\2\2\u0091\u028e\3\2\2\2\u0093\u0294\3\2"+
		"\2\2\u0095\u0299\3\2\2\2\u0097\u02a6\3\2\2\2\u0099\u02a8\3\2\2\2\u009b"+
		"\u02aa\3\2\2\2\u009d\u02af\3\2\2\2\u009f\u02b1\3\2\2\2\u00a1\u02b3\3\2"+
		"\2\2\u00a3\u02b5\3\2\2\2\u00a5\u02b7\3\2\2\2\u00a7\u02b9\3\2\2\2\u00a9"+
		"\u02bb\3\2\2\2\u00ab\u02bd\3\2\2\2\u00ad\u02bf\3\2\2\2\u00af\u02c1\3\2"+
		"\2\2\u00b1\u02c3\3\2\2\2\u00b3\u02c5\3\2\2\2\u00b5\u02c7\3\2\2\2\u00b7"+
		"\u02c9\3\2\2\2\u00b9\u02cb\3\2\2\2\u00bb\u02cd\3\2\2\2\u00bd\u02cf\3\2"+
		"\2\2\u00bf\u02d2\3\2\2\2\u00c1\u02d5\3\2\2\2\u00c3\u02d8\3\2\2\2\u00c5"+
		"\u02db\3\2\2\2\u00c7\u02de\3\2\2\2\u00c9\u02e1\3\2\2\2\u00cb\u02e4\3\2"+
		"\2\2\u00cd\u02e7\3\2\2\2\u00cf\u02e9\3\2\2\2\u00d1\u02eb\3\2\2\2\u00d3"+
		"\u02ed\3\2\2\2\u00d5\u02ef\3\2\2\2\u00d7\u02f1\3\2\2\2\u00d9\u02f3\3\2"+
		"\2\2\u00db\u02f5\3\2\2\2\u00dd\u02f7\3\2\2\2\u00df\u02fa\3\2\2\2\u00e1"+
		"\u02fd\3\2\2\2\u00e3\u0300\3\2\2\2\u00e5\u0303\3\2\2\2\u00e7\u0306\3\2"+
		"\2\2\u00e9\u0309\3\2\2\2\u00eb\u030c\3\2\2\2\u00ed\u030f\3\2\2\2\u00ef"+
		"\u0313\3\2\2\2\u00f1\u0317\3\2\2\2\u00f3\u031c\3\2\2\2\u00f5\u0329\3\2"+
		"\2\2\u00f7\u0331\3\2\2\2\u00f9\u0333\3\2\2\2\u00fb\u0335\3\2\2\2\u00fd"+
		"\u033a\3\2\2\2\u00ff\u0340\3\2\2\2\u0101\u034e\3\2\2\2\u0103\u0104\7u"+
		"\2\2\u0104\u0105\7v\2\2\u0105\u0106\7c\2\2\u0106\u0107\7v\2\2\u0107\u0108"+
		"\7k\2\2\u0108\u0109\7e\2\2\u0109\4\3\2\2\2\u010a\u010b\7d\2\2\u010b\u010c"+
		"\7q\2\2\u010c\u010d\7q\2\2\u010d\u010e\7n\2\2\u010e\6\3\2\2\2\u010f\u0110"+
		"\7u\2\2\u0110\u0111\7v\2\2\u0111\u0112\7t\2\2\u0112\u0113\7k\2\2\u0113"+
		"\u0114\7p\2\2\u0114\u0115\7i\2\2\u0115\b\3\2\2\2\u0116\u0117\7v\2\2\u0117"+
		"\u0118\7j\2\2\u0118\u0119\7k\2\2\u0119\u011a\7u\2\2\u011a\n\3\2\2\2\u011b"+
		"\u011c\7e\2\2\u011c\u011d\7n\2\2\u011d\u011e\7c\2\2\u011e\u011f\7u\2\2"+
		"\u011f\u0120\7u\2\2\u0120\f\3\2\2\2\u0121\u0122\7d\2\2\u0122\u0123\7q"+
		"\2\2\u0123\u0124\7q\2\2\u0124\u0125\7n\2\2\u0125\u0126\7g\2\2\u0126\u0127"+
		"\7c\2\2\u0127\u0128\7p\2\2\u0128\16\3\2\2\2\u0129\u012a\7d\2\2\u012a\u012b"+
		"\7t\2\2\u012b\u012c\7g\2\2\u012c\u012d\7c\2\2\u012d\u012e\7m\2\2\u012e"+
		"\20\3\2\2\2\u012f\u0130\7d\2\2\u0130\u0131\7{\2\2\u0131\u0132\7v\2\2\u0132"+
		"\u0133\7g\2\2\u0133\22\3\2\2\2\u0134\u0135\7e\2\2\u0135\u0136\7c\2\2\u0136"+
		"\u0137\7u\2\2\u0137\u0138\7g\2\2\u0138\24\3\2\2\2\u0139\u013a\7e\2\2\u013a"+
		"\u013b\7j\2\2\u013b\u013c\7c\2\2\u013c\u013d\7t\2\2\u013d\26\3\2\2\2\u013e"+
		"\u013f\7e\2\2\u013f\u0140\7q\2\2\u0140\u0141\7p\2\2\u0141\u0142\7v\2\2"+
		"\u0142\u0143\7k\2\2\u0143\u0144\7p\2\2\u0144\u0145\7w\2\2\u0145\u0146"+
		"\7g\2\2\u0146\30\3\2\2\2\u0147\u0148\7f\2\2\u0148\u0149\7g\2\2\u0149\u014a"+
		"\7h\2\2\u014a\u014b\7c\2\2\u014b\u014c\7w\2\2\u014c\u014d\7n\2\2\u014d"+
		"\u014e\7v\2\2\u014e\32\3\2\2\2\u014f\u0150\7f\2\2\u0150\u0151\7q\2\2\u0151"+
		"\34\3\2\2\2\u0152\u0153\7f\2\2\u0153\u0154\7q\2\2\u0154\u0155\7w\2\2\u0155"+
		"\u0156\7d\2\2\u0156\u0157\7n\2\2\u0157\u0158\7g\2\2\u0158\36\3\2\2\2\u0159"+
		"\u015a\7g\2\2\u015a\u015b\7n\2\2\u015b\u015c\7u\2\2\u015c\u015d\7g\2\2"+
		"\u015d \3\2\2\2\u015e\u015f\7h\2\2\u015f\u0160\7k\2\2\u0160\u0161\7p\2"+
		"\2\u0161\u0162\7c\2\2\u0162\u0163\7n\2\2\u0163\"\3\2\2\2\u0164\u0165\7"+
		"h\2\2\u0165\u0166\7n\2\2\u0166\u0167\7q\2\2\u0167\u0168\7c\2\2\u0168\u0169"+
		"\7v\2\2\u0169$\3\2\2\2\u016a\u016b\7h\2\2\u016b\u016c\7q\2\2\u016c\u016d"+
		"\7t\2\2\u016d&\3\2\2\2\u016e\u016f\7k\2\2\u016f\u0170\7h\2\2\u0170(\3"+
		"\2\2\2\u0171\u0172\7k\2\2\u0172\u0173\7p\2\2\u0173\u0174\7v\2\2\u0174"+
		"*\3\2\2\2\u0175\u0176\7n\2\2\u0176\u0177\7q\2\2\u0177\u0178\7p\2\2\u0178"+
		"\u0179\7i\2\2\u0179,\3\2\2\2\u017a\u017b\7p\2\2\u017b\u017c\7g\2\2\u017c"+
		"\u017d\7y\2\2\u017d.\3\2\2\2\u017e\u017f\7t\2\2\u017f\u0180\7g\2\2\u0180"+
		"\u0181\7v\2\2\u0181\u0182\7w\2\2\u0182\u0183\7t\2\2\u0183\u0184\7p\2\2"+
		"\u0184\60\3\2\2\2\u0185\u0186\7u\2\2\u0186\u0187\7j\2\2\u0187\u0188\7"+
		"q\2\2\u0188\u0189\7t\2\2\u0189\u018a\7v\2\2\u018a\62\3\2\2\2\u018b\u018c"+
		"\7u\2\2\u018c\u018d\7y\2\2\u018d\u018e\7k\2\2\u018e\u018f\7v\2\2\u018f"+
		"\u0190\7e\2\2\u0190\u0191\7j\2\2\u0191\64\3\2\2\2\u0192\u0193\7v\2\2\u0193"+
		"\u0194\7t\2\2\u0194\u0195\7c\2\2\u0195\u0196\7p\2\2\u0196\u0197\7u\2\2"+
		"\u0197\u0198\7k\2\2\u0198\u0199\7g\2\2\u0199\u019a\7p\2\2\u019a\u019b"+
		"\7v\2\2\u019b\66\3\2\2\2\u019c\u019d\7x\2\2\u019d\u019e\7q\2\2\u019e\u019f"+
		"\7k\2\2\u019f\u01a0\7f\2\2\u01a08\3\2\2\2\u01a1\u01a2\7y\2\2\u01a2\u01a3"+
		"\7j\2\2\u01a3\u01a4\7k\2\2\u01a4\u01a5\7n\2\2\u01a5\u01a6\7g\2\2\u01a6"+
		":\3\2\2\2\u01a7\u01ac\5=\37\2\u01a8\u01ac\5? \2\u01a9\u01ac\5A!\2\u01aa"+
		"\u01ac\5C\"\2\u01ab\u01a7\3\2\2\2\u01ab\u01a8\3\2\2\2\u01ab\u01a9\3\2"+
		"\2\2\u01ab\u01aa\3\2\2\2\u01ac<\3\2\2\2\u01ad\u01af\5G$\2\u01ae\u01b0"+
		"\5E#\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0>\3\2\2\2\u01b1\u01b3"+
		"\5U+\2\u01b2\u01b4\5E#\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"@\3\2\2\2\u01b5\u01b7\5_\60\2\u01b6\u01b8\5E#\2\u01b7\u01b6\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8B\3\2\2\2\u01b9\u01bb\5i\65\2\u01ba\u01bc\5E#\2\u01bb"+
		"\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bcD\3\2\2\2\u01bd\u01be\t\2\2\2"+
		"\u01beF\3\2\2\2\u01bf\u01ca\7\62\2\2\u01c0\u01c7\5M\'\2\u01c1\u01c3\5"+
		"I%\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c8\3\2\2\2\u01c4"+
		"\u01c5\5S*\2\u01c5\u01c6\5I%\2\u01c6\u01c8\3\2\2\2\u01c7\u01c2\3\2\2\2"+
		"\u01c7\u01c4\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01bf\3\2\2\2\u01c9\u01c0"+
		"\3\2\2\2\u01caH\3\2\2\2\u01cb\u01d0\5K&\2\u01cc\u01ce\5O(\2\u01cd\u01cc"+
		"\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\5K&\2\u01d0"+
		"\u01cd\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1J\3\2\2\2\u01d2\u01d5\7\62\2\2"+
		"\u01d3\u01d5\5M\'\2\u01d4\u01d2\3\2\2\2\u01d4\u01d3\3\2\2\2\u01d5L\3\2"+
		"\2\2\u01d6\u01d7\t\3\2\2\u01d7N\3\2\2\2\u01d8\u01da\5Q)\2\u01d9\u01d8"+
		"\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"P\3\2\2\2\u01dd\u01e0\5K&\2\u01de\u01e0\7a\2\2\u01df\u01dd\3\2\2\2\u01df"+
		"\u01de\3\2\2\2\u01e0R\3\2\2\2\u01e1\u01e3\7a\2\2\u01e2\u01e1\3\2\2\2\u01e3"+
		"\u01e4\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5T\3\2\2\2"+
		"\u01e6\u01e7\7\62\2\2\u01e7\u01e8\t\4\2\2\u01e8\u01e9\5W,\2\u01e9V\3\2"+
		"\2\2\u01ea\u01ef\5Y-\2\u01eb\u01ed\5[.\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed"+
		"\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\5Y-\2\u01ef\u01ec\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0X\3\2\2\2\u01f1\u01f2\t\5\2\2\u01f2Z\3\2\2\2\u01f3"+
		"\u01f5\5]/\2\u01f4\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f4\3\2\2"+
		"\2\u01f6\u01f7\3\2\2\2\u01f7\\\3\2\2\2\u01f8\u01fb\5Y-\2\u01f9\u01fb\7"+
		"a\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fb^\3\2\2\2\u01fc\u01fe"+
		"\7\62\2\2\u01fd\u01ff\5S*\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200\u0201\5a\61\2\u0201`\3\2\2\2\u0202\u0207\5c\62\2"+
		"\u0203\u0205\5e\63\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206"+
		"\3\2\2\2\u0206\u0208\5c\62\2\u0207\u0204\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"b\3\2\2\2\u0209\u020a\t\6\2\2\u020ad\3\2\2\2\u020b\u020d\5g\64\2\u020c"+
		"\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2"+
		"\2\2\u020ff\3\2\2\2\u0210\u0213\5c\62\2\u0211\u0213\7a\2\2\u0212\u0210"+
		"\3\2\2\2\u0212\u0211\3\2\2\2\u0213h\3\2\2\2\u0214\u0215\7\62\2\2\u0215"+
		"\u0216\t\7\2\2\u0216\u0217\5k\66\2\u0217j\3\2\2\2\u0218\u021d\5m\67\2"+
		"\u0219\u021b\5o8\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c"+
		"\3\2\2\2\u021c\u021e\5m\67\2\u021d\u021a\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"l\3\2\2\2\u021f\u0220\t\b\2\2\u0220n\3\2\2\2\u0221\u0223\5q9\2\u0222\u0221"+
		"\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"p\3\2\2\2\u0226\u0229\5m\67\2\u0227\u0229\7a\2\2\u0228\u0226\3\2\2\2\u0228"+
		"\u0227\3\2\2\2\u0229r\3\2\2\2\u022a\u022d\5u;\2\u022b\u022d\5\u0081A\2"+
		"\u022c\u022a\3\2\2\2\u022c\u022b\3\2\2\2\u022dt\3\2\2\2\u022e\u022f\5"+
		"I%\2\u022f\u0231\7\60\2\2\u0230\u0232\5I%\2\u0231\u0230\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\u0234\3\2\2\2\u0233\u0235\5w<\2\u0234\u0233\3\2\2"+
		"\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236\u0238\5\177@\2\u0237"+
		"\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u024a\3\2\2\2\u0239\u023a\7\60"+
		"\2\2\u023a\u023c\5I%\2\u023b\u023d\5w<\2\u023c\u023b\3\2\2\2\u023c\u023d"+
		"\3\2\2\2\u023d\u023f\3\2\2\2\u023e\u0240\5\177@\2\u023f\u023e\3\2\2\2"+
		"\u023f\u0240\3\2\2\2\u0240\u024a\3\2\2\2\u0241\u0242\5I%\2\u0242\u0244"+
		"\5w<\2\u0243\u0245\5\177@\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"\u024a\3\2\2\2\u0246\u0247\5I%\2\u0247\u0248\5\177@\2\u0248\u024a\3\2"+
		"\2\2\u0249\u022e\3\2\2\2\u0249\u0239\3\2\2\2\u0249\u0241\3\2\2\2\u0249"+
		"\u0246\3\2\2\2\u024av\3\2\2\2\u024b\u024c\5y=\2\u024c\u024d\5{>\2\u024d"+
		"x\3\2\2\2\u024e\u024f\t\t\2\2\u024fz\3\2\2\2\u0250\u0252\5}?\2\u0251\u0250"+
		"\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\5I%\2\u0254"+
		"|\3\2\2\2\u0255\u0256\t\n\2\2\u0256~\3\2\2\2\u0257\u0258\t\13\2\2\u0258"+
		"\u0080\3\2\2\2\u0259\u025a\5\u0083B\2\u025a\u025c\5\u0085C\2\u025b\u025d"+
		"\5\177@\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u0082\3\2\2\2"+
		"\u025e\u0260\5U+\2\u025f\u0261\7\60\2\2\u0260\u025f\3\2\2\2\u0260\u0261"+
		"\3\2\2\2\u0261\u026a\3\2\2\2\u0262\u0263\7\62\2\2\u0263\u0265\t\4\2\2"+
		"\u0264\u0266\5W,\2\u0265\u0264\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267"+
		"\3\2\2\2\u0267\u0268\7\60\2\2\u0268\u026a\5W,\2\u0269\u025e\3\2\2\2\u0269"+
		"\u0262\3\2\2\2\u026a\u0084\3\2\2\2\u026b\u026c\5\u0087D\2\u026c\u026d"+
		"\5{>\2\u026d\u0086\3\2\2\2\u026e\u026f\t\f\2\2\u026f\u0088\3\2\2\2\u0270"+
		"\u0271\7v\2\2\u0271\u0272\7t\2\2\u0272\u0273\7w\2\2\u0273\u027a\7g\2\2"+
		"\u0274\u0275\7h\2\2\u0275\u0276\7c\2\2\u0276\u0277\7n\2\2\u0277\u0278"+
		"\7u\2\2\u0278\u027a\7g\2\2\u0279\u0270\3\2\2\2\u0279\u0274\3\2\2\2\u027a"+
		"\u008a\3\2\2\2\u027b\u027c\7)\2\2\u027c\u027d\5\u008dG\2\u027d\u027e\7"+
		")\2\2\u027e\u0284\3\2\2\2\u027f\u0280\7)\2\2\u0280\u0281\5\u0095K\2\u0281"+
		"\u0282\7)\2\2\u0282\u0284\3\2\2\2\u0283\u027b\3\2\2\2\u0283\u027f\3\2"+
		"\2\2\u0284\u008c\3\2\2\2\u0285\u0286\n\r\2\2\u0286\u008e\3\2\2\2\u0287"+
		"\u0289\7$\2\2\u0288\u028a\5\u0091I\2\u0289\u0288\3\2\2\2\u0289\u028a\3"+
		"\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\7$\2\2\u028c\u0090\3\2\2\2\u028d"+
		"\u028f\5\u0093J\2\u028e\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u028e"+
		"\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0092\3\2\2\2\u0292\u0295\n\16\2\2"+
		"\u0293\u0295\5\u0095K\2\u0294\u0292\3\2\2\2\u0294\u0293\3\2\2\2\u0295"+
		"\u0094\3\2\2\2\u0296\u0297\7^\2\2\u0297\u029a\t\17\2\2\u0298\u029a\5\u0097"+
		"L\2\u0299\u0296\3\2\2\2\u0299\u0298\3\2\2\2\u029a\u0096\3\2\2\2\u029b"+
		"\u029c\7^\2\2\u029c\u02a7\5c\62\2\u029d\u029e\7^\2\2\u029e\u029f\5c\62"+
		"\2\u029f\u02a0\5c\62\2\u02a0\u02a7\3\2\2\2\u02a1\u02a2\7^\2\2\u02a2\u02a3"+
		"\5\u0099M\2\u02a3\u02a4\5c\62\2\u02a4\u02a5\5c\62\2\u02a5\u02a7\3\2\2"+
		"\2\u02a6\u029b\3\2\2\2\u02a6\u029d\3\2\2\2\u02a6\u02a1\3\2\2\2\u02a7\u0098"+
		"\3\2\2\2\u02a8\u02a9\t\20\2\2\u02a9\u009a\3\2\2\2\u02aa\u02ab\7p\2\2\u02ab"+
		"\u02ac\7w\2\2\u02ac\u02ad\7n\2\2\u02ad\u02ae\7n\2\2\u02ae\u009c\3\2\2"+
		"\2\u02af\u02b0\7*\2\2\u02b0\u009e\3\2\2\2\u02b1\u02b2\7+\2\2\u02b2\u00a0"+
		"\3\2\2\2\u02b3\u02b4\7}\2\2\u02b4\u00a2\3\2\2\2\u02b5\u02b6\7\177\2\2"+
		"\u02b6\u00a4\3\2\2\2\u02b7\u02b8\7]\2\2\u02b8\u00a6\3\2\2\2\u02b9\u02ba"+
		"\7_\2\2\u02ba\u00a8\3\2\2\2\u02bb\u02bc\7=\2\2\u02bc\u00aa\3\2\2\2\u02bd"+
		"\u02be\7.\2\2\u02be\u00ac\3\2\2\2\u02bf\u02c0\7\60\2\2\u02c0\u00ae\3\2"+
		"\2\2\u02c1\u02c2\7?\2\2\u02c2\u00b0\3\2\2\2\u02c3\u02c4\7@\2\2\u02c4\u00b2"+
		"\3\2\2\2\u02c5\u02c6\7>\2\2\u02c6\u00b4\3\2\2\2\u02c7\u02c8\7#\2\2\u02c8"+
		"\u00b6\3\2\2\2\u02c9\u02ca\7\u0080\2\2\u02ca\u00b8\3\2\2\2\u02cb\u02cc"+
		"\7A\2\2\u02cc\u00ba\3\2\2\2\u02cd\u02ce\7<\2\2\u02ce\u00bc\3\2\2\2\u02cf"+
		"\u02d0\7?\2\2\u02d0\u02d1\7?\2\2\u02d1\u00be\3\2\2\2\u02d2\u02d3\7>\2"+
		"\2\u02d3\u02d4\7?\2\2\u02d4\u00c0\3\2\2\2\u02d5\u02d6\7@\2\2\u02d6\u02d7"+
		"\7?\2\2\u02d7\u00c2\3\2\2\2\u02d8\u02d9\7#\2\2\u02d9\u02da\7?\2\2\u02da"+
		"\u00c4\3\2\2\2\u02db\u02dc\7(\2\2\u02dc\u02dd\7(\2\2\u02dd\u00c6\3\2\2"+
		"\2\u02de\u02df\7~\2\2\u02df\u02e0\7~\2\2\u02e0\u00c8\3\2\2\2\u02e1\u02e2"+
		"\7-\2\2\u02e2\u02e3\7-\2\2\u02e3\u00ca\3\2\2\2\u02e4\u02e5\7/\2\2\u02e5"+
		"\u02e6\7/\2\2\u02e6\u00cc\3\2\2\2\u02e7\u02e8\7-\2\2\u02e8\u00ce\3\2\2"+
		"\2\u02e9\u02ea\7/\2\2\u02ea\u00d0\3\2\2\2\u02eb\u02ec\7,\2\2\u02ec\u00d2"+
		"\3\2\2\2\u02ed\u02ee\7\61\2\2\u02ee\u00d4\3\2\2\2\u02ef\u02f0\7(\2\2\u02f0"+
		"\u00d6\3\2\2\2\u02f1\u02f2\7~\2\2\u02f2\u00d8\3\2\2\2\u02f3\u02f4\7`\2"+
		"\2\u02f4\u00da\3\2\2\2\u02f5\u02f6\7\'\2\2\u02f6\u00dc\3\2\2\2\u02f7\u02f8"+
		"\7-\2\2\u02f8\u02f9\7?\2\2\u02f9\u00de\3\2\2\2\u02fa\u02fb\7/\2\2\u02fb"+
		"\u02fc\7?\2\2\u02fc\u00e0\3\2\2\2\u02fd\u02fe\7,\2\2\u02fe\u02ff\7?\2"+
		"\2\u02ff\u00e2\3\2\2\2\u0300\u0301\7\61\2\2\u0301\u0302\7?\2\2\u0302\u00e4"+
		"\3\2\2\2\u0303\u0304\7(\2\2\u0304\u0305\7?\2\2\u0305\u00e6\3\2\2\2\u0306"+
		"\u0307\7~\2\2\u0307\u0308\7?\2\2\u0308\u00e8\3\2\2\2\u0309\u030a\7`\2"+
		"\2\u030a\u030b\7?\2\2\u030b\u00ea\3\2\2\2\u030c\u030d\7\'\2\2\u030d\u030e"+
		"\7?\2\2\u030e\u00ec\3\2\2\2\u030f\u0310\7>\2\2\u0310\u0311\7>\2\2\u0311"+
		"\u0312\7?\2\2\u0312\u00ee\3\2\2\2\u0313\u0314\7@\2\2\u0314\u0315\7@\2"+
		"\2\u0315\u0316\7?\2\2\u0316\u00f0\3\2\2\2\u0317\u0318\7@\2\2\u0318\u0319"+
		"\7@\2\2\u0319\u031a\7@\2\2\u031a\u031b\7?\2\2\u031b\u00f2\3\2\2\2\u031c"+
		"\u0320\5\u00f5{\2\u031d\u031f\5\u00f7|\2\u031e\u031d\3\2\2\2\u031f\u0322"+
		"\3\2\2\2\u0320\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u00f4\3\2\2\2\u0322"+
		"\u0320\3\2\2\2\u0323\u032a\t\21\2\2\u0324\u0325\n\22\2\2\u0325\u032a\6"+
		"{\2\2\u0326\u0327\t\23\2\2\u0327\u0328\t\24\2\2\u0328\u032a\6{\3\2\u0329"+
		"\u0323\3\2\2\2\u0329\u0324\3\2\2\2\u0329\u0326\3\2\2\2\u032a\u00f6\3\2"+
		"\2\2\u032b\u0332\t\25\2\2\u032c\u032d\n\22\2\2\u032d\u0332\6|\4\2\u032e"+
		"\u032f\t\23\2\2\u032f\u0330\t\24\2\2\u0330\u0332\6|\5\2\u0331\u032b\3"+
		"\2\2\2\u0331\u032c\3\2\2\2\u0331\u032e\3\2\2\2\u0332\u00f8\3\2\2\2\u0333"+
		"\u0334\7B\2\2\u0334\u00fa\3\2\2\2\u0335\u0336\7\60\2\2\u0336\u0337\7\60"+
		"\2\2\u0337\u0338\7\60\2\2\u0338\u00fc\3\2\2\2\u0339\u033b\t\26\2\2\u033a"+
		"\u0339\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033a\3\2\2\2\u033c\u033d\3\2"+
		"\2\2\u033d\u033e\3\2\2\2\u033e\u033f\b\177\2\2\u033f\u00fe\3\2\2\2\u0340"+
		"\u0341\7\61\2\2\u0341\u0342\7,\2\2\u0342\u0346\3\2\2\2\u0343\u0345\13"+
		"\2\2\2\u0344\u0343\3\2\2\2\u0345\u0348\3\2\2\2\u0346\u0347\3\2\2\2\u0346"+
		"\u0344\3\2\2\2\u0347\u0349\3\2\2\2\u0348\u0346\3\2\2\2\u0349\u034a\7,"+
		"\2\2\u034a\u034b\7\61\2\2\u034b\u034c\3\2\2\2\u034c\u034d\b\u0080\2\2"+
		"\u034d\u0100\3\2\2\2\u034e\u034f\7\61\2\2\u034f\u0350\7\61\2\2\u0350\u0354"+
		"\3\2\2\2\u0351\u0353\n\27\2\2\u0352\u0351\3\2\2\2\u0353\u0356\3\2\2\2"+
		"\u0354\u0352\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0357\3\2\2\2\u0356\u0354"+
		"\3\2\2\2\u0357\u0358\b\u0081\2\2\u0358\u0102\3\2\2\28\2\u01ab\u01af\u01b3"+
		"\u01b7\u01bb\u01c2\u01c7\u01c9\u01cd\u01d0\u01d4\u01db\u01df\u01e4\u01ec"+
		"\u01ef\u01f6\u01fa\u01fe\u0204\u0207\u020e\u0212\u021a\u021d\u0224\u0228"+
		"\u022c\u0231\u0234\u0237\u023c\u023f\u0244\u0249\u0251\u025c\u0260\u0265"+
		"\u0269\u0279\u0283\u0289\u0290\u0294\u0299\u02a6\u0320\u0329\u0331\u033c"+
		"\u0346\u0354\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}