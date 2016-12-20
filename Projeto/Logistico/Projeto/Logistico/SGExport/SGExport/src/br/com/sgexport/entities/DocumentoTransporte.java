package br.com.sgexport.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="DocumentoTransporte")
public class DocumentoTransporte implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column(name="idDocTransporte", nullable=false)
	private int idDocTransporte;
	
	@Column(name="tipoDocTransp", nullable=false, length=2)
	private String tipoDocTransp;
	
	@Column(name="numDocTransp", nullable=false, length=16)
	private String numDocTransp;
	
	@Column(name="dataEmissao", nullable=false)
	private Date dataEmissao;
	
	@Column(name="serieDocTransp", nullable=false, length=4)
	private String serieDocTransp;
	
	@Column(name="tipoEmissor", nullable=false, length=1)
	private String tipoEmissor;
	
	@Column(name="cnpjEmissor", nullable=false, length=14)
	private String cnpjEmissor;
	
	@Column(name="nomeEmissor", nullable=false, length=40)
	private String nomeEmissor;

	public int getIdDocTransporte() {
		return idDocTransporte;
	}
	public void setIdDocTransporte(int idDocTransporte) {
		this.idDocTransporte = idDocTransporte;
	}
	public String getTipoDocTransp() {
		return tipoDocTransp;
	}
	public void setTipoDocTransp(String tipoDocTransp) {
		this.tipoDocTransp = tipoDocTransp;
	}
	public String getNumDocTransp() {
		return numDocTransp;
	}
	public void setNumDocTransp(String numDocTransp) {
		this.numDocTransp = numDocTransp;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getSerieDocTransp() {
		return serieDocTransp;
	}
	public void setSerieDocTransp(String serieDocTransp) {
		this.serieDocTransp = serieDocTransp;
	}
	public String getTipoEmissor() {
		return tipoEmissor;
	}
	public void setTipoEmissor(String tipoEmissor) {
		this.tipoEmissor = tipoEmissor;
	}
	public String getCnpjEmissor() {
		return cnpjEmissor;
	}
	public void setCnpjEmissor(String cnpjEmissor) {
		this.cnpjEmissor = cnpjEmissor;
	}
	public String getNomeEmissor() {
		return nomeEmissor;
	}
	public void setNomeEmissor(String nomeEmissor) {
		this.nomeEmissor = nomeEmissor;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpjEmissor == null) ? 0 : cnpjEmissor.hashCode());
		result = prime * result + ((dataEmissao == null) ? 0 : dataEmissao.hashCode());
		result = prime * result + idDocTransporte;
		result = prime * result + ((nomeEmissor == null) ? 0 : nomeEmissor.hashCode());
		result = prime * result + ((numDocTransp == null) ? 0 : numDocTransp.hashCode());
		result = prime * result + ((serieDocTransp == null) ? 0 : serieDocTransp.hashCode());
		result = prime * result + ((tipoDocTransp == null) ? 0 : tipoDocTransp.hashCode());
		result = prime * result + ((tipoEmissor == null) ? 0 : tipoEmissor.hashCode());
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
		DocumentoTransporte other = (DocumentoTransporte) obj;
		if (cnpjEmissor == null) {
			if (other.cnpjEmissor != null)
				return false;
		} else if (!cnpjEmissor.equals(other.cnpjEmissor))
			return false;
		if (dataEmissao == null) {
			if (other.dataEmissao != null)
				return false;
		} else if (!dataEmissao.equals(other.dataEmissao))
			return false;
		if (idDocTransporte != other.idDocTransporte)
			return false;
		if (nomeEmissor == null) {
			if (other.nomeEmissor != null)
				return false;
		} else if (!nomeEmissor.equals(other.nomeEmissor))
			return false;
		if (numDocTransp == null) {
			if (other.numDocTransp != null)
				return false;
		} else if (!numDocTransp.equals(other.numDocTransp))
			return false;
		if (serieDocTransp == null) {
			if (other.serieDocTransp != null)
				return false;
		} else if (!serieDocTransp.equals(other.serieDocTransp))
			return false;
		if (tipoDocTransp == null) {
			if (other.tipoDocTransp != null)
				return false;
		} else if (!tipoDocTransp.equals(other.tipoDocTransp))
			return false;
		if (tipoEmissor == null) {
			if (other.tipoEmissor != null)
				return false;
		} else if (!tipoEmissor.equals(other.tipoEmissor))
			return false;
		return true;
	}
	
	}
	