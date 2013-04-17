/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Evelio VC
 */
public class CuerpoExpExpSimplAST extends ExpAST{
    public ExpSimplAST ex_si;
    
    public CuerpoExpExpSimplAST(ExpSimplAST a){
        ex_si = a;
    }
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoExpExpSimplAST(this, arg);
    }
}
