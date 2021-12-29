/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.expr;

import com.bluff.compiler.phases.BlufferBaseVisitor;
import com.bluff.compiler.phases.BlufferParser;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class AntlrToProgramBody extends BlufferBaseVisitor<Expression>{

    @Override
    public Expression visitProgramBody(BlufferParser.ProgramBodyContext ctx) {
        return super.visitProgramBody(ctx);
    }
    
}
