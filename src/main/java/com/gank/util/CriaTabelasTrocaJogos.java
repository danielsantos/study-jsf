package com.gank.util;

import javax.persistence.Persistence;

public class CriaTabelasTrocaJogos {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("TrocaJogos");
	}

}
