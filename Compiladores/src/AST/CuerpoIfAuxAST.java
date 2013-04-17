/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Carlos
 */
public class CuerpoIfAuxAST extends IfAuxAST{
    public StatementAST statea;

    public CuerpoIfAuxAST(StatementAST statea) {
        this.statea = statea;
    }
    
    
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoIfAuxAST(this, arg);
    } 
}
