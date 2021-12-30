/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.expr;

import com.bluff.SymbolTable;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class MethodDeclarationExpression extends Expression{
    public final Token identifier;
    public final Expression arguments;
    public final Expression methodBody;
    public final SymbolTable symbolTable;
    public MethodDeclarationExpression(Token identifier, Expression arguments
            , Expression methodBody,SymbolTable table) {
        this.identifier = identifier;
        this.arguments = arguments;
        this.methodBody = methodBody;
        this.symbolTable=table;
        
    }
    
    @Override
    public Object accept(ByteCodeGenerator generator) {
        return generator.visit(this);
    }
    
}
