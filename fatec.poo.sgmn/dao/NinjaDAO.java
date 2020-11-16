package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import model.Ninja;

public class NinjaDAO implements DAO<Ninja> {
	
	Connection connection;
	
	public NinjaDAO(Connection connection) {
		this.connection = connection;
	}
	
	@Override
	public void create(Ninja ninja) {
		
		String sql = "insert into ninjas(nja_name, nja_class, nja_team) values (?, ?, ?)";
		
		try(PreparedStatement stm = connection.prepareStatement(sql)){
			
			stm.setString(1, ninja.getName());
			stm.setString(2,  ninja.getNinjaClass());
			stm.setString(3, ninja.getTeam());
			
			System.out.println("Registrado no banco com sucesso!");
			stm.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Ninja> read() {
		
		List<Ninja> ninjas = new ArrayList<Ninja>();
		
		String sql = "select nja_id, nja_name, nja_class, nja_team from ninjas";
		
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
	public void update(Ninja t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Ninja t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Ninja> get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
