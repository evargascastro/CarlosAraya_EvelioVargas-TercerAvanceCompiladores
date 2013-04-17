/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Carlos
 */
public class CuerpoStatementIfAST extends StatementAST{
    public ExpAST expas;
    public StatementAST statemas;
    public IfAuxAST ifaux;

    public CuerpoStatementIfAST(ExpAST expas, StatementAST statemas, IfAuxAST ifaux) {
        this.expas = expas;
        this.statemas = statemas;
        this.ifaux = ifaux;
    }
    
    
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoStatementIfAST(this, arg);
    } 
}
