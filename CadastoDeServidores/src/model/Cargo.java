/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Patrick Rodrigues
 */
@Entity
public class Cargo {
    
    private static final Logger LOG = Logger.getLogger(Cargo.class.getName());
    
    private Servidor servidor;
    private String nome_cargo;
    private Date data_emisao;
    @Id @GeneratedValue
    private long id;

    public Cargo() {
        super();
    }

    public Cargo(Servidor servidor, String nome_cargo, Date data_emisao, long id) {
        this.servidor = servidor;
        this.nome_cargo = nome_cargo;
        this.data_emisao = data_emisao;
        this.id = id;
    }

    public Cargo(Servidor servidor, String nome_cargo, Date data_emisao) {
        this.servidor = servidor;
        this.nome_cargo = nome_cargo;
        this.data_emisao = data_emisao;
    }

    public Servidor getServidor() {
        return servidor;
    }

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    public String getNome_cargo() {
        return nome_cargo;
    }

    public void setNome_cargo(String nome_cargo) {
        this.nome_cargo = nome_cargo;
    }

    public Date getData_emisao() {
        return data_emisao;
    }

    public void setData_emisao(Date data_emisao) {
        this.data_emisao = data_emisao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
        final Cargo other = (Cargo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cargo{" + "servidor=" + servidor + ", nome_cargo=" + nome_cargo + ", data_emisao=" + data_emisao + ", id=" + id + '}';
    }
    
    
}
