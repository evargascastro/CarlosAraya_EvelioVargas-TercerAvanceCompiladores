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
public class CuerpoFormalListAuxVariosAST extends FormalListAuxAST{
    public FormalListAuxAST formalaux;
    public TypeAST typea;
    public String id;

    public CuerpoFormalListAuxVariosAST(FormalListAuxAST formalaux, TypeAST typea, String id) {
        this.formalaux = formalaux;
        this.typea = typea;
        this.id = id;
    }
    
    
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoFormalListAuxVariosAST(this, arg);
    }
}
