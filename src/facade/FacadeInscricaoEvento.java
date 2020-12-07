/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import control.ControlEvento;
import control.ControlInscricaoEvento;
import control.ControlPessoa;
import control.ControlUsuario;

/**
 *
 * @author Andre Teixeira
 */
public class FacadeInscricaoEvento {
    private String[] vctEvento;
    private String[] vctPessoa;
    private String[] vctUsuario;
    
    
    public void incluirInscricao(String idEvento, String idPessoa, String idUsuario){
        ControlEvento ctrlEvento = new ControlEvento();
        ControlPessoa ctrlPessoa = new ControlPessoa();
        ControlUsuario ctrlUsuario = new ControlUsuario();
        ControlInscricaoEvento ctrlInscEv = new ControlInscricaoEvento();
        
        vctEvento = ctrlEvento.recuperar(Integer.parseInt(idEvento));
        vctPessoa = ctrlPessoa.recuperar(Integer.parseInt(idPessoa));
        vctUsuario = ctrlUsuario.recuperar(Integer.parseInt(idUsuario));
        
        
        
    }
    
}
