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
public class CuerpoExpSimplNumAST extends ExpSimplAST {
    public String num;
    
    public CuerpoExpSimplNumAST(String a) {
        num = a;
    }

    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoExpSimplNumAST(this, arg);
    }
}
