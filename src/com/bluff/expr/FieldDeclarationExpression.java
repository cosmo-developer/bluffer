/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.expr;

import java.util.ArrayList;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class FieldDeclarationExpression extends Expression{
    public final ArrayList<Token> identifier;
    public final ArrayList<Expression> initializer;
    public final ArrayList<String> extraField;
    public FieldDeclarationExpression(ArrayList<Token> identifier,
            ArrayList<Expression> initializer,ArrayList<String> extraField) {
        this.identifier = identifier;
        this.initializer = initializer;
        this.extraField=extraField;
    }
    
    @Override
    public Object accept(ByteCodeGenerator generator) {
        return generator.visit(this);
    }
    
}
