package br.org.cac.tiss.suporte.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.org.cac.tiss.suporte.dao.Dao;
import br.org.cac.tiss.suporte.model.SxmlUsuario;

@Named
@RequestScoped
public class UsuariosBean {
	
	private Dao<SxmlUsuario> usuariodao = new Dao<>(SxmlUsuario.class);
	
	public List<SxmlUsuario> listaUsuarios(){
		return usuariodao.lista();
	}

}
