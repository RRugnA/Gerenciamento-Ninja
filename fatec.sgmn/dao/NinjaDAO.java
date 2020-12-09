package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Ninja;

public class NinjaDAO implements IDAO<Ninja> {
	
	Connection connection;
	
	public NinjaDAO(Connection connection) {
		this.connection = connection;
	}
	
	@Override
	public void create(Ninja ninja) {
		
		String sql = "insert into ninjas(nja_name, nja_class, nja_team_id) values (?, ?, ?)";
		
		try(PreparedStatement stm = connection.prepareStatement(sql)){
			
			stm.setString(1, ninja.getName());
			stm.setString(2,  ninja.getNinjaClass());
			stm.setInt(3, ninja.getTeamId());
			
			System.out.println("Registrado no banco com sucesso!");
			stm.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Ninja> read() {
		
		List<Ninja> ninjas = new ArrayList<Ninja>();
		
		String sql = "select n.nja_id, n.nja_name, n.nja_class, t.tea_lider from ninjas as n join teams as t on n.nja_team_id = t.tea_id order by n.nja_id";
		
		try(PreparedStatement stm = connection.prepareStatement(sql)){
			stm.execute();
			
			try(ResultSet rst = stm.getResultSet()){
				
				while(rst.next()) {
					Ninja ninja = new Ninja(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4));
		
					ninjas.add(ninja);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
					
		return ninjas;
	}

	@Override
	public void update(Ninja ninja) {
		
		String sql = "Update ninjas set nja_name = ?, nja_class = ?, nja_team_id = ? where nja_id = ?";
		
		try(PreparedStatement stm = connection.prepareStatement(sql)){
			
			stm.setString(1, ninja.getName());
			stm.setString(2,  ninja.getNinjaClass());
			stm.setInt(3, ninja.getTeamId());
			stm.setInt(4, ninja.getId());
			
			System.out.println("Alterado no banco com sucesso!");
			stm.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Ninja ninja) {

		String sql = "Delete from ninjas where nja_id = ?";
		
		try(PreparedStatement stm = connection.prepareStatement(sql)){
			
			stm.setInt(1, ninja.getId());
			stm.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public Ninja getId(Ninja ninja) {
		
		String sql = "Select nja_id, nja_name, nja_class, nja_team_id from ninjas where nja_id = ?";
		
		try(PreparedStatement stm = connection.prepareStatement(sql)){
			
			stm.setInt(1, ninja.getId());
			stm.execute();
			
			try(ResultSet rst = stm.getResultSet()){

				if( rst.next()) {
					ninja.setId(rst.getInt(1));
					ninja.setName(rst.getString(2));
					ninja.setNinjaClass(rst.getString(3));
					ninja.setTeamId(rst.getInt(4));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ninja;
	}
}
