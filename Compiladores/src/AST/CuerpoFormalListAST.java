/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Carlos
 */
public class CuerpoFormalListAST  extends FormalListAST{
    public FormalListAuxAST formallist;

    public CuerpoFormalListAST(FormalListAuxAST formallist) {
        this.formallist = formallist;
    }
    
    
    @Override
     public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoFormalListAST(this, arg);
    }
}
