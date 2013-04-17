/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Evelio VC
 */
public class CuerpoExpSimplExp2AST extends ExpSimplAST{
    public ExpAST ex;
    
    public CuerpoExpSimplExp2AST(ExpAST a){
        ex = a;
    }
    
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoExpSimplExp2AST(this, arg);
    }
}
