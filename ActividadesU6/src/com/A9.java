package com;

import java.util.Scanner;

public class A9 {
static String frase, frasejava1, frasejava2  = "";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la supuesta frase del idioma de javalandia");
		frase = sc.nextLine();
		frasejava1 = frase.replace("Javalín, javalón ", "");
		frasejava2 = frase.replace(" javalén, len, len", "");
		if (!frasejava2.equals(frase)) {
			System.out.println("Está en idioma de javalandia \n" + frasejava2);
		} else if (!frasejava1.equals(frase)){
			System.out.println("Está en idioma de javalandia \n" + frasejava1);
		} else {
			System.out.println("No está en idioma de javalandia");
		}
		
		
		
		
		
		
	}

}
