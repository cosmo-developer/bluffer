/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.compiler.phases;

import com.bluff.compiler.ErrorHandler;
import com.bluff.compiler.grammar.ASTNodes;
import com.bluff.compiler.grammar.ASTNodes.BaseNode;
import com.bluff.compiler.phases.Helper.TT;
import com.bluff.compiler.phases.Helper.Token;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    private TT expect(TT type){
        if (lookAhead().type ==  type){
            return this.currentToken.type;
        }else{
            try {
                throw new Exception("Expect: "+type+" But found:"+this.currentToken.name+" info:"+this.currentToken);
            } catch (Exception ex) {
                Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return this.currentToken.type;
    }
    
    private TT expect(TT... types){
        TT type=lookAhead().type;
        boolean found=false;
        for (TT t:types){
            if (t == type){
                found=true;
                break;
            }
        }
        if (!found){
            try {
                throw new Exception("<Identifier> Expected:"+this.currentToken);
            } catch (Exception ex) {
                Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return this.currentToken.type;
    }
    private void expectVarDeclType(){
        this.expect(
                        TT.STRING_KWD,TT.FLOAT_KWD,TT.CHAR_KWD,TT.DOUBLE_KWD,TT.LONG_KWD,TT.BYTE_KWD,TT.SHORT_KWD,
                        TT.INT_KWD
                );
    }

    private void functionDefParser() {
        this.lookAhead();
        if (this.currentToken.type==TT.CLOSE_PARENTHESIS){
            this.expect(TT.OPEN_CURLI_BRACKET);
//            BaseNode functionBody=this.blockParser();
            this.expect(TT.CLOSE_CURLI_BRACKET);
        }else{
            BaseNode args=this.argDefParser();
            this.expect(TT.CLOSE_PARENTHESIS);
            this.expect(TT.OPEN_CURLI_BRACKET);
//            BaseNode functionBody=this.blockParser();
            this.expect(TT.CLOSE_CURLI_BRACKET);
        }
    }

    private void globalVarParser() {
        
    }
    
    private BaseNode argDefParser(){
        ASTNodes.ArgsDefNode argsDef=new ASTNodes.ArgsDefNode();
        
        return null;
    }
    
    private BaseNode argValParser(){
        
        return null;
    }

    private BaseNode mainParser() {
        Token c = lookAhead();
        switch (c.type) {
            case VOID_KWD:
                this.expect(TT.IDENTIFIER);
                this.functionDefParser();
                
                break;
            case FINAL_KWD:
                this.expectVarDeclType();
                this.expect(TT.IDENTIFIER);
                this.expect(TT.EQUAL);
                this.globalVarParser();
                break;
            case STRING_KWD:
            case INT_KWD:
            case FLOAT_KWD:
            case DOUBLE_KWD:
            case SHORT_KWD:
            case LONG_KWD:
            case CHAR_KWD:
            case BOOLEAN_KWD:
            case BYTE_KWD:
                this.expect(TT.IDENTIFIER);
                if (this.currentToken.type ==  TT.OPEN_PARENTHESIS){
                    this.functionDefParser();
                }else{
                    this.expect(TT.EQUAL);
                    this.globalVarParser();
                }
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
