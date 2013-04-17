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
public class CuerpoFormalListAuxUnoAST  extends FormalListAuxAST{
    public TypeAST typeas;
    public String id;

    public CuerpoFormalListAuxUnoAST(TypeAST typeas, String id) {
        this.typeas = typeas;
        this.id = id;
    }
    
    
    
    @Override
     public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoFormalListAuxUnoAST(this, arg);
    }
}
