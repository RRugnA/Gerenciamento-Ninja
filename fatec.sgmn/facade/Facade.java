package facade;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import connection.ConnectionFactory;
import dao.IDAO;
import dao.MissaoDAO;
import dao.NinjaDAO;
import model.EntidadeDominio;
import model.Missao;
import model.Ninja;

public class Facade implements IFacade {

	@Override
	public void cadastrar(EntidadeDominio ed) {

		if(ed instanceof Ninja) {
			try(Connection connection = new ConnectionFactory().getConnection()){
				System.out.println("Conexao obtida");
				IDAO<Ninja> ninjaDAO = new NinjaDAO(connection);
				ninjaDAO.create((Ninja)ed);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else if(ed instanceof Missao) {
			try(Connection connection = new ConnectionFactory().getConnection()){
				System.out.println("Conexao obtida");
				IDAO<Missao> missaoDAO = new MissaoDAO(connection);
				missaoDAO.create((Missao)ed);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Impossível cadastar: Objeto inválido");
		}

	}

	@Override
	public void alterar(EntidadeDominio ed) {

		if(ed instanceof Ninja) {
			try(Connection connection = new ConnectionFactory().getConnection()){
				System.out.println("Conexao obtida");
				IDAO<Ninja> ninjaDAO = new NinjaDAO(connection);
				ninjaDAO.update((Ninja)ed);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else if(ed instanceof Missao) {
			try(Connection connection = new ConnectionFactory().getConnection()){
				System.out.println("Conexao obtida");
				IDAO<Missao> missaoDAO = new MissaoDAO(connection);
				missaoDAO.update((Missao)ed);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Impossível alterar: Objeto inválido");
		}

	}

	@Override
	public void excluir(EntidadeDominio ed) {

		if(ed instanceof Ninja) {
			try(Connection connection = new ConnectionFactory().getConnection()){
				IDAO<Ninja> ninjaDAO = new NinjaDAO(connection);
				ninjaDAO.delete((Ninja)ed);				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(ed instanceof Missao) {
			try(Connection connection = new ConnectionFactory().getConnection()){
				IDAO<Missao> missaoDAO = new MissaoDAO(connection);
				missaoDAO.delete((Missao)ed);				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("Impossível excluir: Objeto Inválido");
		}

	}

	@Override
	public List listar(EntidadeDominio ed) {

		if(ed instanceof Ninja) {
			try(Connection connection = new ConnectionFactory().getConnection()){
				IDAO<Ninja> ninjaDao = new NinjaDAO(connection);
				List<Ninja> lista = ninjaDao.read();
				return lista;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(ed instanceof Missao) {
			try(Connection connection = new ConnectionFactory().getConnection()){
				IDAO<Missao> missaoDao = new MissaoDAO(connection);
				List<Missao> lista = missaoDao.read();
				return lista;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("Impossível consultar: Objeto inválido.");
		}
		return null;
	}

	@Override
	public EntidadeDominio consultar(EntidadeDominio ed) {

		if(ed instanceof Ninja) {
			try(Connection connection = new ConnectionFactory().getConnection()){
				System.out.println("Conexao obtida");
				IDAO<Ninja> ninjaDAO = new NinjaDAO(connection);				
				Ninja ninja = ninjaDAO.getId((Ninja)ed);
				return ninja;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else if(ed instanceof Missao) {
			try(Connection connection = new ConnectionFactory().getConnection()){
				System.out.println("Conexao obtida");
				IDAO<Missao> missaoDAO = new MissaoDAO(connection);
				Missao missao = missaoDAO.getId((Missao)ed);
				return missao;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Impossível consultar: Objeto inválido.");
		}
		return null;
	}

}
