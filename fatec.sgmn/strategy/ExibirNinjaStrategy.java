package strategy;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection.ConnectionFactory;
import dao.DAO;
import dao.NinjaDAO;
import model.Ninja;

public class ExibirNinjaStrategy implements IStrategy {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Listando Ninjas");
		
		try(Connection connection = new ConnectionFactory().getConnection()){
			
			DAO<Ninja> ninjaDao = new NinjaDAO(connection);
			
			List<Ninja> ninjaList = ninjaDao.read();
			
			request.setAttribute("ninjas", ninjaList);
			
		} catch (SQLException e) {
			
			System.out.println("Não foi possivel conectar ao servidor.");
			e.printStackTrace();
		}
		
		return "forward:listaNinjas.jsp";
	}

}
