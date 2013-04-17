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
public class CuerpoUnTypeNameAST extends TypeNameAST{
    public String ide;
    
    public CuerpoUnTypeNameAST(String a){
        ide=a;
    }
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoUnTypeNameAST(this, arg);
    } 
}
