package TestModel;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import Model.TblProductocl2;

public class Test_TblProductocl2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BD_CL2");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		//
		TblProductocl2 P = new TblProductocl2();
		//
		String accion = JOptionPane.showInputDialog("¿Que realizará?");
		switch (accion) {
		case "Registrar":
			P.setNombrecl2("Cuaderno");
			P.setPrecioventacl2(5.00);
			P.setPreciocompcl2(4.50);
			P.setEstadocl2("Nuevo");
			P.setDescripcl2("Cuaderno 100 hojas");
			//
			em.persist(P);
			//
			em.getTransaction().commit();
			System.out.println("Dato registrado");
			//
			em.close();
			break;

		case "Listar":
			List<TblProductocl2> Listado = em.createQuery("Select P from TblProductocl2 P",TblProductocl2.class).getResultList();
			//
			for(TblProductocl2 buscado:Listado){
				System.out.println("ID : " + buscado.getIdproducto() +
								   "\nNombre : " + buscado.getNombrecl2() +
								   "\nS/ VENTA : " + buscado.getPrecioventacl2() +
								   "\nS/ COMPRA : " + buscado.getPreciocompcl2() +
								   "\nEstado : " + buscado.getEstadocl2() + 
								   "\nDescripcion : " + buscado.getDescripcl2());
			}
			//
			em.getTransaction().commit();
			//
			em.close();
			break;
		}
	}
}
