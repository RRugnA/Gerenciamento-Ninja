<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" />
	<link rel="StyleSheet" type="text/css" href="./css/style.css" media="screen" >
	<title>Insert title here</title>
</head>
<body>
	<c:import url="header.jsp" />
	
	<div class="fundo-form-ninja">
		<div class="container form-container" >		
			<form class="form-area" action="cadastrar-ninja" method="post">
			<h1 class="font-weight-bold">Cadastro Ninja</h1>
			
			<div class="form-group">
				<label class="mb-0" for="ninjaName">Nome:</label>
				<input class="form-control" type="text" name="ninjaName" id="ninjaName" required="required"/>
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
						<option>1 - Kakashi</option>
						<option>2 - Guy</option>
						<option>3 - Kurenai</option>
						<option>4 - Asuma</option>
					</select>
			</div>
			
			<input type="hidden" name="action" value="CadastrarNinja" />
			
			<div class="form-footer">
				<a class="btn-form" href="/SGMN/home.jsp" role="button">Voltar</a>
				<button type="submit" class="btn-form">Cadastrar</button>
			</div>			
		</form>
	</div>

	<footer></footer>
	</div>
</body>
</html>