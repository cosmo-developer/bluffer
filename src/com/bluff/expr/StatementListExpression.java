/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.expr;

import com.bluff.compiler.phases.ByteCodeGenerator;
import java.util.ArrayList;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class StatementListExpression extends Expression{
    public final ArrayList<MethodDeclarationExpression> statements;
    public StatementListExpression(ArrayList<MethodDeclarationExpression> statements){
        this.statements=statements;
    }
    @Override
    public Object accept(ByteCodeGenerator generator) {
        return generator.visit(this);
    }
    
}
