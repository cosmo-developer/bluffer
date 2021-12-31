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
public class StringLiteralExpression extends Expression{
    public final String value;
    public final int line;
    public final int column;
    public StringLiteralExpression(String value,int line,int column){
        this.value=value;
        this.line=line;
        this.column=column;
    }
    @Override
    public Object accept(ByteCodeGenerator generator) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
