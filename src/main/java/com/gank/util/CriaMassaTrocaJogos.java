package com.gank.util;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.gank.model.trocajogos.Console;
import com.gank.model.trocajogos.Fabricante;
import com.gank.model.trocajogos.Jogo;
import com.gank.model.trocajogos.TipoSituacao;

public class CriaMassaTrocaJogos {

	public static void main(String[] args) {

		EntityManager manager = JpaUtilTrocaJogos.getEntityManager();
		EntityTransaction trx = manager.getTransaction();
		
		trx.begin();
		
			Fabricante sony = new Fabricante("Sony");
			Fabricante take = new Fabricante("Take-Two");
			Fabricante electronic = new Fabricante("Electronic Arts");
			Fabricante activision = new Fabricante("Activision");
			Fabricante bethesda = new Fabricante("Bethesda");
			
			manager.persist(sony);
			manager.persist(take);
			manager.persist(electronic);
			manager.persist(activision);
			manager.persist(bethesda);
			
			Console console1 = new Console("PlayStation 4", sony);
			manager.persist(console1);
			
			Jogo jogo1 = new Jogo("Call of Duty: Black Ops 3", "2015", console1, TipoSituacao.A, activision);
			Jogo jogo2 = new Jogo("GTA V", "2014", console1, TipoSituacao.A, take);
			Jogo jogo3 = new Jogo("FIFA 2016", "2015", console1, TipoSituacao.A, electronic);
			Jogo jogo4 = new Jogo("Call of Duty: Advanced Warfare", "2014", console1, TipoSituacao.A, activision);
			Jogo jogo5 = new Jogo("Star Wars Battlefront", "2015", console1, TipoSituacao.A, electronic);
			
			manager.persist(jogo1);
			manager.persist(jogo2);
			manager.persist(jogo3);
			manager.persist(jogo4);
			manager.persist(jogo5);
			
			/*
			 	Fallout 4 Bethesda 2015
				FIFA 15 Electronic Arts 2014
				Destiny Activision 2014
				The Last of Us Remastered Sony Interactive Entertainment 2014
				Uncharted: The Nathan Drake Collection Sony Interactive Entertainment 2015
			 */
			
			
			//Console console2 = new Console("Xbox One", "Microsoft");
			//Console console3 = new Console("Nintendo 3DS", "Nintendo");
			
			//manager.persist(console2);
			//manager.persist(console3);
			
		trx.commit();
		
		manager.close();
		
	}

}
