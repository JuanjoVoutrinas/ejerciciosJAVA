package com;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Te voy a decir los número que hay entre dos que tú me digas \nPRESIONA ENTER PARA EMPEZAR");
		sc.nextLine();
		System.out.println("Dime el primero");
		int primero = sc.nextInt();
		System.out.println("Dime el segundo");
		int segundo = sc.nextInt();
		range (primero, segundo);
	}
	
	
	public static void range (int primero, int segundo) {
		if (primero < segundo) {
			int numeroEntre = primero + 1;
			while (numeroEntre >= primero && numeroEntre < segundo) {
				System.out.println(numeroEntre);
				numeroEntre++;
				
			}
			
			
			
			
		} else {
			int numeroEntre = segundo + 1;
			while ( numeroEntre >= segundo && numeroEntre < primero) {
				System.out.println(numeroEntre);
				numeroEntre++;
			}
		}
	}
	
	
	
	
	
	
}
