package strategy;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection.ConnectionFactory;
import dao.DAO;
import dao.MissaoDAO;
import model.Missao;

public class AlterarMissaoStrategy implements IStrategy {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Alterando dados da missão");
		
		String name = request.getParameter("missionName");
		String rank = request.getParameter("missionRank");
		Double pay = Double.parseDouble(request.getParameter("missionPayment"));
		
		String ninjaTeam = request.getParameter("ninjaTeam");		
		String[] codTeam = ninjaTeam.split(" - ");
		int team = Integer.parseInt(codTeam[0]);
		
		String desc = request.getParameter("missionDescription");
		int id = Integer.parseInt(request.getParameter("missaoId"));
		
		System.out.println(team);
		
		Missao missao = new Missao(id, name, rank, pay, team, desc);
		
		try(Connection connection = new ConnectionFactory().getConnection()){
			System.out.println("Conexao obtida");
			DAO<Missao> missaoDAO = new MissaoDAO(connection);
			missaoDAO.update(missao);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("missao", missao);
		
		return "forward:confirmaCadastroMissao.jsp";
	}

}
