package com;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de valores que desea introducir");
		int n = sc.nextInt();
		System.out.println("Ahora introduce los valores de la tabla");
		int[] tabla = new int [n];
		
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = sc.nextInt();
		}
		System.out.println("Media positivos: " + mediaPositivos(tabla));
		System.out.println("Media negativos: " + mediaNegativos(tabla));
		System.out.println("Ceros " + cuentaCeros(tabla));
	}
	
	public static double mediaPositivos(int[] tabla) {
		double acumulacion = 0;
		double contador = 0;
		for (int i = 0; i < tabla.length; i++) {
		if (tabla[i] > 0) {
			contador++;
			acumulacion += tabla[i];
			}
		}
		return acumulacion / contador;
	}
	
	public static double mediaNegativos(int[] tabla) {
		double acumulacion = 0;
		double contador = 0;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] < 0) {
				contador++;
				acumulacion += tabla[i];
			}
		}
		if (contador != 0) {
			return acumulacion / contador;
		} else {
			return 0;
		}
	}
	public static int cuentaCeros(int[] tabla) {
		int contador = 0;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == 0) {
				contador++;
			}
		}
		return contador;
	}
	
}
