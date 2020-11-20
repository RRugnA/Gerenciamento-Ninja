package action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection.ConnectionFactory;
import dao.DAO;
import dao.NinjaDAO;
import model.Ninja;

public class CadastrarNinja implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando Ninja");
		
		String name = request.getParameter("ninjaName");
		String ninjaClass = request.getParameter("ninjaClass");
		int team = Integer.parseInt(request.getParameter("ninjaTeam"));
		
		Ninja ninja = new Ninja(name, ninjaClass, team);
		
		System.out.println(ninja.getName() + " | " + ninja.getNinjaClass() + " | " + ninja.getTeam());
		
		try(Connection connection = new ConnectionFactory().getConnection()){
			System.out.println("Conexao obtida");
			DAO<Ninja> ninjaDAO = new NinjaDAO(connection);
			ninjaDAO.create(ninja);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Ninja cadastrado!");
		
		request.setAttribute("ninja", ninja);
		
		return "forward:confirmaCadastroNinja.jsp";

		
	}

}
