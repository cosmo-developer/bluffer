/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluff.compiler.grammar;

import com.bluff.compiler.phases.ByteCodeGenerator;
import com.bluff.compiler.phases.Helper.TT;
import com.bluff.compiler.phases.Helper.Token;
import java.util.ArrayList;

/**
 *
 * @author Sonu Aryan <cosmo-developer@github.com>
 */
public final class ASTNodes {

    public abstract class BaseNode {

        public abstract Object accept(ByteCodeGenerator generator);
    }

    public class DoubleConstantNode extends BaseNode {

        public final double value;

        public DoubleConstantNode(double value) {
            this.value = value;
        }

        @Override
        public Object accept(ByteCodeGenerator generator) {
            return value;
        }
    }

    public class IntegerConstantNode extends BaseNode {

        public final long value;

        public IntegerConstantNode(long value) {
            this.value = value;
        }

        @Override
        public Object accept(ByteCodeGenerator generator) {
            return value;
        }
    }

    public class IntegralNode extends BaseNode {

        public final BaseNode expression;

        public IntegralNode(BaseNode expression) {
            this.expression = expression;
        }

        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
    }

    public class FloatingNode extends BaseNode {

        public final BaseNode expression;

        public FloatingNode(BaseNode expression) {
            this.expression = expression;
        }

        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
    }

    public class RelationalNode extends BaseNode {

        public final BaseNode lexpression;
        public final BaseNode rexpression;
        public final TT operator;

        public RelationalNode(BaseNode lexpr, BaseNode rexpr, TT operator) {
            this.lexpression = lexpr;
            this.rexpression = rexpr;
            this.operator = operator;
        }

        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
    }

    public class LogicalNode extends BaseNode {

        public final BaseNode lexpression;
        public final BaseNode rexpression;
        public final TT operator;

        public LogicalNode(BaseNode lexpr, BaseNode rexpr, TT operator) {
            this.lexpression = lexpr;
            this.rexpression = rexpr;
            this.operator = operator;
        }

        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
    }

    public class BitwiseNode extends BaseNode {

        public final BaseNode lexpression;
        public final BaseNode rexpression;
        public final TT operator;

        public BitwiseNode(BaseNode lexpr, BaseNode rexpr, TT operator) {
            this.lexpression = lexpr;
            this.rexpression = rexpr;
            this.operator = operator;
        }

        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
    }

    public class CompoundNode extends BaseNode {

        public final ArrayList<BaseNode> expressions;

        public CompoundNode() {
            expressions = new ArrayList<>();
        }

        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
    }

    public class IfNode extends BaseNode {

        public final BaseNode trueStatements;
        public final BaseNode logicTest;
        public final BaseNode falseStatements;

        public IfNode(BaseNode texp, BaseNode logicTest, BaseNode fexp) {
            this.trueStatements = texp;
            this.logicTest = logicTest;
            this.falseStatements = fexp;
        }

        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
    }

    public class WhileNode extends BaseNode {

        public final BaseNode trueStatements;
        public final BaseNode logicTest;

        public WhileNode(BaseNode texp, BaseNode logicTest) {
            this.trueStatements = texp;
            this.logicTest = logicTest;
        }

        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
    }

    public class DoWhileNode extends BaseNode {

        public final BaseNode trueStatements;
        public final BaseNode logicTest;

        public DoWhileNode(BaseNode texp, BaseNode logicTest) {
            this.trueStatements = texp;
            this.logicTest = logicTest;
        }

        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
    }

    public class ForNode extends BaseNode {

        public final BaseNode trueStatements;
        public final BaseNode firstexpr;
        public final BaseNode logicTest;
        public final BaseNode lastexpr;

        public ForNode(BaseNode texp, BaseNode fstexp, BaseNode logicTest, BaseNode lstexp) {
            this.trueStatements = texp;
            this.firstexpr = fstexp;
            this.logicTest = logicTest;
            this.lastexpr = lstexp;
        }

        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
    }

