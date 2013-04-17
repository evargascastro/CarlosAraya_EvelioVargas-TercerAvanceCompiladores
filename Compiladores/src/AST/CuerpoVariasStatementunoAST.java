/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Carlos
 */
public class CuerpoVariasStatementunoAST extends VariasStatementAST{
    public StatementAST statem;

    public CuerpoVariasStatementunoAST(StatementAST statem) {
        this.statem = statem;
    }
    
    
    
    @Override
     public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoVariasStatementunoAST(this, arg);
    }
}
