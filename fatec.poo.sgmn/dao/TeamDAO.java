package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import model.Ninja;
import model.Team;

public class TeamDAO implements DAO<Team> {

	Connection connection;
	
	public TeamDAO(Connection connection) {
		this.connection = connection;
	}
	
	@Override
	public void create(Team team) {
		
		
	}

	@Override
	public List<Team> read() {
		
		List<Team> teams = new ArrayList<Team>();
		
		String sql = "select n.nja_id, n.nja_name, n.nja_class, t.tea_id, t.tea_lider from ninjas as n join teams as t on n.nja_team_id = t.tea_id";
		
		try(PreparedStatement stm = connection.prepareStatement(sql)){
			stm.execute();
			
			try(ResultSet rst = stm.getResultSet()){
				while(rst.next()) {
					Team team = new Team(rst.getInt(4), rst.getString(5));
					Ninja ninja = new Ninja(rst.getInt(1), rst.getString(2), rst.getString(3));
					team.adicionar(ninja);
					teams.add(team);
				}
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return teams;
	}

	@Override
	public void update(Team team, String[] params) {
		
		
	}

	@Override
	public void delete(Team team) {
		
		
	}

	@Override
	public Optional<Team> get(long id) {
		
		return null;
	}

}
