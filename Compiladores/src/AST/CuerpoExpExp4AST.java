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
public class CuerpoExpExp4AST extends ExpAST{
    public ExpAST ex;
    public String ide;
    public ExpListAST explist;

    public CuerpoExpExp4AST(ExpAST ex, String a, ExpListAST c) {
        this.ex = ex;
        this.ide = a;
        this.explist = c;
    }
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoExpExp4AST(this, arg);
    }
}
