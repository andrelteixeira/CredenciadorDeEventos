package control;

import dao.PersistenciaJPA;
import java.util.List;
import model.ObjetoBase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author andre
 */
public abstract class ControlBase {

    protected PersistenciaJPA DAO;
    protected ObjetoBase MODELO;

    public ControlBase() {
        inicializaControle();
    }

    public abstract void inicializaControle();

    public void salvar(String dados[]) {
        MODELO.toObjeto(dados);
        DAO.salvar(MODELO);
        
    }

    public void excluir(int chave) {
        DAO.remover(chave);
    }

    public String[] recuperar(int chave) {
        return DAO.recuperar(chave).toStringVetor();
    }

    public String[] recuperarLogin(String login) {
        ObjetoBase base = DAO.recuperarLogin(login);
        return base.toStringVetor();
    }

    public String[][] recuperar() {
        String[] temp;

        List<ObjetoBase> lista = DAO.recupertodos();
        String[][] vetor = new String[lista.size()][MODELO.qtdAtrib()];

        for (int i = 0; i < lista.size(); i++) {
            MODELO = lista.get(i);
            temp = MODELO.toStringVetor();
            for (int j = 0; j < temp.length; j++) {
                vetor[i][j] = temp[j];
            }
        }
        return vetor;
    }

    public String[][] recuperar(String busca) {
        String[] temp;

        List<ObjetoBase> lista = DAO.recuperarCodigoENome(busca);
        String[][] vetor = new String[lista.size()][MODELO.qtdAtrib()];

        for (int i = 0; i < lista.size(); i++) {
            MODELO = lista.get(i);
            temp = MODELO.toStringVetor();
            for (int j = 0; j < temp.length; j++) {
                vetor[i][j] = temp[j];
            }
        }
        return vetor;
    }
    
    public void importaJson(String Json, String classe) {
        DAO.importaJson(Json, classe);
    }

    public String exportaJson() {
        return DAO.exportaJson();
    }
}
