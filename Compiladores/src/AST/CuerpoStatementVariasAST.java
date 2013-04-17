/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Carlos
 */
public class CuerpoStatementVariasAST extends StatementAST{
    public VariasStatementAST vstatem;

    public CuerpoStatementVariasAST(VariasStatementAST vstatem) {
        this.vstatem = vstatem;
    }
    
    
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoStatementVariasAST(this, arg);
    } 
}
