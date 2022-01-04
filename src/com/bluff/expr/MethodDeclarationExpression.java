/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.expr;

import com.bluff.SymbolTable;
import com.bluff.compiler.phases.ByteCodeGenerator;
import org.antlr.v4.runtime.Token;
import org.objectweb.asm.Label;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class MethodDeclarationExpression extends Expression{
    public final String returnType;
    public final Token identifier;
    public final ParameterExpression parameters;
    public final BlockExpression body;
    public final SymbolTable table;
    public Label start;
    public Label end;

    public MethodDeclarationExpression(String returnType,
            Token identifier, ParameterExpression parameters, 
            BlockExpression body,SymbolTable table) {
        this.returnType = returnType;
        this.identifier = identifier;
        this.parameters = parameters;
        this.body = body;
        this.table=table;
        this.start=new Label();
        this.end=new Label();
    }
    
    
    
    @Override
    public Object accept(ByteCodeGenerator generator) {
        return generator.visit(this);
    }
    
}
