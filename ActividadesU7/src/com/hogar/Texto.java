package com.hogar;

public class Texto {
	private int limite = 10;
	private String cadena;
	
	
	public Texto (String cadena) {
		this.cadena = cadena;
	}
	
	public String getCadena(String cadena) {
		return cadena;
	}
		
	public void addCaracter(String cadena) {
		
		
		
		
		
		if (cadena.length() > limite) {
			System.out.println("Límite superado");
		}
	}
		
		
	
	
	
	
	
	
}
