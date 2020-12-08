package model;

import java.util.Date;

public abstract class EntidadeDominio {

	private int id;
	private Date dataCadastro;

	public EntidadeDominio() {
		
	}
	
	public EntidadeDominio(int id) {
		this.id = id;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}
