/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Evelio VC
 */
public class CuerpoExpSimplTypeAST extends ExpSimplAST {
    public TypeAST ty;
    
    public CuerpoExpSimplTypeAST(TypeAST a){
        ty = a;
    }

    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoExpSimplTypeAST(this, arg);
    }
}
