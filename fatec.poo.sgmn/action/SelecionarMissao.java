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

public class SelecionarMissao implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Mostrando dados do ninja!");
		
		String paramId = request.getParameter("id");
		int id = Integer.parseInt(paramId);
		
		Missao missao = new Missao(id);
		
		try(Connection connection = new ConnectionFactory().getConnection()){
			System.out.println("Conexao obtida");
			DAO<Missao> missaoDAO = new MissaoDAO(connection);
			missao = missaoDAO.getId(missao);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		request.setAttribute("missao", missao);
		
		return "forward:formAlteraMissao.jsp";
	}

}
