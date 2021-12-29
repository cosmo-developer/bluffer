/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.expr;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public class ByteCodeGenerator {
    
    Object visit(MemberDeclarationExpression aThis) {
        
        return null;
    }
    Object visit(MethodDeclarationExpression aThis){
        
        return null;
    }

    Object visit(TypeExpression aThis) {
        return aThis.type;
    }

    Object visit(FieldDeclarationExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object visit(VariableDeclarationExpression aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object visit(ArrayInitializer aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
