/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

/**
 *
 * @author Andre Teixeira
 */
public class Criptografia {

    public static String criptografa(String chave) throws NoSuchAlgorithmException, UnsupportedEncodingException, SQLException {
        MessageDigest algotimo;
        byte digest[];
        StringBuilder stringHexa;

        String hash;

        algotimo = MessageDigest.getInstance("MD5");
        digest = algotimo.digest(chave.getBytes("UTF-8"));

        stringHexa = new StringBuilder();
        for (byte b : digest) {
            stringHexa.append(String.format("%02X", 0xFF & b));
        }
        hash = stringHexa.toString();
        return hash;
    }
}
