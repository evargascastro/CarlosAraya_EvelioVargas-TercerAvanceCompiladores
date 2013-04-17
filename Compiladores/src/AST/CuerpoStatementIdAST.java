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
public class CuerpoStatementIdAST extends StatementAST{
    public String id;
    public IdAuxAST idaux;
    public SystemAuxAST systemaux;

    public CuerpoStatementIdAST(String id, IdAuxAST idaux, SystemAuxAST systemaux) {
        this.id = id;
        this.idaux = idaux;
        this.systemaux = systemaux;
    }
    
    
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoStatementIdAST(this, arg);
    } 
}
