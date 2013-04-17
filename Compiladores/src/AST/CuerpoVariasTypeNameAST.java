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
public class CuerpoVariasTypeNameAST extends TypeNameAST{
    public TypeNameAST tname;
    public String ide;
    
    public CuerpoVariasTypeNameAST(TypeNameAST a, String b){
        tname=a;
        ide=b;
    }
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoVariasTypeNameAST(this, arg);
    } 
}
