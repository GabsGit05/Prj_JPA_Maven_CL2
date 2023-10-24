package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Class_CRUD_UsuarioCL2_Imp;
import Model.TblUsuariocl2;

/**
 * Servlet implementation class LogueoController
 */
public class LogueoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogueoController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		String usuariocl2 = request.getParameter("usuariocl2");
		String passwordcl2 = request.getParameter("passwordcl2");
		//
		TblUsuariocl2 U = new TblUsuariocl2();
		Class_CRUD_UsuarioCL2_Imp Uimp = new Class_CRUD_UsuarioCL2_Imp();
		//
		U.setUsuariocl2(usuariocl2);
		U.setPasswordcl2(passwordcl2);
		//
		String msj;
		//
		if(Uimp.ValidarUsuario(U) != null) {
			msj = "Ingreso Validio";
			request.setAttribute("msj", msj);
			request.getRequestDispatcher("/GestionProducto.jsp").forward(request, response);
		}else {
			msj = "Ingreso No valido";
			request.setAttribute("msj", msj);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}
}
