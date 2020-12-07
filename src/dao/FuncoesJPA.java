/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author andre
 */
public class FuncoesJPA {
    public static EntityManager abrirConexao(){
        EntityManager gerente = FabricaJPA.getManager();
        gerente.getTransaction().begin();
        
        return gerente;
    }
    
    public static void fecharConexao(EntityManager gerente, boolean bCommit){
        if (bCommit) {
            gerente.getTransaction().commit();
        } else {
            gerente.getTransaction().rollback();
        }
        
        gerente.close();
    }
    
    public static void persistir(Object obj){
        EntityManager trans = abrirConexao();
        trans.persist(obj);
        fecharConexao(trans, true);
    }
    
    public static void fundir(Object obj){
        EntityManager trans = abrirConexao();
        trans.merge(obj);
        fecharConexao(trans, true); 
    }
    
    public static void excluir(int chave, Class classe) {
        EntityManager trans = abrirConexao();
        Object obj = trans.find(classe, chave);
        trans.remove(obj);
        fecharConexao(trans, true);
    }
    
    public static Object recuperar(int chave, Class classe) {
        EntityManager trans = abrirConexao();
        return trans.find(classe, chave);
    }
    
    public static Object recuperar(String chave, Class classe) {
        EntityManager trans = abrirConexao();
        return trans.find(classe, chave);
    }
    
    public static List<?> selecionar(Class classe, String where) {
        EntityManager trans = FabricaJPA.getManager();
        String query = "SELECT u FROM " + classe.getSimpleName() + " u " + where;
        Query minhaQuery = trans.createQuery(query);
        List<?> lista = minhaQuery.getResultList();
        return lista;
    }
    
    public static List<?> selecionar(Class classe, String[][] parameters) {
        String where = "";
        if (parameters.length > 0) {
            for (int i = 0; i < parameters.length; i++) {
                if (i == 0) 
                    where += " where ";
                else
                    where += " add ";
                
                String campo = parameters[i][0];
                String valor = parameters[i][1];
                
                where = where + campo + " = " + valor;
            }
        }
        return selecionar(classe, where);
    }
    
    public static List<?> selecionar(Class classe) {
        return selecionar(classe, "");
    }
}
