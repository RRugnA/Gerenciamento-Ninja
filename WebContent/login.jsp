<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" />
<link rel="StyleSheet" type="text/css" href="css/style.css" media="screen" >
<title>Insert title here</title>
</head>
<body>
  <div class="login">
    <div class="container" >
      <div class="row d-flex justify-content-center align-items-center h-100vh" >
        <div class="col-md-4 col-md-offset-4 border-0 rounded-lg bg-light p-4 shadow">
          <div class="panel panel-default ">

            <div class="panel-heading ">
              <h3 class="panel-title">Login</h3>
            </div>
            
            <div class="panel-body">

              <form accept-charset="UTF-8" role="form" method="post" action="home.jsp">
              <fieldset>

                <div class="form-group">
                  <input class="form-control" placeholder="E-mail" name="email" type="text">
                </div>

                <div class="form-group">
                  <input class="form-control" placeholder="Senha" name="password" type="password" value="">
                </div>
                
                <div class="checkbox">
                  <label>
                    <input name="remember" type="checkbox" value="Remember Me"> Lembrar
                  </label>
                </div>

                <input class="btn btn-lg btn-block font-weight-bold rounded-lg" type="submit" value="Entrar" style="background-image: linear-gradient(to left, #fff7dc, #f7e38c);">
                
              </fieldset>
              </form>

            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>