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
public class FactorExpression extends Expression{
    public final String unaryOperator;
    public final Expression anyOne;
    public final boolean lengthSelector;
    public final Expression arraySelctor;
    public final Token identifier;
    public FactorExpression(String unaryOperator, 
            Expression anyOne,boolean lengthSelector,
            Expression arraySelector,Token identifier) {
        this.unaryOperator = unaryOperator;
        this.anyOne = anyOne;
        this.lengthSelector=lengthSelector;
        this.arraySelctor=arraySelector;
        this.identifier=identifier;
    }
    @Override
    public Object accept(ByteCodeGenerator generator) {
        return generator.visit(this);
    }
}
