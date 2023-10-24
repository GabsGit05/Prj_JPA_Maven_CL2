package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaz.I_ProductoCL2_able;
import Model.TblProductocl2;

public class Class_CRUD_ProductoCL2_Imp implements I_ProductoCL2_able{

	public void RegistrarProducto(TblProductocl2 P) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BD_CL2");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		//
		em.persist(P);
		//
		em.getTransaction().commit();
		//
		em.close();
	}

	public List<TblProductocl2> ListarProductoCL2() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BD_CL2");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		//
		List<TblProductocl2> Listado = em.createQuery("Select P from TblProductocl2 P",TblProductocl2.class).getResultList();
		//
		em.getTransaction().commit();
		//
		em.close();
		return Listado;
	}
}
