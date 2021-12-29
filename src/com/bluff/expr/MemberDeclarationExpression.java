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
public class MemberDeclarationExpression extends Expression{
    public final Expression typeExpression;
    public final Expression declExpr;
    
    public MemberDeclarationExpression(Expression typeExpression,Expression declExpr) {
        this.typeExpression=typeExpression;
        this.declExpr = declExpr;
    }

    @Override
    public Object accept(ByteCodeGenerator generator) {
        return generator.visit(this);
    }
    
}
