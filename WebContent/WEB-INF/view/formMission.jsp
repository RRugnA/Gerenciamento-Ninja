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
<title>Insert title here</title>
</head>
<body>
	<c:import url="header.jsp" />
	
	<div class="fundo-form-missao">
		<div class="container form-container" >		
		
			<form class="form-area" action="${ linkEntradaServlet }" method="post">
				<h1 class="font-weight-bold">Cadastro de Missões</h1>
				
				<div class="form-group">
					<label class="mb-0" for="missionName">Nome:</label>
					<input class="form-control" type="text" name="missionName" id="missionName" required="required"/>
				</div>
				
				<div class="row">
					<div class="col">
						<div class="form-group">
							<label class="mb-0" for="missionRank">Rank:</label>
							<select class="form-control" name="missionRank" id="missionRank">
								<option>D</option>
								<option>C</option>
								<option>B</option>
								<option>A</option>
								<option>S</option>
							</select>
						</div>
					</div>

					<div class="col">
						<div class="form-group">
							<label class="mb-0" for="missionPayment">Pagamento:</label>
							<input class="form-control" type="number" min="1" step="any" name="missionPayment" id="missionPayment" placeholder="000,00" required="required" />
						</div>
					</div>

					<div class="col">
						<label class="mb-0" for="ninjaTeam">Equipe:</label>
							<select class="form-control" name="ninjaTeam" id="ninjaTeam">
								<option>1 - Kakashi</option>
								<option>2 - Guy</option>
								<option>3 - Kurenai</option>
								<option>4 - Asuma</option>
							</select>
					</div>

				</div>			
				
				<div class="form-group">
					<label class="mb-0" for="missionDescription">Descricao:</label>
					<textarea class="form-control" name="missionDescription" id="missionDescription" rows="3" required="required"></textarea>
				</div>
				
				<input type="hidden" name="action" value="CadastrarMissao" /> 
				
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