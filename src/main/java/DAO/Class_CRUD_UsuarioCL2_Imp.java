package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

import Interfaz.I_Usuariocl2_able;
import Model.TblUsuariocl2;

public class Class_CRUD_UsuarioCL2_Imp implements I_Usuariocl2_able{

	public TblUsuariocl2 ValidarUsuario(TblUsuariocl2 U) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BD_CL2");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		//
		Query busca = em.createQuery("Select u from TblUsuariocl2 u Where u.usuariocl2 =:x and u.passwordcl2 =:y",TblUsuariocl2.class);
		//
		busca.setParameter("x", U.getUsuariocl2());
		busca.setParameter("y", U.getPasswordcl2());
		//
		TblUsuariocl2 u;
		try {
			u = (TblUsuariocl2)busca.getSingleResult();
		} catch (Exception ex) {
			u = null;
		}
		return u;
	}
}