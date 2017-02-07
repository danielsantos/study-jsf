package com.gank.model.trocajogos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Console {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(length = 60, nullable = false) 
	private String nome;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "fabricante_id")
	private Fabricante fabricante;

	
	public Console() {
		super();
	}

	public Console(String nome, Fabricante fabricante) {
		super();
		this.nome = nome;
		this.fabricante = fabricante;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
}
