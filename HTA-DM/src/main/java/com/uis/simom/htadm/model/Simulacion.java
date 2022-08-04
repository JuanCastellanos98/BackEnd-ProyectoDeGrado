package com.uis.simom.htadm.model;


//import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name="simulacion")

public class Simulacion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private double altura;
    private double calorias;//total calorias ingesta diaria
    private int dbp;
    private int sbp;
    private int edad;
    private int fumar;
    private int herencia;
    private double peso;
    private String paciente ;
    private int sexo;
    private int semanaF;
    private int upDown;
    private int upDownCalorias;
    private int semanaC;
    private int tiempo;
	
	
	public Simulacion() {
		
	}

	

	public Simulacion(int id, double altura, double calorias, int dbp, int sbp, int edad, int fumar, int herencia,
			double peso, String paciente, int sexo, int semanaF, int upDown, int upDownCalorias, int semanaC,
			int tiempo, Enfermero cc) {
		super();
		this.id = id;
		this.altura = altura;
		this.calorias = calorias;
		this.dbp = dbp;
		this.sbp = sbp;
		this.edad = edad;
		this.fumar = fumar;
		this.herencia = herencia;
		this.peso = peso;
		this.paciente = paciente;
		this.sexo = sexo;
		this.semanaF = semanaF;
		this.upDown = upDown;
		this.upDownCalorias = upDownCalorias;
		this.semanaC = semanaC;
		this.tiempo = tiempo;
		
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getCalorias() {
		return calorias;
	}


	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}


	public int getDbp() {
		return dbp;
	}


	public void setDbp(int dbp) {
		this.dbp = dbp;
	}


	public int getSbp() {
		return sbp;
	}


	public void setSbp(int sbp) {
		this.sbp = sbp;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getFumar() {
		return fumar;
	}


	public void setFumar(int fumar) {
		this.fumar = fumar;
	}


	public int getHerencia() {
		return herencia;
	}


	public void setHerencia(int herencia) {
		this.herencia = herencia;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public String getPaciente() {
		return paciente;
	}


	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}


	public int getSexo() {
		return sexo;
	}


	public void setSexo(int sexo) {
		this.sexo = sexo;
	}


	public int getSemanaF() {
		return semanaF;
	}


	public void setSemanaF(int semanaF) {
		this.semanaF = semanaF;
	}


	public int getUpDown() {
		return upDown;
	}


	public void setUpDown(int upDown) {
		this.upDown = upDown;
	}


	public int getUpDownCalorias() {
		return upDownCalorias;
	}


	public void setUpDownCalorias(int upDownCalorias) {
		this.upDownCalorias = upDownCalorias;
	}


	public int getSemanaC() {
		return semanaC;
	}


	public void setSemanaC(int semanaC) {
		this.semanaC = semanaC;
	}


	public int getTiempo() {
		return tiempo;
	}


	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}


	

	

}
