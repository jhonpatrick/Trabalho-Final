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
public class Servidor {

    private static final Logger LOG = Logger.getLogger(Servidor.class.getName());
    //criando ob do tipo das Classes
    //falta criar o relacionameno entre as tabelas 
    //criando tabelas que vão se relcionar com a tabela Servidor
    
    private Endereco endereco_serv;
    private Documentos doc_serv;
    private Dependentes dependentes;
    private Cargo cargo;
    private Escolaridade grau_instrucao;

    @Id
    @GeneratedValue
    private long id;

    private String nome_serv;
    private char sexo_serv;
    private Date data_nasc_serv;
    private String estado_civil_serv;
    private String naturalidade_serv;
    private boolean deficinte_fisico = false;
    private String nome_pai;
    private String nome_mae;

    public Servidor(Endereco endereco_serv, Documentos doc_serv, Dependentes dependentes, Cargo cargo, Escolaridade grau_instrução, long id, String nome_serv, char sexo_serv, Date data_nasc_serv, String estado_civil_serv, String naturalidade_serv, String nome_pai, String nome_mae) {
        this.endereco_serv = endereco_serv;
        this.doc_serv = doc_serv;
        this.dependentes = dependentes;
        this.cargo = cargo;
        this.grau_instrucao = grau_instrução;
        this.id = id;
        this.nome_serv = nome_serv;
        this.sexo_serv = sexo_serv;
        this.data_nasc_serv = data_nasc_serv;
        this.estado_civil_serv = estado_civil_serv;
        this.naturalidade_serv = naturalidade_serv;
        this.nome_pai = nome_pai;
        this.nome_mae = nome_mae;
    }

    public Servidor(Endereco endereco_serv, Documentos doc_serv, Dependentes dependentes, Cargo cargo, Escolaridade grau_instrução, String nome_serv, char sexo_serv, Date data_nasc_serv, String estado_civil_serv, String naturalidade_serv, String nome_pai, String nome_mae) {
        this.endereco_serv = endereco_serv;
        this.doc_serv = doc_serv;
        this.dependentes = dependentes;
        this.cargo = cargo;
        this.grau_instrucao = grau_instrução;
        this.nome_serv = nome_serv;
        this.sexo_serv = sexo_serv;
        this.data_nasc_serv = data_nasc_serv;
        this.estado_civil_serv = estado_civil_serv;
        this.naturalidade_serv = naturalidade_serv;
        this.nome_pai = nome_pai;
        this.nome_mae = nome_mae;
    }

    public Servidor() {
        super();
    }

    public Endereco getEndereco_serv() {
        return endereco_serv;
    }

    public void setEndereco_serv(Endereco endereco_serv) {
        this.endereco_serv = endereco_serv;
    }

    public Documentos getDoc_serv() {
        return doc_serv;
    }

    public void setDoc_serv(Documentos doc_serv) {
        this.doc_serv = doc_serv;
    }

    public Dependentes getDependentes() {
        return dependentes;
    }

    public void setDependentes(Dependentes dependentes) {
        this.dependentes = dependentes;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Escolaridade getGrau_instrucao() {
        return grau_instrucao;
    }

    public void setGrau_instrucao(Escolaridade grau_instrucao) {
        this.grau_instrucao = grau_instrucao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome_serv() {
        return nome_serv;
    }

    public void setNome_serv(String nome_serv) {
        this.nome_serv = nome_serv;
    }

    public char getSexo_serv() {
        return sexo_serv;
    }

    public void setSexo_serv(char sexo_serv) {
        this.sexo_serv = sexo_serv;
    }

    public Date getData_nasc_serv() {
        return data_nasc_serv;
    }

    public void setData_nasc_serv(Date data_nasc_serv) {
        this.data_nasc_serv = data_nasc_serv;
    }

    public String getEstado_civil_serv() {
        return estado_civil_serv;
    }

    public void setEstado_civil_serv(String estado_civil_serv) {
        this.estado_civil_serv = estado_civil_serv;
    }

    public String getNaturalidade_serv() {
        return naturalidade_serv;
    }

    public void setNaturalidade_serv(String naturalidade_serv) {
        this.naturalidade_serv = naturalidade_serv;
    }

    public boolean isDeficinte_fisico() {
        return deficinte_fisico;
    }

    public void setDeficinte_fisico(boolean deficinte_fisico) {
        this.deficinte_fisico = deficinte_fisico;
    }

    public String getNome_pai() {
        return nome_pai;
    }

    public void setNome_pai(String nome_pai) {
        this.nome_pai = nome_pai;
    }

    public String getNome_mae() {
        return nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
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
        final Servidor other = (Servidor) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Servidor{ \n" + "endereco_serv=" + endereco_serv + 
                ", doc_serv=" + doc_serv + ", dependentes=" + dependentes + 
                ", cargo=" + cargo + ", grau_instrucao=" + grau_instrucao + 
                ", id=" + id + ", nome_serv=" + nome_serv + ", sexo_serv=" + sexo_serv + 
                ", data_nasc_serv=" + data_nasc_serv + ", estado_civil_serv=" + estado_civil_serv + 
                ", naturalidade_serv=" + naturalidade_serv + ", deficinte_fisico=" + deficinte_fisico + 
                ", nome_pai=" + nome_pai + ", nome_mae=" + nome_mae + "\n }";
    }
}
