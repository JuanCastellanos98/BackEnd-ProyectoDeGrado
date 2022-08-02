package com.uis.simom.htadm.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "alimento")

public class Alimento {
	@Id
	private int id;
	private String alimento;
	
	private int calorias;
	private int proteina;
	private int grasa;
	private int carbohidrato;
	private int gramos;
	private String Medida_casera;
	private String Grupo_alimento;
	
	
	
	
	
	public Alimento() {
		
	}
	public Alimento(int id, String alimento, int calorias, int proteina, int grasa, int carbohidrato, int gramos,
			String medida_casera, String grupo_alimento) {
		super();
		this.id = id;
		this.alimento = alimento;
		this.calorias = calorias;
		this.proteina = proteina;
		this.grasa = grasa;
		this.carbohidrato = carbohidrato;
		this.gramos = gramos;
		Medida_casera = medida_casera;
		Grupo_alimento = grupo_alimento;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAlimento() {
		return alimento;
	}
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	public int getCalorias() {
		return calorias;
	}
	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}
	public int getProteina() {
		return proteina;
	}
	public void setProteina(int proteina) {
		this.proteina = proteina;
	}
	public int getGrasa() {
		return grasa;
	}
	public void setGrasa(int grasa) {
		this.grasa = grasa;
	}
	public int getCarbohidrato() {
		return carbohidrato;
	}
	public void setCarbohidrato(int carbohidrato) {
		this.carbohidrato = carbohidrato;
	}
	public int getGramos() {
		return gramos;
	}
	public void setGramos(int gramos) {
		this.gramos = gramos;
	}
	public String getMedida_casera() {
		return Medida_casera;
	}
	public void setMedida_casera(String medida_casera) {
		Medida_casera = medida_casera;
	}
	public String getGrupo_alimento() {
		return Grupo_alimento;
	}
	public void setGrupo_alimento(String grupo_alimento) {
		Grupo_alimento = grupo_alimento;
	}
	
	


	
}	
	
	