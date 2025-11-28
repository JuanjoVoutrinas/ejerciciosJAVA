package com;

import java.util.Scanner;

public class A10 {
	static Scanner sc = new Scanner(System.in);
	static String cadena = "";
	public static void main(String[] args) {	
		System.out.println("Introduce la palabra/frase la cual desea codificar: ");
		String cadena = sc.nextLine();
		char[] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
		char[] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
		String codificado = "";
		for (int i = 0; i < cadena.length(); i++) {
			codificado += codifica(conjunto1, conjunto2, cadena.toLowerCase().charAt(i));
		}
		
		
		
		System.out.println(codificado);
		
	}
	
	public static char codifica(char conjunto1[], char conjunto2[], char c) {
		for (int i = 0; i < conjunto1.length; i++) {
			 if (conjunto1[i] == c) {
				 return conjunto2[i];
			 }
		}
		
		return c;
	}
}
