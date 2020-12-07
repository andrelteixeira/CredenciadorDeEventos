/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.PersistenciaJPA;
import model.Usuario;

/**
 *
 * @author Andre Teixeira
 */
public class ControlUsuario extends ControlBase {

    @Override
    public void inicializaControle() {
        DAO = new PersistenciaJPA(Usuario.class);
        MODELO = new Usuario();
    }

    public String[] valida(String[] dados) {
        String[] usuario = recuperarLogin(dados[0]);
        String[] caracteristicas = new String[2];
        if (usuario[3].equals(dados[1])){
            caracteristicas[0] = usuario[0];
            caracteristicas[1] = usuario[4];
        }
        else{
            caracteristicas[0] = "";
            caracteristicas[1] = "";
        }
        return caracteristicas;
    }
}
