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
public class AddExpression extends Expression{
    public final TermExpression left;
    public final String operator;
    public final TermExpression right;
    public AddExpression(TermExpression left, String operator, TermExpression right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }
    
    @Override
    public Object accept(ByteCodeGenerator generator) {
        return generator.visit(this);
    }
    
}
