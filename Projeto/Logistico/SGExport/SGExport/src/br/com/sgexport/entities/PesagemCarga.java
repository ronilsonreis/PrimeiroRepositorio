package br.com.sgexport.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="PesagemCarga")
public class PesagemCarga {

	@Id
	@Column(name="idPesagemCarga", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idPesagemCarga;
	
	@Column(name="dataEntradaCarga", nullable=false)
	private Date dataEntradaCarga;
	
	@Column(name="horaEntradaCarga", nullable=false, length=06)
	private String horaEntradaCarga;
	
	@Column(name="dataSaidaCarga", nullable=true)
	private Date dataSaidaCarga;
	
	@Column(name="horaSaidaCarga", nullable=true, length=06)
	private String horaSaidaCarga;
	
	@Column(name="pesoBrutoCarga", nullable=false, length=11)
	private Double pesoBrutoCarga;
	
	@Column(name="pesoLiquidoCarga", nullable=true, length=11)
	private Double pesoLiquidoCarga;
	
	@Column(name="pesoTaraVeiculo", nullable=true, length=11)
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
			
}
