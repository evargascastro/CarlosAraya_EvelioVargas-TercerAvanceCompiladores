/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;
import java_cup.runtime.Symbol;
/**
 *
 * @author Evelio VC
 */
public class CuerpoExpSimplString_ConsAST extends ExpSimplAST{
    public String str_cons;
    
    public CuerpoExpSimplString_ConsAST(String a){
        str_cons = a;
    }
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoExpSimplString_ConsAST(this, arg);
    }
}
