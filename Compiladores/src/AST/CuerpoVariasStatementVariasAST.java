/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Carlos
 */
public class CuerpoVariasStatementVariasAST extends VariasStatementAST{
    public VariasStatementAST vstatem;
    public StatementAST statem;

    public CuerpoVariasStatementVariasAST(VariasStatementAST vstatem, StatementAST statem) {
        this.vstatem = vstatem;
        this.statem = statem;
    }
    
    
    @Override
     public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoVariasStatementVariasAST(this, arg);
    }
}
