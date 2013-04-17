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
public class CuerpoMainClassAST extends MainClassAST{
    public String ide;
    public String ide1;
    public StatementAST statem;
    
    public CuerpoMainClassAST (String a, String b, StatementAST c){
        ide=a;
        ide1=b;
        statem=c;
    }
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoMainClassAST(this, arg);
    } 
}
