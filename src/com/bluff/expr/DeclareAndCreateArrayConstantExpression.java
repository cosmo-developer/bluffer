/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.expr;

import com.bluff.compiler.phases.ByteCodeGenerator;
import java.util.ArrayList;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class DeclareAndCreateArrayConstantExpression extends Expression{
    public final String arrayType;
    public final Token identifier;
    public final ArrayList<Expression> intiailizers;

    public DeclareAndCreateArrayConstantExpression(String arrayType, Token identifier, ArrayList<Expression> intiailizers) {
        this.arrayType = arrayType;
        this.identifier = identifier;
        this.intiailizers = intiailizers;
    }
    
    @Override
    public Object accept(ByteCodeGenerator generator) {
        return generator.visit(this);
    }
    
}
