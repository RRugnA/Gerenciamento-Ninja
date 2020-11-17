package action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection.ConnectionFactory;
import dao.DAO;
import dao.TeamDAO;
import model.Team;

public class ShowTeams implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Listando Ninjas");
		
		try(Connection connection = new ConnectionFactory().getConnection()){
			
			DAO<Team> teamDao = new TeamDAO(connection);
			
			List<Team> teamList = teamDao.read();
			
			request.setAttribute("teams", teamList);
			
			
		} catch (SQLException e) {
			
			System.out.println("Não foi possivel conectar ao servidor.");
			e.printStackTrace();
		}
		
		return "forward:listaTeams.jsp";
	}

}
