package es.iescamas.programacion.ej4;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String [] cadena = {"hola", "avenida", "coquina"};
		
		OrdenArrayString combi = new OrdenArrayString(cadena);
		
		
		System.out.println(Arrays.toString(combi.OrdenarCadenas(cadena)));
	}

}
