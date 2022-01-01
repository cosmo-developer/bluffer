/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.expr;

import com.bluff.compiler.phases.ByteCodeGenerator;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class IdentifierExpression extends Expression{
    public final Token identifier;
    public boolean lengthSelector=false;
    public Expression arraySelector=null;

    public IdentifierExpression(Token identifier) {
        this.identifier = identifier;
    }

    @Override
    public Object accept(ByteCodeGenerator generator) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
