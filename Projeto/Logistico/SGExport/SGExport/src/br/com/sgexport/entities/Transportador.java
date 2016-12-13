package br.com.sgexport.entities;

import javax.persistence.*;


@Entity
@Table(name="Transportador")
public class Transportador {

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
}
