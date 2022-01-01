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
public class DeclareArrayExpression extends Expression{
    public final String arrayType;
    public final Token identifier;

    public DeclareArrayExpression(String arrayType, Token identifier) {
        this.arrayType = arrayType;
        this.identifier = identifier;
    }
    
    @Override
    public Object accept(ByteCodeGenerator generator) {
        return generator.visit(this);
    }
    
}
