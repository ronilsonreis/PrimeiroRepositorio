package br.com.sgexport.entities;

import javax.persistence.*;

@Entity
@Table(name="CadastroTelefoneCondutor")
public class CadastroTelefoneCondutor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idtelefone;
	
	@Column(name="codPais", nullable=false, length=2)
	private String codPais;
	
	@Column(name="codArea", nullable=false, length=2)
	private String codArea;
	
	@Column(name="nrTelefone", nullable=false, length=9)
	private String nrTelefone;
	
	@Column(name="nrRadio", nullable=true, length=10)
	private String nrRadio;
	
	@Column(name="operadora", nullable=false, length=10)
	private String operadora;
	
	@Column(name="tipo", nullable=false, length=1)
	private String tipo;
	
}
