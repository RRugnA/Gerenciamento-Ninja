<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c-rt" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" />
    <link rel="StyleSheet" type="text/css" href="css/style.css" media="screen" >
    <script src="https://kit.fontawesome.com/add39efd86.js" crossorigin="anonymous"></script>
<title>SGMN - Lista de Missões</title>
</head>
<body>

	<c:import url="header.jsp" />
	
	
	
	<div class="container my-5">
	

		<h2 class="my-4">Lista de Miss�es:</h2>

	    <table class="table mt-5">
	    	<thead>
	    		<tr>
	          		<th scope="col">#</th>
	          		<th scope="col">Nome</th>
		          	<th scope="col">Rank</th>
		          	<th scope="col">Pagamento</th>
		          	<th scope="col">Descricao</th>
		          	<th scope="col">Equipe</th>
		          	<th scope="col"></th>
	        	</tr>
	    	</thead>
	      	<tbody>

			<c:forEach items="${ missoes }" var="missao" >

				<tr>			
			
					<td>${ missao.id }</td>
					<td>${ missao.name }</td>
					<td>${ missao.rank }</td>
					<td>$ ${ missao.pay }</td>
					<td>${ missao.desc }</td>
					<td>${ missao.ninjaLider }</td>
					
					<td>
						<a href="/SGMN/editar-missao?action=SelecionarMissao&id=${ missao.id }"><i class="fas fa-edit"></i>
						</a><a href="/SGMN/exibir-missoes?action=ExcluirMissao&id=${ missao.id }"><i class="fas fa-trash-alt"></i></a>
					</td>
				</tr>
				
			</c:forEach>
			
			</tbody>
			
	    </table>
	    <a class="btn-form mt-4" href="/SGMN/home.jsp" role="button">Voltar</a>
	    
	</div>
</body>
</html>
