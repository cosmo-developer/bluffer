/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.compiler.phases;

import com.bluff.compiler.grammar.ASTNodes.BaseNode;
import com.bluff.compiler.phases.Lexer.Token;
import java.util.ArrayList;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class Parser {
    final ArrayList<Token> tokens;
    int pos=0;
    Token currentToken;
    public Parser(ArrayList<Token> tokens){
        this.tokens=tokens;
        this.currentToken=tokens.get(0);
    }
    
    public Token lookAhead(){
        if (pos<tokens.size()){
            currentToken=this.tokens.get(++pos);
            return currentToken;
        }
        return null;
    }
    public Token lookBack(){
        if (pos>0){
            currentToken=this.tokens.get(--pos);
        }
        return null;
    }
    
    private BaseNode mainParser(){
        
        return null;
    }
    
    public BaseNode parse(){
        BaseNode result=null;
        
        return result;
    }
    
}
