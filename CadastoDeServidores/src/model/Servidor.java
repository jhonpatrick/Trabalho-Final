/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * 
 * @author Patrick Rodrigues
 */
@Entity
public class Servidor {

	private static final Logger LOG = Logger
			.getLogger(Servidor.class.getName());
	// criando ob do tipo das Classes
	// falta criar o relacionameno entre as tabelas
	// criando tabelas que vão se relcionar com a tabela Servidor
	@ManyToOne
	private Endereco enderecoServ;
	@ManyToMany
	private List<Dependentes> dependentesServ;

	// criando o atributo id da tabela
	@Id
	// gerando automático
	@GeneratedValue
	private long idServ;

	private String grauInstrucaoServ;
	private String areaFormacaoServ;
	private String nomeServ;
	private char sexoServ;
	private Date dataNascServ;
	private String estadoCivilServ;
	private String naturalidadeServ;
	private boolean deficinteFisico;
	private String nomePaiServ;
	private String nomeMaeServ;

	private String cargoServ;
	private Date dataEmisaoServ;

	private long numCtpsServ;
	private long serieCtpsServ;
	private Date dataEmissaoCtpsServ;
	private long numPasepServ;
	private Date dataCadastroPasepServ;
	private long identidadeServ;
	private String orgaoIdentidadeServ;
	private Date dataEmissaoIdentidadeServ;
	private long numTituloServ;
	private long numSessaoTituloServ;
	private String zonaTituloServ;
	private int numCpfServ;
	private int certMilitarServ;

	public Servidor() {
		super();
	}

	public Servidor(Endereco endereco_serv, List<Dependentes> dependentes,
			long idServ, String grau_instrucao, String area_formacao,
			String nomeServ, char sexoServ, Date dataNascServ,
			String estadoCivilServ, String naturalidadeServ,
			boolean deficinteFisico, String nomePaiServ, String nomeMaeServ,
			String cargoServ, Date dataEmisaoServ, long numCtpsServ,
			long serieCtpsServ, Date dataEmissaoCtpsServ, long numPasepServ,
			Date dataCadastroPasepServ, long identidadeServ,
			String orgaoIdentidadeServ, Date dataEmissaoIdentidadeServ,
			long numTituloServ, long numSessaoTituloServ,
			String zonaTituloServ, int numCpfServ, int certMilitarServ) {
		this.enderecoServ = endereco_serv;
		this.dependentesServ = dependentes;
		this.idServ = idServ;
		this.grauInstrucaoServ = grau_instrucao;
		this.areaFormacaoServ = area_formacao;
		this.nomeServ = nomeServ;
		this.sexoServ = sexoServ;
		this.dataNascServ = dataNascServ;
		this.estadoCivilServ = estadoCivilServ;
		this.naturalidadeServ = naturalidadeServ;
		this.deficinteFisico = deficinteFisico;
		this.nomePaiServ = nomePaiServ;
		this.nomeMaeServ = nomeMaeServ;
		this.cargoServ = cargoServ;
		this.dataEmisaoServ = dataEmisaoServ;
		this.numCtpsServ = numCtpsServ;
		this.serieCtpsServ = serieCtpsServ;
		this.dataEmissaoCtpsServ = dataEmissaoCtpsServ;
		this.numPasepServ = numPasepServ;
		this.dataCadastroPasepServ = dataCadastroPasepServ;
		this.identidadeServ = identidadeServ;
		this.orgaoIdentidadeServ = orgaoIdentidadeServ;
		this.dataEmissaoIdentidadeServ = dataEmissaoIdentidadeServ;
		this.numTituloServ = numTituloServ;
		this.numSessaoTituloServ = numSessaoTituloServ;
		this.zonaTituloServ = zonaTituloServ;
		this.numCpfServ = numCpfServ;
		this.certMilitarServ = certMilitarServ;
	}

