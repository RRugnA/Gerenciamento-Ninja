package action;

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


public class CadastrarMissao implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando Missao");
		
		String name = request.getParameter("missionName");
		String rank = request.getParameter("missionRank");
		double pay = Double.parseDouble(request.getParameter("missionPayment"));
		String desc = request.getParameter("missionDescription");
		int team = Integer.parseInt(request.getParameter("ninjaTeam"));
		
		Missao missao = new Missao(name, rank, pay, desc, team);
		
		System.out.println(missao.getName() + " cadastrada!");
		
		try(Connection connection = new ConnectionFactory().getConnection()){
			System.out.println("Conexao obtida");
			DAO<Missao> missaoDAO = new MissaoDAO(connection);
			missaoDAO.create(missao);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Missão cadastrado!");
		
		request.setAttribute("missao", missao);
		
		return "forward:confirmaCadastroMissao.jsp";

		
	}

}
