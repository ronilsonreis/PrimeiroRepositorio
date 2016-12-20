package br.com.sgexport.entities;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="PesagemCarga")
public class PesagemCarga implements Serializable {


	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="idVeicTransp")
	private VeiculoTransportador veiculotransportador;
	
	@ManyToOne
	@JoinColumn(name="idTransp")
	private Transportador transportador;
	
	@ManyToOne
	@JoinColumn(name="idCondutor")
	private CondutorVeiculo condutorveiculo;
		
	@Id
	@Column(name="idPesagemCarga", nullable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idPesagemCarga;
	
	@Column(name="dataEntradaCarga", nullable=false)
	private Date dataEntradaCarga;
	
	@Column(name="horaEntradaCarga", nullable=false, length=06)
	private String horaEntradaCarga;
	
	@Column(name="dataSaidaCarga", nullable=true)
	private Date dataSaidaCarga;
	
	@Column(name="horaSaidaCarga", nullable=true, length=06)
	private String horaSaidaCarga;
	
	@Column(name="pesoBrutoCarga", nullable=false, length=11, precision=4)
	private Double pesoBrutoCarga;
	
	@Column(name="pesoLiquidoCarga", nullable=true, length=11, precision=4)
	private Double pesoLiquidoCarga;
	
	@Column(name="pesoTaraVeiculo", nullable=true, length=11, precision=4)
	private Double pesoTaraVeiculo;

	@Column(name="quantCarga", nullable=true, length=6)
	private Integer quantCarga;
	
	@Column(name="ticketPesagemCarga", nullable=true, length=10)
	private String ticketPesagemCarga;
	
	@Column(name="sequencialPesagem", nullable=false, length=13)
	private String sequencialPesagem;
	
	
	public Integer getQuantCarga() {
		return quantCarga;
	}
	public void setQuantCarga(Integer quantCarga) {
		this.quantCarga = quantCarga;
	}
	public Integer getIdPesagemCarga() {
		return idPesagemCarga;
	}
	public void setIdPesagemCarga(Integer idPesagemCarga) {
		this.idPesagemCarga = idPesagemCarga;
	}
	public Date getDataEntradaCarga() {
		return dataEntradaCarga;
	}
	public void setDataEntradaCarga(Date dataEntradaCarga) {
		this.dataEntradaCarga = dataEntradaCarga;
	}
	public String getHoraEntradaCarga() {
		return horaEntradaCarga;
	}
	public void setHoraEntradaCarga(String horaEntradaCarga) {
		this.horaEntradaCarga = horaEntradaCarga;
	}
	public Date getDataSaidaCarga() {
		return dataSaidaCarga;
	}
	public void setDataSaidaCarga(Date dataSaidaCarga) {
		this.dataSaidaCarga = dataSaidaCarga;
	}
	public String getHoraSaidaCarga() {
		return horaSaidaCarga;
	}
	public void setHoraSaidaCarga(String horaSaidaCarga) {
		this.horaSaidaCarga = horaSaidaCarga;
	}
	public Double getPesoBrutoCarga() {
		return pesoBrutoCarga;
	}
	public void setPesoBrutoCarga(Double pesoBrutoCarga) {
		this.pesoBrutoCarga = pesoBrutoCarga;
	}
	public Double getPesoLiquidoCarga() {
		return pesoLiquidoCarga;
	}
	public void setPesoLiquidoCarga(Double pesoLiquidoCarga) {
		this.pesoLiquidoCarga = pesoLiquidoCarga;
	}
	public Double getPesoTaraVeiculo() {
		return pesoTaraVeiculo;
	}
	public void setPesoTaraVeiculo(Double pesoTaraVeiculo) {
		this.pesoTaraVeiculo = pesoTaraVeiculo;
	}
	public String getTicketPesagemCarga() {
		return ticketPesagemCarga;
	}
	public void setTicketPesagemCarga(String ticketPesagemCarga) {
		this.ticketPesagemCarga = ticketPesagemCarga;
	}
	public String getSequencialPesagem() {
		return sequencialPesagem;
	}
	public void setSequencialPesagem(String sequencialPesagem) {
		this.sequencialPesagem = sequencialPesagem;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataEntradaCarga == null) ? 0 : dataEntradaCarga.hashCode());
		result = prime * result + ((dataSaidaCarga == null) ? 0 : dataSaidaCarga.hashCode());
		result = prime * result + ((horaEntradaCarga == null) ? 0 : horaEntradaCarga.hashCode());
		result = prime * result + ((horaSaidaCarga == null) ? 0 : horaSaidaCarga.hashCode());
		result = prime * result + ((idPesagemCarga == null) ? 0 : idPesagemCarga.hashCode());
		result = prime * result + ((pesoBrutoCarga == null) ? 0 : pesoBrutoCarga.hashCode());
		result = prime * result + ((pesoLiquidoCarga == null) ? 0 : pesoLiquidoCarga.hashCode());
		result = prime * result + ((pesoTaraVeiculo == null) ? 0 : pesoTaraVeiculo.hashCode());
		result = prime * result + ((quantCarga == null) ? 0 : quantCarga.hashCode());
		result = prime * result + ((sequencialPesagem == null) ? 0 : sequencialPesagem.hashCode());
		result = prime * result + ((ticketPesagemCarga == null) ? 0 : ticketPesagemCarga.hashCode());
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
		PesagemCarga other = (PesagemCarga) obj;
		if (dataEntradaCarga == null) {
			if (other.dataEntradaCarga != null)
				return false;
		} else if (!dataEntradaCarga.equals(other.dataEntradaCarga))
			return false;
		if (dataSaidaCarga == null) {
			if (other.dataSaidaCarga != null)
				return false;
		} else if (!dataSaidaCarga.equals(other.dataSaidaCarga))
			return false;
		if (horaEntradaCarga == null) {
			if (other.horaEntradaCarga != null)
				return false;
		} else if (!horaEntradaCarga.equals(other.horaEntradaCarga))
			return false;
		if (horaSaidaCarga == null) {
			if (other.horaSaidaCarga != null)
				return false;
		} else if (!horaSaidaCarga.equals(other.horaSaidaCarga))
			return false;
		if (idPesagemCarga == null) {
			if (other.idPesagemCarga != null)
				return false;
		} else if (!idPesagemCarga.equals(other.idPesagemCarga))
			return false;
		if (pesoBrutoCarga == null) {
			if (other.pesoBrutoCarga != null)
				return false;
		} else if (!pesoBrutoCarga.equals(other.pesoBrutoCarga))
			return false;
		if (pesoLiquidoCarga == null) {
			if (other.pesoLiquidoCarga != null)
				return false;
		} else if (!pesoLiquidoCarga.equals(other.pesoLiquidoCarga))
			return false;
		if (pesoTaraVeiculo == null) {
			if (other.pesoTaraVeiculo != null)
				return false;
		} else if (!pesoTaraVeiculo.equals(other.pesoTaraVeiculo))
			return false;
		if (quantCarga == null) {
			if (other.quantCarga != null)
				return false;
		} else if (!quantCarga.equals(other.quantCarga))
			return false;
		if (sequencialPesagem == null) {
			if (other.sequencialPesagem != null)
				return false;
		} else if (!sequencialPesagem.equals(other.sequencialPesagem))
			return false;
		if (ticketPesagemCarga == null) {
			if (other.ticketPesagemCarga != null)
				return false;
		} else if (!ticketPesagemCarga.equals(other.ticketPesagemCarga))
			return false;
		return true;
	}
	
	
	
}
