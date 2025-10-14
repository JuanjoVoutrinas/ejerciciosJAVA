package com;

import java.util.Scanner;

public class A9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la medida de los árboles para saber el más alto (intorduzca -1 cuando quiera ver el resultado)");
		
		int numero = 1, mayornum = 0, mayorarb = 0, arbol = 1;
		arbol = sc.nextInt();
		while (arbol > 0) {
			
			System.out.println("Árbol " + numero++ + ": " + arbol);
		
		
			
			if (arbol > mayorarb) {
			
			mayorarb = arbol;
			}
			arbol = sc.nextInt();
			}
		
		System.out.println("El árbol más grande es el que mide " + mayorarb + " cm.");

	}

}
