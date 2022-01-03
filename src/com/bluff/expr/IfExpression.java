/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.expr;

import com.bluff.SymbolTable;
import com.bluff.compiler.phases.ByteCodeGenerator;
import java.util.ArrayList;
import org.objectweb.asm.Label;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class IfExpression extends Expression{
    public final Expression condition;
    public final Expression statement;
    public Expression elseExpression;
    public ArrayList<ElseIfExpression> elseIfExpression;
    public final SymbolTable table;
    public Label start;
    public Label end;

    public IfExpression(Expression condition, Expression statement,Expression elseExpression,SymbolTable table) {
        this.condition = condition;
        this.statement = statement;
        this.elseExpression=elseExpression;
        this.table=table;
        this.start=new Label();
        this.end=new Label();
        this.elseIfExpression=new ArrayList<>();
    }
    
    @Override
    public Object accept(ByteCodeGenerator generator) {
        return generator.visit(this);
    }
    
}
