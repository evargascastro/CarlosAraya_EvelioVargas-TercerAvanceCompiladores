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
public class CuerpoStatementSystemExitAST extends StatementAST{
    public String num;

    public CuerpoStatementSystemExitAST(String num) {
        this.num = num;
    }
    
    
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoStatementSystemExitAST(this, arg);
    } 
}
