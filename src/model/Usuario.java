/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Andre Teixeira
 */
@Entity
public class Usuario extends ObjetoBase implements Serializable {

    @OneToMany(mappedBy = "usuario")
    private List<InscricaoEvento> inscricaoEventos;
    @Column(nullable = true)
    private String nome;
    @Column(unique = true)
    private String login;
    private String senha;
    private boolean eadmin;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Calendar dtCriacao;
    @OneToMany(mappedBy = "usuario")
    private List<Log> logs;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isEadmin() {
        return eadmin;
    }

    public void setEadmin(boolean eadmin) {
        this.eadmin = eadmin;
    }

    public Calendar getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(Calendar dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    public void setDtCriacao(String dtCriacao) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(dtCriacao));
        this.dtCriacao = cal;
    }

    @Override
    public ObjetoBase toObjeto(String[] dados) {
        try {
            setCodigo(Integer.parseInt(dados[0]));
            setNome(dados[1]);
            setLogin(dados[2]);
            setSenha(dados[3]);
            setEadmin(Boolean.parseBoolean(dados[4]));
            setDtCriacao(dados[5]);
        } catch (ParseException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this;
    }

    @Override
    public String[] toStringVetor() {
        String[] dados = new String[qtdAtrib()];
        dados[0] = String.valueOf(getCodigo());
        dados[1] = getNome();
        dados[2] = getLogin();
        dados[3] = getSenha();
        dados[4] = String.valueOf(isEadmin());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dados[5] = sdf.format(dtCriacao.getTime());
        return dados;
    }

    @Override
    public int qtdAtrib() {
        return 1 + 5;
    }

}
