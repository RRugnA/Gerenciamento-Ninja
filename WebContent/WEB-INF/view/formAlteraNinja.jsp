<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<c:url value="/" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" />
	<link rel="StyleSheet" type="text/css" href="./css/style.css" media="screen" >
	<title>SGMN - Alterar Ninja</title>
</head>
<body>
	<c:import url="header.jsp" />
	
	<div class="fundo-form-ninja">
		<div class="container form-container" >		
			<form class="form-area" action="${ linkEntradaServlet }" method="post">
			<h1 class="font-weight-bold">Alterar Ninja</h1>
			
			<div class="form-group">
				<label class="mb-0" for="ninjaName">Nome:</label>
				<input class="form-control" type="text" name="ninjaName" id="ninjaName" value="${ ninja.name }" required="required"/>
			</div>
			
			<div class="form-group">
				<label class="mb-0" for="ninjaClass">Classe:</label>
					<select class="form-control" name="ninjaClass" id="ninjaClass">
						<option>Genin</option>
						<option>Chunin</option>
						<option>Jounin</option>
					</select>
			</div>
			
			<div class="form-group">
				<label class="mb-0" for="ninjaTeam">Equipe:</label>
					<select class="form-control" name="ninjaTeam" id="ninjaTeam">
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
					</select>
			</div>
			
			<input type="hidden" name="ninjaId" value="${ ninja.id }" />
			<input type="hidden" name="action" value="AlterarNinja" />
			
			<div class="form-footer">
				<a class="btn-form" href="?action=Home" role="button">Voltar</a>
				<button type="submit" class="btn-form">Alterar</button>
			</div>			
		</form>
	</div>

	<footer></footer>
	</div>
</body>
</html>