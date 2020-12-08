package strategy;

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

public class ExcluirNinjaStrategy implements IStrategy {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Removendo ninja!");
		
		String paramId = request.getParameter("id");
		int id = Integer.parseInt(paramId);
	 
		System.out.println(id);
	 
		Ninja ninja = new Ninja(id);
		
		try(Connection connection = new ConnectionFactory().getConnection()){
			DAO<Ninja> ninjaDAO = new NinjaDAO(connection);
			ninjaDAO.delete(ninja);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		return "redirect:?action=ExibirNinjas";
	}

}
