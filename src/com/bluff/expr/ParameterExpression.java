/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.expr;

import com.bluff.compiler.phases.ByteCodeGenerator;
import java.util.HashMap;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Pair;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class ParameterExpression extends Expression{
    public final HashMap<String,Pair<String,Token>> parameters;

    public ParameterExpression(HashMap<String, Pair<String,Token>> parameters) {
        this.parameters = parameters;
       
    }
    
    @Override
    public Object accept(ByteCodeGenerator generator) {
        return generator.visit(this);
    }
    
}
