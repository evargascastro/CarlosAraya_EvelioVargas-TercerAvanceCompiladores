/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Evelio VC
 */
public class CuerpoExpSimplExp3AST extends ExpSimplAST{
    public ExpAST ex;
    
    public CuerpoExpSimplExp3AST(ExpAST a){
        ex = a;
    }
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoExpSimplExp3AST(this, arg);
    }
}
