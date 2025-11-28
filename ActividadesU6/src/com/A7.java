package com;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase = sc.nextLine();
		System.out.println("Introduce la palabra que quieres que busque en la frase");
		String palabra = sc.nextLine();
		int contador = 0;
		int index = 0;
		while ((index = frase.indexOf(palabra, index)) != -1) {
			contador++;
			index += palabra.length();	
		}
		
		System.out.println("La palabra " + palabra + " aparece " + contador + " veces");
		
	}

}
