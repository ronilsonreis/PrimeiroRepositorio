package br.com.sgexport.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="VeiculoTransportador")
public class VeiculoTransportador implements Serializable {
	

	private static final long serialVersionUID = 1L;

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

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idVeicTransp == null) ? 0 : idVeicTransp.hashCode());
		result = prime * result + ((placaReboque1 == null) ? 0 : placaReboque1.hashCode());
		result = prime * result + ((placaReboque2 == null) ? 0 : placaReboque2.hashCode());
		result = prime * result + ((placaReboque3 == null) ? 0 : placaReboque3.hashCode());
		result = prime * result + ((placaVeiculo == null) ? 0 : placaVeiculo.hashCode());
		result = prime * result + ((tipoTransporte == null) ? 0 : tipoTransporte.hashCode());
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
		VeiculoTransportador other = (VeiculoTransportador) obj;
		if (idVeicTransp == null) {
			if (other.idVeicTransp != null)
				return false;
		} else if (!idVeicTransp.equals(other.idVeicTransp))
			return false;
		if (placaReboque1 == null) {
			if (other.placaReboque1 != null)
				return false;
		} else if (!placaReboque1.equals(other.placaReboque1))
			return false;
		if (placaReboque2 == null) {
			if (other.placaReboque2 != null)
				return false;
		} else if (!placaReboque2.equals(other.placaReboque2))
			return false;
		if (placaReboque3 == null) {
			if (other.placaReboque3 != null)
				return false;
		} else if (!placaReboque3.equals(other.placaReboque3))
			return false;
		if (placaVeiculo == null) {
			if (other.placaVeiculo != null)
				return false;
		} else if (!placaVeiculo.equals(other.placaVeiculo))
			return false;
		if (tipoTransporte == null) {
			if (other.tipoTransporte != null)
				return false;
		} else if (!tipoTransporte.equals(other.tipoTransporte))
			return false;
		return true;
	}
	
}
