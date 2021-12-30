/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.expr;

import com.bluff.compiler.phases.BlufferBaseVisitor;
import com.bluff.compiler.phases.BlufferParser;
import java.util.ArrayList;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class AntlrToProgramBody extends BlufferBaseVisitor<Expression>{
    public final ArrayList<Expression> expressions;
    public final AntlrToExpression expr;
    public AntlrToProgramBody(AntlrToExpression expr) {
        expressions=new ArrayList<>();
        this.expr=expr;
    }
    
    @Override
    public Expression visitProgramBody(BlufferParser.ProgramBodyContext ctx) {
        ctx.children.forEach((tree) -> {
            expressions.add(expr.visit(tree));
        });
        return null;
    }
    
}
