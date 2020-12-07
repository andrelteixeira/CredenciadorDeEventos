/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.PersistenciaJPA;
import model.Pessoa;

/**
 *
 * @author Andre Teixeira
 */
public class ControlPessoa extends ControlBase{
    @Override
    public void inicializaControle() {
        DAO = new PersistenciaJPA(Pessoa.class);
        MODELO = new Pessoa();
    }
}
