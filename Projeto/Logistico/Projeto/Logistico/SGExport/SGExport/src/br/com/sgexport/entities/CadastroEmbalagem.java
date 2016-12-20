package br.com.sgexport.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="CadastroEmbalagem")
public class CadastroEmbalagem implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idEmbalagem", nullable=false)
	private Integer idEmbalagem;
	
	@Column(name="codEmbalagem", nullable=false, length=2)
	private String codEmbalagem;
	
	@Column(name="descEmbalagem", nullable=false, length=40)
	private String descEmbalagem;

	public Integer getIdEmbalagem() {
		return idEmbalagem;
	}
	public void setIdEmbalagem(Integer idEmbalagem) {
		this.idEmbalagem = idEmbalagem;
	}
	public String getCodEmbalagem() {
		return codEmbalagem;
	}
	public void setCodEmbalagem(String codEmbalagem) {
		this.codEmbalagem = codEmbalagem;
	}
	public String getDescEmbalagem() {
		return descEmbalagem;
	}
	public void setDescEmbalagem(String descEmbalagem) {
		this.descEmbalagem = descEmbalagem;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codEmbalagem == null) ? 0 : codEmbalagem.hashCode());
		result = prime * result + ((descEmbalagem == null) ? 0 : descEmbalagem.hashCode());
		result = prime * result + ((idEmbalagem == null) ? 0 : idEmbalagem.hashCode());
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
		CadastroEmbalagem other = (CadastroEmbalagem) obj;
		if (codEmbalagem == null) {
			if (other.codEmbalagem != null)
				return false;
		} else if (!codEmbalagem.equals(other.codEmbalagem))
			return false;
		if (descEmbalagem == null) {
			if (other.descEmbalagem != null)
				return false;
		} else if (!descEmbalagem.equals(other.descEmbalagem))
			return false;
		if (idEmbalagem == null) {
			if (other.idEmbalagem != null)
				return false;
		} else if (!idEmbalagem.equals(other.idEmbalagem))
			return false;
		return true;
	}
	
}
