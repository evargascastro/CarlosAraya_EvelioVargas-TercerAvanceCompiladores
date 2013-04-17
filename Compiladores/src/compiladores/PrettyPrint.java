/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladores;
import AST.*;
import javax.swing.tree.DefaultMutableTreeNode;
/**
 *
 * @author Carlos
 */
public class PrettyPrint implements Visitor{
 
    public void imprimir(AST raiz)
  {
    raiz.visit(this,new Integer(0));
  }
    
    @Override
    public Object visitCuerpoProgramAST(CuerpoProgramAST c, Object arg) {
     DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
     if (c.p1!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.p1.getClass().getName());
            raiz.add(hijo);
            c.p1.visit(this, hijo);
        }
     if (c.p2!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.p2.getClass().getName());
            raiz.add(hijo);
            c.p2.visit(this, hijo);
        }
     if (c.m1!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.m1.getClass().getName());
            raiz.add(hijo);
            c.m1.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoVariasImportDeclAST(CuerpoVariasImportDeclAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
         if (c.vimp!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.vimp.getClass().getName());
            raiz.add(hijo);
            c.vimp.visit(this, hijo);
        }
         if (c.imp!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.imp.getClass().getName());
            raiz.add(hijo);
            c.imp.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoVariasClassDeclAST(CuerpoVariasClassDeclAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
         if (c.vclas!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.vclas.getClass().getName());
            raiz.add(hijo);
            c.vclas.visit(this, hijo);
        }
         if (c.clas!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.clas.getClass().getName());
            raiz.add(hijo);
            c.clas.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoImportDeclAST(CuerpoImportDeclAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
         if (c.tname!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.tname.getClass().getName());
            raiz.add(hijo);
            c.tname.visit(this, hijo);
        }
         if (c.idecl!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.idecl.getClass().getName());
            raiz.add(hijo);
            c.idecl.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoImportDeclAuxAST(CuerpoImportDeclAuxAST c, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
        if (c.id!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.id.getClass().getName());
            raiz.add(hijo);
            hijo.add(new DefaultMutableTreeNode(c.id.toString()));
        }
     return null;
    }

    @Override
    public Object visitCuerpoUnTypeNameAST(CuerpoUnTypeNameAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
         if (c.ide!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ide.getClass().getName());
            raiz.add(hijo);
            hijo.add(new DefaultMutableTreeNode(c.ide.toString()));
        }
     return null;
    }

    @Override
    public Object visitCuerpoVariasTypeNameAST(CuerpoVariasTypeNameAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
         if (c.tname!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.tname.getClass().getName());
            raiz.add(hijo);
            c.tname.visit(this, hijo);
        }
         if (c.ide!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ide.getClass().getName());
            raiz.add(hijo);
            hijo.add(new DefaultMutableTreeNode(c.ide.toString()));
        }
     return null;
    }

    @Override
    public Object visitCuerpoMainClassAST(CuerpoMainClassAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
          if (c.ide!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ide.getClass().getName());
            raiz.add(hijo);
             hijo.add(new DefaultMutableTreeNode(c.ide.toString()));
        }
           if (c.ide1!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ide1.getClass().getName());
            raiz.add(hijo);
            hijo.add(new DefaultMutableTreeNode(c.ide.toString()));
        }
           if (c.statem!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.statem.getClass().getName());
            raiz.add(hijo);
            c.statem.visit(this, hijo);
        }
           
     return null;
    }

    @Override
    public Object visitCuerpoClassDeclAST(CuerpoClassDeclAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
         if (c.ide!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ide.getClass().getName());
            raiz.add(hijo);
             hijo.add(new DefaultMutableTreeNode(c.ide.toString()));
        }
           if (c.clasdecl!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.clasdecl.getClass().getName());
            raiz.add(hijo);
            c.clasdecl.visit(this, hijo);
        }
             if (c.bodydecl!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.bodydecl.getClass().getName());
            raiz.add(hijo);
            c.bodydecl.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoExtendsClassDeclAuxAST(CuerpoExtendsClassDeclAuxAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
             if (c.ide!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ide.getClass().getName());
            raiz.add(hijo);
            hijo.add(new DefaultMutableTreeNode(c.ide.toString()));
        }
             
     return null;
    }

    @Override
    public Object visitCuerpoImplementsClassDeclAuxAST(CuerpoImplementsClassDeclAuxAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
              if (c.ide!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ide.getClass().getName());
            raiz.add(hijo);
            hijo.add(new DefaultMutableTreeNode(c.ide.toString()));
        }
     return null;
    }

    @Override
    public Object visitCuerpoBodyDeclVarDeclAST(CuerpoBodyDeclVarDeclAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
              if (c.bodydecl!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.bodydecl.getClass().getName());
            raiz.add(hijo);
            c.bodydecl.visit(this, hijo);
        }
             if (c.vardecl!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.vardecl.getClass().getName());
            raiz.add(hijo);
            c.vardecl.visit(this, hijo);
        }      
     return null;
    }

    @Override
    public Object visitCuerpoBodyDeclMethodDeclAST(CuerpoBodyDeclMethodDeclAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
              if (c.bodydecl!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.bodydecl.getClass().getName());
            raiz.add(hijo);
            c.bodydecl.visit(this, hijo);
        }
             if (c.methoddecl!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.methoddecl.getClass().getName());
            raiz.add(hijo);
            c.methoddecl.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoBodyDeclClassDeclAST(CuerpoBodyDeclClassDeclAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
             if (c.bodydecl!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.bodydecl.getClass().getName());
            raiz.add(hijo);
            c.bodydecl.visit(this, hijo);
        }
             if (c.clasdecl!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.clasdecl.getClass().getName());
            raiz.add(hijo);
            c.clasdecl.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoVarDeclAST(CuerpoVarDeclAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
              if (c.typea!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.typea.getClass().getName());
            raiz.add(hijo);
            c.typea.visit(this, hijo);
        }
             if (c.ide!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ide.getClass().getName());
            raiz.add(hijo);
             hijo.add(new DefaultMutableTreeNode(c.ide.toString()));
        }
     return null;
    }

    @Override
    public Object visitCuerpoMethodDeclAST(CuerpoMethodDeclAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
               if (c.consormethod!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.consormethod.getClass().getName());
            raiz.add(hijo);
            c.consormethod.visit(this, hijo);
        }
                if (c.formalist!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.formalist.getClass().getName());
            raiz.add(hijo);
            c.formalist.visit(this, hijo);
        }
                 if (c.methodaux!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.methodaux.getClass().getName());
            raiz.add(hijo);
            c.methodaux.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoConstrDeclorMethodDeclConstrDeclAST(CuerpoConstrDeclorMethodDeclConstrDeclAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
               if (c.ide!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ide.getClass().getName());
            raiz.add(hijo);
           hijo.add(new DefaultMutableTreeNode(c.ide.toString()));
        }
     return null;
    }

    @Override
    public Object visitCuerpoConstrDeclorMethodDeclMethodDeclAST(CuerpoConstrDeclorMethodDeclMethodDeclAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
              if (c.methodaux!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.methodaux.getClass().getName());
            raiz.add(hijo);
            c.methodaux.visit(this, hijo);
        }
                if (c.ide!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ide.getClass().getName());
            raiz.add(hijo);
           hijo.add(new DefaultMutableTreeNode(c.ide.toString()));
        }
     return null;
    }

    @Override
    public Object visitCuerpoVariasVarDeclAST(CuerpoVariasVarDeclAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
               if (c.vvardecl!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.vvardecl.getClass().getName());
            raiz.add(hijo);
            c.vvardecl.visit(this, hijo);
        }
               if (c.vardecl!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.vardecl.getClass().getName());
            raiz.add(hijo);
            c.vardecl.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoVariasStatementunoAST(CuerpoVariasStatementunoAST c, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
              if (c.statem!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.statem.getClass().getName());
            raiz.add(hijo);
            c.statem.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoVariasStatementVariasAST(CuerpoVariasStatementVariasAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
               if (c.vstatem!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.vstatem.getClass().getName());
            raiz.add(hijo);
            c.vstatem.visit(this, hijo);
        }
             if (c.statem!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.statem.getClass().getName());
            raiz.add(hijo);
            c.statem.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoMethodDeclAuxAST(CuerpoMethodDeclAuxAST c, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
              if (c.typeas!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.typeas.getClass().getName());
            raiz.add(hijo);
            c.typeas.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoMethodDeclAuxUnoAST(CuerpoMethodDeclAuxUnoAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
               if (c.vvardecl!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.vvardecl.getClass().getName());
            raiz.add(hijo);
            c.vvardecl.visit(this, hijo);
        }
              if (c.vstatem!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.vstatem.getClass().getName());
            raiz.add(hijo);
            c.vstatem.visit(this, hijo);
        }
                if (c.mdecl!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.mdecl.getClass().getName());
            raiz.add(hijo);
            c.mdecl.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoMethodDeclAuxDosAST(CuerpoMethodDeclAuxDosAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
               if (c.expa!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.expa.getClass().getName());
            raiz.add(hijo);
            c.expa.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoFormalListAST(CuerpoFormalListAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
               if (c.formallist!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.formallist.getClass().getName());
            raiz.add(hijo);
            c.formallist.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoFormalListAuxUnoAST(CuerpoFormalListAuxUnoAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
               if (c.typeas!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.typeas.getClass().getName());
            raiz.add(hijo);
            c.typeas.visit(this, hijo);
        }
                if (c.id!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.id.getClass().getName());
            raiz.add(hijo);
           hijo.add(new DefaultMutableTreeNode(c.id.toString()));
        }
     return null;
    }

    @Override
    public Object visitCuerpoFormalListAuxVariosAST(CuerpoFormalListAuxVariosAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
               if (c.formalaux!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.formalaux.getClass().getName());
            raiz.add(hijo);
            c.formalaux.visit(this, hijo);
        }
               if (c.typea!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.typea.getClass().getName());
            raiz.add(hijo);
            c.typea.visit(this, hijo);
        }
             if (c.id!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.id.getClass().getName());
            raiz.add(hijo);
           hijo.add(new DefaultMutableTreeNode(c.id.toString()));
        }
     return null;
    }

    @Override
    public Object visitCuerpoTypeAST(CuerpoTypeAST c, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
                if (c.id!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.id.getClass().getName());
            raiz.add(hijo);
           hijo.add(new DefaultMutableTreeNode(c.id.toString()));
        }
     return null;
    }

    @Override
    public Object visitCuerpoStatementVariasAST(CuerpoStatementVariasAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
         if (c.vstatem!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.vstatem.getClass().getName());
            raiz.add(hijo);
            c.vstatem.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoStatementIfAST(CuerpoStatementIfAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
         if (c.expas!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.expas.getClass().getName());
            raiz.add(hijo);
            c.expas.visit(this, hijo);
        }
         if (c.statemas!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.statemas.getClass().getName());
            raiz.add(hijo);
            c.statemas.visit(this, hijo);
        }
         if (c.ifaux!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ifaux.getClass().getName());
            raiz.add(hijo);
            c.ifaux.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoStatementWhileAST(CuerpoStatementWhileAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
         if (c.exps!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.exps.getClass().getName());
            raiz.add(hijo);
            c.exps.visit(this, hijo);
        }
         if (c.statem!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.statem.getClass().getName());
            raiz.add(hijo);
            c.statem.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoStatementSystemOutAST(CuerpoStatementSystemOutAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
         if (c.espa!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.espa.getClass().getName());
            raiz.add(hijo);
            c.espa.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoStatementSystemExitAST(CuerpoStatementSystemExitAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
         if (c.num!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.num.getClass().getName());
            raiz.add(hijo);
           hijo.add(new DefaultMutableTreeNode(c.num.toString()));
        }
     return null;
    }

    @Override
    public Object visitCuerpoStatementIdAST(CuerpoStatementIdAST c, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
       if (c.id!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.id.getClass().getName());
            raiz.add(hijo);
           hijo.add(new DefaultMutableTreeNode(c.id.toString()));
        }
       if (c.idaux!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.idaux.getClass().getName());
            raiz.add(hijo);
            c.idaux.visit(this, hijo);
        }
       if (c.systemaux!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.systemaux.getClass().getName());
            raiz.add(hijo);
            c.systemaux.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoStatementThisAST(CuerpoStatementThisAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
         if (c.thisaux!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.thisaux.getClass().getName());
            raiz.add(hijo);
            c.thisaux.visit(this, hijo);
        }
         if (c.id!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.id.getClass().getName());
            raiz.add(hijo);
           hijo.add(new DefaultMutableTreeNode(c.id.toString()));
        }
         if (c.explist!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.explist.getClass().getName());
            raiz.add(hijo);
            c.explist.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoIfAuxAST(CuerpoIfAuxAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
         if (c.statea!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.statea.getClass().getName());
            raiz.add(hijo);
            c.statea.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoUnExpListAST(CuerpoUnExpListAST c, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
        if (c.ex!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ex.getClass().getName());
            raiz.add(hijo);
            c.ex.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoVariasExpListAST(CuerpoVariasExpListAST c, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
        if (c.expli!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.expli.getClass().getName());
            raiz.add(hijo);
            c.expli.visit(this, hijo);
        }
        if (c.ex!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ex.getClass().getName());
            raiz.add(hijo);
            c.ex.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoExpSimplNumAST(CuerpoExpSimplNumAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
         if (c.num!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.num.getClass().getName());
            raiz.add(hijo);
           hijo.add(new DefaultMutableTreeNode(c.num.toString()));
        }
     return null;
    }

    @Override
    public Object visitCuerpoExpSimplTypeAST(CuerpoExpSimplTypeAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
        if (c.ty!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ty.getClass().getName());
            raiz.add(hijo);
            c.ty.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoExpSimplExp1AST(CuerpoExpSimplExp1AST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
         if (c.ex!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ex.getClass().getName());
            raiz.add(hijo);
            c.ex.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoExpSimplIdAST(CuerpoExpSimplIdAST c, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
        if (c.ide!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ide.getClass().getName());
            raiz.add(hijo);
           hijo.add(new DefaultMutableTreeNode(c.ide.toString()));
        }
        if (c.explist!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.explist.getClass().getName());
            raiz.add(hijo);
            c.explist.visit(this, hijo);
        }
     return null;
    }

   

    @Override
    public Object visitCuerpoExpSimplExp2AST(CuerpoExpSimplExp2AST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
       if (c.ex!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ex.getClass().getName());
            raiz.add(hijo);
            c.ex.visit(this, hijo);
        }  
     return null;
    }

    @Override
    public Object visitCuerpoExpSimplExp3AST(CuerpoExpSimplExp3AST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
        if (c.ex!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ex.getClass().getName());
            raiz.add(hijo);
            c.ex.visit(this, hijo);
        } 
     return null;
    }

    @Override
    public Object visitCuerpoExpSimplString_ConsAST(CuerpoExpSimplString_ConsAST c, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
        if (c.str_cons!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.str_cons.getClass().getName());
            raiz.add(hijo);
           hijo.add(new DefaultMutableTreeNode(c.str_cons.toString()));
        }
     return null;
    }

    @Override
    public Object visitCuerpoExpExpSimplAST(CuerpoExpExpSimplAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
       if (c.ex_si!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ex_si.getClass().getName());
            raiz.add(hijo);
            c.ex_si.visit(this, hijo);
        }   
     return null;
    }

    @Override
    public Object visitCuerpoExpExp1AST(CuerpoExpExp1AST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
         if (c.ex!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ex.getClass().getName());
            raiz.add(hijo);
            c.ex.visit(this, hijo);
        } 
         if (c.ex1!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ex1.getClass().getName());
            raiz.add(hijo);
            c.ex1.visit(this, hijo);
        } 
     return null;
    }

    @Override
    public Object visitCuerpoExpExp2AST(CuerpoExpExp2AST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
         if (c.ex!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ex.getClass().getName());
            raiz.add(hijo);
            c.ex.visit(this, hijo);
        } 
         if (c.ex1!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ex1.getClass().getName());
            raiz.add(hijo);
            c.ex1.visit(this, hijo);
        } 
     return null;
    }

    @Override
    public Object visitCuerpoExpExp3AST(CuerpoExpExp3AST c, Object arg) {
      DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
      if (c.ex!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ex.getClass().getName());
            raiz.add(hijo);
            c.ex.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoExpExp4AST(CuerpoExpExp4AST c, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
        if (c.ex!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ex.getClass().getName());
            raiz.add(hijo);
            c.ex.visit(this, hijo);
        }
        if (c.ide!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ide.getClass().getName());
            raiz.add(hijo);
           hijo.add(new DefaultMutableTreeNode(c.ide.toString()));
        }
        if (c.explist!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.explist.getClass().getName());
            raiz.add(hijo);
            c.explist.visit(this, hijo);
        }
     return null;
    }

 


    @Override
    public Object visitCuerpoThisAuxIdAST(CuerpoThisAuxIdAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
         if (c.ide!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ide.getClass().getName());
            raiz.add(hijo);
           hijo.add(new DefaultMutableTreeNode(c.ide.toString()));
        }
     return null;
    }

    @Override
    public Object visitCuerpoSystemAuxExpAST(CuerpoSystemAuxExpAST c, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
        if (c.ex!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ex.getClass().getName());
            raiz.add(hijo);
            c.ex.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoSystemAuxTypeAST(CuerpoSystemAuxTypeAST c, Object arg) {
         DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
         if (c.ty!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ty.getClass().getName());
            raiz.add(hijo);
            c.ty.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitCuerpoIdAuxExpAST(CuerpoIdAuxExpAST c, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg;
        if (c.ex!=null)
        {
            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.ex.getClass().getName());
            raiz.add(hijo);
            c.ex.visit(this, hijo);
        }
     return null;
    }

    @Override
    public Object visitProgramAST(ProgramAST c, Object arg) {
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)arg; 

            DefaultMutableTreeNode hijo =  new DefaultMutableTreeNode(c.getClass().getName());
            raiz.add(hijo);
            c.visit(this, hijo);
            
        return null;
    }



  
}
