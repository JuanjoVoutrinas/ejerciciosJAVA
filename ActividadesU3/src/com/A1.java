package com;
import java.util.Scanner;
public class A1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número y te diré si es positivo, si es par, y su cuadrado");
		
		long numeromulti;
		long numero;
		numero = sc.nextInt();
		numeromulti = numero * numero;
		do {
			if (numero % 2 == 0) {
				System.out.println("Es par");
			} else {
				System.out.println("Es impar");
			}
			
			if (numero < 0) {
				System.out.println("Es negativo");
			} else {
				System.out.println("Es positivo");
			}
			
			System.out.println("Su cuadrado es: " + numeromulti);
			numero = sc.nextInt();
			numeromulti = numero * numero;
			
				
		} while (numero != 0);
			
		
		System.out.println("Finishing...");
		
	}

}
