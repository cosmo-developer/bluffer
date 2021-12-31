// Generated from src/com/bluff/compiler/grammar/Avagadro.g4 by ANTLR 4.9.3
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
public class AvagadroLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOLEAN", "CHAR", "ELSE", "FLOAT", "IF", "INT", "STRING", "NEW", "RETURN", 
			"VOID", "WHILE", "LENGTH", "IntegerLiteral", "DecimalIntegerLiteral", 
			"HexIntegerLiteral", "OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", 
			"DecimalNumeral", "Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", 
			"DigitOrUnderscore", "Underscores", "HexNumeral", "HexDigits", "HexDigit", 
			"HexDigitsAndUnderscores", "HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", 
			"OctalDigit", "OctalDigitsAndUnderscores", "OctalDigitOrUnderscore", 
			"BinaryNumeral", "BinaryDigits", "BinaryDigit", "BinaryDigitsAndUnderscores", 
			"BinaryDigitOrUnderscore", "FloatingPointLiteral", "DecimalFloatingPointLiteral", 
			"ExponentPart", "ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", 
			"HexSignificand", "BooleanLiteral", "CharacterLiteral", "SingleCharacter", 
			"StringLiteral", "StringCharacters", "StringCharacter", "EscapeSequence", 
			"OctalEscape", "ZeroToThree", "NullLiteral", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", 
			"LT", "EQUAL", "LE", "GE", "NOTEQUAL", "ADD", "SUB", "MUL", "DIV", "MOD", 
			"Identifier", "JavaLetter", "JavaLetterOrDigit", "WS", "COMMENT", "LINE_COMMENT"
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


	public AvagadroLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Avagadro.g4"; }

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
		case 80:
			return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 81:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u024e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\5\16\u00f2\n\16\3\17\3\17\5\17\u00f6\n\17\3\20\3\20\5\20"+
		"\u00fa\n\20\3\21\3\21\5\21\u00fe\n\21\3\22\3\22\5\22\u0102\n\22\3\23\3"+
		"\23\3\24\3\24\3\24\5\24\u0109\n\24\3\24\3\24\3\24\5\24\u010e\n\24\5\24"+
		"\u0110\n\24\3\25\3\25\5\25\u0114\n\25\3\25\5\25\u0117\n\25\3\26\3\26\5"+
		"\26\u011b\n\26\3\27\3\27\3\30\6\30\u0120\n\30\r\30\16\30\u0121\3\31\3"+
		"\31\5\31\u0126\n\31\3\32\6\32\u0129\n\32\r\32\16\32\u012a\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\5\34\u0133\n\34\3\34\5\34\u0136\n\34\3\35\3\35\3\36"+
		"\6\36\u013b\n\36\r\36\16\36\u013c\3\37\3\37\5\37\u0141\n\37\3 \3 \5 \u0145"+
		"\n \3 \3 \3!\3!\5!\u014b\n!\3!\5!\u014e\n!\3\"\3\"\3#\6#\u0153\n#\r#\16"+
		"#\u0154\3$\3$\5$\u0159\n$\3%\3%\3%\3%\3&\3&\5&\u0161\n&\3&\5&\u0164\n"+
		"&\3\'\3\'\3(\6(\u0169\n(\r(\16(\u016a\3)\3)\5)\u016f\n)\3*\3*\3+\3+\3"+
		"+\5+\u0176\n+\3+\5+\u0179\n+\3+\5+\u017c\n+\3+\3+\3+\5+\u0181\n+\3+\5"+
		"+\u0184\n+\3+\3+\3+\5+\u0189\n+\3+\3+\3+\5+\u018e\n+\3,\3,\3,\3-\3-\3"+
		".\5.\u0196\n.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\5\61\u01a0\n\61\3\61\3\61"+
		"\3\61\5\61\u01a5\n\61\3\61\3\61\5\61\u01a9\n\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\5\62\u01b4\n\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\5\63\u01be\n\63\3\64\3\64\3\65\3\65\5\65\u01c4\n\65\3\65\3"+
		"\65\3\66\6\66\u01c9\n\66\r\66\16\66\u01ca\3\67\3\67\5\67\u01cf\n\67\3"+
		"8\38\38\58\u01d4\n8\39\39\39\39\39\39\39\39\39\39\39\59\u01e1\n9\3:\3"+
		":\3;\3;\3;\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3"+
		"D\3E\3E\3F\3F\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3M\3M\3"+
		"N\3N\3O\3O\3P\3P\3Q\3Q\7Q\u021a\nQ\fQ\16Q\u021d\13Q\3R\3R\3R\3R\3R\3R"+
		"\5R\u0225\nR\3S\3S\3S\3S\3S\3S\5S\u022d\nS\3T\6T\u0230\nT\rT\16T\u0231"+
		"\3T\3T\3U\3U\3U\3U\7U\u023a\nU\fU\16U\u023d\13U\3U\3U\3U\3U\3U\3V\3V\3"+
		"V\3V\7V\u0248\nV\fV\16V\u024b\13V\3V\3V\3\u023b\2W\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\2\37\2!\2#\2%\2\'\2)\2"+
		"+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S"+
		"\20U\2W\2Y\2[\2]\2_\2a\2c\21e\22g\2i\23k\2m\2o\2q\2s\2u\24w\25y\26{\27"+
		"}\30\177\31\u0081\32\u0083\33\u0085\34\u0087\35\u0089\36\u008b\37\u008d"+
		" \u008f!\u0091\"\u0093#\u0095$\u0097%\u0099&\u009b\'\u009d(\u009f)\u00a1"+
		"*\u00a3\2\u00a5\2\u00a7+\u00a9,\u00ab-\3\2\27\4\2NNnn\3\2\63;\4\2ZZzz"+
		"\5\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2"+
		"))^^\4\2$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\6\2&&C\\aac|\4\2\2\u0101\ud802"+
		"\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f\16\17"+
		"\"\"\4\2\f\f\17\17\2\u025d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2S\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2i\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2"+
		"}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2"+
		"\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1"+
		"\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\3\u00ad\3\2\2"+
		"\2\5\u00b2\3\2\2\2\7\u00b7\3\2\2\2\t\u00bc\3\2\2\2\13\u00c2\3\2\2\2\r"+
		"\u00c5\3\2\2\2\17\u00c9\3\2\2\2\21\u00d0\3\2\2\2\23\u00d4\3\2\2\2\25\u00db"+
		"\3\2\2\2\27\u00e0\3\2\2\2\31\u00e6\3\2\2\2\33\u00f1\3\2\2\2\35\u00f3\3"+
		"\2\2\2\37\u00f7\3\2\2\2!\u00fb\3\2\2\2#\u00ff\3\2\2\2%\u0103\3\2\2\2\'"+
		"\u010f\3\2\2\2)\u0111\3\2\2\2+\u011a\3\2\2\2-\u011c\3\2\2\2/\u011f\3\2"+
		"\2\2\61\u0125\3\2\2\2\63\u0128\3\2\2\2\65\u012c\3\2\2\2\67\u0130\3\2\2"+
		"\29\u0137\3\2\2\2;\u013a\3\2\2\2=\u0140\3\2\2\2?\u0142\3\2\2\2A\u0148"+
		"\3\2\2\2C\u014f\3\2\2\2E\u0152\3\2\2\2G\u0158\3\2\2\2I\u015a\3\2\2\2K"+
		"\u015e\3\2\2\2M\u0165\3\2\2\2O\u0168\3\2\2\2Q\u016e\3\2\2\2S\u0170\3\2"+
		"\2\2U\u018d\3\2\2\2W\u018f\3\2\2\2Y\u0192\3\2\2\2[\u0195\3\2\2\2]\u0199"+
		"\3\2\2\2_\u019b\3\2\2\2a\u01a8\3\2\2\2c\u01b3\3\2\2\2e\u01bd\3\2\2\2g"+
		"\u01bf\3\2\2\2i\u01c1\3\2\2\2k\u01c8\3\2\2\2m\u01ce\3\2\2\2o\u01d3\3\2"+
		"\2\2q\u01e0\3\2\2\2s\u01e2\3\2\2\2u\u01e4\3\2\2\2w\u01e9\3\2\2\2y\u01eb"+
		"\3\2\2\2{\u01ed\3\2\2\2}\u01ef\3\2\2\2\177\u01f1\3\2\2\2\u0081\u01f3\3"+
		"\2\2\2\u0083\u01f5\3\2\2\2\u0085\u01f7\3\2\2\2\u0087\u01f9\3\2\2\2\u0089"+
		"\u01fb\3\2\2\2\u008b\u01fd\3\2\2\2\u008d\u01ff\3\2\2\2\u008f\u0201\3\2"+
		"\2\2\u0091\u0204\3\2\2\2\u0093\u0207\3\2\2\2\u0095\u020a\3\2\2\2\u0097"+
		"\u020d\3\2\2\2\u0099\u020f\3\2\2\2\u009b\u0211\3\2\2\2\u009d\u0213\3\2"+
		"\2\2\u009f\u0215\3\2\2\2\u00a1\u0217\3\2\2\2\u00a3\u0224\3\2\2\2\u00a5"+
		"\u022c\3\2\2\2\u00a7\u022f\3\2\2\2\u00a9\u0235\3\2\2\2\u00ab\u0243\3\2"+
		"\2\2\u00ad\u00ae\7d\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1"+
		"\7n\2\2\u00b1\4\3\2\2\2\u00b2\u00b3\7e\2\2\u00b3\u00b4\7j\2\2\u00b4\u00b5"+
		"\7c\2\2\u00b5\u00b6\7t\2\2\u00b6\6\3\2\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9"+
		"\7n\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7g\2\2\u00bb\b\3\2\2\2\u00bc\u00bd"+
		"\7h\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7c\2\2\u00c0"+
		"\u00c1\7v\2\2\u00c1\n\3\2\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7h\2\2\u00c4"+
		"\f\3\2\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7v\2\2\u00c8"+
		"\16\3\2\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7t\2\2\u00cc"+
		"\u00cd\7k\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7i\2\2\u00cf\20\3\2\2\2\u00d0"+
		"\u00d1\7p\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7y\2\2\u00d3\22\3\2\2\2\u00d4"+
		"\u00d5\7t\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7w\2\2"+
		"\u00d8\u00d9\7t\2\2\u00d9\u00da\7p\2\2\u00da\24\3\2\2\2\u00db\u00dc\7"+
		"x\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7f\2\2\u00df\26"+
		"\3\2\2\2\u00e0\u00e1\7y\2\2\u00e1\u00e2\7j\2\2\u00e2\u00e3\7k\2\2\u00e3"+
		"\u00e4\7n\2\2\u00e4\u00e5\7g\2\2\u00e5\30\3\2\2\2\u00e6\u00e7\7n\2\2\u00e7"+
		"\u00e8\7g\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7i\2\2\u00ea\u00eb\7v\2\2"+
		"\u00eb\u00ec\7j\2\2\u00ec\32\3\2\2\2\u00ed\u00f2\5\35\17\2\u00ee\u00f2"+
		"\5\37\20\2\u00ef\u00f2\5!\21\2\u00f0\u00f2\5#\22\2\u00f1\u00ed\3\2\2\2"+
		"\u00f1\u00ee\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\34"+
		"\3\2\2\2\u00f3\u00f5\5\'\24\2\u00f4\u00f6\5%\23\2\u00f5\u00f4\3\2\2\2"+
		"\u00f5\u00f6\3\2\2\2\u00f6\36\3\2\2\2\u00f7\u00f9\5\65\33\2\u00f8\u00fa"+
		"\5%\23\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa \3\2\2\2\u00fb"+
		"\u00fd\5? \2\u00fc\u00fe\5%\23\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2"+
		"\2\u00fe\"\3\2\2\2\u00ff\u0101\5I%\2\u0100\u0102\5%\23\2\u0101\u0100\3"+
		"\2\2\2\u0101\u0102\3\2\2\2\u0102$\3\2\2\2\u0103\u0104\t\2\2\2\u0104&\3"+
		"\2\2\2\u0105\u0110\7\62\2\2\u0106\u010d\5-\27\2\u0107\u0109\5)\25\2\u0108"+
		"\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010e\3\2\2\2\u010a\u010b\5\63"+
		"\32\2\u010b\u010c\5)\25\2\u010c\u010e\3\2\2\2\u010d\u0108\3\2\2\2\u010d"+
		"\u010a\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u0105\3\2\2\2\u010f\u0106\3\2"+
		"\2\2\u0110(\3\2\2\2\u0111\u0116\5+\26\2\u0112\u0114\5/\30\2\u0113\u0112"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\5+\26\2\u0116"+
		"\u0113\3\2\2\2\u0116\u0117\3\2\2\2\u0117*\3\2\2\2\u0118\u011b\7\62\2\2"+
		"\u0119\u011b\5-\27\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b,\3"+
		"\2\2\2\u011c\u011d\t\3\2\2\u011d.\3\2\2\2\u011e\u0120\5\61\31\2\u011f"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\60\3\2\2\2\u0123\u0126\5+\26\2\u0124\u0126\7a\2\2\u0125\u0123"+
		"\3\2\2\2\u0125\u0124\3\2\2\2\u0126\62\3\2\2\2\u0127\u0129\7a\2\2\u0128"+
		"\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\64\3\2\2\2\u012c\u012d\7\62\2\2\u012d\u012e\t\4\2\2\u012e\u012f"+
		"\5\67\34\2\u012f\66\3\2\2\2\u0130\u0135\59\35\2\u0131\u0133\5;\36\2\u0132"+
		"\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\59"+
		"\35\2\u0135\u0132\3\2\2\2\u0135\u0136\3\2\2\2\u01368\3\2\2\2\u0137\u0138"+
		"\t\5\2\2\u0138:\3\2\2\2\u0139\u013b\5=\37\2\u013a\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d<\3\2\2\2"+
		"\u013e\u0141\59\35\2\u013f\u0141\7a\2\2\u0140\u013e\3\2\2\2\u0140\u013f"+
		"\3\2\2\2\u0141>\3\2\2\2\u0142\u0144\7\62\2\2\u0143\u0145\5\63\32\2\u0144"+
		"\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\5A"+
		"!\2\u0147@\3\2\2\2\u0148\u014d\5C\"\2\u0149\u014b\5E#\2\u014a\u0149\3"+
		"\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\5C\"\2\u014d"+
		"\u014a\3\2\2\2\u014d\u014e\3\2\2\2\u014eB\3\2\2\2\u014f\u0150\t\6\2\2"+
		"\u0150D\3\2\2\2\u0151\u0153\5G$\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155F\3\2\2\2\u0156\u0159"+
		"\5C\"\2\u0157\u0159\7a\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159"+
		"H\3\2\2\2\u015a\u015b\7\62\2\2\u015b\u015c\t\7\2\2\u015c\u015d\5K&\2\u015d"+
		"J\3\2\2\2\u015e\u0163\5M\'\2\u015f\u0161\5O(\2\u0160\u015f\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\5M\'\2\u0163\u0160\3\2"+
		"\2\2\u0163\u0164\3\2\2\2\u0164L\3\2\2\2\u0165\u0166\t\b\2\2\u0166N\3\2"+
		"\2\2\u0167\u0169\5Q)\2\u0168\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016bP\3\2\2\2\u016c\u016f\5M\'\2\u016d\u016f"+
		"\7a\2\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016fR\3\2\2\2\u0170\u0171"+
		"\5U+\2\u0171T\3\2\2\2\u0172\u0173\5)\25\2\u0173\u0175\7\60\2\2\u0174\u0176"+
		"\5)\25\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177"+
		"\u0179\5W,\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2"+
		"\2\u017a\u017c\5_\60\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u018e"+
		"\3\2\2\2\u017d\u017e\7\60\2\2\u017e\u0180\5)\25\2\u017f\u0181\5W,\2\u0180"+
		"\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0184\5_"+
		"\60\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u018e\3\2\2\2\u0185"+
		"\u0186\5)\25\2\u0186\u0188\5W,\2\u0187\u0189\5_\60\2\u0188\u0187\3\2\2"+
		"\2\u0188\u0189\3\2\2\2\u0189\u018e\3\2\2\2\u018a\u018b\5)\25\2\u018b\u018c"+
		"\5_\60\2\u018c\u018e\3\2\2\2\u018d\u0172\3\2\2\2\u018d\u017d\3\2\2\2\u018d"+
		"\u0185\3\2\2\2\u018d\u018a\3\2\2\2\u018eV\3\2\2\2\u018f\u0190\5Y-\2\u0190"+
		"\u0191\5[.\2\u0191X\3\2\2\2\u0192\u0193\t\t\2\2\u0193Z\3\2\2\2\u0194\u0196"+
		"\5]/\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0198\5)\25\2\u0198\\\3\2\2\2\u0199\u019a\t\n\2\2\u019a^\3\2\2\2\u019b"+
		"\u019c\t\13\2\2\u019c`\3\2\2\2\u019d\u019f\5\65\33\2\u019e\u01a0\7\60"+
		"\2\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a9\3\2\2\2\u01a1"+
		"\u01a2\7\62\2\2\u01a2\u01a4\t\4\2\2\u01a3\u01a5\5\67\34\2\u01a4\u01a3"+
		"\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\7\60\2\2"+
		"\u01a7\u01a9\5\67\34\2\u01a8\u019d\3\2\2\2\u01a8\u01a1\3\2\2\2\u01a9b"+
		"\3\2\2\2\u01aa\u01ab\7v\2\2\u01ab\u01ac\7t\2\2\u01ac\u01ad\7w\2\2\u01ad"+
		"\u01b4\7g\2\2\u01ae\u01af\7h\2\2\u01af\u01b0\7c\2\2\u01b0\u01b1\7n\2\2"+
		"\u01b1\u01b2\7u\2\2\u01b2\u01b4\7g\2\2\u01b3\u01aa\3\2\2\2\u01b3\u01ae"+
		"\3\2\2\2\u01b4d\3\2\2\2\u01b5\u01b6\7)\2\2\u01b6\u01b7\5g\64\2\u01b7\u01b8"+
		"\7)\2\2\u01b8\u01be\3\2\2\2\u01b9\u01ba\7)\2\2\u01ba\u01bb\5o8\2\u01bb"+
		"\u01bc\7)\2\2\u01bc\u01be\3\2\2\2\u01bd\u01b5\3\2\2\2\u01bd\u01b9\3\2"+
		"\2\2\u01bef\3\2\2\2\u01bf\u01c0\n\f\2\2\u01c0h\3\2\2\2\u01c1\u01c3\7$"+
		"\2\2\u01c2\u01c4\5k\66\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c6\7$\2\2\u01c6j\3\2\2\2\u01c7\u01c9\5m\67\2\u01c8"+
		"\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2"+
		"\2\2\u01cbl\3\2\2\2\u01cc\u01cf\n\r\2\2\u01cd\u01cf\5o8\2\u01ce\u01cc"+
		"\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cfn\3\2\2\2\u01d0\u01d1\7^\2\2\u01d1\u01d4"+
		"\t\16\2\2\u01d2\u01d4\5q9\2\u01d3\u01d0\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4"+
		"p\3\2\2\2\u01d5\u01d6\7^\2\2\u01d6\u01e1\5C\"\2\u01d7\u01d8\7^\2\2\u01d8"+
		"\u01d9\5C\"\2\u01d9\u01da\5C\"\2\u01da\u01e1\3\2\2\2\u01db\u01dc\7^\2"+
		"\2\u01dc\u01dd\5s:\2\u01dd\u01de\5C\"\2\u01de\u01df\5C\"\2\u01df\u01e1"+
		"\3\2\2\2\u01e0\u01d5\3\2\2\2\u01e0\u01d7\3\2\2\2\u01e0\u01db\3\2\2\2\u01e1"+
		"r\3\2\2\2\u01e2\u01e3\t\17\2\2\u01e3t\3\2\2\2\u01e4\u01e5\7p\2\2\u01e5"+
		"\u01e6\7w\2\2\u01e6\u01e7\7n\2\2\u01e7\u01e8\7n\2\2\u01e8v\3\2\2\2\u01e9"+
		"\u01ea\7*\2\2\u01eax\3\2\2\2\u01eb\u01ec\7+\2\2\u01ecz\3\2\2\2\u01ed\u01ee"+
		"\7}\2\2\u01ee|\3\2\2\2\u01ef\u01f0\7\177\2\2\u01f0~\3\2\2\2\u01f1\u01f2"+
		"\7]\2\2\u01f2\u0080\3\2\2\2\u01f3\u01f4\7_\2\2\u01f4\u0082\3\2\2\2\u01f5"+
		"\u01f6\7=\2\2\u01f6\u0084\3\2\2\2\u01f7\u01f8\7.\2\2\u01f8\u0086\3\2\2"+
		"\2\u01f9\u01fa\7\60\2\2\u01fa\u0088\3\2\2\2\u01fb\u01fc\7?\2\2\u01fc\u008a"+
		"\3\2\2\2\u01fd\u01fe\7@\2\2\u01fe\u008c\3\2\2\2\u01ff\u0200\7>\2\2\u0200"+
		"\u008e\3\2\2\2\u0201\u0202\7?\2\2\u0202\u0203\7?\2\2\u0203\u0090\3\2\2"+
		"\2\u0204\u0205\7>\2\2\u0205\u0206\7?\2\2\u0206\u0092\3\2\2\2\u0207\u0208"+
		"\7@\2\2\u0208\u0209\7?\2\2\u0209\u0094\3\2\2\2\u020a\u020b\7#\2\2\u020b"+
		"\u020c\7?\2\2\u020c\u0096\3\2\2\2\u020d\u020e\7-\2\2\u020e\u0098\3\2\2"+
		"\2\u020f\u0210\7/\2\2\u0210\u009a\3\2\2\2\u0211\u0212\7,\2\2\u0212\u009c"+
		"\3\2\2\2\u0213\u0214\7\61\2\2\u0214\u009e\3\2\2\2\u0215\u0216\7\'\2\2"+
		"\u0216\u00a0\3\2\2\2\u0217\u021b\5\u00a3R\2\u0218\u021a\5\u00a5S\2\u0219"+
		"\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2"+
		"\2\2\u021c\u00a2\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u0225\t\20\2\2\u021f"+
		"\u0220\n\21\2\2\u0220\u0225\6R\2\2\u0221\u0222\t\22\2\2\u0222\u0223\t"+
		"\23\2\2\u0223\u0225\6R\3\2\u0224\u021e\3\2\2\2\u0224\u021f\3\2\2\2\u0224"+
		"\u0221\3\2\2\2\u0225\u00a4\3\2\2\2\u0226\u022d\t\24\2\2\u0227\u0228\n"+
		"\21\2\2\u0228\u022d\6S\4\2\u0229\u022a\t\22\2\2\u022a\u022b\t\23\2\2\u022b"+
		"\u022d\6S\5\2\u022c\u0226\3\2\2\2\u022c\u0227\3\2\2\2\u022c\u0229\3\2"+
		"\2\2\u022d\u00a6\3\2\2\2\u022e\u0230\t\25\2\2\u022f\u022e\3\2\2\2\u0230"+
		"\u0231\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2"+
		"\2\2\u0233\u0234\bT\2\2\u0234\u00a8\3\2\2\2\u0235\u0236\7\61\2\2\u0236"+
		"\u0237\7,\2\2\u0237\u023b\3\2\2\2\u0238\u023a\13\2\2\2\u0239\u0238\3\2"+
		"\2\2\u023a\u023d\3\2\2\2\u023b\u023c\3\2\2\2\u023b\u0239\3\2\2\2\u023c"+
		"\u023e\3\2\2\2\u023d\u023b\3\2\2\2\u023e\u023f\7,\2\2\u023f\u0240\7\61"+
		"\2\2\u0240\u0241\3\2\2\2\u0241\u0242\bU\2\2\u0242\u00aa\3\2\2\2\u0243"+
		"\u0244\7\61\2\2\u0244\u0245\7\61\2\2\u0245\u0249\3\2\2\2\u0246\u0248\n"+
		"\26\2\2\u0247\u0246\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249"+
		"\u024a\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u024d\bV"+
		"\2\2\u024d\u00ac\3\2\2\2\66\2\u00f1\u00f5\u00f9\u00fd\u0101\u0108\u010d"+
		"\u010f\u0113\u0116\u011a\u0121\u0125\u012a\u0132\u0135\u013c\u0140\u0144"+
		"\u014a\u014d\u0154\u0158\u0160\u0163\u016a\u016e\u0175\u0178\u017b\u0180"+
		"\u0183\u0188\u018d\u0195\u019f\u01a4\u01a8\u01b3\u01bd\u01c3\u01ca\u01ce"+
		"\u01d3\u01e0\u021b\u0224\u022c\u0231\u023b\u0249\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}