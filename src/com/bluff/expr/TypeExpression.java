/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.expr;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class TypeExpression extends Expression {
    final String type;
    public TypeExpression(String type){
        this.type=type;
    }
    @Override
    public Object accept(ByteCodeGenerator generator) {
        return generator.visit(this);
    }
    
}
