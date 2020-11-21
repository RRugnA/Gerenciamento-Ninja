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

public class SelecionarNinja implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Mostrando dados do ninja!");
		
		String paramId = request.getParameter("id");
		int id = Integer.parseInt(paramId);
		
		Ninja ninja = new Ninja(id);
		
		try(Connection connection = new ConnectionFactory().getConnection()){
			System.out.println("Conexao obtida");
			DAO<Ninja> ninjaDAO = new NinjaDAO(connection);
			ninja = ninjaDAO.getId(ninja);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		request.setAttribute("ninja", ninja);
		
		return "forward:formAlteraNinja.jsp";
	}

}
