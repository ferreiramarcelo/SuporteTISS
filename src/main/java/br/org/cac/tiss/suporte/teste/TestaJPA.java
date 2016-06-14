package br.org.cac.tiss.suporte.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.org.cac.tiss.suporte.model.Prestador;
import br.org.cac.tiss.suporte.model.SxmlUsuario;

public class TestaJPA {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SuporteTISSLocal");
		
		EntityManager manager = null;
		
		try {
			
		manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Prestador prestador = new Prestador('F', "Ruben Rodriguez", Calendar.getInstance().getTime(),
				'F', true, true, true, false, Calendar.getInstance().getTime());
		Prestador prestador2 = new Prestador('F', "Helio Rabelo", Calendar.getInstance().getTime(),
				'F', true, true, true, false, Calendar.getInstance().getTime());
		Prestador prestador3 = new Prestador('F', "Felipe Somolinos", Calendar.getInstance().getTime(),
				'F', true, true, true, false, Calendar.getInstance().getTime());
		
		manager.persist(prestador);
		manager.persist(prestador2);
		manager.persist(prestador3);
		
		SxmlUsuario usuario = new SxmlUsuario();
		usuario.setEmail("email");
		usuario.setGrupo("Admin");
		usuario.setSenha("123456789");
		usuario.setPrestador(prestador);
		usuario.setTimestamp(Calendar.getInstance().getTime());
		
		manager.persist(usuario);
		
		SxmlUsuario usuario2 = new SxmlUsuario();
		usuario2.setEmail("email2");
		usuario2.setGrupo("Admin");
		usuario2.setSenha("123456789");
		usuario2.setPrestador(prestador2);
		usuario2.setTimestamp(Calendar.getInstance().getTime());
		
		manager.persist(usuario2);
		
		SxmlUsuario usuario3 = new SxmlUsuario();
		usuario3.setEmail("email3");
		usuario3.setGrupo("User");
		usuario3.setSenha("123456789");
		usuario3.setPrestador(prestador3);
		usuario3.setTimestamp(Calendar.getInstance().getTime());
		
		manager.persist(usuario3);
		
		manager.getTransaction().commit();
		
		} catch (Exception e) {
			e.printStackTrace();
			manager.getTransaction().rollback();
		}finally {
			manager.close();
		}
		
	}

}
