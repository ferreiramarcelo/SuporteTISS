package br.org.cac.tiss.suporte.dao;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@Named
public class Dao<T> {
	
	private Class<T> classe;
	
	@Inject
	EntityManager manager;
		
	public List<T> lista() {
		
		System.out.println(classe.getSimpleName());
		Query query = manager.createQuery("select u from "+classe.getSimpleName()+" u");

		List<T> lista = query.getResultList();
		
		return lista;
	}

	public Dao(Class<T> classe) {
		this.classe = classe;
	}
	
	public Dao(){
		classe = null;
	}
	
}
