package br.com.sgexport.entities;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="Transportador")
public class Transportador implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="idTransp", nullable=false)
	private Integer idTransp;
	
	@Column(name="cnpjTransp", nullable=false, length=14)
	private String cnpjTransp;
	
	@Column(name="ie", nullable=false, length=14)
	private String ie;
	
	@Column(name="im", nullable=false, length=14)
	private String im;
	
	@Column(name="nomeTransp", nullable=false, length=40)
	private String nomeTransp;
	
	@Column(name="tipoTransp", nullable=false, length=01)
	private String tipoTransp;

	public Integer getIdTransp() {
		return idTransp;
	}
	public void setIdTransp(Integer idTransp) {
		this.idTransp = idTransp;
	}
	public String getCnpjTransp() {
		return cnpjTransp;
	}
	public void setCnpjTransp(String cnpjTransp) {
		this.cnpjTransp = cnpjTransp;
	}
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}
	public String getIm() {
		return im;
	}
	public void setIm(String im) {
		this.im = im;
	}
	public String getNomeTransp() {
		return nomeTransp;
	}
	public void setNomeTransp(String nomeTransp) {
		this.nomeTransp = nomeTransp;
	}
	public String getTipoTransp() {
		return tipoTransp;
	}
	public void setTipoTransp(String tipoTransp) {
		this.tipoTransp = tipoTransp;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpjTransp == null) ? 0 : cnpjTransp.hashCode());
		result = prime * result + ((idTransp == null) ? 0 : idTransp.hashCode());
		result = prime * result + ((ie == null) ? 0 : ie.hashCode());
		result = prime * result + ((im == null) ? 0 : im.hashCode());
		result = prime * result + ((nomeTransp == null) ? 0 : nomeTransp.hashCode());
		result = prime * result + ((tipoTransp == null) ? 0 : tipoTransp.hashCode());
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
		Transportador other = (Transportador) obj;
		if (cnpjTransp == null) {
			if (other.cnpjTransp != null)
				return false;
		} else if (!cnpjTransp.equals(other.cnpjTransp))
			return false;
		if (idTransp == null) {
			if (other.idTransp != null)
				return false;
		} else if (!idTransp.equals(other.idTransp))
			return false;
		if (ie == null) {
			if (other.ie != null)
				return false;
		} else if (!ie.equals(other.ie))
			return false;
		if (im == null) {
			if (other.im != null)
				return false;
		} else if (!im.equals(other.im))
			return false;
		if (nomeTransp == null) {
			if (other.nomeTransp != null)
				return false;
		} else if (!nomeTransp.equals(other.nomeTransp))
			return false;
		if (tipoTransp == null) {
			if (other.tipoTransp != null)
				return false;
		} else if (!tipoTransp.equals(other.tipoTransp))
			return false;
		return true;
	}

}
