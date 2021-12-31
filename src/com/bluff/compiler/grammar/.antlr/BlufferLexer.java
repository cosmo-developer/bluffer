// Generated from e:\jdev-2021\bluffer\src\com\bluff\compiler\grammar\Bluffer.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOLEAN", "CHAR", "ELSE", "FLOAT", "IF", "INT", "STRING", "NEW", "RETURN", 
			"VOID", "WHILE", "IntegerLiteral", "DecimalIntegerLiteral", "HexIntegerLiteral", 
			"OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", 
			"Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore", 
			"Underscores", "HexNumeral", "HexDigits", "HexDigit", "HexDigitsAndUnderscores", 
			"HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", "OctalDigit", 
			"OctalDigitsAndUnderscores", "OctalDigitOrUnderscore", "BinaryNumeral", 
			"BinaryDigits", "BinaryDigit", "BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", 
			"FloatingPointLiteral", "DecimalFloatingPointLiteral", "ExponentPart", 
			"ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", "HexSignificand", 
			"BooleanLiteral", "CharacterLiteral", "SingleCharacter", "StringLiteral", 
			"StringCharacters", "StringCharacter", "EscapeSequence", "OctalEscape", 
			"ZeroToThree", "NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "ADD", "SUB", "MUL", "DIV", "MOD", "Identifier", 
			"JavaLetter", "JavaLetterOrDigit", "WS", "COMMENT", "LINE_COMMENT"
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
		case 79:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 80:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0245\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00e9\n\r\3\16\3\16"+
		"\5\16\u00ed\n\16\3\17\3\17\5\17\u00f1\n\17\3\20\3\20\5\20\u00f5\n\20\3"+
		"\21\3\21\5\21\u00f9\n\21\3\22\3\22\3\23\3\23\3\23\5\23\u0100\n\23\3\23"+
		"\3\23\3\23\5\23\u0105\n\23\5\23\u0107\n\23\3\24\3\24\5\24\u010b\n\24\3"+
		"\24\5\24\u010e\n\24\3\25\3\25\5\25\u0112\n\25\3\26\3\26\3\27\6\27\u0117"+
		"\n\27\r\27\16\27\u0118\3\30\3\30\5\30\u011d\n\30\3\31\6\31\u0120\n\31"+
		"\r\31\16\31\u0121\3\32\3\32\3\32\3\32\3\33\3\33\5\33\u012a\n\33\3\33\5"+
		"\33\u012d\n\33\3\34\3\34\3\35\6\35\u0132\n\35\r\35\16\35\u0133\3\36\3"+
		"\36\5\36\u0138\n\36\3\37\3\37\5\37\u013c\n\37\3\37\3\37\3 \3 \5 \u0142"+
		"\n \3 \5 \u0145\n \3!\3!\3\"\6\"\u014a\n\"\r\"\16\"\u014b\3#\3#\5#\u0150"+
		"\n#\3$\3$\3$\3$\3%\3%\5%\u0158\n%\3%\5%\u015b\n%\3&\3&\3\'\6\'\u0160\n"+
		"\'\r\'\16\'\u0161\3(\3(\5(\u0166\n(\3)\3)\3*\3*\3*\5*\u016d\n*\3*\5*\u0170"+
		"\n*\3*\5*\u0173\n*\3*\3*\3*\5*\u0178\n*\3*\5*\u017b\n*\3*\3*\3*\5*\u0180"+
		"\n*\3*\3*\3*\5*\u0185\n*\3+\3+\3+\3,\3,\3-\5-\u018d\n-\3-\3-\3.\3.\3/"+
		"\3/\3\60\3\60\5\60\u0197\n\60\3\60\3\60\3\60\5\60\u019c\n\60\3\60\3\60"+
		"\5\60\u01a0\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01ab"+
		"\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u01b5\n\62\3\63\3\63"+
		"\3\64\3\64\5\64\u01bb\n\64\3\64\3\64\3\65\6\65\u01c0\n\65\r\65\16\65\u01c1"+
		"\3\66\3\66\5\66\u01c6\n\66\3\67\3\67\3\67\5\67\u01cb\n\67\38\38\38\38"+
		"\38\38\38\38\38\38\38\58\u01d8\n8\39\39\3:\3:\3:\3:\3:\3;\3;\3<\3<\3="+
		"\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3G\3H"+
		"\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\7P\u0211"+
		"\nP\fP\16P\u0214\13P\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u021c\nQ\3R\3R\3R\3R\3R\3R\5"+
		"R\u0224\nR\3S\6S\u0227\nS\rS\16S\u0228\3S\3S\3T\3T\3T\3T\7T\u0231\nT\f"+
		"T\16T\u0234\13T\3T\3T\3T\3T\3T\3U\3U\3U\3U\7U\u023f\nU\fU\16U\u0242\13"+
		"U\3U\3U\3\u0232\2V\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2"+
		";\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\17S\2U\2W\2Y\2[\2]\2_\2a\20c\21e\2"+
		"g\22i\2k\2m\2o\2q\2s\23u\24w\25y\26{\27}\30\177\31\u0081\32\u0083\33\u0085"+
		"\34\u0087\35\u0089\36\u008b\37\u008d \u008f!\u0091\"\u0093#\u0095$\u0097"+
		"%\u0099&\u009b\'\u009d(\u009f)\u00a1\2\u00a3\2\u00a5*\u00a7+\u00a9,\3"+
		"\2\27\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63\4"+
		"\2GGgg\4\2--//\6\2FFHHffhh\4\2))^^\4\2$$^^\n\2$$))^^ddhhppttvv\3\2\62"+
		"\65\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001"+
		"\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0254\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2Q\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2g\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w"+
		"\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d"+
		"\3\2\2\2\2\u009f\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2"+
		"\2\3\u00ab\3\2\2\2\5\u00b0\3\2\2\2\7\u00b5\3\2\2\2\t\u00ba\3\2\2\2\13"+
		"\u00c0\3\2\2\2\r\u00c3\3\2\2\2\17\u00c7\3\2\2\2\21\u00ce\3\2\2\2\23\u00d2"+
		"\3\2\2\2\25\u00d9\3\2\2\2\27\u00de\3\2\2\2\31\u00e8\3\2\2\2\33\u00ea\3"+
		"\2\2\2\35\u00ee\3\2\2\2\37\u00f2\3\2\2\2!\u00f6\3\2\2\2#\u00fa\3\2\2\2"+
		"%\u0106\3\2\2\2\'\u0108\3\2\2\2)\u0111\3\2\2\2+\u0113\3\2\2\2-\u0116\3"+
		"\2\2\2/\u011c\3\2\2\2\61\u011f\3\2\2\2\63\u0123\3\2\2\2\65\u0127\3\2\2"+
		"\2\67\u012e\3\2\2\29\u0131\3\2\2\2;\u0137\3\2\2\2=\u0139\3\2\2\2?\u013f"+
		"\3\2\2\2A\u0146\3\2\2\2C\u0149\3\2\2\2E\u014f\3\2\2\2G\u0151\3\2\2\2I"+
		"\u0155\3\2\2\2K\u015c\3\2\2\2M\u015f\3\2\2\2O\u0165\3\2\2\2Q\u0167\3\2"+
		"\2\2S\u0184\3\2\2\2U\u0186\3\2\2\2W\u0189\3\2\2\2Y\u018c\3\2\2\2[\u0190"+
		"\3\2\2\2]\u0192\3\2\2\2_\u019f\3\2\2\2a\u01aa\3\2\2\2c\u01b4\3\2\2\2e"+
		"\u01b6\3\2\2\2g\u01b8\3\2\2\2i\u01bf\3\2\2\2k\u01c5\3\2\2\2m\u01ca\3\2"+
		"\2\2o\u01d7\3\2\2\2q\u01d9\3\2\2\2s\u01db\3\2\2\2u\u01e0\3\2\2\2w\u01e2"+
		"\3\2\2\2y\u01e4\3\2\2\2{\u01e6\3\2\2\2}\u01e8\3\2\2\2\177\u01ea\3\2\2"+
		"\2\u0081\u01ec\3\2\2\2\u0083\u01ee\3\2\2\2\u0085\u01f0\3\2\2\2\u0087\u01f2"+
		"\3\2\2\2\u0089\u01f4\3\2\2\2\u008b\u01f6\3\2\2\2\u008d\u01f8\3\2\2\2\u008f"+
		"\u01fb\3\2\2\2\u0091\u01fe\3\2\2\2\u0093\u0201\3\2\2\2\u0095\u0204\3\2"+
		"\2\2\u0097\u0206\3\2\2\2\u0099\u0208\3\2\2\2\u009b\u020a\3\2\2\2\u009d"+
		"\u020c\3\2\2\2\u009f\u020e\3\2\2\2\u00a1\u021b\3\2\2\2\u00a3\u0223\3\2"+
		"\2\2\u00a5\u0226\3\2\2\2\u00a7\u022c\3\2\2\2\u00a9\u023a\3\2\2\2\u00ab"+
		"\u00ac\7d\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7n\2\2"+
		"\u00af\4\3\2\2\2\u00b0\u00b1\7e\2\2\u00b1\u00b2\7j\2\2\u00b2\u00b3\7c"+
		"\2\2\u00b3\u00b4\7t\2\2\u00b4\6\3\2\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7"+
		"\7n\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7g\2\2\u00b9\b\3\2\2\2\u00ba\u00bb"+
		"\7h\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7c\2\2\u00be"+
		"\u00bf\7v\2\2\u00bf\n\3\2\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7h\2\2\u00c2"+
		"\f\3\2\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7v\2\2\u00c6"+
		"\16\3\2\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7t\2\2\u00ca"+
		"\u00cb\7k\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7i\2\2\u00cd\20\3\2\2\2\u00ce"+
		"\u00cf\7p\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7y\2\2\u00d1\22\3\2\2\2\u00d2"+
		"\u00d3\7t\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7w\2\2"+
		"\u00d6\u00d7\7t\2\2\u00d7\u00d8\7p\2\2\u00d8\24\3\2\2\2\u00d9\u00da\7"+
		"x\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7f\2\2\u00dd\26"+
		"\3\2\2\2\u00de\u00df\7y\2\2\u00df\u00e0\7j\2\2\u00e0\u00e1\7k\2\2\u00e1"+
		"\u00e2\7n\2\2\u00e2\u00e3\7g\2\2\u00e3\30\3\2\2\2\u00e4\u00e9\5\33\16"+
		"\2\u00e5\u00e9\5\35\17\2\u00e6\u00e9\5\37\20\2\u00e7\u00e9\5!\21\2\u00e8"+
		"\u00e4\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2"+
		"\2\2\u00e9\32\3\2\2\2\u00ea\u00ec\5%\23\2\u00eb\u00ed\5#\22\2\u00ec\u00eb"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\34\3\2\2\2\u00ee\u00f0\5\63\32\2\u00ef"+
		"\u00f1\5#\22\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\36\3\2\2"+
		"\2\u00f2\u00f4\5=\37\2\u00f3\u00f5\5#\22\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5 \3\2\2\2\u00f6\u00f8\5G$\2\u00f7\u00f9\5#\22\2\u00f8\u00f7"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\"\3\2\2\2\u00fa\u00fb\t\2\2\2\u00fb"+
		"$\3\2\2\2\u00fc\u0107\7\62\2\2\u00fd\u0104\5+\26\2\u00fe\u0100\5\'\24"+
		"\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0105\3\2\2\2\u0101\u0102"+
		"\5\61\31\2\u0102\u0103\5\'\24\2\u0103\u0105\3\2\2\2\u0104\u00ff\3\2\2"+
		"\2\u0104\u0101\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u00fc\3\2\2\2\u0106\u00fd"+
		"\3\2\2\2\u0107&\3\2\2\2\u0108\u010d\5)\25\2\u0109\u010b\5-\27\2\u010a"+
		"\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\5)"+
		"\25\2\u010d\u010a\3\2\2\2\u010d\u010e\3\2\2\2\u010e(\3\2\2\2\u010f\u0112"+
		"\7\62\2\2\u0110\u0112\5+\26\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2"+
		"\u0112*\3\2\2\2\u0113\u0114\t\3\2\2\u0114,\3\2\2\2\u0115\u0117\5/\30\2"+
		"\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119.\3\2\2\2\u011a\u011d\5)\25\2\u011b\u011d\7a\2\2\u011c\u011a"+
		"\3\2\2\2\u011c\u011b\3\2\2\2\u011d\60\3\2\2\2\u011e\u0120\7a\2\2\u011f"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\62\3\2\2\2\u0123\u0124\7\62\2\2\u0124\u0125\t\4\2\2\u0125\u0126"+
		"\5\65\33\2\u0126\64\3\2\2\2\u0127\u012c\5\67\34\2\u0128\u012a\59\35\2"+
		"\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d"+
		"\5\67\34\2\u012c\u0129\3\2\2\2\u012c\u012d\3\2\2\2\u012d\66\3\2\2\2\u012e"+
		"\u012f\t\5\2\2\u012f8\3\2\2\2\u0130\u0132\5;\36\2\u0131\u0130\3\2\2\2"+
		"\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134:\3"+
		"\2\2\2\u0135\u0138\5\67\34\2\u0136\u0138\7a\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0136\3\2\2\2\u0138<\3\2\2\2\u0139\u013b\7\62\2\2\u013a\u013c\5\61\31"+
		"\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e"+
		"\5? \2\u013e>\3\2\2\2\u013f\u0144\5A!\2\u0140\u0142\5C\"\2\u0141\u0140"+
		"\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\5A!\2\u0144"+
		"\u0141\3\2\2\2\u0144\u0145\3\2\2\2\u0145@\3\2\2\2\u0146\u0147\t\6\2\2"+
		"\u0147B\3\2\2\2\u0148\u014a\5E#\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014cD\3\2\2\2\u014d\u0150"+
		"\5A!\2\u014e\u0150\7a\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150"+
		"F\3\2\2\2\u0151\u0152\7\62\2\2\u0152\u0153\t\7\2\2\u0153\u0154\5I%\2\u0154"+
		"H\3\2\2\2\u0155\u015a\5K&\2\u0156\u0158\5M\'\2\u0157\u0156\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\5K&\2\u015a\u0157\3\2\2"+
		"\2\u015a\u015b\3\2\2\2\u015bJ\3\2\2\2\u015c\u015d\t\b\2\2\u015dL\3\2\2"+
		"\2\u015e\u0160\5O(\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u015f"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162N\3\2\2\2\u0163\u0166\5K&\2\u0164\u0166"+
		"\7a\2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166P\3\2\2\2\u0167\u0168"+
		"\5S*\2\u0168R\3\2\2\2\u0169\u016a\5\'\24\2\u016a\u016c\7\60\2\2\u016b"+
		"\u016d\5\'\24\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3"+
		"\2\2\2\u016e\u0170\5U+\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0172\3\2\2\2\u0171\u0173\5]/\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2"+
		"\2\u0173\u0185\3\2\2\2\u0174\u0175\7\60\2\2\u0175\u0177\5\'\24\2\u0176"+
		"\u0178\5U+\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2"+
		"\2\u0179\u017b\5]/\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0185"+
		"\3\2\2\2\u017c\u017d\5\'\24\2\u017d\u017f\5U+\2\u017e\u0180\5]/\2\u017f"+
		"\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0185\3\2\2\2\u0181\u0182\5\'"+
		"\24\2\u0182\u0183\5]/\2\u0183\u0185\3\2\2\2\u0184\u0169\3\2\2\2\u0184"+
		"\u0174\3\2\2\2\u0184\u017c\3\2\2\2\u0184\u0181\3\2\2\2\u0185T\3\2\2\2"+
		"\u0186\u0187\5W,\2\u0187\u0188\5Y-\2\u0188V\3\2\2\2\u0189\u018a\t\t\2"+
		"\2\u018aX\3\2\2\2\u018b\u018d\5[.\2\u018c\u018b\3\2\2\2\u018c\u018d\3"+
		"\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\5\'\24\2\u018fZ\3\2\2\2\u0190\u0191"+
		"\t\n\2\2\u0191\\\3\2\2\2\u0192\u0193\t\13\2\2\u0193^\3\2\2\2\u0194\u0196"+
		"\5\63\32\2\u0195\u0197\7\60\2\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2"+
		"\2\u0197\u01a0\3\2\2\2\u0198\u0199\7\62\2\2\u0199\u019b\t\4\2\2\u019a"+
		"\u019c\5\65\33\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\3"+
		"\2\2\2\u019d\u019e\7\60\2\2\u019e\u01a0\5\65\33\2\u019f\u0194\3\2\2\2"+
		"\u019f\u0198\3\2\2\2\u01a0`\3\2\2\2\u01a1\u01a2\7v\2\2\u01a2\u01a3\7t"+
		"\2\2\u01a3\u01a4\7w\2\2\u01a4\u01ab\7g\2\2\u01a5\u01a6\7h\2\2\u01a6\u01a7"+
		"\7c\2\2\u01a7\u01a8\7n\2\2\u01a8\u01a9\7u\2\2\u01a9\u01ab\7g\2\2\u01aa"+
		"\u01a1\3\2\2\2\u01aa\u01a5\3\2\2\2\u01abb\3\2\2\2\u01ac\u01ad\7)\2\2\u01ad"+
		"\u01ae\5e\63\2\u01ae\u01af\7)\2\2\u01af\u01b5\3\2\2\2\u01b0\u01b1\7)\2"+
		"\2\u01b1\u01b2\5m\67\2\u01b2\u01b3\7)\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01ac"+
		"\3\2\2\2\u01b4\u01b0\3\2\2\2\u01b5d\3\2\2\2\u01b6\u01b7\n\f\2\2\u01b7"+
		"f\3\2\2\2\u01b8\u01ba\7$\2\2\u01b9\u01bb\5i\65\2\u01ba\u01b9\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\7$\2\2\u01bdh\3\2\2\2\u01be"+
		"\u01c0\5k\66\2\u01bf\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01bf\3\2"+
		"\2\2\u01c1\u01c2\3\2\2\2\u01c2j\3\2\2\2\u01c3\u01c6\n\r\2\2\u01c4\u01c6"+
		"\5m\67\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6l\3\2\2\2\u01c7"+
		"\u01c8\7^\2\2\u01c8\u01cb\t\16\2\2\u01c9\u01cb\5o8\2\u01ca\u01c7\3\2\2"+
		"\2\u01ca\u01c9\3\2\2\2\u01cbn\3\2\2\2\u01cc\u01cd\7^\2\2\u01cd\u01d8\5"+
		"A!\2\u01ce\u01cf\7^\2\2\u01cf\u01d0\5A!\2\u01d0\u01d1\5A!\2\u01d1\u01d8"+
		"\3\2\2\2\u01d2\u01d3\7^\2\2\u01d3\u01d4\5q9\2\u01d4\u01d5\5A!\2\u01d5"+
		"\u01d6\5A!\2\u01d6\u01d8\3\2\2\2\u01d7\u01cc\3\2\2\2\u01d7\u01ce\3\2\2"+
		"\2\u01d7\u01d2\3\2\2\2\u01d8p\3\2\2\2\u01d9\u01da\t\17\2\2\u01dar\3\2"+
		"\2\2\u01db\u01dc\7p\2\2\u01dc\u01dd\7w\2\2\u01dd\u01de\7n\2\2\u01de\u01df"+
		"\7n\2\2\u01dft\3\2\2\2\u01e0\u01e1\7*\2\2\u01e1v\3\2\2\2\u01e2\u01e3\7"+
		"+\2\2\u01e3x\3\2\2\2\u01e4\u01e5\7}\2\2\u01e5z\3\2\2\2\u01e6\u01e7\7\177"+
		"\2\2\u01e7|\3\2\2\2\u01e8\u01e9\7]\2\2\u01e9~\3\2\2\2\u01ea\u01eb\7_\2"+
		"\2\u01eb\u0080\3\2\2\2\u01ec\u01ed\7=\2\2\u01ed\u0082\3\2\2\2\u01ee\u01ef"+
		"\7.\2\2\u01ef\u0084\3\2\2\2\u01f0\u01f1\7\60\2\2\u01f1\u0086\3\2\2\2\u01f2"+
		"\u01f3\7?\2\2\u01f3\u0088\3\2\2\2\u01f4\u01f5\7@\2\2\u01f5\u008a\3\2\2"+
		"\2\u01f6\u01f7\7>\2\2\u01f7\u008c\3\2\2\2\u01f8\u01f9\7?\2\2\u01f9\u01fa"+
		"\7?\2\2\u01fa\u008e\3\2\2\2\u01fb\u01fc\7>\2\2\u01fc\u01fd\7?\2\2\u01fd"+
		"\u0090\3\2\2\2\u01fe\u01ff\7@\2\2\u01ff\u0200\7?\2\2\u0200\u0092\3\2\2"+
		"\2\u0201\u0202\7#\2\2\u0202\u0203\7?\2\2\u0203\u0094\3\2\2\2\u0204\u0205"+
		"\7-\2\2\u0205\u0096\3\2\2\2\u0206\u0207\7/\2\2\u0207\u0098\3\2\2\2\u0208"+
		"\u0209\7,\2\2\u0209\u009a\3\2\2\2\u020a\u020b\7\61\2\2\u020b\u009c\3\2"+
		"\2\2\u020c\u020d\7\'\2\2\u020d\u009e\3\2\2\2\u020e\u0212\5\u00a1Q\2\u020f"+
		"\u0211\5\u00a3R\2\u0210\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210"+
		"\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u00a0\3\2\2\2\u0214\u0212\3\2\2\2\u0215"+
		"\u021c\t\20\2\2\u0216\u0217\n\21\2\2\u0217\u021c\6Q\2\2\u0218\u0219\t"+
		"\22\2\2\u0219\u021a\t\23\2\2\u021a\u021c\6Q\3\2\u021b\u0215\3\2\2\2\u021b"+
		"\u0216\3\2\2\2\u021b\u0218\3\2\2\2\u021c\u00a2\3\2\2\2\u021d\u0224\t\24"+
		"\2\2\u021e\u021f\n\21\2\2\u021f\u0224\6R\4\2\u0220\u0221\t\22\2\2\u0221"+
		"\u0222\t\23\2\2\u0222\u0224\6R\5\2\u0223\u021d\3\2\2\2\u0223\u021e\3\2"+
		"\2\2\u0223\u0220\3\2\2\2\u0224\u00a4\3\2\2\2\u0225\u0227\t\25\2\2\u0226"+
		"\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2"+
		"\2\2\u0229\u022a\3\2\2\2\u022a\u022b\bS\2\2\u022b\u00a6\3\2\2\2\u022c"+
		"\u022d\7\61\2\2\u022d\u022e\7,\2\2\u022e\u0232\3\2\2\2\u022f\u0231\13"+
		"\2\2\2\u0230\u022f\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0233\3\2\2\2\u0232"+
		"\u0230\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0236\7,"+
		"\2\2\u0236\u0237\7\61\2\2\u0237\u0238\3\2\2\2\u0238\u0239\bT\2\2\u0239"+
		"\u00a8\3\2\2\2\u023a\u023b\7\61\2\2\u023b\u023c\7\61\2\2\u023c\u0240\3"+
		"\2\2\2\u023d\u023f\n\26\2\2\u023e\u023d\3\2\2\2\u023f\u0242\3\2\2\2\u0240"+
		"\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242\u0240\3\2"+
		"\2\2\u0243\u0244\bU\2\2\u0244\u00aa\3\2\2\2\66\2\u00e8\u00ec\u00f0\u00f4"+
		"\u00f8\u00ff\u0104\u0106\u010a\u010d\u0111\u0118\u011c\u0121\u0129\u012c"+
		"\u0133\u0137\u013b\u0141\u0144\u014b\u014f\u0157\u015a\u0161\u0165\u016c"+
		"\u016f\u0172\u0177\u017a\u017f\u0184\u018c\u0196\u019b\u019f\u01aa\u01b4"+
		"\u01ba\u01c1\u01c5\u01ca\u01d7\u0212\u021b\u0223\u0228\u0232\u0240\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}