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
public class AssignmentExpression extends Expression {

    public final Token identifier;
    public final Expression arraySelector;
    public final Expression initializer;

    public AssignmentExpression(Token identifier, Expression arraySelector, Expression initializer) {
        this.identifier = identifier;
        this.arraySelector = arraySelector;
        this.initializer = initializer;
    }

    @Override
    public Object accept(ByteCodeGenerator generator) {
        return generator.visit(this);
    }

}
