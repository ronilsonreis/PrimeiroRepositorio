package br.com.sgexport.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="CondutorVeiculo")
public class CondutorVeiculo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@OneToOne
	@PrimaryKeyJoinColumn(name="idCondutor")
	private CadastroTelefoneCondutor cadastroTelefoneCondutor;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idCondutor", nullable=false)
	private Integer idCondutor;
	
	@Column(name="dataEntrada", nullable=false)
	private Date dataEntrada;
	
	@Column(name="horaEntrada", nullable=true, length=06)
	private String horaEntrada;
	
	@Column(name="dataSaida", nullable=true)
	private Date dataSaida;
	
	@Column(name="horaSaida", nullable=true, length=06)
	private String horaSaida;
	
	@Column(name="nomeCondutor", nullable=false, length=25)
	private String nomeCondutor;
	
	@Column(name="numeroDocumento", nullable=false, length=11)
	private String numeroDocumento;
	
	@Column(name="orgaoEmissor", nullable=false, length=15)
	private String orgaoEmissor;
	
	@Column(name="cnhVisitante", nullable=false, length=11)
	private String cnhVisitante;
	
	@Column(name="matriculaFiscal", nullable=false, length=10)
	private String matriculaFiscal;
	
	@Column(name="sequenciaVisitante", nullable=false, length=13)
	private String sequencialVisitante;

	public Integer getIdCondutor() {
		return idCondutor;
	}
	public void setIdCondutor(Integer idCondutor) {
		this.idCondutor = idCondutor;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public String getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	public String getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}
	public String getNomeCondutor() {
		return nomeCondutor;
	}
	public void setNomeCondutor(String nomeCondutor) {
		this.nomeCondutor = nomeCondutor;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}
	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}
	public String getCnhVisitante() {
		return cnhVisitante;
	}
	public void setCnhVisitante(String cnhVisitante) {
		this.cnhVisitante = cnhVisitante;
	}
	public String getMatriculaFiscal() {
		return matriculaFiscal;
	}
	public void setMatriculaFiscal(String matriculaFiscal) {
		this.matriculaFiscal = matriculaFiscal;
	}
	public String getSequencialVisitante() {
		return sequencialVisitante;
	}
	public void setSequencialVisitante(String sequencialVisitante) {
		this.sequencialVisitante = sequencialVisitante;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnhVisitante == null) ? 0 : cnhVisitante.hashCode());
		result = prime * result + ((dataEntrada == null) ? 0 : dataEntrada.hashCode());
		result = prime * result + ((dataSaida == null) ? 0 : dataSaida.hashCode());
		result = prime * result + ((horaEntrada == null) ? 0 : horaEntrada.hashCode());
		result = prime * result + ((horaSaida == null) ? 0 : horaSaida.hashCode());
		result = prime * result + ((idCondutor == null) ? 0 : idCondutor.hashCode());
		result = prime * result + ((matriculaFiscal == null) ? 0 : matriculaFiscal.hashCode());
		result = prime * result + ((nomeCondutor == null) ? 0 : nomeCondutor.hashCode());
		result = prime * result + ((numeroDocumento == null) ? 0 : numeroDocumento.hashCode());
		result = prime * result + ((orgaoEmissor == null) ? 0 : orgaoEmissor.hashCode());
		result = prime * result + ((sequencialVisitante == null) ? 0 : sequencialVisitante.hashCode());
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
		CondutorVeiculo other = (CondutorVeiculo) obj;
		if (cnhVisitante == null) {
			if (other.cnhVisitante != null)
				return false;
		} else if (!cnhVisitante.equals(other.cnhVisitante))
			return false;
		if (dataEntrada == null) {
			if (other.dataEntrada != null)
				return false;
		} else if (!dataEntrada.equals(other.dataEntrada))
			return false;
		if (dataSaida == null) {
			if (other.dataSaida != null)
				return false;
		} else if (!dataSaida.equals(other.dataSaida))
			return false;
		if (horaEntrada == null) {
			if (other.horaEntrada != null)
				return false;
		} else if (!horaEntrada.equals(other.horaEntrada))
			return false;
		if (horaSaida == null) {
			if (other.horaSaida != null)
				return false;
		} else if (!horaSaida.equals(other.horaSaida))
			return false;
		if (idCondutor == null) {
			if (other.idCondutor != null)
				return false;
		} else if (!idCondutor.equals(other.idCondutor))
			return false;
		if (matriculaFiscal == null) {
			if (other.matriculaFiscal != null)
				return false;
		} else if (!matriculaFiscal.equals(other.matriculaFiscal))
			return false;
		if (nomeCondutor == null) {
			if (other.nomeCondutor != null)
				return false;
		} else if (!nomeCondutor.equals(other.nomeCondutor))
			return false;
		if (numeroDocumento == null) {
			if (other.numeroDocumento != null)
				return false;
		} else if (!numeroDocumento.equals(other.numeroDocumento))
			return false;
		if (orgaoEmissor == null) {
			if (other.orgaoEmissor != null)
				return false;
		} else if (!orgaoEmissor.equals(other.orgaoEmissor))
			return false;
		if (sequencialVisitante == null) {
			if (other.sequencialVisitante != null)
				return false;
		} else if (!sequencialVisitante.equals(other.sequencialVisitante))
			return false;
		return true;
	}
	
	
}
