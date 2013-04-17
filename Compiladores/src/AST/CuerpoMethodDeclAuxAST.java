/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Carlos
 */
public class CuerpoMethodDeclAuxAST extends MethodDeclAuxAST{
    public  TypeAST typeas;

    public CuerpoMethodDeclAuxAST(TypeAST typeas) {
        this.typeas = typeas;
    }
    
    
    @Override
     public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoMethodDeclAuxAST(this, arg);
    }
}
