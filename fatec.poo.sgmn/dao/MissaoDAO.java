package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import model.Missao;

public class MissaoDAO implements DAO<Missao> {
	
	Connection connection;
	
	public MissaoDAO(Connection connection) {
		this.connection = connection;
	}
	
	@Override
	public void create(Missao missao) {
		
		String sql = "insert into missions(mis_name, mis_rank, mis_pay, mis_desc, mis_team_id) values (?, ?, ?, ?, ?)";
		
		try(PreparedStatement stm = connection.prepareStatement(sql)){
			
			stm.setString(1, missao.getName());
			stm.setString(2, missao.getRank());
			stm.setDouble(3, missao.getPay());
			stm.setString(4,  missao.getDesc());
			stm.setInt(5, missao.getTeamId());
			
			System.out.println("Registrado no banco com sucesso!");
			stm.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Missao> read() {
		
		List<Missao> missoes = new ArrayList<Missao>();
		
		//String sql = "select mis_id, mis_name, mis_rank, mis_pay, mis_desc, mis_team_id from missions";
		
		String sql2 = "select m.mis_id, m.mis_name, m.mis_rank, m.mis_pay, m.mis_desc, t.tea_lider from missions as m join teams as t on m.mis_team_id = t.tea_id";
		
		try(PreparedStatement stm = connection.prepareStatement(sql2)){
			stm.execute();
			
			try(ResultSet rst = stm.getResultSet()){
				
				while(rst.next()) {
					Missao missao = new Missao(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getString(5), rst.getString(6));
					
					missoes.add(missao);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
					
		return missoes;
	}

	@Override
	public void update(Missao t, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Missao t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Missao> get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
