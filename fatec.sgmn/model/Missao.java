package model;


public class Missao extends EntidadeDominio {

	private String name;
	private String rank;
	private Double pay;
	private String desc;
	private int teamId;
	private String ninjaLider;
	
	public Missao() {
		super();
	}
	
	public Missao(int id) {
		this.setId(id);
	}
	
	public Missao(String name, String rank, double pay, String descricao, int teamId) {
		this.name = name;
		this.rank = rank;
		this.pay = pay;
		this.desc = descricao;
		this.teamId = teamId;
	}
	
	public Missao(int id, String name, String rank, double pay, int teamId, String descricao) {
		this.setId(id);
		this.name = name;
		this.rank = rank;
		this.pay = pay;
		this.desc = descricao;
		this.teamId = teamId;
	}
	
	public Missao(int id, String name, String rank, double pay, String descricao, String ninjaLider) {
		this.setId(id);
		this.name = name;
		this.rank = rank;
		this.pay = pay;
		this.desc = descricao;
		this.ninjaLider = ninjaLider;
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

	public String getNinjaLider() {
		return ninjaLider;
	}

	public void setNinjaLider(String ninjaLider) {
		this.ninjaLider = ninjaLider;
	}

	
}
