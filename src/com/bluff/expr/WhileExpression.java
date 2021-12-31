/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.expr;

import com.bluff.SymbolTable;
import com.bluff.compiler.phases.ByteCodeGenerator;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class WhileExpression extends Expression{
    public final Expression condition;
    public final Expression statement;
    public final SymbolTable table;

    public WhileExpression(Expression condition, Expression statement,SymbolTable table) {
        this.condition = condition;
        this.statement = statement;
        this.table=table;
    }
    
    @Override
    public Object accept(ByteCodeGenerator generator) {
        return generator.visit(this);
    }
    
}
