/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Evelio VC
 */
public class CuerpoExpSimplExp1AST extends ExpSimplAST {
    public ExpAST ex;
    
    public CuerpoExpSimplExp1AST(ExpAST a){
        ex = a;
    }
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoExpSimplExp1AST(this, arg);
    }
}
