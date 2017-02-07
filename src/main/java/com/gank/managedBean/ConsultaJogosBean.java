package com.gank.managedBean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.gank.model.trocajogos.Jogo;
import com.gank.util.JpaUtil;
import com.gank.util.JpaUtilTrocaJogos;

@ManagedBean
@ViewScoped
public class ConsultaJogosBean {

	private static final long serialVersionUID = 1L;
	
	private List<Jogo> jogos;

	public void consultar() {
		EntityManager manager = JpaUtilTrocaJogos.getEntityManager();
		TypedQuery<Jogo> query = manager.createQuery("from Jogo", Jogo.class);
		this.jogos = query.getResultList();
		manager.close();
	}

	public List<Jogo> getJogos() {
		return jogos;
	}

}
