package br.com.sgexport.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="CadastroConteiner")
public class CadastroConteiner implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="idControleLacre")
	private ControleLacre controleLacre;
		
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
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

	public Integer getIdCadastroConteiner() {
		return idCadastroConteiner;
	}

	public void setIdCadastroConteiner(Integer idCadastroConteiner) {
		this.idCadastroConteiner = idCadastroConteiner;
	}
	public String getConteiner() {
		return conteiner;
	}
	public void setConteiner(String conteiner) {
		this.conteiner = conteiner;
	}
	public String getTipoConteiner() {
		return tipoConteiner;
	}
	public void setTipoConteiner(String tipoConteiner) {
		this.tipoConteiner = tipoConteiner;
	}
	public String getDimensao() {
		return dimensao;
	}
	public void setDimensao(String dimensao) {
		this.dimensao = dimensao;
	}
	public Double getTara() {
		return tara;
	}
	public void setTara(Double tara) {
		this.tara = tara;
	}
	public String getCondicaoConteudo() {
		return condicaoConteudo;
	}
	public void setCondicaoConteudo(String condicaoConteudo) {
		this.condicaoConteudo = condicaoConteudo;
	}
	public String getLocalArmazenagem() {
		return localArmazenagem;
	}
	public void setLocalArmazenagem(String localArmazenagem) {
		this.localArmazenagem = localArmazenagem;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((condicaoConteudo == null) ? 0 : condicaoConteudo.hashCode());
		result = prime * result + ((conteiner == null) ? 0 : conteiner.hashCode());
		result = prime * result + ((dimensao == null) ? 0 : dimensao.hashCode());
		result = prime * result + ((idCadastroConteiner == null) ? 0 : idCadastroConteiner.hashCode());
		result = prime * result + ((localArmazenagem == null) ? 0 : localArmazenagem.hashCode());
		result = prime * result + ((tara == null) ? 0 : tara.hashCode());
		result = prime * result + ((tipoConteiner == null) ? 0 : tipoConteiner.hashCode());
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
		CadastroConteiner other = (CadastroConteiner) obj;
		if (condicaoConteudo == null) {
			if (other.condicaoConteudo != null)
				return false;
		} else if (!condicaoConteudo.equals(other.condicaoConteudo))
			return false;
		if (conteiner == null) {
			if (other.conteiner != null)
				return false;
		} else if (!conteiner.equals(other.conteiner))
			return false;
		if (dimensao == null) {
			if (other.dimensao != null)
				return false;
		} else if (!dimensao.equals(other.dimensao))
			return false;
		if (idCadastroConteiner == null) {
			if (other.idCadastroConteiner != null)
				return false;
		} else if (!idCadastroConteiner.equals(other.idCadastroConteiner))
			return false;
		if (localArmazenagem == null) {
			if (other.localArmazenagem != null)
				return false;
		} else if (!localArmazenagem.equals(other.localArmazenagem))
			return false;
		if (tara == null) {
			if (other.tara != null)
				return false;
		} else if (!tara.equals(other.tara))
			return false;
		if (tipoConteiner == null) {
			if (other.tipoConteiner != null)
				return false;
		} else if (!tipoConteiner.equals(other.tipoConteiner))
			return false;
		return true;
	}

	
}
