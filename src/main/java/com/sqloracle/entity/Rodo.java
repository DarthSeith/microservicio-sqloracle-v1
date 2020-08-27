package com.sqloracle.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rodo")
public class Rodo {
	
	@Id
	private String nombre;
	private int edad;
	private Date fecha;

	public Rodo() {
		super();
	}

	public Rodo(String nombre, int edad, Date fecha) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
