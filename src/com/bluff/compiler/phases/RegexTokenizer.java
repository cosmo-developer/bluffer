/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.compiler.phases;

import com.bluff.compiler.ErrorHandler;
import com.bluff.compiler.phases.Helper.TT;
import com.bluff.compiler.phases.Helper.Token;
import com.bluff.util.Pair;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class RegexTokenizer {

    public static final HashMap<String, TT> SUPPORTED_KEYWORDS;//List of supported keywords in bluff language
    private final File sourceFile;
    private ArrayList<Token> tokens;
    private final ArrayList<String> sourceLines;

    static {
        SUPPORTED_KEYWORDS = new HashMap<>();
        SUPPORTED_KEYWORDS.put("bool", TT.BOOLEAN_KWD);
        SUPPORTED_KEYWORDS.put("break", TT.BREAK_KWD);
        SUPPORTED_KEYWORDS.put("byte", TT.BYTE_KWD);
        SUPPORTED_KEYWORDS.put("case", TT.CASE_KWD);
        SUPPORTED_KEYWORDS.put("char", TT.CHAR_KWD);
        SUPPORTED_KEYWORDS.put("continue", TT.CONTINUE_KWD);
        SUPPORTED_KEYWORDS.put("default", TT.DEFAULT_KWD);
        SUPPORTED_KEYWORDS.put("do", TT.DO_KWD);
        SUPPORTED_KEYWORDS.put("double", TT.DOUBLE_KWD);
        SUPPORTED_KEYWORDS.put("else", TT.ELSE_KWD);
        SUPPORTED_KEYWORDS.put("final", TT.FINAL_KWD);
        SUPPORTED_KEYWORDS.put("float", TT.FLOAT_KWD);
        SUPPORTED_KEYWORDS.put("for", TT.FOR_KWD);
        SUPPORTED_KEYWORDS.put("if", TT.IF_KWD);
        SUPPORTED_KEYWORDS.put("int", TT.INT_KWD);
        SUPPORTED_KEYWORDS.put("long", TT.LONG_KWD);
        SUPPORTED_KEYWORDS.put("return", TT.RETURN_KWD);
        SUPPORTED_KEYWORDS.put("short", TT.SHORT_KWD);
        SUPPORTED_KEYWORDS.put("switch", TT.SWITCH_KWD);
        SUPPORTED_KEYWORDS.put("void", TT.VOID_KWD);
        SUPPORTED_KEYWORDS.put("while", TT.WHILE_KWD);
        SUPPORTED_KEYWORDS.put("native", TT.NATIVE_KWD);
        SUPPORTED_KEYWORDS.put("println", TT.PRINTLN_KWD);
        SUPPORTED_KEYWORDS.put("string", TT.STRING_KWD);
        SUPPORTED_KEYWORDS.put("print", TT.PRINT_KWD);
        SUPPORTED_KEYWORDS.put("new", TT.NEW_KWD);

    }

    public RegexTokenizer() {
        sourceFile = new File("test.java");
        sourceLines = new ArrayList<>();
    }

    public Pair<String, ArrayList<Helper.Token>> genTokens() {
        tokens = new ArrayList<>();
        try {
            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile)) //Creating a buffer reader
                    ) {
                int fileSizeInBytes = (int) sourceFile.length();//Get The Size of File in bytes
                byte[] src = new byte[fileSizeInBytes];//Creating empty byte array to store file data
                bis.read(src);//reading total content of file
                performLexicalAnalysis(src); //Given to this function to generate tokens from source
                bis.close();//Closing Buffer reader
                return new Pair(new String(src), tokens);
            } //Get The Size of File in bytes
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private static String buildKwdGroup() {
        String buildString = "";
        buildString = RegexTokenizer.SUPPORTED_KEYWORDS.keySet().stream().map((kwd) -> kwd + "$").reduce(buildString, String::concat);
        buildString += "!";
        buildString = buildString.replace("$", "|");
        buildString = buildString.replace("|!", "");
        buildString = "(?<keywords>"+"[^_a-zA-Z0-9]"+"("+ buildString +")"+"[^a-zA-Z0-9]"+")";
        return buildString;
    }

    private static final String TOKEN_PATTERN_SOURCE
            = ""//Multi line comment not supported
            + "(?<slcomment>#.*)"
            + "|>>>|>>|>=|<<<|<<|<="
            + "|\\+=|\\+\\+|\\+|-=|--|-|/=|/|\\*=|%=|"
            + "==|!=|&&|&|\\|\\||"
            + ":|;|\\(|\\)|\\[|\\]|\\{|\\}|\\^|"
            + "(?<charliteral>'.*')|"
            + "(?<stringliteral>\".*\")|"
            + buildKwdGroup() + "|"
            + "(?<identifier>[_a-zA-Z][_a-zA-Z0-9]*)|"
            + "(?<newline>\\n)|(?<whitespace>\\s)|(?<scientific>\\d*(.|)[0-9]+e(\\+|\\-|)\\d*)|"
            + "(?<double>\\d*[.][0-9]+)|"
            + "(?<integer>[0-9]+)|"
            + "";
    static Pattern escapeMatching=Pattern.compile("\\[^nbrf'\"]");
    private String performEscaping(String anyliteral,byte[] source,int curpos,int line,int col){
        if (anyliteral.length() >=3){
            
        }
        String result= anyliteral
                .replace("\\n", "\n")
                .replace("\\b", "\b")
                .replace("\\r", "\r")
                .replace("\\f", "\f")
                .replace("\\\"", "\"")
                .replace("\\\\", "\\")
                ;
        if (anyliteral.charAt(0)=='\''){
            result=result.replace("\\'", "'");
        }
        Matcher matcher = escapeMatching.matcher(anyliteral);
        while (matcher.find()){
            ErrorHandler.InvalidEscapeCharacter(null, Helper.getBackTraceOneLine(source, curpos), curpos, line, col);
            
        }
        if (ErrorHandler.errorCount!=0)
            return null;
        return result;
    }
    private void performLexicalAnalysis(byte[] src) {
        String source = new String(src);
        try {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("test.regex"))) {
                bw.write(RegexTokenizer.TOKEN_PATTERN_SOURCE);
                bw.flush();
            }
        } catch (IOException ex) {
            Logger.getLogger(RegexTokenizer.class.getName()).log(Level.SEVERE, null, ex);
        }
        Pattern token_pattern = Pattern.compile(TOKEN_PATTERN_SOURCE);
        Matcher matcher = token_pattern.matcher(source);
        int line = 1;
        int col = 1;
        while (matcher.find()) {
            if (matcher.group("identifier") != null) {
                tokens.add(new Token(matcher.group(), TT.IDENTIFIER, sourceFile.getName(), line, col,matcher.start()));
                col += matcher.group().length();
            } else if (matcher.group("keywords") != null) {
                tokens.add(new Token(matcher.group(), SUPPORTED_KEYWORDS.get(matcher.group()), sourceFile.getName(), line, col,matcher.start()));
                col += matcher.group().length();
            } else if (matcher.group("newline") != null) {
                line++;
                col = 1;
            } else if (matcher.group("whitespace") != null) {
                col++;
            } else if (matcher.group("scientific") != null) {
                tokens.add(new Token(matcher.group(), TT.DOUBLE_LITERAL, sourceFile.getName(), line, col,matcher.start()));
                col += matcher.group().length();
            } else if (matcher.group("double") != null) {
                tokens.add(new Token(matcher.group(), TT.DOUBLE_LITERAL, sourceFile.getName(), line, col,matcher.start()));
                col += matcher.group().length();
            } else if (matcher.group("integer") != null) {
                tokens.add(new Token(matcher.group(), TT.INTEGER_LITERAL, sourceFile.getName(), line, col,matcher.start()));
                col += matcher.group().length();
            } else if (matcher.group("charliteral") != null) {
                int test_size = matcher.group().length();
                switch (test_size) {
                    case 3:
                    case 4:
                        tokens.add(new Token(
                                this.performEscaping(matcher.group(), source.getBytes(), matcher.start(), line, col)
                                , TT.CHAR_LITERAL, sourceFile.getName(), line, col,matcher.start()));
                        col += matcher.group().length();
                        break;
                    case 2:
                        ErrorHandler.EmptyCharLiteral(Helper.getBackTraceOneLine(source.getBytes(), matcher.start()), line, col);
                        col += test_size;
                        break;
                    default:
                        ErrorHandler.UnclosedCharLiteral(source.getBytes(), Helper.getBackTraceOneLine(source.getBytes(), matcher.start()), matcher.start(), line, col);
                        col += test_size;
                        break;
                }
            } else if (matcher.group("stringliteral") != null) {
                int test_size = matcher.group().length();
                if (test_size >= 2 && matcher.group().charAt(test_size-1)=='"') {
                    tokens.add(new Token(this.performEscaping(matcher.group(), source.getBytes(), matcher.start(), line, col), TT.STRING_LITERAL, sourceFile.getName(), line, col,matcher.start()));
                    col += matcher.group().length();
                }else{
                    ErrorHandler.UnclosedStringLiteral(Helper.getBackTraceOneLine(source.getBytes(), matcher.start()), line, col+test_size-1);
                    col+=test_size;
                }

            }/*else if(matcher.group("multicomment")!=null){
                line+=matcher.group().split("\n").length;
                if (matcher.group().charAt(matcher.group().length()-1)=='\n'){
                    col=1;
                }
            }*/ else if (matcher.group("slcomment") != null) {
                col = 1;
                line += 1;
            } /*else if (matcher.group("other") != null) {
                TT type = RegexTokenizer.getNonTerminalsType(matcher.group());
                if (type != TT.EOF && type != TT.NEWLINE && type != TT.SPACEBAR) {
                    tokens.add(new Token(matcher.group(), RegexTokenizer.getNonTerminalsType(matcher.group()), sourceFile.getName(), line, col,
                    matcher.start()));
                    col += matcher.group().length();
                } else if (type == TT.NEWLINE) {
                    line++;
                    col = 1;
                } else if (type == TT.SPACEBAR) {
                    col++;
                } else {
                    ErrorHandler.InvalidCharacter(Helper.getBackTraceOneLine(source.getBytes(), matcher.start()), line, col - 1);
                    col += matcher.group().length();
                }
            } */else {
                tokens.add(new Token(matcher.group(), RegexTokenizer.getNonTerminalsType(matcher.group()), sourceFile.getName(), line, col,
                    matcher.start()));
                    col += matcher.group().length();
            }
        }

    }

    public static TT getNonTerminalsType(String nt) {
        switch (nt) {
            case "{":
                return TT.OPEN_CURLI_BRACKET;
            case "}":
                return TT.CLOSE_CURLI_BRACKET;
            case "(":
                return TT.OPEN_PARENTHESIS;
            case ")":
                return TT.CLOSE_PARENTHESIS;
            case "[":
                return TT.RIGHT_SQUARE_BRACKET;
            case "]":
                return TT.LEFT_SQUARE_BRACKET;
            case "<":
                return TT.LESS_THAN;
            case "<=":
                return TT.LESS_THAN_OR_EQUAL_TO;
            case "<<<":
                return TT.UNSIGNED_LEFT_SHIFT_OPERATOR;
            case "<<":
                return TT.SIGNED_LEFT_SHIFT_OPERATOR;
            case ">":
                return TT.GREATER_THAN;
            case ">=":
                return TT.GREATER_THAN_OR_EQUAL_TO;
            case ">>>":
                return TT.UNSIGNED_RIGHT_SHIFT_OPERATOR;
            case ">>":
                return TT.SIGNED_RIGHT_SHIFT_OPERATOR;
            case "?":
                return TT.WHAT;
            case ":":
                return TT.COLON;
            case ",":
                return TT.COMMA;
            case ";":
                return TT.SEMICOLON;
            case "=":
                return TT.EQUAL;
            case "==":
                return TT.EQUAL_TO;
            case "!=":
                return TT.NOT_EQUAL_TO;
            case "&":
                return TT.BITWISE_AND;
            case "&&":
                return TT.LOGICAL_AND;
            case "!":
                return TT.LOGICAL_NOT;
            case "|":
                return TT.BITWISE_OR;
            case "||":
                return TT.LOGICAL_OR;
            case "^":
                return TT.BITWISE_XOR;
            case "~":
                return TT.BITWISE_COMPLEMENT;
            case "+":
                return TT.PLUS;
            case "+=":
                return TT.PLUS_EQUAL;
            case "++":
                return TT.INC;
            case "-":
                return TT.MINUS;
            case "-=":
                return TT.MINUS_EQUAL;
            case "--":
                return TT.DEC;
            case "/":
                return TT.DIVIDE;
            case "/=":
                return TT.DIVIDE_EQUAL;
            case "%":
                return TT.MOD;
            case "%=":
                return TT.MOD_EQUAL;
            case ".":
                return TT.DOT;
            case " ":
                return TT.SPACEBAR;
            case "\n":
                return TT.NEWLINE;
            default:
                return TT.EOF;
        }
    }
}
