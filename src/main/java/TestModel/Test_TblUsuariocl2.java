package TestModel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import DAO.Class_CRUD_UsuarioCL2_Imp;
import Model.TblUsuariocl2;

public class Test_TblUsuariocl2 {

	public static void main(String[] args) {
		Class_CRUD_UsuarioCL2_Imp Uimp = new Class_CRUD_UsuarioCL2_Imp();
		TblUsuariocl2 U = new TblUsuariocl2();
		//
		U.setUsuariocl2("Gabs");
		U.setPasswordcl2("12345");
		//
		if(Uimp.ValidarUsuario(U) != null) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
	}
}
