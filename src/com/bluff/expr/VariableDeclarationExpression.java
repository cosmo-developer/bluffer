/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.expr;

import java.util.ArrayList;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class VariableDeclarationExpression extends Expression{
    public final ArrayList<Token> identifiers;
    public final ArrayList<Expression> initializers;
    
    public VariableDeclarationExpression() {
        this.identifiers = new ArrayList<>();
        this.initializers = new ArrayList<>();
    }

    @Override
    public Object accept(ByteCodeGenerator generator) {
        return generator.visit(this);
    }
    
}
