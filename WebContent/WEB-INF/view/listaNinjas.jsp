<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" />
    <link rel="StyleSheet" type="text/css" href="css/style.css" media="screen" >
    <script src="https://kit.fontawesome.com/add39efd86.js" crossorigin="anonymous"></script>
<title>SGMN - Lista de Ninjas</title>
</head>
<body>

	<c:import url="header.jsp" />
	
	
	
	<div class="container">
	
		<h2 class="my-4">Lista de Ninjas:</h2>

	    <table class="table mt-5">
	    	<thead>
	    		<tr>
	          		<th scope="col">#</th>
	          		<th scope="col">Nome</th>
		          	<th scope="col">Classe</th>
		          	<th scope="col">Equipe</th>
		          	<th scope="col"></th>
	        	</tr>
	    	</thead>
	      	<tbody>
		
			<c:forEach items="${ ninjas }" var="ninja">
				<tr>
					<td>${ ninja.id }</td>
					<td>${ ninja.name }</td>
					<td>${ ninja.ninjaClass }</td>
					<td>${ ninja.team }</td>
					<td>
						<a href="/?action=SelectNinja&id=${ ninja.id }"><i class="fas fa-edit"></i>
						</a><a href="/?action=Delete&nome=ninja&id=${ ninja.id }"><i class="fas fa-trash-alt"></i></a>
					</td>
				</tr>
			</c:forEach>
			
			</tbody>
			
	    </table>
	    <a class="btn-form mt-4" href="?action=Home" role="button">Voltar</a>
	    
	</div>
</body>
</html>