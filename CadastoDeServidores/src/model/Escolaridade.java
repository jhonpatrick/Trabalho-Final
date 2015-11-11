/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Patrick Rodrigues
 */
@Entity
public class Escolaridade {

    private static final Logger LOG = Logger.getLogger(Escolaridade.class.getName());

    private String grau_instrucao;
    private String area_formacao;
    @Id @GeneratedValue
    private long id;
    private Servidor servidor;

    public Escolaridade() {
        super();
    }

    public Escolaridade(String grau_instrucao, String area_formacao, long id, Servidor servidor) {
        this.grau_instrucao = grau_instrucao;
        this.area_formacao = area_formacao;
        this.id = id;
        this.servidor = servidor;
    }

    public Escolaridade(String grau_instrucao, String area_formacao, Servidor servidor) {
        this.grau_instrucao = grau_instrucao;
        this.area_formacao = area_formacao;
        this.servidor = servidor;
    }

    public String getGrau_instrucao() {
        return grau_instrucao;
    }

    public void setGrau_instrucao(String grau_instrucao) {
        this.grau_instrucao = grau_instrucao;
    }

    public String getArea_formacao() {
        return area_formacao;
    }

    public void setArea_formacao(String area_formacao) {
        this.area_formacao = area_formacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Servidor getServidor() {
        return servidor;
    }

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Escolaridade other = (Escolaridade) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Escolaridade{" + "grau_instrucao=" + grau_instrucao + ", area_formacao=" + area_formacao + ", id=" + id + ", servidor=" + servidor + '}';
    }

}
