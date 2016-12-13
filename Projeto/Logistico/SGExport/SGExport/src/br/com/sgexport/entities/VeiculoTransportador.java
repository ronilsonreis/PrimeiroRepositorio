package br.com.sgexport.entities;

import javax.persistence.*;

@Entity
@Table(name="VeiculoTransportador")
public class VeiculoTransportador {
	
	@Id
	@GeneratedValue
	@Column(name="idVeicTransp", nullable=false)
	private Integer idVeicTransp;
	
	@Column(name="placaVeiculo", nullable=false, length=10)
	private String placaVeiculo;
	
	@Column(name="placaReboque1", nullable=false, length=7)
	private String placaReboque1;
	
	@Column(name="placaReboque2", nullable=false, length=7)
	private String placaReboque2;
	
	@Column(name="placaReboque3", nullable=false, length=7)
	private String placaReboque3;
	
	@Column(name="tipoTransporte", nullable=false, length=1)
	private String tipoTransporte;

	public Integer getIdVeicTransp() {
		return idVeicTransp;
	}
	
	public void setIdVeicTransp(Integer idVeicTransp) {
		this.idVeicTransp = idVeicTransp;
	}
	public String getPlacaVeiculo() {
		return placaVeiculo;
	}
	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}
	public String getPlacaReboque1() {
		return placaReboque1;
	}
	public void setPlacaReboque1(String placaReboque1) {
		this.placaReboque1 = placaReboque1;
	}
	public String getPlacaReboque2() {
		return placaReboque2;
	}
	public void setPlacaReboque2(String placaReboque2) {
		this.placaReboque2 = placaReboque2;
	}
	public String getPlacaReboque3() {
		return placaReboque3;
	}
	public void setPlacaReboque3(String placaReboque3) {
		this.placaReboque3 = placaReboque3;
	}
	public String getTipoTransporte() {
		return tipoTransporte;
	}
	public void setTipoTransporte(String tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}

}
