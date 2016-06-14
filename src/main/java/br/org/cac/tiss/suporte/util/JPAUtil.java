package br.org.cac.tiss.suporte.util;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@RequestScoped
public class JPAUtil {
	
	private static EntityManager manager;
	
	private static EntityManagerFactory factory;
	
	@Produces @RequestScoped
	public EntityManager getEntityManager(){
		if(factory == null){
			factory = Persistence.createEntityManagerFactory("SuporteTISSLocal");
			System.out.println("criando entity manager factory: "+factory.toString());
		}
		manager = factory.createEntityManager();
		System.out.println("injetando novo entity manager gerado: "+manager.toString());
		
		return manager;
	}
	
	public void close(@Disposes EntityManager manager){
		manager.close();
	}

}
