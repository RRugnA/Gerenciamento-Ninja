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

public class ExcluirMissaoStrategy implements IStrategy {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Removendo missão!");
		
		String paramId = request.getParameter("id");
		int id = Integer.parseInt(paramId);
	 
		System.out.println(id);
	 
		Missao missao = new Missao(id);
		
		try(Connection connection = new ConnectionFactory().getConnection()){
			DAO<Missao> missaoDAO = new MissaoDAO(connection);
			missaoDAO.delete(missao);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		return "redirect:?action=ExibirMissao";
	}

}
