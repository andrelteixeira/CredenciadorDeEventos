/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author andre
 */
@MappedSuperclass
public abstract class ObjetoBase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public abstract ObjetoBase toObjeto(String[] dados);
    public abstract String[] toStringVetor();
    public abstract int qtdAtrib();
}
