package model;

public class Ninja extends EntidadeDominio {

	private String name;
	private String ninjaClass;
	private int teamId;
	private String ninjaLeader;

	public Ninja() {

	}

	public Ninja(int id) {
		this.setId(id);
	}

	public Ninja(String name, String ninjaClass, int teamId) {
		this.name = name;
		this.ninjaClass = ninjaClass;
		this.teamId = teamId;
	}

	public Ninja(int id, String name, String ninjaClass) {
		this.setId(id);
		this.name = name;
		this.ninjaClass = ninjaClass;
	}

	public Ninja(int id, String name, String ninjaClass, int teamId) {
		this.setId(id);
		this.name = name;
		this.ninjaClass = ninjaClass;
		this.teamId = teamId;
	}

	public Ninja(int id, String name, String ninjaClass, String ninjaLeader) {
		this.setId(id);
		this.name = name;
		this.ninjaClass = ninjaClass;
		this.ninjaLeader = ninjaLeader;
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

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getNinjaLeader() {
		return ninjaLeader;
	}

	public void setNinjaLeader(String ninjaLeader) {
		this.ninjaLeader = ninjaLeader;
	}

}
