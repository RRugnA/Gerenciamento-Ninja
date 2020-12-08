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
import dao.MissaoDAO;
import model.Missao;

public class ExibirMissaoStrategy implements IStrategy {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Listando Missões");
		
		try(Connection connection = new ConnectionFactory().getConnection()){
			
			DAO<Missao> missaoDao = new MissaoDAO(connection);
			
			List<Missao> missaoList = missaoDao.read();
			
			request.setAttribute("missoes", missaoList);
			
			
		} catch (SQLException e) {
			
			System.out.println("Não foi possivel conectar ao servidor.");
			e.printStackTrace();
		}
		
		return "forward:listaMissoes.jsp";
	}

}
