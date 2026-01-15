package com.banco;

public class Banco {
	private final String nombre;
	private double capital;
	private String direccion;
	
	public Banco(String nombre, double capital, String direccion) {
		this.nombre = nombre;
		this.setCapital(capital);
		this.setDireccion(direccion);
	}
	public Banco(String nombre, String direccion) {
		this.nombre = nombre;
		this.setDireccion(direccion);
		this.capital = 5200000;
	}
	
	public String getNombre (String nombre) {
		return nombre;
	}


	public double getCapital() {
		return capital;
	}


	public void setCapital(double capital) {
		this.capital = capital;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getNombre() {
		return nombre;
	}

	
	

}
