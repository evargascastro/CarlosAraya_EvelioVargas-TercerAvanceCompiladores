/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Carlos
 */
public class CuerpoMethodDeclAuxDosAST extends MethodDeclAuxDosAST {
    public ExpAST expa;

    public CuerpoMethodDeclAuxDosAST(ExpAST expa) {
        this.expa = expa;
    }
    
    
    
    @Override
     public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoMethodDeclAuxDosAST(this, arg);
    }
}
