/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author andre
 */
public class FabricaJPA {

    private static EntityManagerFactory fabrica;
    private static final String PERSISTENCIA = "CredenciadorDeEventosPU";
    
    private FabricaJPA(){
        fabrica = Persistence.createEntityManagerFactory(PERSISTENCIA);
    }
    
    public static EntityManager getManager(){
        try {
            if (fabrica == null) {
                FabricaJPA cnxAberta = new FabricaJPA();
                System.out.println("Conexão Aberta");
            }
            return fabrica.createEntityManager();
        } catch (Exception e) {
            System.out.println("Erro ao abrir conexão: "+e.getMessage());
            return null;
        }
    }
    
    public static void fechaFabrica(){
        fabrica.close();
    }
}
