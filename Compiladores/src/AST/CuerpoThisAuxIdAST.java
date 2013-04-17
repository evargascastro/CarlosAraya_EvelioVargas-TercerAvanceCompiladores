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
public class CuerpoThisAuxIdAST extends ThisAuxAST{
    public String ide;

    public CuerpoThisAuxIdAST(String ide) {
        this.ide = ide;
    }
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoThisAuxIdAST(this, arg);
    }
}
