package com;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba una frase, te diré cuántos espacios posee");
		String frase = sc.nextLine();
		int contador = 0;
		for (int i = 0; i < frase.length(); i++) {
			char caracter = frase.charAt(i);
			if (caracter == ' ') {
				contador++;
			}
		}
		System.out.println("Hay " + contador + " espacios");
	}

}
