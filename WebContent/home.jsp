<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<c:url value="/" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" />
    <link rel="StyleSheet" type="text/css" href="css/style.css" media="screen" >
	<title>SGMN</title>
</head>
<body class="home">

	<c:import url="/WEB-INF/view/header.jsp" />
	
	<main>
		<div class="container">		
			<div class="row">

				<div class="col-5 menu-main">
					<input type="button" id="ninja" class="btn  btn-block" value="Ninjas">	
				</div>

				<div class="col-6">
					<div id="submenu1" class="invisivel">
						<div>
							<form class="menu-main" action="${ linkEntradaServlet }" method="post">				
								<input type="hidden" name="action" value="Form" />
								<input type="hidden" name="form" value="ninja" />
								<button class="btn-submenu btn-block" type="submit">
									Cadastrar Ninja						
								</button>		
							</form>
						</div>

						<div>
							<form class="menu-main" action="${ linkEntradaServlet }" method="post">	
								<input type="hidden" name="action" value="ExibirNinjas" />
								<input type="hidden" name="list" value="ninja" />
								<button class="btn-submenu btn-block" type="submit">
									Exibir Lista de Ninjas						
								</button>		
							</form>	
						</div>
					</div>
				</div>

			</div>			
		</div>

		<div class="container">		
			<div class="row">
		
				<div class="col-5 menu-main">				
					<input type="button" id="mission" class="btn btn-block" value="Missões">								
				</div>

				<div class="col-6">
					<div id="submenu2" class="invisivel">
						<div>
							<form class="menu-main" action="${ linkEntradaServlet }" method="post">			
								<input type="hidden" name="action" value="Form" />
								<input type="hidden" name="form" value="mission" />
								<button class="btn-submenu btn-block" type="submit">
									Cadastrar Missão						
								</button>		
							</form>
						</div>

						<div>
<!-- 							falta implementar -->
							<form class="menu-main" action="${ linkEntradaServlet }" method="post">	
								<input type="hidden" name="action" value="ExibirMissao" />
								<input type="hidden" name="list" value="mission" />
								<button class="btn-submenu btn-block" type="submit">
									Exibir Lista de Missões						
								</button>		
							</form>	
						</div>
					</div>
				</div>
			</div>
		</div>
	</main>
	
	<footer>		
	</footer>
	<script src="js/subMenu.js"></script>
</body>
</html>