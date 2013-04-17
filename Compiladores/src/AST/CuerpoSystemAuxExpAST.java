/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Evelio VC
 */
public class CuerpoSystemAuxExpAST extends SystemAuxAST{
    public ExpAST ex;

    public CuerpoSystemAuxExpAST(ExpAST ex) {
        this.ex = ex;
    }
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoSystemAuxExpAST(this, arg);
    }
}
