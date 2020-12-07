/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.PersistenciaJPA;
import model.InscricaoEvento;

/**
 *
 * @author Andre Teixeira
 */
public class ControlInscricaoEvento extends ControlBase{
    @Override
    public void inicializaControle() {
        DAO = new PersistenciaJPA(InscricaoEvento.class);
        MODELO = new InscricaoEvento();
    }
}
