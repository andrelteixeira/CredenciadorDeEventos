/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.ControlEvento;
import control.ControlPessoa;
import control.ControlUsuario;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Andre Teixeira
 */
@Entity
public class InscricaoEvento extends ObjetoBase implements Serializable {

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Calendar dtInscricao;
    @ManyToOne
    private Evento evento;
    @ManyToOne
    private Pessoa pessoa;
    @ManyToOne
    private Usuario usuario;
    private boolean presenca;

    public Calendar getDtInscricao() {
        return dtInscricao;
    }

    public void setDtInscricao(Calendar dtInscricao) {
        this.dtInscricao = dtInscricao;
    }

    public void setDtInscricao(String dtInscricao) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(dtInscricao));
        this.dtInscricao = cal;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public void setEvento(int chave) {
        ControlEvento ctrl = new ControlEvento();
        Evento model = new Evento();
        this.evento = (Evento) model.toObjeto(ctrl.recuperar(chave));
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setPessoa(int chave) {
        ControlPessoa ctrl = new ControlPessoa();
        Pessoa model = new Pessoa();
        this.pessoa = (Pessoa) model.toObjeto(ctrl.recuperar(chave));
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setUsuario(int chave) {
        ControlUsuario ctrl = new ControlUsuario();
        Usuario model = new Usuario();
        this.usuario = (Usuario) model.toObjeto(ctrl.recuperar(chave));
    }

    public boolean isPresenca() {
        return presenca;
    }

    public void setPresenca(boolean presenca) {
        this.presenca = presenca;
    }

    @Override
    public ObjetoBase toObjeto(String[] dados) {
        try {
            setCodigo(Integer.parseInt(dados[0]));
            setEvento(Integer.parseInt(dados[1]));
            setPessoa(Integer.parseInt(dados[2]));
            setUsuario(Integer.parseInt(dados[3]));
            setPresenca(Boolean.parseBoolean(dados[4]));
            setDtInscricao(dados[5]);
        } catch (ParseException ex) {
            Logger.getLogger(InscricaoEvento.class.getName()).log(Level.SEVERE, null, ex);
        }

        return this;
    }

    @Override
    public String[] toStringVetor() {
        String[] dados = new String[qtdAtrib()];
        dados[0] = String.valueOf(getCodigo());
        dados[1] = String.valueOf(getEvento().getCodigo());
        dados[2] = String.valueOf(getPessoa().getCodigo());
        dados[3] = String.valueOf(getUsuario().getCodigo());
        dados[4] = String.valueOf(isPresenca());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dados[5] = sdf.format(dtInscricao.getTime());
        return null;
    }

    @Override
    public int qtdAtrib() {
        return 1 + 5;
    }
}
