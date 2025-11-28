package com;

import java.util.Arrays;
import java.util.Scanner;

public class A12 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce la primera palabra");
		String frase1 = sc.nextLine();
		System.out.println("Ahora la segurnda");
		String frase2 = sc.nextLine();
		int contador1, contador2;

		frase1 = frase1.toLowerCase();
		frase2 = frase2.toLowerCase();

		if (frase1.length() != frase2.length()) {
			System.out.println("No son anagramas");
		} else {
			char[] tf1 = frase1.toCharArray();
			char[] tf2 = frase2.toCharArray();
			
			Arrays.sort(tf1);
			Arrays.sort(tf2);
			
			
			anagrama(tf1,tf2);
			
		}
		
		
		
			
	}
	
	public static void anagrama(char[] tf1, char[] tf2) {
		boolean anagram = true;
		for (int i = 0; i < tf1.length; i++) {
			
			 if (tf1[i] != tf2[i]) {
				anagram = false;
				break;
			 }	
			
		}
		if (anagram) {
			System.out.println("Es un anagrama");
		} else {
			System.out.println("No es un anagrama");
		}
	}
	
	
	
	
	
	
	
	
}
