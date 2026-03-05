package es.iescamas.programacion.ej4;

import java.util.Arrays;

public class OrdenArrayString {
	
	public String[] cadenas;
	
	public OrdenArrayString (String [] cadenas) {
		this.cadenas = cadenas;
	}
	
	public String [] OrdenarCadenas (String [] cadenas) {
		Arrays.sort(cadenas);
		return cadenas;
	}
	
	
	
}
