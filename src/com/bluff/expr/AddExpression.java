/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.expr;

import com.bluff.compiler.phases.ByteCodeGenerator;
import java.util.ArrayList;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class AddExpression extends Expression{
    public final ArrayList<Expression> exps;
    public final ArrayList<String> operators;

    public AddExpression(ArrayList<Expression> exps, ArrayList<String> operators) {
        this.exps = exps;
        this.operators = operators;
    }
    
    @Override
    public Object accept(ByteCodeGenerator generator) {
        return generator.visit(this);
    }
    
}
