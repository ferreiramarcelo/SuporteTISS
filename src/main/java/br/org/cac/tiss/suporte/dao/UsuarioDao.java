package br.org.cac.tiss.suporte.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

import br.org.cac.tiss.suporte.model.SxmlUsuario;

public class UsuarioDao {
	
	@Inject
	EntityManager em;
		 
	public void adiciona(SxmlUsuario usuario) {
	    em.persist(usuario);
	}
	 
	public void remove(SxmlUsuario usuario) {
	    em.remove(usuario);
	}
	 
	public void atualiza(SxmlUsuario usuario) {
	    em.merge(usuario);
	}
	 
	public List<SxmlUsuario> listaTodos() {
	    CriteriaQuery query = em.getCriteriaBuilder().createQuery(SxmlUsuario.class);
	    query.from(SxmlUsuario.class);
	    return em.createQuery(query).getResultList();
	}

}
