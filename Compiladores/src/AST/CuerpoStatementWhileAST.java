/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Carlos
 */
public class CuerpoStatementWhileAST extends StatementAST{
    public ExpAST exps;
    public StatementAST statem;

    public CuerpoStatementWhileAST(ExpAST exps, StatementAST statem) {
        this.exps = exps;
        this.statem = statem;
    }
    
    
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoStatementWhileAST(this, arg);
    } 
}
