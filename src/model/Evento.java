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
public class Evento extends ObjetoBase implements Serializable {

    @OneToMany(mappedBy = "evento")
    private List<InscricaoEvento> inscricaoEventos;
    @Column(nullable = true)
    private String nome;
    private String descricao;
    @Column(nullable = true)
    private int capacidade;
    private String endereco;
    private String cidade;
    @Column(nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Calendar dtInicio;
    @Column(nullable = true)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Calendar dtFim;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Calendar dtCriacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Calendar getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(Calendar dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setDtInicio(String dtInicio) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(dtInicio));
        this.dtInicio = cal;
    }

    public Calendar getDtFim() {
        return dtFim;
    }

    public void setDtFim(Calendar dtFim) {
        this.dtFim = dtFim;
    }

    public void setDtFim(String dtFim) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(dtFim));
        this.dtFim = cal;
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
            setDescricao(dados[2]);
            setCapacidade(Integer.parseInt(dados[3]));
            setEndereco(dados[4]);
            setCidade(dados[5]);
            setDtInicio(dados[6]);
            setDtFim(dados[7]);
            setDtCriacao(dados[8]);
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
        dados[2] = getDescricao();
        dados[3] = String.valueOf(getCapacidade());
        dados[4] = getEndereco();
        dados[5] = getCidade();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dados[6] = sdf.format(getDtInicio().getTime());
        dados[7] = sdf.format(getDtFim().getTime());
        dados[8] = sdf.format(getDtCriacao().getTime());
        return dados;
    }

    @Override
    public int qtdAtrib() {
        return 1 + 8;
    }
}
