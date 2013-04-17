/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Evelio VC
 */
public interface Visitor {
    
    public Object visitProgramAST(ProgramAST c, Object arg);
    public Object visitCuerpoProgramAST( CuerpoProgramAST c, Object arg);
    public Object visitCuerpoVariasImportDeclAST(CuerpoVariasImportDeclAST c, Object arg);
    public Object visitCuerpoVariasClassDeclAST(CuerpoVariasClassDeclAST c, Object arg);
    public Object visitCuerpoImportDeclAST(CuerpoImportDeclAST c, Object arg);
    public Object visitCuerpoImportDeclAuxAST(CuerpoImportDeclAuxAST c, Object arg);
    public Object visitCuerpoUnTypeNameAST(CuerpoUnTypeNameAST c, Object arg);
    public Object visitCuerpoVariasTypeNameAST(CuerpoVariasTypeNameAST c, Object arg);
    public Object visitCuerpoMainClassAST(CuerpoMainClassAST c, Object arg);
    public Object visitCuerpoClassDeclAST(CuerpoClassDeclAST c, Object arg);
    public Object visitCuerpoExtendsClassDeclAuxAST(CuerpoExtendsClassDeclAuxAST c, Object arg);
    public Object visitCuerpoImplementsClassDeclAuxAST(CuerpoImplementsClassDeclAuxAST c, Object arg);
    public Object visitCuerpoBodyDeclVarDeclAST(CuerpoBodyDeclVarDeclAST c, Object arg);
    public Object visitCuerpoBodyDeclMethodDeclAST(CuerpoBodyDeclMethodDeclAST c, Object arg);
    public Object visitCuerpoBodyDeclClassDeclAST(CuerpoBodyDeclClassDeclAST c, Object arg);
    public Object visitCuerpoVarDeclAST(CuerpoVarDeclAST c, Object arg);
    public Object visitCuerpoMethodDeclAST(CuerpoMethodDeclAST c, Object arg);
    public Object visitCuerpoConstrDeclorMethodDeclConstrDeclAST(CuerpoConstrDeclorMethodDeclConstrDeclAST c, Object arg);
    public Object visitCuerpoConstrDeclorMethodDeclMethodDeclAST(CuerpoConstrDeclorMethodDeclMethodDeclAST c, Object arg);
    public Object visitCuerpoVariasVarDeclAST(CuerpoVariasVarDeclAST c, Object arg);
    public Object visitCuerpoVariasStatementunoAST(CuerpoVariasStatementunoAST c, Object arg);
    public Object visitCuerpoVariasStatementVariasAST(CuerpoVariasStatementVariasAST c, Object arg);
    public Object visitCuerpoMethodDeclAuxAST(CuerpoMethodDeclAuxAST c, Object arg);
    public Object visitCuerpoMethodDeclAuxUnoAST(CuerpoMethodDeclAuxUnoAST c, Object arg);
    public Object visitCuerpoMethodDeclAuxDosAST(CuerpoMethodDeclAuxDosAST c, Object arg);
    public Object visitCuerpoFormalListAST(CuerpoFormalListAST c, Object arg);
    public Object visitCuerpoFormalListAuxUnoAST(CuerpoFormalListAuxUnoAST c, Object arg);
    public Object visitCuerpoFormalListAuxVariosAST(CuerpoFormalListAuxVariosAST c, Object arg);
    public Object visitCuerpoTypeAST(CuerpoTypeAST c, Object arg);
    public Object visitCuerpoStatementVariasAST(CuerpoStatementVariasAST c, Object arg);
    public Object visitCuerpoStatementIfAST(CuerpoStatementIfAST c, Object arg);
    public Object visitCuerpoStatementWhileAST(CuerpoStatementWhileAST c, Object arg);
    public Object visitCuerpoStatementSystemOutAST(CuerpoStatementSystemOutAST c, Object arg);
    public Object visitCuerpoStatementSystemExitAST(CuerpoStatementSystemExitAST c, Object arg);
    public Object visitCuerpoStatementIdAST(CuerpoStatementIdAST c, Object arg);
    public Object visitCuerpoStatementThisAST(CuerpoStatementThisAST c, Object arg);
    public Object visitCuerpoIfAuxAST(CuerpoIfAuxAST c, Object arg);
    

    
    public Object visitCuerpoUnExpListAST(CuerpoUnExpListAST c, Object arg);
public Object visitCuerpoVariasExpListAST(CuerpoVariasExpListAST c, Object arg);
public Object visitCuerpoExpSimplNumAST(CuerpoExpSimplNumAST c, Object arg);
public Object visitCuerpoExpSimplTypeAST(CuerpoExpSimplTypeAST c, Object arg);
public Object visitCuerpoExpSimplExp1AST(CuerpoExpSimplExp1AST c, Object arg);
public Object visitCuerpoExpSimplIdAST(CuerpoExpSimplIdAST c, Object arg);

public Object visitCuerpoExpSimplExp2AST(CuerpoExpSimplExp2AST c, Object arg);
public Object visitCuerpoExpSimplExp3AST(CuerpoExpSimplExp3AST c, Object arg);
public Object visitCuerpoExpSimplString_ConsAST(CuerpoExpSimplString_ConsAST c, Object arg);
public Object visitCuerpoExpExpSimplAST(CuerpoExpExpSimplAST c, Object arg);
public Object visitCuerpoExpExp1AST(CuerpoExpExp1AST c, Object arg);
public Object visitCuerpoExpExp2AST(CuerpoExpExp2AST c, Object arg);
public Object visitCuerpoExpExp3AST(CuerpoExpExp3AST c, Object arg);
public Object visitCuerpoExpExp4AST(CuerpoExpExp4AST c, Object arg);


public Object visitCuerpoThisAuxIdAST(CuerpoThisAuxIdAST c, Object arg);
public Object visitCuerpoSystemAuxExpAST(CuerpoSystemAuxExpAST c, Object arg);
public Object visitCuerpoSystemAuxTypeAST(CuerpoSystemAuxTypeAST c, Object arg);
public Object visitCuerpoIdAuxExpAST(CuerpoIdAuxExpAST c, Object arg);
            
}
