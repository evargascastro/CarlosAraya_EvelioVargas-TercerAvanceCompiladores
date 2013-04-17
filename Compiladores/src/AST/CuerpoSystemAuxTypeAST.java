/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Evelio VC
 */
public class CuerpoSystemAuxTypeAST extends SystemAuxAST{
    public TypeAST ty;

    public CuerpoSystemAuxTypeAST(TypeAST ty) {
        this.ty = ty;
    }
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoSystemAuxTypeAST(this, arg);
    }
}
