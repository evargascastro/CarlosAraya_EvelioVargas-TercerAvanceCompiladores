/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Carlos
 */
public class CuerpoMethodDeclAuxUnoAST extends MethodDeclAuxUnoAST{
    public VariasVarDeclAST vvardecl;
    public VariasStatementAST vstatem;
    public MethodDeclAuxDosAST mdecl;

    public CuerpoMethodDeclAuxUnoAST(VariasVarDeclAST vvardecl, VariasStatementAST vstatem, MethodDeclAuxDosAST mdecl) {
        this.vvardecl = vvardecl;
        this.vstatem = vstatem;
        this.mdecl = mdecl;
    }
    
    
    @Override
     public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoMethodDeclAuxUnoAST(this, arg);
    }
}
