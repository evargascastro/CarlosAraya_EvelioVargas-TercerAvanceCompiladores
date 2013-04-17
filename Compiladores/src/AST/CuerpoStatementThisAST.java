/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import java_cup.runtime.Symbol;

/**
 *
 * @author Carlos
 */
public class CuerpoStatementThisAST extends StatementAST{
    public ThisAuxAST thisaux;
    public String id;
    public ExpListAST explist;

    public CuerpoStatementThisAST(ThisAuxAST thisaux, String id, ExpListAST explist) {
        this.thisaux = thisaux;
        this.id = id;
        this.explist = explist;
    }
    
    
    
    @Override
     public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoStatementThisAST(this, arg);
    } 
}
