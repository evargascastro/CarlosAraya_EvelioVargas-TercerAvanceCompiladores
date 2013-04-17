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
public class CuerpoTypeAST extends TypeAST{
    public String id;

    public CuerpoTypeAST(String id) {
        this.id = id;
    }
    
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoTypeAST(this, arg);
    }
}
