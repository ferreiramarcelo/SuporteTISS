package br.org.cac.tiss.suporte.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.org.cac.tiss.suporte.dao.DAO;
import br.org.cac.tiss.suporte.model.SxmlUsuario;

@Named
@RequestScoped
public class UsuariosBean {
	
	@Inject
	DAO<SxmlUsuario> daogenerico;
	
	public List<SxmlUsuario> listaUsuarios(){
		List<SxmlUsuario> lista = daogenerico.listaTodos();
		return lista;
	}

}
