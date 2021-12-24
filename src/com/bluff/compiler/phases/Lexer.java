package com.bluff.compiler.phases;

import com.bluff.compiler.ErrorHandler;
import com.bluff.util.Pair;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class Lexer {

    public static final ArrayList<Pair<String, TT>> SUPPORTED_KEYWORDS;//List of supported keywords in bluff language
    private final File sourceFile;
    private final ArrayList<String> sourceLines;
    private final AtomicReference<Boolean> booleanReference;

    static {
        SUPPORTED_KEYWORDS = new ArrayList<>();
        SUPPORTED_KEYWORDS.add(new Pair("bool", TT.BOOLEAN_KWD));
        SUPPORTED_KEYWORDS.add(new Pair("break", TT.BREAK_KWD));
        SUPPORTED_KEYWORDS.add(new Pair("byte", TT.BYTE_KWD));
        SUPPORTED_KEYWORDS.add(new Pair("case", TT.CASE_KWD));
        SUPPORTED_KEYWORDS.add(new Pair("char", TT.CHAR_KWD));
        SUPPORTED_KEYWORDS.add(new Pair("continue", TT.CONTINUE_KWD));
        SUPPORTED_KEYWORDS.add(new Pair("default", TT.DEFAULT_KWD));
        SUPPORTED_KEYWORDS.add(new Pair("do", TT.DO_KWD));
        SUPPORTED_KEYWORDS.add(new Pair("double", TT.DOUBLE_KWD));
        SUPPORTED_KEYWORDS.add(new Pair("else", TT.ELSE_KWD));
        SUPPORTED_KEYWORDS.add(new Pair("final", TT.FINAL_KWD));
        SUPPORTED_KEYWORDS.add(new Pair("float", TT.FLOAT_KWD));
        SUPPORTED_KEYWORDS.add(new Pair("for", TT.FOR_KWD));
        SUPPORTED_KEYWORDS.add(new Pair("if", TT.IF_KWD));
        SUPPORTED_KEYWORDS.add(new Pair("int", TT.INT_KWD));
        SUPPORTED_KEYWORDS.add(new Pair("long", TT.LONG_KWD));
        SUPPORTED_KEYWORDS.add(new Pair("return", TT.RETURN_KWD));
        SUPPORTED_KEYWORDS.add(new Pair("short", TT.SHORT_KWD));
        SUPPORTED_KEYWORDS.add(new Pair("switch", TT.SWITCH_KWD));
        SUPPORTED_KEYWORDS.add(new Pair("void", TT.VOID_KWD));
        SUPPORTED_KEYWORDS.add(new Pair("while", TT.WHILE_KWD));
        SUPPORTED_KEYWORDS.add(new Pair("native", TT.NATIVE_KWD));
        SUPPORTED_KEYWORDS.add(new Pair("println", TT.PRINTLN_KWD));
    }

    protected boolean isKeyWord(String word) {
        SUPPORTED_KEYWORDS.forEach((pair) -> {
            if (pair.getKey().equals(word)) {
                booleanReference.set(true);
            }
        });
        boolean result = booleanReference.get();
        booleanReference.set(false);
        return result;
    }

    protected TT getTypeOf(String kwd) {
        for (Pair<String, TT> p : SUPPORTED_KEYWORDS) {
            if (p.getKey().equals(kwd)) {
                return p.getValue();
            }
        }
        return null;
    }

    class Track {

        public int line;
        public int col;
        public int pos;
        public final int MAX_CAP;

        public Track(int line, int col, int pos, int MAX_CAP) {
            this.line = line;
            this.col = col;
            this.MAX_CAP = MAX_CAP;
        }

        public int lookAhead() {
            if (makeSure(pos, MAX_CAP)) {
                return pos++;
            }
            tokens.add(new Token("EOF", TT.EOF, sourceFile.getName(), line, col));
            return -1;
        }

        public int lookBack() {
            if (pos >= 0) {
                return pos--;
            }
            return -1;
        }

        @Override
        public String toString() {
            return "Track{" + "line=" + line + ", col=" + col + ", pos=" + pos + ", MAX_CAP=" + MAX_CAP + '}';
        }

    }

    //Token Types
    public static enum TT {
        //KeyWord groups
        BOOLEAN_KWD,
        BREAK_KWD,
        BYTE_KWD,
        CASE_KWD,
        CATCH_KWD,
        CHAR_KWD,
        CONTINUE_KWD,
        DEFAULT_KWD,
        DO_KWD,
        DOUBLE_KWD,
        ELSE_KWD,
        FINAL_KWD,
        FOR_KWD,
        IF_KWD,
        INT_KWD,
        LONG_KWD,
        SHORT_KWD,
        FLOAT_KWD,
        NATIVE_KWD,
        NULL_KWD,
        RETURN_KWD,
        SWITCH_KWD,
        VOID_KWD,
        WHILE_KWD,
        PRINTLN_KWD,
        IDENTIFIER,
        STRING_KWD,
        //Arithematic Operators
        PLUS,
        MINUS,
        MULTIPLY,
        DIVIDE,
        MOD,
        //Unary Operators
        TILD,
        NOT,
        INC,
        DEC,
        //Assignment Operators
        EQUAL,
        PLUS_EQUAL,
        MINUS_EQUAL,
        MULTIPLY_EQUAL,
        DIVIDE_EQUAL,
        MOD_EQUAL,
        //Relational Operators
        EQUAL_TO,
        NOT_EQUAL_TO,
        GREATER_THAN,
        LESS_THAN,
        LESS_THAN_OR_EQUAL_TO,
        GREATER_THAN_OR_EQUAL_TO,
        //Logical Operators
        LOGICAL_AND,
        LOGICAL_OR,
        LOGICAL_NOT,
        //Terranary Operator
        TERRANARY,
        //Bitwise Operators
        BITWISE_OR,
        BITWISE_AND,
        BITWISE_XOR,
        BITWISE_COMPLEMENT,
        //Shift Operators
        SIGNED_RIGHT_SHIFT_OPERATOR,
        UNSIGNED_RIGHT_SHIFT_OPERATOR,
        SIGNED_LEFT_SHIFT_OPERATOR,
        UNSIGNED_LEFT_SHIFT_OPERATOR,
        //Stoppers
        SEMICOLON,
        SINGLE_QUOTE,
        DOUBLE_QUOTE,
        BACK_SLASH,
        LOWER_DASH,
        LEFT_SQUARE_BRACKET,
        RIGHT_SQUARE_BRACKET,
        OPEN_CURLI_BRACKET,
        CLOSE_CURLI_BRACKET,
        OPEN_PARENTHESIS,
        CLOSE_PARENTHESIS,
        COMMA,
        DOT,
        WHAT,
        COLON,
        //Literals
        STRING_LITERAL,
        CHAR_LITERAL,
        DOUBLE_LITERAL,
        EOF, INTEGER_LITERAL, PRINT_KWD, NEW_KWD, NEWLINE,SPACEBAR
    }

    public static class Token {

        public final String name;
        public final TT type;
        public final String fileName;
        public final int lineno;
        public final int colno;

        public Token(String name, TT type, String fileName, int lineno, int colno) {
            this.name = name;
            this.type = type;
            this.fileName = fileName;
            this.lineno = lineno;
            this.colno = colno;
        }

        @Override
        public String toString() {
            return "Token{" + "name=" + name + ", type=" + type + ", fileName=" + fileName + ", lineno=" + lineno + ", colno=" + colno + '}';
        }

    }
    private final ArrayList<Token> tokens;

    public Lexer(String filename) throws FileNotFoundException {
        tokens = new ArrayList<>();
        sourceFile = new File(filename);
        if (!sourceFile.exists()) {
            throw new FileNotFoundException(sourceFile.toPath().toString() + " Not Found!");
        }
        booleanReference = new AtomicReference(false);
        sourceLines = new ArrayList<>();
    }

    private boolean makeSure(int p, int max) {
        return p < max;
    }

    protected void performLexicalAnalysis(byte[] src) {

        int srcLength = src.length;
        Track track = new Track(1, 1, 0, srcLength);
        while (track.pos < srcLength) {
            switch (src[track.pos]) {
                case '\n':
                    track.col = 1;
                    track.line++;
                    break;
                case ' ':
                    track.col++;
                    break;
                case '{':
                    tokens.add(new Token("{", TT.OPEN_CURLI_BRACKET, sourceFile.getName(), track.line, track.col));
                    track.col++;
                    break;
                case '}':
                    tokens.add(new Token("}", TT.CLOSE_CURLI_BRACKET, sourceFile.getName(), track.line, track.col));
                    track.col++;
                    break;
                case '[':
                    tokens.add(new Token("[", TT.LEFT_SQUARE_BRACKET, sourceFile.getName(), track.line, track.col));
                    track.col++;
                    break;
                case ']':
                    tokens.add(new Token("]", TT.RIGHT_SQUARE_BRACKET, sourceFile.getName(), track.line, track.col));
                    track.col++;
                    break;
                case '?':
                    tokens.add(new Token("?", TT.WHAT, sourceFile.getName(), track.line, track.col));
                    track.col++;
                    break;
                case ':':
                    tokens.add(new Token(":", TT.COLON, sourceFile.getName(), track.line, track.col));
                    track.col++;
                    break;
                case ',':
                    tokens.add(new Token(",", TT.COMMA, sourceFile.getName(), track.line, track.col));
                    track.col++;
                    break;
                case '(':
                    tokens.add(new Token("(", TT.OPEN_PARENTHESIS, sourceFile.getName(), track.line, track.col));
                    track.col++;
                    break;
                case ')':
                    tokens.add(new Token(")", TT.CLOSE_PARENTHESIS, sourceFile.getName(), track.line, track.col));
                    track.col++;
                    break;
                case '.':
                    tokens.add(new Token(".", TT.DOT, sourceFile.getName(), track.line, track.col));
                    track.col++;
                    break;
                case ';':
                    tokens.add(new Token(";", TT.SEMICOLON, sourceFile.getName(), track.line, track.col));
                    track.col++;
                    break;

                case '^':
                    tokens.add(new Token("^", TT.BITWISE_XOR, sourceFile.getName(), track.line, track.col));
                    track.col++;
                    break;
                case '~':
                    tokens.add(new Token("~", TT.BITWISE_COMPLEMENT, sourceFile.getName(), track.line, track.col));
                    track.col++;
                    break;

                case '+': {
                    tokens.add(new Token("+", TT.PLUS, sourceFile.getName(), track.line, track.col));
                    track.col++;
                    break;
                }
                case '-': {
                    tokens.add(new Token("-", TT.MINUS, sourceFile.getName(), track.line, track.col));
                    track.col++;
                    break;
                }

                case '/': {
                    if (src[track.pos + 1] != '=' && src[track.pos + 1] != '/' && src[track.pos + 1] != '*') {
                        tokens.add(new Token("/", TT.DIVIDE, sourceFile.getName(), track.line, track.col));
                        track.col++;
                    } else if (src[track.pos + 1] == '/') {
                        //Some Comment
                        track.pos += 1;
                        try {
                            while (src[track.pos] != '\n') {
                                track.pos++;
                            }
                        } catch (ArrayIndexOutOfBoundsException e) {

                        }
                        track.col = 1;
                        track.line += 1;
                    } else if (src[track.pos + 1] == '*') {
                        /*Some Comment*/
                        track.pos += 1;
                        track.col += 1;
                        boolean endOfCommentFound = false;
                        int poscopy = track.pos;
                        int linecopy = track.line;
                        int colcopy = track.col;
                        for (int i = poscopy; i < srcLength; i++) {
                            track.col += 1;
                            track.pos += 1;
                            if (src[i] == '\n') {
                                track.col = 1;
                                track.line += 1;
                            }
                            if (src[i] == '/' && src[i - 1] == '*') {
                                endOfCommentFound = true;
                                break;
                            }
                        }
                        if (!endOfCommentFound) {
                            ErrorHandler.UnclosedComment(src, Lexer.getBackTraceOneLine(src, poscopy), poscopy, linecopy, colcopy);
                        }
                    } else if (src[track.pos + 1] == '=') {
                        tokens.add(new Token("/=", TT.DIVIDE_EQUAL, sourceFile.getName(), track.line, track.col));
                        track.col += 2;
                        track.pos += 1;
                    }
                    break;
                }
                case '%': {
                    tokens.add(new Token("%", TT.MOD, sourceFile.getName(), track.line, track.col));
                    track.col++;
                    break;
                }

                case '*': {
                    tokens.add(new Token("*", TT.MULTIPLY, sourceFile.getName(), track.line, track.col));
                    track.col++;
                    break;
                }

                case '|': {
                    if (src[track.pos + 1] != '|') {
                        tokens.add(new Token("|", TT.BITWISE_OR, sourceFile.getName(), track.line, track.col));
                        track.col++;
                    } else if (src[track.pos + 1] == '|') {
                        tokens.add(new Token("||", TT.LOGICAL_OR, sourceFile.getName(), track.line, track.col));
                        track.col += 2;
                        track.pos += 1;
                    }
                }
                case '&': {
                    if (makeSure(track.pos + 1, srcLength)) {
                        if (src[track.pos + 1] != '&') {
                            tokens.add(new Token("&", TT.BITWISE_AND, sourceFile.getName(), track.line, track.col));
                            track.col++;
                        } else if (src[track.pos + 1] == '&') {
                            tokens.add(new Token("&&", TT.LOGICAL_AND, sourceFile.getName(), track.line, track.col));
                            track.col += 2;
                            track.pos += 1;
                        }
                    } else {
                        tokens.add(new Token("&", TT.BITWISE_AND, sourceFile.getName(), track.line, track.col));
                        track.col++;
                        tokens.add(new Token("EOF", TT.EOF, sourceFile.getName(), track.line, track.col));
                        track.col++;
                    }

                }
                case '!': {
                    if (makeSure(track.pos + 1, srcLength)) {
                        if (src[track.pos + 1] != '=') {
                            tokens.add(new Token("!", TT.LOGICAL_NOT, sourceFile.getName(), track.line, track.col));
                            track.col++;
                        } else if (src[track.pos + 1] == '=') {
                            tokens.add(new Token("!=", TT.NOT_EQUAL_TO, sourceFile.getName(), track.line, track.col));
                            track.col += 2;
                            track.pos += 1;
                        }
                    } else {
                        tokens.add(new Token("!", TT.LOGICAL_NOT, sourceFile.getName(), track.line, track.col));
                        track.col++;
                        tokens.add(new Token("EOF", TT.EOF, sourceFile.getName(), track.line, track.col));
                        track.col++;
                    }
                }
                case '\'': {
                    try {
                        //Require support for \uCCCC \r \n \b \t \f
                        if (src[track.pos + 1] == '\\') {
                            if (src[track.pos + 2] == 'n' || src[track.pos + 2] == 't' || src[track.pos + 2] == 'b' || src[track.pos + 2] == 'f' || src[track.pos + 2] == '\\') {
                                String escapeLiteral = Lexer.getEscape((char) src[track.pos + 2]);
                                if (src[track.pos + 3] != '\'') {
                                    ErrorHandler.UnclosedCharLiteral(src, Lexer.getBackTraceOneLine(src, track.pos), track.pos, track.line, track.col);
                                } else {
                                    tokens.add(new Token(escapeLiteral, TT.CHAR_LITERAL, sourceFile.getName(), track.line, track.col));
                                }
                                track.pos += 3;
                                track.col += 4;
                            } else {
                                ErrorHandler.InvalidEscapeCharacter(src, Lexer.getBackTraceOneLine(src, track.pos), track.pos, track.line, track.col);
                            }
                        } else if (src[track.pos + 1] < 256 && src[track.pos + 1] > 0) {
                            if (src[track.pos + 2] != '\'') {
                                ErrorHandler.UnclosedCharLiteral(src, Lexer.getBackTraceOneLine(src, track.pos), track.pos, track.line, track.col);
                            } else {
                                String charLiteral = "" + (char) src[track.pos + 1];
                                tokens.add(new Token(charLiteral, TT.CHAR_LITERAL, sourceFile.getName(), track.line, track.col));
                            }
                            track.col += 3;
                            track.pos += 2;
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        ErrorHandler.UnclosedCharLiteral(src, Lexer.getBackTraceOneLine(src, track.pos - 1), track.pos - 1, track.line, track.col);
                        ErrorHandler.EndOfFile(src, "EOF at Line", track.line);
                    }
                    break;
                }
                case '"': {
                    
                    break;
                }
                case '>': {
                    break;
                }
                case '<': {

                    break;
                }

            }
            track.pos++;
        }
    }

    private static String getEscape(char escapechar) {
        switch (escapechar) {
            case 'n':
                return "\n";
            case 'b':
                return "\b";
            case 'f':
                return "\f";
            case 't':
                return "\t";
            case 'r':
                return "\r";
            default:
                return "" + escapechar;
        }
    }

    public static String getBackTraceOneLine(byte[] src, int curpos) {
        String line = "";
        int startpos = 0;
        for (int i = curpos; i >= 0; i--) {
            if (src[i] == '\n') {
                break;
            }
            startpos = i;
        }
        for (int j = startpos; j < src.length; j++) {
            if (src[j] == '\n') {
                break;
            }
            line += new String(new byte[]{src[j]});
        }
        return line;
    }

    public Pair<Byte[], ArrayList<Token>> genTokens() {

        try {
            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile)) //Creating a buffer reader
                    ) {
                int fileSizeInBytes = (int) sourceFile.length();//Get The Size of File in bytes
                byte[] src = new byte[fileSizeInBytes];//Creating empty byte array to store file data
                bis.read(src);//reading total content of file
                performLexicalAnalysis(src); //Given to this function to generate tokens from source
                bis.close();//Closing Buffer reader
                return new Pair(src, tokens);
            } //Get The Size of File in bytes
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lexer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lexer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
