/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.expr;

import org.antlr.v4.runtime.Token;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class LiteralExpression extends Expression{
    public final Token value;
    public final String type;
    public LiteralExpression(Token value, String type) {
        this.value = value;
        this.type = type;
    }
    @Override
    public Object accept(ByteCodeGenerator generator) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
