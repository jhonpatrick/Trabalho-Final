/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;



import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Lord Devil Hunter
 */
@Entity
public class Dependentes {
    
    
    
    @Id
    @GeneratedValue
    private long id;
    private Servidor servidor;
    private String nomeDependente;
    private Date dataNascimentoDependente;
    private String parentesco;

    public Dependentes() {
        super();
    }

    public Dependentes(long id, Servidor servidor, String nomeDependente, Date dataNascimentoDependente, String parentesco) {
        this.id = id;
        this.servidor = servidor;
        this.nomeDependente = nomeDependente;
        this.dataNascimentoDependente = dataNascimentoDependente;
        this.parentesco = parentesco;
    }

    public Dependentes(Servidor servidor, String nomeDependente, Date dataNascimentoDependente, String parentesco) {
        this.servidor = servidor;
        this.nomeDependente = nomeDependente;
        this.dataNascimentoDependente = dataNascimentoDependente;
        this.parentesco = parentesco;
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

    public String getNomeDependente() {
        return nomeDependente;
    }

    public void setNomeDependente(String nomeDependente) {
        this.nomeDependente = nomeDependente;
    }

    public Date getDataNascimentoDependente() {
        return dataNascimentoDependente;
    }

    public void setDataNascimentoDependente(Date dataNascimentoDependente) {
        this.dataNascimentoDependente = dataNascimentoDependente;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Dependentes other = (Dependentes) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dependentes{" + "id=" + id + ", servidor=" + servidor + ", nomeDependente=" + nomeDependente + ", dataNascimentoDependente=" + dataNascimentoDependente + ", parentesco=" + parentesco + '}';
    }
    
    
    
    

    
}
