package model;

import java.util.ArrayList;
import java.util.List;

public class Team {
	
	private int id;
	private String lider;
	private List<Ninja> ninjas = new ArrayList<Ninja>();
	
	public Team(int id, String lider) {
		super();
		this.id = id;
		this.lider = lider;
	}
	
	public Team(String lider) {
		this.lider = lider;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLider() {
		return lider;
	}

	public void setLider(String lider) {
		this.lider = lider;
	}

	public void adicionar(Ninja ninja) {
		ninjas.add(ninja);
		
	}
	
	public List<Ninja> getNinjas() {
		return ninjas;
	}
	
	
}
