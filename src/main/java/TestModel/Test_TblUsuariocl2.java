package TestModel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test_TblUsuariocl2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BD_CL2");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().commit();
		//
		

	}

}
