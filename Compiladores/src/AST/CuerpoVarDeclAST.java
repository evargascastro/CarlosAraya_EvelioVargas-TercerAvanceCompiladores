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
public class CuerpoVarDeclAST extends VarDeclAST{
    public TypeAST typea;
    public String ide;

    public CuerpoVarDeclAST(TypeAST a, String b) {
        typea=a;
        ide=b;
    }
    
    
    @Override
     public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoVarDeclAST(this, arg);
    } 
}
