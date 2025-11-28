package com;

import java.util.Arrays;
import java.util.Scanner;


public class A10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuántos números desea introducir en la tabla?");
		int cantidad = sc.nextInt();
		System.out.println("Introduce los valores de la tabla");
		int[] tabla = new int[cantidad];
		
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = sc.nextInt();
		}
		System.out.println("Procediendo con la separación de pares e impares... \n PULSA ENTER PARA VER LAS DOS TABLAS");
		
		int cuentapares = 0;
		for (int j = 0; j < tabla.length; j++) {
			if (tabla[j] % 2 == 0)  cuentapares++;
			
		}
		
		int[] valoresPares = new int[cuentapares];
		int[] valoresImpares = new int[cantidad - cuentapares];
		int i = 0;
		for (int k = 0; k < valoresPares.length;) {
			
			if (tabla[i] % 2 == 0) {
				valoresPares[k] = tabla[i];	
				k++;
			}
			 i++;
		
		}
		int j = 0;
		for (int l = 0; l < valoresImpares.length;) {
			
			if (tabla[j] % 2 != 0) {
				valoresImpares[l] = tabla[j];
				l++;
			}
			
			j++;
		}
		
		System.out.println("Tabla de PARES: " + Arrays.toString(valoresPares));
		System.out.println("----------------------------------------------------");
		System.out.println("Tabla de Impares: " + Arrays.toString(valoresImpares));
		
		
	}

}
