/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Evelio VC
 */
public class CuerpoUnExpListAST extends ExpListAST {
    public ExpAST ex;

    public CuerpoUnExpListAST(ExpAST a) {
        ex = a;
    }

    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoUnExpListAST(this, arg);
    }
}
