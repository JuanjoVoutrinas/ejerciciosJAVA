package com;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una letra");
		char letra = sc.next().charAt(0);
		
		if (esVocal (letra)) {
			System.out.println("La letra " + letra + " es vocal");
		} else {
			System.out.println("La letra " + letra + " no es vocal");
		}
	}
	
	public static boolean esVocal (char letra) {
		letra = Character.toUpperCase(letra);
		if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
			return true;
		} else {
			return false;
		}
			
	}
	
	
	
	
	
	
	
	
	
	
	
}
