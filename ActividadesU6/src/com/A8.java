package com;

import java.util.Scanner;

public class A8 {
	static Scanner sc = new Scanner(System.in);
	static String frase = "";
	public static void main(String[] args) {	
		System.out.println("Introduzca la frase palíndroma sin tildes");
		frase = sc.nextLine();
		
		palindroma(frase);
	}
	
	public static void palindroma (String frase) {
		String fraseReves = "";
		for (int i = frase.length() - 1; i >= 0; i--) {
			char caracter = frase.charAt(i);
			fraseReves += caracter;
		}
		
		frase = frase.replace(" ", "");
		fraseReves = fraseReves.replace(" ", "");
		
		if (frase.equals(fraseReves)) {
			System.out.println("La frase es palíndroma");
		} else {
			System.out.println("La frase NO es palíndroma");
		}
		
	}
	
	
	
}
