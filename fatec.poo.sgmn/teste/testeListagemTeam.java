package teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import connection.ConnectionFactory;
import dao.TeamDAO;
import model.Ninja;
import model.Team;

public class testeListagemTeam {

	public static void main(String[] args) {

		try(Connection connection = new ConnectionFactory().getConnection()){
			
			TeamDAO teamDAO = new TeamDAO(connection);	
			
			List<Team> listaTeam = teamDAO.read();
			
			listaTeam.stream().forEach(lt -> {
				System.out.println(lt.getLider() + ":");
				
				for(Ninja ninja : lt.getNinjas()) {
					System.out.println("- " + ninja.getName());
				}
			
			});
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
