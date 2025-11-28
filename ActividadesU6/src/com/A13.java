package com;

import java.util.Arrays;
import java.util.Scanner;

public class A13 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce la frase");
		String frase = sc.nextLine();
		frase = frase.toLowerCase();
		
		char[] tablilla = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int[] contador = new int[26];
		for (char letra : frase.toCharArray()) {
			if (letra >= 'a' && letra <= 'z'){
				contador[letra - 'a']++;
				
				
			}
		}
		System.out.println(Arrays.toString(contador));
		System.out.println(Arrays.toString(tablilla));
		
	}

}
