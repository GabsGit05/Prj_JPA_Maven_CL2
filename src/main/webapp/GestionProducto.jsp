<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- -------------- -->
<%@page import="java.util.*" %>
<%@page import="Model.TblProductocl2" %>
<!-- -------------- -->    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestion Producto</title>
</head>
<body bgcolor="#F4E0AF">
	<form action="ProductoController" method="post">
		<table align="center">	
			<tr>
				<td>Nombre :</td>
				<td><input type="text" name="nombrecl2"></td>
			</tr>	
			<tr>
				<td>Precio Venta :</td>
				<td><input type="text" name="precioventacl2"></td>
			</tr>
			<tr>
				<td>Precio Compra :</td>
				<td><input type="text" name="preciocompcl2"></td>
			</tr>
			<tr>
				<td>Estado :</td>
				<td><input type="text" name="estadocl2"></td>
			</tr>
			<tr>
				<td>Descripcion :</td>
				<td><input type="text" name="descripcl2"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Registrar"></td>
			</tr>
		</table>
	</form>
	<br>
	<br>
	<!-- ---------------------------------------------------- -->
		<table border="2" align="center">
		<tr>
			<th>ID</th>
			<th>Nombre</th>
			<th>Precio Venta</th>
			<th>Precio Compra</th>
			<th>Estado</th>
			<th>Descripcion</th>
		</tr>
		<%
			List<TblProductocl2> Listado = (List<TblProductocl2>)request.getAttribute("Listado"); 
			if(Listado != null){
				for(TblProductocl2 List:Listado){
		%>
		<tr>
			<td><%=List.getIdproducto()%></td>
			<td><%=List.getNombrecl2()%></td>
			<td><%=List.getPrecioventacl2()%></td>
			<td><%=List.getPreciocompcl2()%></td>
			<td><%=List.getEstadocl2()%></td>
			<td><%=List.getDescripcl2()%></td>
		</tr>
		<%			
				}
			}
		%>
	</table>
	

</body>
</html>