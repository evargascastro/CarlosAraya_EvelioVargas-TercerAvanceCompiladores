/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Evelio VC
 */
public abstract class ProgramAST extends AST {

    @Override
   public Object visit(Visitor v, Object arg) {
        return v.visitProgramAST(this, arg);
    }
}
