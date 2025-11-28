package com;

import java.util.Scanner;

public class A6 {
static String frase;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Soy aún más chulo que antes, escribe una frase");
		String frase = sc.nextLine();
		String fraseAlReves = "";
		char caracter;
		for(int i = frase.length() - 1; i >= 0; i--) {
			caracter = frase.charAt(i);
			fraseAlReves += caracter;
		}
		System.out.println("Mira lo que hago: " + fraseAlReves);
	}

}
