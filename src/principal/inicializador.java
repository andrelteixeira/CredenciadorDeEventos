/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import control.ControlEvento;
import control.ControlPessoa;
import control.ControlUsuario;
import dao.FabricaJPA;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import facade.Criptografia;

/**
 *
 * @author Andre Teixeira
 */
public class inicializador {

    public static void inicializar() throws InterruptedException, NoSuchAlgorithmException, UnsupportedEncodingException, SQLException {
// # # # # # # # # # # Script de criação # # # # # # # # # # //

        FabricaJPA.getManager();
        //user master
        String[] usuario1 = new String[6];
        usuario1[0] = "0";
        usuario1[1] = "master";
        usuario1[2] = "master";
        usuario1[3] = Criptografia.criptografa("master");
        usuario1[4] = "true";
        usuario1[5] = "2020-11-21 00:00:00";
        ControlUsuario controlUsuario1 = new ControlUsuario();
        controlUsuario1.salvar(usuario1);

        //user comum
        String[] usuario2 = new String[6];
        usuario2[0] = "0";
        usuario2[1] = "comum";
        usuario2[2] = "comum";
        usuario2[3] = Criptografia.criptografa("comum");
        usuario2[4] = "false";
        usuario2[5] = "2020-11-21 00:00:00";
        ControlUsuario controlUsuario2 = new ControlUsuario();
        controlUsuario2.salvar(usuario2);

        //evento teste 
        String[] evento1 = new String[9];
        evento1[0] = "0";
        evento1[1] = "Prova do Saulo";
        evento1[2] = "Prova de lab 3";
        evento1[3] = "30";
        evento1[4] = "Virtual";
        evento1[5] = "Ubá";
        evento1[6] = "2020-11-21 00:00:00";
        evento1[7] = "2020-11-21 00:00:00";
        evento1[8] = "2020-11-21 00:00:00";
        ControlEvento controlEvent2 = new ControlEvento();
        controlEvent2.salvar(evento1);

        //evento teste 
        String[] evento2 = new String[9];
        evento2[0] = "0";
        evento2[1] = "Apresentação de monografia";
        evento2[2] = "apresentação";
        evento2[3] = "10";
        evento2[4] = "rua a";
        evento2[5] = "Ubá";
        evento2[6] = "2020-11-21 00:00:00";
        evento2[7] = "2020-11-21 00:00:00";
        evento2[8] = "2020-11-21 00:00:00";
        ControlEvento controlEvent1 = new ControlEvento();
        controlEvent1.salvar(evento2);

        //pessoa para teste 1
        Thread.sleep(1000);
        String[] pessoa1 = new String[10];
        pessoa1[0] = "0";
        pessoa1[1] = "Andre";
        pessoa1[2] = "98458731037";
        pessoa1[3] = "483644626";
        pessoa1[4] = "Rua a";
        pessoa1[5] = "uba";
        pessoa1[6] = "60471538174";
        pessoa1[7] = "andre@andre.com";
        DateFormat dateFormat1 = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date1 = new Date();
        pessoa1[8] = dateFormat1.format(date1);
        pessoa1[9] = "2020-11-21 00:00:00";
        ControlPessoa controlPessoa1 = new ControlPessoa();
        controlPessoa1.salvar(pessoa1);

        //pessoa para teste 2
        Thread.sleep(1000);
        String[] pessoa2 = new String[10];
        pessoa2[0] = "0";
        pessoa2[1] = "Saulo";
        pessoa2[2] = "25565393051";
        pessoa2[3] = "157573394";
        pessoa2[4] = "Rua b";
        pessoa2[5] = "uba";
        pessoa2[6] = "26160832750";
        pessoa2[7] = "saulo@saulo.com";
        DateFormat dateFormat2 = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date2 = new Date();
        pessoa2[8] = dateFormat2.format(date2);
        pessoa2[9] = "2020-11-21 00:00:00";
        ControlPessoa controlPessoa2 = new ControlPessoa();
        controlPessoa2.salvar(pessoa2);

        //pessoa para teste 3
        Thread.sleep(1000);
        String[] pessoa3 = new String[10];
        pessoa3[0] = "0";
        pessoa3[1] = "Geraldo";
        pessoa3[2] = "01843420074";
        pessoa3[3] = "241081968";
        pessoa3[4] = "Rua b";
        pessoa3[5] = "uba";
        pessoa3[6] = "53450511281";
        pessoa3[7] = "geraldo@geraldo.com";
        DateFormat dateFormat3 = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date3 = new Date();
        pessoa3[8] = dateFormat3.format(date3);
        pessoa3[9] = "2020-11-21 00:00:00";
        ControlPessoa controlPessoa3 = new ControlPessoa();
        controlPessoa3.salvar(pessoa3);

        FabricaJPA.fechaFabrica();
    }
}
