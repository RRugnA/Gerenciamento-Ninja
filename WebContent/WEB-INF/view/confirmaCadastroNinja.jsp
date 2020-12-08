<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" />
    <link rel="StyleSheet" type="text/css" href="css/style.css" media="screen" >
<title>Insert title here</title>
</head>
<body>

	<c:import url="header.jsp" />
	
	<div class="container">
		<h1>Cadastro efetuado com sucesso!</h1>
		
		<p>Dados do cadastro:</p>
		<p>Nome: ${ ninja.name }</p>
		<p>Classe: ${ ninja.ninjaClass }</p>
		<p>Equipe: ${ ninja.teamId }</p>
		
		<a href="/SGMN/home.jsp" role="button">Voltar</a>	
	</div>
	
</body>
</html>