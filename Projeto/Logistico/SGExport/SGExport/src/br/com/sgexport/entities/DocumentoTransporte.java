package br.com.sgexport.entities;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="DocumentoTransporte")
public class DocumentoTransporte {
	
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
}
	