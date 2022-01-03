/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.expr;

import com.bluff.SymbolTable;
import com.bluff.compiler.phases.ByteCodeGenerator;
import org.objectweb.asm.Label;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class ElseExpression extends Expression{
    public IfExpression parent;
    public final Expression expression;
    public final SymbolTable table;
    public Label start;
    public Label end;

    public ElseExpression(Expression expression,SymbolTable table) {
        this.expression = expression;
        this.table=table;
        this.start=new Label();
        this.end=new Label();
    }
    
    @Override
    public Object accept(ByteCodeGenerator generator) {
        return generator.visit(this);
    }
    
}
