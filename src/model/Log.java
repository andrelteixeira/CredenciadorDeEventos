/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.PersistenciaJPA;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Andre Teixeira
 */
@Entity
public class Log extends ObjetoBase implements Serializable {

    @Column(nullable = true)
    private String acao;
    @Column(nullable = true)
    private String modelo;
    @Column(nullable = true)
    private String descricao;
    @ManyToOne
    private Usuario usuario;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Calendar dtCriacao;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setUsuario(String codUser) {
        PersistenciaJPA dao = new PersistenciaJPA(Usuario.class);
        this.usuario = (Usuario) dao.recuperar(Integer.parseInt(codUser));
    }
     
    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
            setAcao(dados[1]);
            setModelo(dados[2]);
            setDescricao(dados[3]);
            setUsuario(dados[4]);
            setDtCriacao(dados[5]);
        } catch (ParseException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this;
    }

    @Override
    public String[] toStringVetor() {
        String[] dados = new String[qtdAtrib()];
        dados[0] = String.valueOf(getCodigo());
        dados[1] = getAcao();
        dados[2] = getModelo();
        dados[3] = getDescricao();
        dados[4] = String.valueOf(getUsuario().getCodigo());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dados[5] = sdf.format(dtCriacao.getTime());
        return dados;
    }

    @Override
    public int qtdAtrib() {
        return 1 + 5;
    }

}
