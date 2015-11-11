/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Lord Devil Hunter
 */
@Entity
public class Documentos {
    
    
    @Id
    @GeneratedValue
    private long id;
    
    private Servidor servidor;
    
    private long numCtps;
    private long serieCtps;
    private Date dataEmissaoCtps;
    private long numPasep;
    private Date dataCadastroPasep;
    private long identidade;
    private String orgaoIdentidade;
    private Date dataEmissaoIdentidade;
    private long numTitulo;
    private long numSessaoTitulo;
    private String zonaTitulo;
    private int numCpf;
    private int certMilitar;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Documentos() {
    }

    public Documentos(long id, Servidor servidor, long numCtps, long serieCtps, Date dataEmissaoCtps, long numPasep, Date dataCadastroPasep, long identidade, String orgaoIdentidade, Date dataEmissaoIdentidade, long numTitulo, long numSessaoTitulo, String zonaTitulo, int numCpf, int certMilitar) {
        this.id = id;
        this.servidor = servidor;
        this.numCtps = numCtps;
        this.serieCtps = serieCtps;
        this.dataEmissaoCtps = dataEmissaoCtps;
        this.numPasep = numPasep;
        this.dataCadastroPasep = dataCadastroPasep;
        this.identidade = identidade;
        this.orgaoIdentidade = orgaoIdentidade;
        this.dataEmissaoIdentidade = dataEmissaoIdentidade;
        this.numTitulo = numTitulo;
        this.numSessaoTitulo = numSessaoTitulo;
        this.zonaTitulo = zonaTitulo;
        this.numCpf = numCpf;
        this.certMilitar = certMilitar;
    }

    public Documentos(Servidor servidor, long numCtps, long serieCtps, Date dataEmissaoCtps, long numPasep, Date dataCadastroPasep, long identidade, String orgaoIdentidade, Date dataEmissaoIdentidade, long numTitulo, long numSessaoTitulo, String zonaTitulo, int numCpf, int certMilitar) {
        this.servidor = servidor;
        this.numCtps = numCtps;
        this.serieCtps = serieCtps;
        this.dataEmissaoCtps = dataEmissaoCtps;
        this.numPasep = numPasep;
        this.dataCadastroPasep = dataCadastroPasep;
        this.identidade = identidade;
        this.orgaoIdentidade = orgaoIdentidade;
        this.dataEmissaoIdentidade = dataEmissaoIdentidade;
        this.numTitulo = numTitulo;
        this.numSessaoTitulo = numSessaoTitulo;
        this.zonaTitulo = zonaTitulo;
        this.numCpf = numCpf;
        this.certMilitar = certMilitar;
    }

    public Servidor getServidor() {
        return servidor;
    }

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    public long getNumCtps() {
        return numCtps;
    }

    public void setNumCtps(long numCtps) {
        this.numCtps = numCtps;
    }

    public long getSerieCtps() {
        return serieCtps;
    }

    public void setSerieCtps(long serieCtps) {
        this.serieCtps = serieCtps;
    }

    public Date getDataEmissaoCtps() {
        return dataEmissaoCtps;
    }

    public void setDataEmissaoCtps(Date dataEmissaoCtps) {
        this.dataEmissaoCtps = dataEmissaoCtps;
    }

    public long getNumPasep() {
        return numPasep;
    }

    public void setNumPasep(long numPasep) {
        this.numPasep = numPasep;
    }

    public Date getDataCadastroPasep() {
        return dataCadastroPasep;
    }

    public void setDataCadastroPasep(Date dataCadastroPasep) {
        this.dataCadastroPasep = dataCadastroPasep;
    }

    public long getIdentidade() {
        return identidade;
    }

    public void setIdentidade(long identidade) {
        this.identidade = identidade;
    }

    public String getOrgaoIdentidade() {
        return orgaoIdentidade;
    }

    public void setOrgaoIdentidade(String orgaoIdentidade) {
        this.orgaoIdentidade = orgaoIdentidade;
    }

    public Date getDataEmissaoIdentidade() {
        return dataEmissaoIdentidade;
    }

    public void setDataEmissaoIdentidade(Date dataEmissaoIdentidade) {
        this.dataEmissaoIdentidade = dataEmissaoIdentidade;
    }

    public long getNumTitulo() {
        return numTitulo;
    }

    public void setNumTitulo(long numTitulo) {
        this.numTitulo = numTitulo;
    }

    public long getNumSessaoTitulo() {
        return numSessaoTitulo;
    }

    public void setNumSessaoTitulo(long numSessaoTitulo) {
        this.numSessaoTitulo = numSessaoTitulo;
    }

    public String getZonaTitulo() {
        return zonaTitulo;
    }

    public void setZonaTitulo(String zonaTitulo) {
        this.zonaTitulo = zonaTitulo;
    }

    public int getNumCpf() {
        return numCpf;
    }

    public void setNumCpf(int numCpf) {
        this.numCpf = numCpf;
    }

    public int getCertMilitar() {
        return certMilitar;
    }

    public void setCertMilitar(int certMilitar) {
        this.certMilitar = certMilitar;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Documentos other = (Documentos) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Documentos{" + "id=" + id + ", servidor=" + servidor + ", numCtps=" + numCtps + ", serieCtps=" + serieCtps + ", dataEmissaoCtps=" + dataEmissaoCtps + ", numPasep=" + numPasep + ", dataCadastroPasep=" + dataCadastroPasep + ", identidade=" + identidade + ", orgaoIdentidade=" + orgaoIdentidade + ", dataEmissaoIdentidade=" + dataEmissaoIdentidade + ", numTitulo=" + numTitulo + ", numSessaoTitulo=" + numSessaoTitulo + ", zonaTitulo=" + zonaTitulo + ", numCpf=" + numCpf + ", certMilitar=" + certMilitar + '}';
    }
    
    
    
    
}