    public class ArgsNode extends BaseNode {

        public final ArrayList<BaseNode> argsexp;

        public ArgsNode() {
            argsexp = new ArrayList<>();
        }

        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
    }
    
    
    
    public class AssignNode extends BaseNode{
        public final BaseNode lexp;
        public final BaseNode rexp;
        public AssignNode(BaseNode lexp,BaseNode rexp){
            this.lexp=lexp;
            this.rexp=rexp;
        }
        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
        
    }
    public class VarNode extends BaseNode{
        public final Token variable;
        public VarNode(Token variable){
            this.variable=variable;
        }
        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
    }
    
    public class DotAccessNode extends BaseNode{
        public final BaseNode expression;
        public DotAccessNode(BaseNode expression){
            this.expression=expression;
        }
        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
    }
    public class CallFunctionNode extends BaseNode{
        public final BaseNode argexprs;
        public CallFunctionNode(BaseNode argexprs){
            this.argexprs=argexprs;
        }
        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
    }
    
    public class MathExpNode extends BaseNode{
        public final BaseNode lexp;
        public final TT operator;
        public final BaseNode rexp;
        public MathExpNode(BaseNode lexp,TT operator,BaseNode rexp){
            this.lexp=lexp;
            this.operator=operator;
            this.rexp=rexp;
        }
        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
    }
    
    public class TermNode extends BaseNode{
        public final BaseNode lexp;
        public final TT operator;
        public final BaseNode rexp;
        public TermNode(BaseNode lexp,TT operator,BaseNode rexp){
            this.lexp=lexp;
            this.operator=operator;
            this.rexp=rexp;
        }
        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
    }
    
    public class FactorNode extends BaseNode{
        public final BaseNode exp;
        public FactorNode(BaseNode exp){
            this.exp=exp;
        }
        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
    }
    
    public class UnaryNode extends BaseNode{
        public final BaseNode exp;
        public final TT operator;
        public UnaryNode(BaseNode exp,TT operator){
            this.exp=exp;
            this.operator=operator;
        }
        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
    }
    public class GlobalVarNode extends BaseNode{
        public final Token var;
        public final int flag;//0 for final 1 for normal
        public GlobalVarNode(Token var,int flag){
            this.var=var;
            this.flag=flag;
        }
        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
        
    }
    
    public class ArrayVariableNode extends BaseNode{
        public final int nDimensions;
        public final Token var;
        public final int flag;//0 for final 1 for normal
        public ArrayVariableNode(int nDimensions,Token var,int flag){
            this.nDimensions=nDimensions;
            this.var=var;
            this.flag=flag;
        }
        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
    }
    
    public class CreateNewArrayNode extends BaseNode{
        public final int nDimensions;
        public final ArrayList<BaseNode> sizeIntializer;
        public final Token type;
        public CreateNewArrayNode(int nDimensions,ArrayList<BaseNode> sizeInitializer,Token type){
            this.nDimensions=nDimensions;
            this.sizeIntializer=sizeInitializer;
            this.type=type;
        }
        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
    }
    public class DirectArrayAssignNode extends BaseNode{
        public final int nDimensions;
        public final ArrayList<BaseNode> valueInitializers;
        public final Token type;
        public DirectArrayAssignNode(int nDimensions,ArrayList<BaseNode> valueInitializers,Token type){
            this.nDimensions=nDimensions;
            this.valueInitializers=valueInitializers;
            this.type=type;
        }
        
        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
        
    }
    public class ArgsDefNode extends BaseNode{
        @Override
        public Object accept(ByteCodeGenerator generator) {
            return generator.visit(this);
        }
        
    }
    
    public class VarDeclNonInitializedNode extends BaseNode{
        public final boolean isArray;
        public final Token name;
        public VarDeclNonInitializedNode(boolean isArray,Token name){
            this.isArray=isArray;
            this.name=name;
        }
        @Override
        public Object accept(ByteCodeGenerator generator) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
   
}
