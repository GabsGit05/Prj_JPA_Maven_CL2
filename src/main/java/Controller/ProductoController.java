package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Class_CRUD_ProductoCL2_Imp;
import Model.TblProductocl2;

/**
 * Servlet implementation class ProductoController
 */
public class ProductoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductoController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		TblProductocl2 P = new TblProductocl2();
		Class_CRUD_ProductoCL2_Imp Pimp = new Class_CRUD_ProductoCL2_Imp();
		//
		List<TblProductocl2> Listado = Pimp.ListarProductoCL2();
		request.setAttribute("Listado", Listado);
		//
		request.getRequestDispatcher("/GestionProducto.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		String nombrecl2 = request.getParameter("nombrecl2");
		Double precioventacl2 = Double.parseDouble(request.getParameter("precioventacl2"));
		Double preciocompcl2 = Double.parseDouble(request.getParameter("preciocompcl2"));
		String estadocl2 = request.getParameter("estadocl2");
		String descripcl2 = request.getParameter("descripcl2");
		//
		TblProductocl2 P = new TblProductocl2();
		Class_CRUD_ProductoCL2_Imp Pimp = new Class_CRUD_ProductoCL2_Imp();
		//
		P.setNombrecl2(nombrecl2);
		P.setPrecioventacl2(precioventacl2);
		P.setPreciocompcl2(preciocompcl2);
		P.setEstadocl2(estadocl2);
		P.setDescripcl2(descripcl2);
		//
		Pimp.RegistrarProducto(P);
		//
		List<TblProductocl2> Listado = Pimp.ListarProductoCL2();
		//
		request.setAttribute("Listado", Listado);
		//
		request.getRequestDispatcher("/GestionProducto.jsp").forward(request, response);
	}
}
