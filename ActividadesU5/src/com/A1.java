package com;

import java.util.Arrays;
import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los valores que desea meter en la tabla");
		double[] tabla = new double[5];
		
		
		
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = sc.nextDouble();
			
		}
			
		for (int i = 0; i <= 4; i++) {
			System.out.print(tabla[i]);
			if (i != tabla.length -1) {
				System.out.print(", ");
			}
		}
		
	}

}
