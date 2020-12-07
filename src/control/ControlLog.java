/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.PersistenciaJPA;
import model.Log;

/**
 *
 * @author Andre Teixeira
 */
public class ControlLog extends ControlBase{
    @Override
    public void inicializaControle() {
        DAO = new PersistenciaJPA(Log.class);
        MODELO = new Log();
    }
}
