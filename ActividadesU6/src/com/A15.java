package com;

import java.util.Scanner;

public class A15 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int decision = 0;
		do {
			System.out.println("-----EL JUEGO DEL ANAGRAMA-----\n[1]Jugar   [2]Instrucciones   [3]Salir");
			decision = sc.nextInt();
			switch (decision) {
				case 1: jugar();
					break;
				case 2: instrucciones(sc);
					break;
				case 3: System.out.println("Saliendo...");
					break;
				default: System.out.println("Mete otro número");
				decision = sc.nextInt();
			}	
		} while (decision != 3);
		
		
	}
	
	public static void jugar() {
		sc.nextLine();
		System.out.println("Jugador 1, introduce la palabra");
		String laPalabra = sc.nextLine();
		laPalabra = laPalabra.toLowerCase();
		char[] formacion =laPalabra.toCharArray();
		
		
			for (int i = 0; i < laPalabra.length(); i++) {
				char temporal = formacion[i];
				int j = (int) (Math.random() * (i + 1));
					formacion[i] = formacion[j];
					formacion[j] = temporal;
				
			}	
			String texto = "";
			for (int i = 0; i < formacion.length; i++) {
				texto += formacion[i];
			}
			
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + texto);
			String intento = "";
			do {
				intento = sc.nextLine();
				char[] tPalabra = laPalabra.toCharArray();
				char[] tIntento = intento.toLowerCase().toCharArray();
				int contadorLetras = 0;
				for (int i = 0; i < laPalabra.length(); i++) {
					if (tIntento[i] == tPalabra[i]) {
						contadorLetras++;
					}
				}
				System.out.println("Coinciden " + contadorLetras + " letras");
			} while (!intento.equalsIgnoreCase(laPalabra));
		System.out.println("Felicidades, la palabra era " + laPalabra);
		
	}
	
	public static void instrucciones(Scanner sc) {
		System.out.println("El primer jugador mete una palabra, el siguiente intenta adivinarla a partir de su anagrama aleatorio");
		System.out.println("Pulsa enter para volver" );
		sc.nextLine();
		sc.nextLine();
		
	}
	
	
	
	
}
