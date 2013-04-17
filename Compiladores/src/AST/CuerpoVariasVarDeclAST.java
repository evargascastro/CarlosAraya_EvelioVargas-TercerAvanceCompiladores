/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Carlos
 */
public class CuerpoVariasVarDeclAST extends VariasVarDeclAST{
    public VariasVarDeclAST vvardecl;
    public VarDeclAST vardecl;
    
    public CuerpoVariasVarDeclAST(VariasVarDeclAST a, VarDeclAST b){
        vvardecl=a;
        vardecl=b;
    }
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoVariasVarDeclAST(this, arg);
    }
}
