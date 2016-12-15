package br.com.sgexport.entities;

import javax.persistence.*;

@Entity
@Table(name="CadastroConteiner")
public class CadastroConteiner {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column(name="idCadastroConteiner", nullable=false)
	private Integer idCadastroConteiner;
	
	@Column(name="conteiner", nullable=false, length=11)
	private String conteiner;
	
	@Column(name="tipoConteiner", nullable=false, length=15)
	private String tipoConteiner;
	
	@Column(name="dimensao", nullable=false, length=02)
	private String dimensao;
	
	@Column(name="tara", nullable=false, length=11, precision=3)
	private Double tara;
	
	@Column(name="condicaoConteudo", nullable=false, length=1)
	private String condicaoConteudo;
	
	@Column(name="localArmazenagem", nullable=false, length=20)
	private String localArmazenagem;
	
}