	public Servidor(Endereco endereco_serv, List<Dependentes> dependentes,
			String grau_instrucao, String area_formacao, String nomeServ,
			char sexoServ, Date dataNascServ, String estadoCivilServ,
			String naturalidadeServ, boolean deficinteFisico,
			String nomePaiServ, String nomeMaeServ, String cargoServ,
			Date dataEmisaoServ, long numCtpsServ, long serieCtpsServ,
			Date dataEmissaoCtpsServ, long numPasepServ,
			Date dataCadastroPasepServ, long identidadeServ,
			String orgaoIdentidadeServ, Date dataEmissaoIdentidadeServ,
			long numTituloServ, long numSessaoTituloServ,
			String zonaTituloServ, int numCpfServ, int certMilitarServ) {
		this.enderecoServ = endereco_serv;
		this.dependentesServ = dependentes;
		this.grauInstrucaoServ = grau_instrucao;
		this.areaFormacaoServ = area_formacao;
		this.nomeServ = nomeServ;
		this.sexoServ = sexoServ;
		this.dataNascServ = dataNascServ;
		this.estadoCivilServ = estadoCivilServ;
		this.naturalidadeServ = naturalidadeServ;
		this.deficinteFisico = deficinteFisico;
		this.nomePaiServ = nomePaiServ;
		this.nomeMaeServ = nomeMaeServ;
		this.cargoServ = cargoServ;
		this.dataEmisaoServ = dataEmisaoServ;
		this.numCtpsServ = numCtpsServ;
		this.serieCtpsServ = serieCtpsServ;
		this.dataEmissaoCtpsServ = dataEmissaoCtpsServ;
		this.numPasepServ = numPasepServ;
		this.dataCadastroPasepServ = dataCadastroPasepServ;
		this.identidadeServ = identidadeServ;
		this.orgaoIdentidadeServ = orgaoIdentidadeServ;
		this.dataEmissaoIdentidadeServ = dataEmissaoIdentidadeServ;
		this.numTituloServ = numTituloServ;
		this.numSessaoTituloServ = numSessaoTituloServ;
		this.zonaTituloServ = zonaTituloServ;
		this.numCpfServ = numCpfServ;
		this.certMilitarServ = certMilitarServ;
	}

	public Endereco getEnderecoServ() {
		return enderecoServ;
	}

	public void setEnderecoServ(Endereco enderecoServ) {
		this.enderecoServ = enderecoServ;
	}

	public List<Dependentes> getDependentesServ() {
		return dependentesServ;
	}

	public void setDependentesServ(List<Dependentes> dependentesServ) {
		this.dependentesServ = dependentesServ;
	}

	public long getIdServ() {
		return idServ;
	}

	public void setIdServ(long idServ) {
		this.idServ = idServ;
	}

	public String getGrauInstrucaoServ() {
		return grauInstrucaoServ;
	}

	public void setGrauInstrucaoServ(String grauInstrucaoServ) {
		this.grauInstrucaoServ = grauInstrucaoServ;
	}

	public String getArea_formacao() {
		return areaFormacaoServ;
	}

	public void setArea_formacao(String area_formacao) {
		this.areaFormacaoServ = area_formacao;
	}

	public String getNomeServ() {
		return nomeServ;
	}

	public void setNomeServ(String nomeServ) {
		this.nomeServ = nomeServ;
	}

	public char getSexoServ() {
		return sexoServ;
	}

	public void setSexoServ(char sexoServ) {
		this.sexoServ = sexoServ;
	}

	public Date getDataNascServ() {
		return dataNascServ;
	}

	public void setDataNascServ(Date dataNascServ) {
		this.dataNascServ = dataNascServ;
	}

	public String getEstadoCivilServ() {
		return estadoCivilServ;
	}

	public void setEstadoCivilServ(String estadoCivilServ) {
		this.estadoCivilServ = estadoCivilServ;
	}

	public String getNaturalidadeServ() {
		return naturalidadeServ;
	}

	public void setNaturalidadeServ(String naturalidadeServ) {
		this.naturalidadeServ = naturalidadeServ;
	}

	public boolean isDeficinteFisico() {
		return deficinteFisico;
	}

	public void setDeficinteFisico(boolean deficinteFisico) {
		this.deficinteFisico = deficinteFisico;
	}

	public String getNomePaiServ() {
		return nomePaiServ;
	}

	public void setNomePaiServ(String nomePaiServ) {
		this.nomePaiServ = nomePaiServ;
	}

	public String getNomeMaeServ() {
		return nomeMaeServ;
	}

	public void setNomeMaeServ(String nomeMaeServ) {
		this.nomeMaeServ = nomeMaeServ;
	}

	public String getCargoServ() {
		return cargoServ;
	}

	public void setCargoServ(String cargoServ) {
		this.cargoServ = cargoServ;
	}

	public Date getDataEmisaoServ() {
		return dataEmisaoServ;
	}

	public void setDataEmisaoServ(Date dataEmisaoServ) {
		this.dataEmisaoServ = dataEmisaoServ;
	}

	public long getNumCtpsServ() {
		return numCtpsServ;
	}

