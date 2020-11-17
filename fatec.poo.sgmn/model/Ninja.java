package model;

public class Ninja {

	private int id;
	private String name;
	private String ninjaClass;
	private int team;
	
	public Ninja(String name, String ninjaClass, int team) {
		this.name = name;
		this.ninjaClass = ninjaClass;
		this.team = team;
	}
	
	public Ninja(int id, String name, String ninjaClass) {
		this.id = id;
		this.name = name;
		this.ninjaClass = ninjaClass;
	}
	

	public Ninja(int id, String name, String ninjaClass, int team) {
		super();
		this.id = id;
		this.name = name;
		this.ninjaClass = ninjaClass;
		this.team = team;
	}

	public Ninja() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNinjaClass() {
		return ninjaClass;
	}

	public void setNinjaClass(String ninjaClass) {
		this.ninjaClass = ninjaClass;
	}

	public int getTeam() {
		return team;
	}

	public void setTeam(int team) {
		this.team = team;
	}
	
	
}
