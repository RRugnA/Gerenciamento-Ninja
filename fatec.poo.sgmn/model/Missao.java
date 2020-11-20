package model;


public class Missao {

	private int id;
	private String name;
	private String rank;
	private Double pay;
	private String desc;
	private int teamId;
	private String teamLider;
	

	public Missao(String name, String rank, double pay, String descricao, int teamId) {
		this.name = name;
		this.rank = rank;
		this.pay = pay;
		this.desc = descricao;
		this.teamId = teamId;
	}
	
	public Missao(int id, String name, String rank, double pay, String descricao, String teamLider) {
		this.id = id;
		this.name = name;
		this.rank = rank;
		this.pay = pay;
		this.desc = descricao;
		this.teamLider = teamLider;
	}

	public Missao() {
		
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

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String descricao) {
		this.desc = descricao;
	}
	
	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamLider() {
		return teamLider;
	}

	public void setTeamLider(String teamLider) {
		this.teamLider = teamLider;
	}

	
}
