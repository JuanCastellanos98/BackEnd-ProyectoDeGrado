package com.uis.simom.htadm.model;


import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="simulacion")

public class Simulacion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private double altura;
	private int calorias;
    private LocalDateTime create_at;
	private int dbp;
	private int sbp;
	private int edad;
	private int fumar;
	private int herencia;
	private double peso;
	
	@ManyToOne
	@JoinColumn(name="paciente")
	private Enfermero cc;
	
	
	public Simulacion() {
		
	}

	public Simulacion(int id, double altura, int calorias, LocalDateTime create_at, int dbp, int sbp, int edad, int fumar,
			int herencia, double peso, Enfermero cc) {
		super();
		this.id = id;
		this.altura = altura;
		this.calorias = calorias;
		this.create_at = create_at;
		this.dbp = dbp;
		this.sbp = sbp;
		this.edad = edad;
		this.fumar = fumar;
		this.herencia = herencia;
		this.peso = peso;
		this.cc = cc;
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

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

	public LocalDateTime getCreate_at() {
		return create_at;
	}

	public void setCreate_at(LocalDateTime create_at) {
		this.create_at = create_at;
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

	public Enfermero getCc() {
		return cc;
	}

	public void setCc(Enfermero cc) {
		this.cc = cc;
	}
	
	

}