	public void setNumCtpsServ(long numCtpsServ) {
		this.numCtpsServ = numCtpsServ;
	}

	public long getSerieCtpsServ() {
		return serieCtpsServ;
	}

	public void setSerieCtpsServ(long serieCtpsServ) {
		this.serieCtpsServ = serieCtpsServ;
	}

	public Date getDataEmissaoCtpsServ() {
		return dataEmissaoCtpsServ;
	}

	public void setDataEmissaoCtpsServ(Date dataEmissaoCtpsServ) {
		this.dataEmissaoCtpsServ = dataEmissaoCtpsServ;
	}

	public long getNumPasepServ() {
		return numPasepServ;
	}

	public void setNumPasepServ(long numPasepServ) {
		this.numPasepServ = numPasepServ;
	}

	public Date getDataCadastroPasepServ() {
		return dataCadastroPasepServ;
	}

	public void setDataCadastroPasepServ(Date dataCadastroPasepServ) {
		
		this.dataCadastroPasepServ = dataCadastroPasepServ;
	}

	public long getIdentidadeServ() {
		return identidadeServ;
	}

	public void setIdentidadeServ(long identidadeServ) {
		this.identidadeServ = identidadeServ;
	}

	public String getOrgaoIdentidadeServ() {
		return orgaoIdentidadeServ;
	}

	public void setOrgaoIdentidadeServ(String orgaoIdentidadeServ) {
		this.orgaoIdentidadeServ = orgaoIdentidadeServ;
	}

	public Date getDataEmissaoIdentidadeServ() {
		return dataEmissaoIdentidadeServ;
	}

	public void setDataEmissaoIdentidadeServ(Date dataEmissaoIdentidadeServ) {
		this.dataEmissaoIdentidadeServ = dataEmissaoIdentidadeServ;
	}

	public long getNumTituloServ() {
		return numTituloServ;
	}

	public void setNumTituloServ(long numTituloServ) {
		this.numTituloServ = numTituloServ;
	}

	public long getNumSessaoTituloServ() {
		return numSessaoTituloServ;
	}

	public void setNumSessaoTituloServ(long numSessaoTituloServ) {
		this.numSessaoTituloServ = numSessaoTituloServ;
	}

	public String getZonaTituloServ() {
		return zonaTituloServ;
	}

	public void setZonaTituloServ(String zonaTituloServ) {
		this.zonaTituloServ = zonaTituloServ;
	}

	public int getNumCpfServ() {
		return numCpfServ;
	}

	public void setNumCpfServ(int numCpfServ) {
		this.numCpfServ = numCpfServ;
	}

	public int getCertMilitarServ() {
		return certMilitarServ;
	}

	public void setCertMilitarServ(int certMilitarServ) {
		this.certMilitarServ = certMilitarServ;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 71 * hash + (int) (this.idServ ^ (this.idServ >>> 32));
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
		if (this.idServ != other.idServ) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Servidor{" + "endereco_serv=" + enderecoServ + ", dependentes="
				+ dependentesServ + ", idServ=" + idServ + ", grau_instrucao="
				+ grauInstrucaoServ + ", area_formacao=" + areaFormacaoServ
				+ ", nomeServ=" + nomeServ + ", sexoServ=" + sexoServ
				+ ", dataNascServ=" + dataNascServ + ", estadoCivilServ="
				+ estadoCivilServ + ", naturalidadeServ=" + naturalidadeServ
				+ ", deficinteFisico=" + deficinteFisico + ", nomePaiServ="
				+ nomePaiServ + ", nomeMaeServ=" + nomeMaeServ + ", cargoServ="
				+ cargoServ + ", dataEmisaoServ=" + dataEmisaoServ
				+ ", numCtpsServ=" + numCtpsServ + ", serieCtpsServ="
				+ serieCtpsServ + ", dataEmissaoCtpsServ="
				+ dataEmissaoCtpsServ + ", numPasepServ=" + numPasepServ
				+ ", dataCadastroPasepServ=" + dataCadastroPasepServ
				+ ", identidadeServ=" + identidadeServ
				+ ", orgaoIdentidadeServ=" + orgaoIdentidadeServ
				+ ", dataEmissaoIdentidadeServ=" + dataEmissaoIdentidadeServ
				+ ", numTituloServ=" + numTituloServ + ", numSessaoTituloServ="
				+ numSessaoTituloServ + ", zonaTituloServ=" + zonaTituloServ
				+ ", numCpfServ=" + numCpfServ + ", certMilitarServ="
				+ certMilitarServ + '}';
	}
}