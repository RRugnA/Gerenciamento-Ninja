package model;

public class Ninja {

	private int id;
	private String name;
	private String ninjaClass;
	private String team;
	
	public Ninja(String name, String ninjaClass, String team) {
		this.name = name;
		this.ninjaClass = ninjaClass;
		this.team = team;
	}
	

	public Ninja(int id, String name, String ninjaClass, String team) {
		super();
		this.id = id;
		this.name = name;
		this.ninjaClass = ninjaClass;
		this.team = team;
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

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	
}
