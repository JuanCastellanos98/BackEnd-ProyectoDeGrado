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
    private int met1;
    private int met2;
    private int met3;
    private int met4;
    private int met5;
    private int t1;
    private int t2;
    private int t3;
    private int t4;
    private int t5;
    private int med_HTA;
    private int niv_glu;
    private int per_abd;
    private int ali;
    private int antecedentesDM2;
	
	
	public Simulacion() {
		
	}

	
	public Simulacion(int id, double altura, double calorias, int dbp, int sbp, int edad, int fumar, int herencia,
			double peso, String paciente, int sexo, int semanaF, int upDown, int upDownCalorias, int semanaC,
			int tiempo, int met1, int met2, int met3, int met4, int met5, int t1, int t2, int t3, int t4, int t5,
			int med_HTA, int niv_glu, int per_abd, int ali, int antecedentesDM2) {
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
		this.met1 = met1;
		this.met2 = met2;
		this.met3 = met3;
		this.met4 = met4;
		this.met5 = met5;
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		this.t4 = t4;
		this.t5 = t5;
		this.med_HTA = med_HTA;
		this.niv_glu = niv_glu;
		this.per_abd = per_abd;
		this.ali = ali;
		this.antecedentesDM2 = antecedentesDM2;
	}





	public int getMed_HTA() {
		return med_HTA;
	}



	public void setMed_HTA(int med_HTA) {
		this.med_HTA = med_HTA;
	}



	public int getNiv_glu() {
		return niv_glu;
	}



	public void setNiv_glu(int niv_glu) {
		this.niv_glu = niv_glu;
	}



	public int getPer_abd() {
		return per_abd;
	}



	public void setPer_abd(int per_abd) {
		this.per_abd = per_abd;
	}



	public int getAli() {
		return ali;
	}



	public void setAli(int ali) {
		this.ali = ali;
	}



	public int getAntecedentesDM2() {
		return antecedentesDM2;
	}



	public void setAntecedentesDM2(int antecedentesDM2) {
		this.antecedentesDM2 = antecedentesDM2;
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


	public int getMet1() {
		return met1;
	}


	public void setMet1(int met1) {
		this.met1 = met1;
	}


	public int getMet2() {
		return met2;
	}


	public void setMet2(int met2) {
		this.met2 = met2;
	}


	public int getMet3() {
		return met3;
	}


	public void setMet3(int met3) {
		this.met3 = met3;
	}


	public int getMet4() {
		return met4;
	}


	public void setMet4(int met4) {
		this.met4 = met4;
	}


	public int getMet5() {
		return met5;
	}


	public void setMet5(int met5) {
		this.met5 = met5;
	}


	public int getT1() {
		return t1;
	}


	public void setT1(int t1) {
		this.t1 = t1;
	}


	public int getT2() {
		return t2;
	}


	public void setT2(int t2) {
		this.t2 = t2;
	}


	public int getT3() {
		return t3;
	}


	public void setT3(int t3) {
		this.t3 = t3;
	}


	public int getT4() {
		return t4;
	}


	public void setT4(int t4) {
		this.t4 = t4;
	}


	public int getT5() {
		return t5;
	}


	public void setT5(int t5) {
		this.t5 = t5;
	}

	

	
	

	

}
