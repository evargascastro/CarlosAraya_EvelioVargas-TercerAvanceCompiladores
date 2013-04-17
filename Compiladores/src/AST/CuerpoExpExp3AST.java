/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Evelio VC
 */
public class CuerpoExpExp3AST extends ExpAST {
    public ExpAST ex;

    public CuerpoExpExp3AST(ExpAST a) {
        ex = a;
    }

    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoExpExp3AST(this, arg);
    }
}
