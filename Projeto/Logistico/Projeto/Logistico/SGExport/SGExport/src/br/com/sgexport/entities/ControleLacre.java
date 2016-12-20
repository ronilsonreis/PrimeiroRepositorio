package br.com.sgexport.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="ControleLacre")
public class ControleLacre implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idControleLacre", nullable=false)
	private Integer idControleLacre;
	
	@Column(name="lacre1", nullable=false, length=11)
	private String lacre1;
	
	@Column(name="lacre2", nullable=false, length=11)
	private String lacre2;

	public Integer getIdControleLacre() {
		return idControleLacre;
	}
	public void setIdControleLacre(Integer idControleLacre) {
		this.idControleLacre = idControleLacre;
	}
	public String getLacre1() {
		return lacre1;
	}
	public void setLacre1(String lacre1) {
		this.lacre1 = lacre1;
	}
	public String getLacre2() {
		return lacre2;
	}
	public void setLacre2(String lacre2) {
		this.lacre2 = lacre2;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idControleLacre == null) ? 0 : idControleLacre.hashCode());
		result = prime * result + ((lacre1 == null) ? 0 : lacre1.hashCode());
		result = prime * result + ((lacre2 == null) ? 0 : lacre2.hashCode());
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
		ControleLacre other = (ControleLacre) obj;
		if (idControleLacre == null) {
			if (other.idControleLacre != null)
				return false;
		} else if (!idControleLacre.equals(other.idControleLacre))
			return false;
		if (lacre1 == null) {
			if (other.lacre1 != null)
				return false;
		} else if (!lacre1.equals(other.lacre1))
			return false;
		if (lacre2 == null) {
			if (other.lacre2 != null)
				return false;
		} else if (!lacre2.equals(other.lacre2))
			return false;
		return true;
	}
		
}
