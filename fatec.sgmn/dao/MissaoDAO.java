package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Missao;

public class MissaoDAO implements IDAO<Missao> {
	
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
		
		String sql2 = "select m.mis_id, m.mis_name, m.mis_rank, m.mis_pay, m.mis_desc, t.tea_lider from missions as m join teams as t on m.mis_team_id = t.tea_id order by m.mis_id";
		
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
	public void update(Missao missao) {
		
		String sql = "Update missions set mis_name = ?, mis_rank = ?, mis_pay = ?, mis_desc = ?, mis_team_id = ? where mis_id = ?";
		
		try(PreparedStatement stm = connection.prepareStatement(sql)){
			
			stm.setString(1, missao.getName());
			stm.setString(2,  missao.getRank());
			stm.setDouble(3, missao.getPay());
			stm.setString(4, missao.getDesc());
			stm.setInt(5, missao.getTeamId());
			stm.setInt(6, missao.getId());
			
			System.out.println("Alterado no banco com sucesso!");
			stm.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(Missao missao) {
		
String sql = "Delete from missions where mis_id = ?";
		
		try(PreparedStatement stm = connection.prepareStatement(sql)){
			
			stm.setInt(1, missao.getId());
			stm.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}


	@Override
	public Missao getId(Missao missao) {
		String sql = "Select mis_id, mis_name, mis_rank, mis_pay, mis_desc from missions where mis_id = ?";
		
		try(PreparedStatement stm = connection.prepareStatement(sql)){
			
			stm.setInt(1, missao.getId());
			stm.execute();
			
			try(ResultSet rst = stm.getResultSet()){

				if( rst.next()) {
					missao.setId(rst.getInt(1));
					missao.setName(rst.getString(2));
					missao.setRank(rst.getString(3));
					missao.setPay(rst.getDouble(4));
					missao.setDesc(rst.getString(5));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return missao;
	}

}
