package br.com.sgexport.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="DocumentoEntrada")
public class DocumentoEntrada implements Serializable{

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="idItem")
	private ItemDocumentoEntrada itemDocumentoEntrada;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idDocumentoEntrada;
	
	@Column(name="tipoDocumento", nullable=false, length=1)
	private String tipoDocumento;
	
	@Column(name="numeroDocumento", nullable=false, length=18)
	private String numDocumento;
	
	@Column(name="dataEmissao", nullable=false)
	private Date dataEmissao;
	
	@Column(name="ufDocumento", nullable=false, length=2)
	private String ufDocumento;
	
	@Column(name="cidadeDocumento", nullable=false, length=15)
	private String cidadeDocumento;
	
	@Column(name="ieDocumento", nullable=false, length=14)
	private String ieDocumento;
	
	@Column(name="icms", nullable=false, length=11, precision=4)
	private Double icms;
	
	@Column(name="ipi", nullable=false, length=11, precision=4)
	private Double ipi;
	
	@Column(name="valor", nullable=false, length=11, precision=4)
	private Double valor;
	
	@Column(name="serie", nullable=false, length=4)
	private String serie;
	
	@Column(name="cfop", nullable=false, length=4)
	private String cfop;
	
	@Column(name="identLote", nullable=false, length=9)
	private String identLote;
	
	@Column(name="tipoConsig", nullable=false, length=1)
	private String tipoConsig;
	
	@Column(name="cnpjConsig", nullable=false, length=14)
	private String cnpjConsig;
	
	@Column(name="nomeConsig", nullable=false, length=40)
	private String nomeConsig;
	
	@Column(name="statusCadastro", nullable=false, length=1)
	private String statusCadastro;
	
	@Column(name="statusCadastro", nullable=false, length=1)
	private String vinculoDocTransp;
	
	@Column(name="exportVeiculo", nullable=false, length=1)
	private String exportVeiculo;
	
	public Integer getIdDocumentoEntrada() {
		return idDocumentoEntrada;
	}
	public void setIdDocumentoEntrada(Integer idDocumentoEntrada) {
		this.idDocumentoEntrada = idDocumentoEntrada;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumDocumento() {
		return numDocumento;
	}
	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getUfDocumento() {
		return ufDocumento;
	}
	public void setUfDocumento(String ufDocumento) {
		this.ufDocumento = ufDocumento;
	}
	public String getCidadeDocumento() {
		return cidadeDocumento;
	}
	public void setCidadeDocumento(String cidadeDocumento) {
		this.cidadeDocumento = cidadeDocumento;
	}
	public String getIeDocumento() {
		return ieDocumento;
	}
	public void setIeDocumento(String ieDocumento) {
		this.ieDocumento = ieDocumento;
	}
	public Double getIcms() {
		return icms;
	}
	public void setIcms(Double icms) {
		this.icms = icms;
	}
	public Double getIpi() {
		return ipi;
	}
	public void setIpi(Double ipi) {
		this.ipi = ipi;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getCfop() {
		return cfop;
	}
	public void setCfop(String cfop) {
		this.cfop = cfop;
	}
	public String getIdentLote() {
		return identLote;
	}
	public void setIdentLote(String identLote) {
		this.identLote = identLote;
	}
	public String getTipoConsig() {
		return tipoConsig;
	}
	public void setTipoConsig(String tipoConsig) {
		this.tipoConsig = tipoConsig;
	}
	public String getCnpjConsig() {
		return cnpjConsig;
	}
	public void setCnpjConsig(String cnpjConsig) {
		this.cnpjConsig = cnpjConsig;
	}
	public String getNomeConsig() {
		return nomeConsig;
	}
	public void setNomeConsig(String nomeConsig) {
		this.nomeConsig = nomeConsig;
	}
	public String getStatusCadastro() {
		return statusCadastro;
	}
	public void setStatusCadastro(String statusCadastro) {
		this.statusCadastro = statusCadastro;
	}
	public String getVinculoDocTransp() {
		return vinculoDocTransp;
	}
	public void setVinculoDocTransp(String vinculoDocTransp) {
		this.vinculoDocTransp = vinculoDocTransp;
	}
	public String getExportVeiculo() {
		return exportVeiculo;
	}
	public void setExportVeiculo(String exportVeiculo) {
		this.exportVeiculo = exportVeiculo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cfop == null) ? 0 : cfop.hashCode());
		result = prime * result + ((cidadeDocumento == null) ? 0 : cidadeDocumento.hashCode());
		result = prime * result + ((cnpjConsig == null) ? 0 : cnpjConsig.hashCode());
		result = prime * result + ((dataEmissao == null) ? 0 : dataEmissao.hashCode());
		result = prime * result + ((exportVeiculo == null) ? 0 : exportVeiculo.hashCode());
		result = prime * result + ((icms == null) ? 0 : icms.hashCode());
		result = prime * result + ((idDocumentoEntrada == null) ? 0 : idDocumentoEntrada.hashCode());
		result = prime * result + ((identLote == null) ? 0 : identLote.hashCode());
		result = prime * result + ((ieDocumento == null) ? 0 : ieDocumento.hashCode());
		result = prime * result + ((ipi == null) ? 0 : ipi.hashCode());
		result = prime * result + ((nomeConsig == null) ? 0 : nomeConsig.hashCode());
		result = prime * result + ((numDocumento == null) ? 0 : numDocumento.hashCode());
		result = prime * result + ((serie == null) ? 0 : serie.hashCode());
		result = prime * result + ((statusCadastro == null) ? 0 : statusCadastro.hashCode());
		result = prime * result + ((tipoConsig == null) ? 0 : tipoConsig.hashCode());
		result = prime * result + ((tipoDocumento == null) ? 0 : tipoDocumento.hashCode());
		result = prime * result + ((ufDocumento == null) ? 0 : ufDocumento.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		result = prime * result + ((vinculoDocTransp == null) ? 0 : vinculoDocTransp.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DocumentoEntrada other = (DocumentoEntrada) obj;
		if (cfop == null) {
			if (other.cfop != null)
				return false;
		} else if (!cfop.equals(other.cfop))
			return false;
		if (cidadeDocumento == null) {
			if (other.cidadeDocumento != null)
				return false;
		} else if (!cidadeDocumento.equals(other.cidadeDocumento))
			return false;
		if (cnpjConsig == null) {
			if (other.cnpjConsig != null)
				return false;
		} else if (!cnpjConsig.equals(other.cnpjConsig))
			return false;
		if (dataEmissao == null) {
			if (other.dataEmissao != null)
				return false;
		} else if (!dataEmissao.equals(other.dataEmissao))
			return false;
		if (exportVeiculo == null) {
			if (other.exportVeiculo != null)
				return false;
		} else if (!exportVeiculo.equals(other.exportVeiculo))
			return false;
		if (icms == null) {
			if (other.icms != null)
				return false;
		} else if (!icms.equals(other.icms))
			return false;
		if (idDocumentoEntrada == null) {
			if (other.idDocumentoEntrada != null)
				return false;
		} else if (!idDocumentoEntrada.equals(other.idDocumentoEntrada))
			return false;
		if (identLote == null) {
			if (other.identLote != null)
				return false;
		} else if (!identLote.equals(other.identLote))
			return false;
		if (ieDocumento == null) {
			if (other.ieDocumento != null)
				return false;
		} else if (!ieDocumento.equals(other.ieDocumento))
			return false;
		if (ipi == null) {
			if (other.ipi != null)
				return false;
		} else if (!ipi.equals(other.ipi))
			return false;
		if (nomeConsig == null) {
			if (other.nomeConsig != null)
				return false;
		} else if (!nomeConsig.equals(other.nomeConsig))
			return false;
		if (numDocumento == null) {
			if (other.numDocumento != null)
				return false;
		} else if (!numDocumento.equals(other.numDocumento))
			return false;
		if (serie == null) {
			if (other.serie != null)
				return false;
		} else if (!serie.equals(other.serie))
			return false;
		if (statusCadastro == null) {
			if (other.statusCadastro != null)
				return false;
		} else if (!statusCadastro.equals(other.statusCadastro))
			return false;
		if (tipoConsig == null) {
			if (other.tipoConsig != null)
				return false;
		} else if (!tipoConsig.equals(other.tipoConsig))
			return false;
		if (tipoDocumento == null) {
			if (other.tipoDocumento != null)
				return false;
		} else if (!tipoDocumento.equals(other.tipoDocumento))
			return false;
		if (ufDocumento == null) {
			if (other.ufDocumento != null)
				return false;
		} else if (!ufDocumento.equals(other.ufDocumento))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		if (vinculoDocTransp == null) {
			if (other.vinculoDocTransp != null)
				return false;
		} else if (!vinculoDocTransp.equals(other.vinculoDocTransp))
			return false;
		return true;
	}
	
}
