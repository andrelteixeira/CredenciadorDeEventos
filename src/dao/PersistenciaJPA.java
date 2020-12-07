/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.util.List;
import model.ObjetoBase;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author andre
 * @param <T>
 */
public class PersistenciaJPA<T extends ObjetoBase> {

    private final Class<T> classePersistente;

    public PersistenciaJPA(Class<T> classePersistente) {
        this.classePersistente = classePersistente;
    }

    public void salvar(T obj) {
        if (obj.getCodigo() > 0) {
            FuncoesJPA.fundir(obj);
        } else {
            FuncoesJPA.persistir(obj);
        }
    }

    public void remover(int chave) {
        FuncoesJPA.excluir(chave, classePersistente);
    }

    public T recuperar(int chave) {
        Object obj = FuncoesJPA.recuperar(chave, classePersistente);
        return (T) obj;
    }

    public T recuperarLogin(String chave) {
        String where = "where login like \'" + chave + "\'";
        List<?> obj = FuncoesJPA.selecionar(classePersistente, where);
        return (T) obj.get(0);
    }

    public List<T> recuperar(String chave, String tipo) {
        String where = "";
        if (tipo.equals("evento")) {
            where = "where evento_codigo like \'" + chave + "\'";
        } else if (tipo.equals("pessoa")) {
            where = "where pessoa_codigo like \'" + chave + "\'";
        }

        List<?> lista = FuncoesJPA.selecionar(classePersistente, where);
        return (List<T>) lista;
    }

    public List<T> recuperarCodigoENome(String chave) {
        String where = "";
        where = "where codigo like \'%" + chave + "%\' or nome like \'%" + chave + "%\'" ;
        List<?> lista = FuncoesJPA.selecionar(classePersistente, where);
        return (List<T>) lista;
    }
    
    public List<T> recupertodos() {
        return (List<T>) FuncoesJPA.selecionar(classePersistente);
    }

    public String exportaJson() {
        Gson gson = new Gson();
        List<T> dados = recupertodos();
        return gson.toJson(dados);
    }

    public void importaJson(String Json, String nomeClasse) {
        Gson gson = new Gson();
        try {
            final Class<?> classe = Class.forName(nomeClasse);
            JSONArray jSONArray = new JSONArray(Json);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject json = jSONArray.getJSONObject(i);
                ObjetoBase objBase = (ObjetoBase) gson.fromJson(json.toString(), classe);
                salvar((T) objBase);
            }
        } catch (JsonSyntaxException | ClassNotFoundException | JSONException e) {
            System.out.println(e.getMessage());
        }
    }
}
