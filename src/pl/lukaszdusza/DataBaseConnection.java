package pl.lukaszdusza;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataBaseConnection {

	public void ConnectionToDataBase() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mykukui_3");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.close();
		entityManagerFactory.close();
	}
	
	
}
