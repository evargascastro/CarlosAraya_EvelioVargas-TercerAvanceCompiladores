/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Evelio VC
 */
public class CuerpoExpExp2AST extends ExpAST {
    public ExpAST ex;
    public ExpAST ex1;
    public CuerpoExpExp2AST(ExpAST a, ExpAST b){
        ex = a;
        ex1=b;
    }
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoExpExp2AST(this, arg);
    }
}
