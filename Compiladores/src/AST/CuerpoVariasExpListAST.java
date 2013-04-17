/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Evelio VC
 */
public class CuerpoVariasExpListAST extends ExpListAST{
    public ExpAST ex;
    public ExpListAST expli;
    
    public CuerpoVariasExpListAST( ExpListAST b, ExpAST a){
        ex = a;
        expli = b;
    }
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoVariasExpListAST(this, arg);
    }
}
