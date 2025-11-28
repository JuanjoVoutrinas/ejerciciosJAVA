package com;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase palabra por palabra y finaliza con \"fin\"");
		String palabra = sc.nextLine();
		String frase = "";
		while (!palabra.equalsIgnoreCase("fin")) {
			frase += palabra + " ";
			palabra = sc.nextLine();
		}
		System.out.println(frase);
	}

}
