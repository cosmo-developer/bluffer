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
public class DeclVariableInitializedExpression extends Expression{
    public final String type;
    public final Token identifier;
    public final Expression initialize;

    public DeclVariableInitializedExpression(String type, Token identifier, Expression initialize) {
        this.type = type;
        this.identifier = identifier;
        this.initialize = initialize;
    }
    
    @Override
    public Object accept(ByteCodeGenerator generator) {
        return generator.visit(this);
    }
    
}
