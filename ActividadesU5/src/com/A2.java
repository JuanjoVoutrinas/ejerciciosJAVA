package com;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la longitud de la tabla");
		int tamaño = sc.nextInt();
		System.out.println("Introduzca los valores para representarlos en una tabla en orden inverso");
		double[] tabla = new double[tamaño];
		
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = sc.nextDouble();
		}
		
		for (int i = tamaño - 1; i >= 0; i--) {
			System.out.print(tabla[i]);
			if (i != 0) {
				System.out.print(", ");
			}
		}
		
		
		
	}

}
