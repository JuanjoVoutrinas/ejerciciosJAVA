package com;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos a crear un intervalo");
		System.out.println("Establece el valor mínimo");
		int minimo = sc.nextInt();
		
		System.out.println("Establece el valor máximo");
		int maximo = sc.nextInt();
		
		int numero = sc.nextInt();
		while (minimo > numero || maximo < numero) {
			System.out.println("No está dentro del intervalo");
			numero = sc.nextInt();
		}
		
		System.out.println("Menos mal \nSaliendo...");
		
		
		
		
		
		
		

	}

}
