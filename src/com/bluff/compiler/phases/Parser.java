/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.compiler.phases;

import com.bluff.compiler.ErrorHandler;
import com.bluff.compiler.grammar.ASTNodes.BaseNode;
import com.bluff.compiler.phases.Helper.Token;
import java.util.ArrayList;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class Parser {

    final ArrayList<Token> tokens;

    int pos = -1;
    final String source;
    Token currentToken;
    
    
    
    public Parser(ArrayList<Token> tokens, String source) {
        this.tokens = tokens;
        this.currentToken = null;
        this.source = source;
    }

    public Token lookAhead() {
        if (pos < tokens.size()) {
            currentToken = this.tokens.get(++pos);
            return currentToken;
        }
        return null;
    }

    public Token lookBack() {
        if (pos > 0) {
            currentToken = this.tokens.get(--pos);
        }
        return null;
    }

    private void functionParser() {
        
    }

    private void globalVarParser() {

    }

    private BaseNode mainParser() {
        Token c = lookAhead();
        switch (c.type) {
            case VOID_KWD:
                this.functionParser();
                break;
            case FINAL_KWD:
            case STRING_KWD:
            case INT_KWD:
            case FLOAT_KWD:
            case DOUBLE_KWD:
            case SHORT_KWD:
            case LONG_KWD:
            case CHAR_KWD:
            case BOOLEAN_KWD:
            case BYTE_KWD:
                this.globalVarParser();
                break;
            default:
                ErrorHandler.ThrowIllegalStartOfExpression(
                        null, 
                        Helper.getBackTraceOneLine(source.getBytes(), c.pos), c.pos, c.lineno, c.colno);
        }
        return null;
    }

    public BaseNode parse() {
        BaseNode result = null;
        this.mainParser();
        return result;
    }

}
