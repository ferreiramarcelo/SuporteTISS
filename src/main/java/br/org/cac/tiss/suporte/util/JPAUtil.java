package br.org.cac.tiss.suporte.util;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@RequestScoped
public class JPAUtil {
	
	EntityManager manager;
	
	@Produces @RequestScoped
	public EntityManager getEntityManager(){
		if(manager == null){
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("SuporteTISSLocal");
			manager = factory.createEntityManager();
		}
		
		return manager;
	}
	
	public void close(@Disposes EntityManager manager){
		manager.close();
	}

}
