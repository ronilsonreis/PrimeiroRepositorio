package br.com.sgexport.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="CadastroMercadoria")
public class CadastroMercadoria implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idMercadoria", nullable=false)
	private Integer idMercadoria;
		
	@Id
	@Column(name="dataCadastro", nullable=false)
	private Date dataCadastro;
	
	@Id
	@Column(name="dataAtualizacao", nullable=false)
	private Date dataAtualizacao;
		
	@Column(name="valorMercadoria", nullable=false, length=14, precision=4)
	private Double valorMercadoria;
	
	@Column(name="ncm", nullable=false, length=8)
	private String ncm;
	
	@Column(name="descMercadoria", nullable=false, length=40)
	private String descMercadoria;
	
	@Column(name="unidadeMedida", nullable=false, length=3)
	private String unidadeMedida;
	
	@ManyToOne
	@JoinColumn(name="idEmbalagem")
	private CadastroEmbalagem cadastroEmbalagem;

	public Integer getIdMercadoria() {
		return idMercadoria;
	}
	public void setIdMercadoria(Integer idMercadoria) {
		this.idMercadoria = idMercadoria;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	public Double getValorMercadoria() {
		return valorMercadoria;
	}
	public void setValorMercadoria(Double valorMercadoria) {
		this.valorMercadoria = valorMercadoria;
	}
	public String getNcm() {
		return ncm;
	}
	public void setNcm(String ncm) {
		this.ncm = ncm;
	}
	public String getDescMercadoria() {
		return descMercadoria;
	}
	public void setDescMercadoria(String descMercadoria) {
		this.descMercadoria = descMercadoria;
	}
	public String getUnidadeMedida() {
		return unidadeMedida;
	}
	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	public CadastroEmbalagem getCadastroEmbalagem() {
		return cadastroEmbalagem;
	}
	public void setCadastroEmbalagem(CadastroEmbalagem cadastroEmbalagem) {
		this.cadastroEmbalagem = cadastroEmbalagem;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cadastroEmbalagem == null) ? 0 : cadastroEmbalagem.hashCode());
		result = prime * result + ((dataAtualizacao == null) ? 0 : dataAtualizacao.hashCode());
		result = prime * result + ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
		result = prime * result + ((descMercadoria == null) ? 0 : descMercadoria.hashCode());
		result = prime * result + ((idMercadoria == null) ? 0 : idMercadoria.hashCode());
		result = prime * result + ((ncm == null) ? 0 : ncm.hashCode());
		result = prime * result + ((unidadeMedida == null) ? 0 : unidadeMedida.hashCode());
		result = prime * result + ((valorMercadoria == null) ? 0 : valorMercadoria.hashCode());
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
		CadastroMercadoria other = (CadastroMercadoria) obj;
		if (cadastroEmbalagem == null) {
			if (other.cadastroEmbalagem != null)
				return false;
		} else if (!cadastroEmbalagem.equals(other.cadastroEmbalagem))
			return false;
		if (dataAtualizacao == null) {
			if (other.dataAtualizacao != null)
				return false;
		} else if (!dataAtualizacao.equals(other.dataAtualizacao))
			return false;
		if (dataCadastro == null) {
			if (other.dataCadastro != null)
				return false;
		} else if (!dataCadastro.equals(other.dataCadastro))
			return false;
		if (descMercadoria == null) {
			if (other.descMercadoria != null)
				return false;
		} else if (!descMercadoria.equals(other.descMercadoria))
			return false;
		if (idMercadoria == null) {
			if (other.idMercadoria != null)
				return false;
		} else if (!idMercadoria.equals(other.idMercadoria))
			return false;
		if (ncm == null) {
			if (other.ncm != null)
				return false;
		} else if (!ncm.equals(other.ncm))
			return false;
		if (unidadeMedida == null) {
			if (other.unidadeMedida != null)
				return false;
		} else if (!unidadeMedida.equals(other.unidadeMedida))
			return false;
		if (valorMercadoria == null) {
			if (other.valorMercadoria != null)
				return false;
		} else if (!valorMercadoria.equals(other.valorMercadoria))
			return false;
		return true;
	}
	
	
}
