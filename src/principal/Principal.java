/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dao.FabricaJPA;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import view.Login;

/**
 *
 * @author Andre Teixeira
 */
public class Principal {

    /**
     * @param args the command line arguments
     * @throws java.security.NoSuchAlgorithmException
     * @throws java.io.UnsupportedEncodingException
     * @throws java.sql.SQLException
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException, SQLException, InterruptedException {
//        inicializador.inicializar();
        Login tela = new Login();
        tela.setVisible(true);
        FabricaJPA.fechaFabrica();
    }
}
