package br.org.cac.tiss.suporte.dao;
import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

import br.org.cac.tiss.suporte.util.JPAUtil;

public class DAO<T> implements Serializable {
	  private final Class<T> classe;
	  
	  private EntityManager em = new JPAUtil().getEntityManager();
	 
	  public DAO(Class<T> classe) {
	    this.classe = classe;
	  }
	 
	  public void adiciona(T obj) {
	    em.persist(obj);
	  }
	 
	  public void remove(T obj) {
	    em.remove(obj);
	  }
	 
	  public void atualiza(T obj) {
	    em.merge(obj);
	  }
	 
	  public List<T> listaTodos() {
	    CriteriaQuery<T> query = em.getCriteriaBuilder().createQuery(classe);
	    query.from(classe);
	    return em.createQuery(query).getResultList();
	  }
	 
	  public T buscaPorId(Long id) {
	    return em.find(classe,id);
	  }
}