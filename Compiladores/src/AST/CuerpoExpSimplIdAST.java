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
public class CuerpoExpSimplIdAST extends ExpSimplAST{
    public String ide;
    public ExpListAST explist;
    
    public CuerpoExpSimplIdAST(String a, ExpListAST b){
        ide = a;
        explist=b;
    }
    
    @Override
    public Object visit(Visitor v, Object arg) {
        return v.visitCuerpoExpSimplIdAST(this, arg);
    }
}
