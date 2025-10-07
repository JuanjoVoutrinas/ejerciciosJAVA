package com;
import java.util.Scanner;
public class EjemploBucles {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		final String PREGUNTA = "¿Quieres que te cuente el cuento de la buena pipa";
		String palabra_leida;
		
		System.out.println(PREGUNTA);
		palabra_leida = sc.nextLine();
		
		while (!palabra_leida.equals("fin")) {
			System.out.println(PREGUNTA);
			palabra_leida = sc.nextLine();
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
