package com.gank.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtilTrocaJogos {

	private static EntityManagerFactory factory;

	static {
		factory = Persistence.createEntityManagerFactory("TrocaJogos");
	}

	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

}
