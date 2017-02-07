package com.gank.model.trocajogos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Jogo {
	
	@Id
	@GeneratedValue 
	private Long id;
	
	@Column(length = 60, nullable = false) 
	private String nome;
	
	@Column(length = 4, nullable = false) 
	private String anoLancamento;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "console_id")
	private Console console;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 1, nullable = false)
	private TipoSituacao situacao;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "fabricante_id")
	private Fabricante fabricante;
	
	public Jogo() {
		super();
	}

	public Jogo(Long id, String nome, String anoLancamento, Console console, TipoSituacao situacao,
			Fabricante fabricante) {
		super();
		this.id = id;
		this.nome = nome;
		this.anoLancamento = anoLancamento;
		this.console = console;
		this.situacao = situacao;
		this.fabricante = fabricante;
	}

	public Jogo(String nome, String anoLancamento, Console console, TipoSituacao situacao, Fabricante fabricante) {
		super();
		this.nome = nome;
		this.anoLancamento = anoLancamento;
		this.console = console;
		this.situacao = situacao;
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

	public Console getConsole() {
		return console;
	}

	public void setConsole(Console console) {
		this.console = console;
	}

	public TipoSituacao getSituacao() {
		return situacao;
	}

	public void setSituacao(TipoSituacao situacao) {
		this.situacao = situacao;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
}
