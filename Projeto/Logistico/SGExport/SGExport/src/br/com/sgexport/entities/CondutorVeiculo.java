package br.com.sgexport.entities;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="CondutorVeiculo")
public class CondutorVeiculo {
	
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
	
	
}
