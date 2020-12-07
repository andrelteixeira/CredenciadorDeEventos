/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.PersistenciaJPA;
import model.Evento;

/**
 *
 * @author Andre Teixeira
 */
public class ControlEvento extends ControlBase{
    @Override
    public void inicializaControle() {
        DAO = new PersistenciaJPA(Evento.class);
        MODELO = new Evento();
    }

    
}
