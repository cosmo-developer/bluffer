package com.bluff.compiler.phases;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class Helper {



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
        public final int pos;

        public Token(String name, TT type, String fileName, int lineno, int colno,int pos) {
            this.name = name;
            this.type = type;
            this.fileName = fileName;
            this.lineno = lineno;
            this.colno = colno;
            this.pos=pos;
        }

        @Override
        public String toString() {
            return "Token{" + "name=" + name + ", type=" + type + ", fileName=" + fileName + ", lineno=" + lineno + ", colno=" + colno + '}';
        }

    }

    public Helper(String filename) {
       
    }

    private boolean makeSure(int p, int max) {
        return p < max;
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

   
}
