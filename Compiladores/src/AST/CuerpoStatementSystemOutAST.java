/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Carlos
 */
public class CuerpoStatementSystemOutAST extends StatementAST{
    public ExpAST espa;

    public CuerpoStatementSystemOutAST(ExpAST espa) {
        this.espa = espa;
    }
    
    
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoStatementSystemOutAST(this, arg);
    } 
}
