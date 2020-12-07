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
public class Pessoa extends ObjetoBase implements Serializable {

    @OneToMany(mappedBy = "pessoa")
    private List<InscricaoEvento> inscricaoEventos;
    @Column(nullable = true)
    private String nome;
    @Column(unique = true, length = 11)
    private String cpf;
    @Column(unique = true)
    private String rg;
    private String endereco;
    private String cidade;
    @Column(length = 11)
    private String telefone;
    private String email;
    @Column(unique = true, length = 14)
    private String matricula;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Calendar dtCriacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setDtCriacao(String dtCriacao) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(dtCriacao));
        this.dtCriacao = cal;
    }

    public Calendar getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(Calendar dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    @Override
    public ObjetoBase toObjeto(String[] dados) {
        try {
            setCodigo(Integer.parseInt(dados[0]));
            setNome(dados[1]);
            setCpf(dados[2]);
            setRg(dados[3]);
            setEndereco(dados[4]);
            setCidade(dados[5]);
            setTelefone(dados[6]);
            setEmail(dados[7]);
            setMatricula(dados[8]);
            setDtCriacao(dados[9]);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this;
    }

    @Override
    public String[] toStringVetor() {
        String[] dados = new String[qtdAtrib()];
        dados[0] = String.valueOf(getCodigo());
        dados[1] = getNome();
        dados[2] = getCpf();
        dados[3] = getRg();
        dados[4] = getEndereco();
        dados[5] = getCidade();
        dados[6] = getTelefone();
        dados[7] = getEmail();
        dados[8] = getMatricula();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dados[9] = sdf.format(dtCriacao.getTime());
        return dados;
    }

    @Override
    public int qtdAtrib() {
        return 1 + 9;
    }

}
