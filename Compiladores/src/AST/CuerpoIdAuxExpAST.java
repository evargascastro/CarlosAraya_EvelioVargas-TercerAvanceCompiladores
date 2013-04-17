/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Evelio VC
 */
public class CuerpoIdAuxExpAST extends IdAuxAST{
    public ExpAST ex;

    public CuerpoIdAuxExpAST(ExpAST ex) {
        this.ex = ex;
    }
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoIdAuxExpAST(this, arg);
    }
}
