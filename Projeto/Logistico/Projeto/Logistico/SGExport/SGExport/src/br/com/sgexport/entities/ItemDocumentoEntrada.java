package br.com.sgexport.entities;

import java.io.Serializable;
import javax.persistence.*;

public class ItemDocumentoEntrada implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	@ManyToOne
	@JoinColumn(name="idMercadoria")
	private CadastroMercadoria cadastroMercadoria;
	
	@ManyToOne
	@JoinColumn(name="idEmbalagem")
	private CadastroEmbalagem cadastroEmbalagem;
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idItem")
	private Integer idItem;
	
	@Column(name="item", nullable=false, length=3)
	private String item;
	
	@Column(name="quantidade", nullable=false, length=14, precision=4)
	private Double quantidade;
		

	public Integer getIdItem() {
		return idItem;
	}
	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	public CadastroMercadoria getCadastroMercadoria() {
		return cadastroMercadoria;
	}
	public void setCadastroMercadoria(CadastroMercadoria cadastroMercadoria) {
		this.cadastroMercadoria = cadastroMercadoria;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cadastroMercadoria == null) ? 0 : cadastroMercadoria.hashCode());
		result = prime * result + ((idItem == null) ? 0 : idItem.hashCode());
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + ((quantidade == null) ? 0 : quantidade.hashCode());
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
		ItemDocumentoEntrada other = (ItemDocumentoEntrada) obj;
		if (cadastroMercadoria == null) {
			if (other.cadastroMercadoria != null)
				return false;
		} else if (!cadastroMercadoria.equals(other.cadastroMercadoria))
			return false;
		if (idItem == null) {
			if (other.idItem != null)
				return false;
		} else if (!idItem.equals(other.idItem))
			return false;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		return true;
	}
		
}
