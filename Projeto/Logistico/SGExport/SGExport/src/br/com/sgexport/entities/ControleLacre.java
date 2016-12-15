package br.com.sgexport.entities;

import javax.persistence.*;

@Entity
@Table(name="ControleLacre")
public class ControleLacre {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idControleLacre", nullable=false)
	private Integer idControleLacre;
	
	@Column(name="lacre1", nullable=false, length=11)
	private String lacre1;
	
	@Column(name="lacre1", nullable=false, length=11)
	private String lacre2;
	
}
