/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.expr;

import java.util.ArrayList;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class ArrayInitializer extends Expression{
    public final ArrayList<Expression> initializers;

    public ArrayInitializer(ArrayList<Expression> initializers) {
        this.initializers = initializers;
    }

    @Override
    public Object accept(ByteCodeGenerator generator) {
        return generator.visit(this);
    }
    
}
