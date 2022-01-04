/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.expr;

import com.bluff.compiler.phases.ByteCodeGenerator;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class ParExpression extends Expression {

    public final Expression exp;
    public boolean lengthSelector = false;
    public Expression arraySelector = null;

    public ParExpression(Expression exp) {
        this.exp = exp;
    }

    @Override
    public Object accept(ByteCodeGenerator generator) {
        return generator.visit(this);
    }

}
