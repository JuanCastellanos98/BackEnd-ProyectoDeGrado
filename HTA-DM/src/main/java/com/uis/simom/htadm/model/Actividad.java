package com.uis.simom.htadm.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "actividad")

public class Actividad {
	@Id
	private int id;
	private int mets;
	private String nombAct;
	
	public Actividad() {
		
	}
	
	
	public Actividad(int id, int mets, String nomb_act) {
		super();
		this.id = id;
		this.mets = mets;
		this.nombAct = nomb_act;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMets() {
		return mets;
	}
	public void setMets(int mets) {
		this.mets = mets;
	}
	public String getNomb_act() {
		return nombAct;
	}
	public void setNomb_act(String nomb_act) {
		this.nombAct = nomb_act;
	}

}
