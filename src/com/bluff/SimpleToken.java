/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;
/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class SimpleToken implements Token{
    String text;
    int type;
    int line;
    int column;
    public SimpleToken(Token tok){
        this.text=tok.getText();
        this.type=tok.getType();
        this.column=tok.getCharPositionInLine();
    }
    public void setText(String text){
        this.text=text;
    }
    @Override
    public String getText() {
        return text;
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getCharPositionInLine() {
        return column;
    }

    @Override
    public int getChannel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getTokenIndex() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getStartIndex() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getStopIndex() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TokenSource getTokenSource() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CharStream getInputStream() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
