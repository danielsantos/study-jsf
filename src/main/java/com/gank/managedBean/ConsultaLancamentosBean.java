package com.gank.managedBean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.gank.model.Lancamento;
import com.gank.util.JpaUtil;

public class ConsultaLancamentosBean {

	private static final long serialVersionUID = 1L;

	private List<Lancamento> lancamentos;

	public void consultar() {
		EntityManager manager = JpaUtil.getEntityManager();
		TypedQuery<Lancamento> query = manager.createQuery("from Lancamento", Lancamento.class);
		this.lancamentos = query.getResultList();
		manager.close();
	}

	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}

}
