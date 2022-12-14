package com.uis.simom.htadm.model;


import java.time.LocalDate;
//import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name= "paciente")

public class Paciente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String apellido;
	private String barrio;
	@Column(unique=true)
	private String cc;
	private String celular;
	private String ciudad;
	
    private LocalDate create_at=LocalDate.now();
	private String direccion;
	private String email;
    private LocalDate fec_nac;
	private String nombre;
	private String password;
	private String sexo;
	private String tipo_doc;
	private double altura;
	
	public Paciente() {
		
	}

	public Paciente(int id, String apellido, String barrio, String cc, String celular, String ciudad,
			LocalDate create_at, String direccion, String email, LocalDate fec_nac, String nombre, String password,
			String sexo, String tipo_doc, double altura) {
		super();
		this.id = id;
		this.apellido = apellido;
		this.barrio = barrio;
		this.cc = cc;
		this.celular = celular;
		this.ciudad = ciudad;
		this.create_at = create_at;
		this.direccion = direccion;
		this.email = email;
		this.fec_nac = fec_nac;
		this.nombre = nombre;
		this.password = password;
		this.sexo = sexo;
		this.tipo_doc = tipo_doc;
		this.altura = altura;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public LocalDate getCreate_at() {
		return create_at;
	}

	public void setCreate_at(LocalDate create_at) {
		this.create_at = create_at;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getFec_nac() {
		return fec_nac;
	}

	public void setFec_nac(LocalDate fec_nac) {
		this.fec_nac = fec_nac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTipo_doc() {
		return tipo_doc;
	}

	public void setTipo_doc(String tipo_doc) {
		this.tipo_doc = tipo_doc;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
