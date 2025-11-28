package com;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dos palabras, te diré la más grande");
		String palabra1 = sc.nextLine();
		System.out.println("Ahora la segunda");
		String palabra2 = sc.nextLine();
		
		if (palabra1.length() < palabra2.length()) {
			System.out.println("La palabra " + palabra2 + " es la que más letras posee");
		} else if (palabra2.length() < palabra1.length()) {
			System.out.println("La palabra " + palabra1 + " es la que más letras posee");
		} else {
			System.out.println("¡Tienen el mismo número de caracteres!");
		}
		
	}

}
