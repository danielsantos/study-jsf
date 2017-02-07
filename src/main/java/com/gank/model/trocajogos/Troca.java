package com.gank.model.trocajogos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//@Entity
//@Table
public class Troca {
	
	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "usuario_proprietario_id")
	private Usuario usuarioProprietario;

	@ManyToOne(optional = false)
	@JoinColumn(name = "jogo_requerido_id")
	private Jogo jogoRequirido;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "usuario_requerente_id")
	private Usuario usuarioRequerente;
	
	@ManyToOne(optional = true)
	@JoinColumn(name = "jogo_do_requerente_id")
	private Jogo jogoDoRequerente;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date dataRequisicao;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column
	private Date dataTroca;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuarioProprietario() {
		return usuarioProprietario;
	}

	public void setUsuarioProprietario(Usuario usuarioProprietario) {
		this.usuarioProprietario = usuarioProprietario;
	}

	public Jogo getJogoRequirido() {
		return jogoRequirido;
	}

	public void setJogoRequirido(Jogo jogoRequirido) {
		this.jogoRequirido = jogoRequirido;
	}

	public Usuario getUsuarioRequerente() {
		return usuarioRequerente;
	}

	public void setUsuarioRequerente(Usuario usuarioRequerente) {
		this.usuarioRequerente = usuarioRequerente;
	}

	public Jogo getJogoDoRequerente() {
		return jogoDoRequerente;
	}

	public void setJogoDoRequerente(Jogo jogoDoRequerente) {
		this.jogoDoRequerente = jogoDoRequerente;
	}

	public Date getDataRequisicao() {
		return dataRequisicao;
	}

	public void setDataRequisicao(Date dataRequisicao) {
		this.dataRequisicao = dataRequisicao;
	}

	public Date getDataTroca() {
		return dataTroca;
	}

	public void setDataTroca(Date dataTroca) {
		this.dataTroca = dataTroca;
	}
	
}
