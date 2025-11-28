package com;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Jugador 1, introduce la contraseña");
		String contraseña = sc.nextLine();
		System.out.println("¿Qué modo quieres? \n [1]Normal   [2]Difícil   [3]Salir");
		int version = sc.nextInt();
		
		
		if (version == 3) {
			System.out.println("Saliendo...");
		} else if (version == 1) {
			System.out.println("El número de caracteres de la contraseña es: " + contraseña.length());
			System.out.println("La primera letra es: " + contraseña.charAt(0) + "\n La última es: " + contraseña.charAt(contraseña.length() - 1));
			System.out.println("Comienza");
			sc.nextLine();
			String intento = sc.nextLine();
			while (!intento.equals(contraseña)) {
				System.out.println("Incorrecta, pruebe de nuevo");
				intento = sc.nextLine();
			}
			System.out.println("Acertada");
		} else if (version == 2) {
			System.out.println("Comienza");
			sc.nextLine();
			String intento = sc.nextLine();
			while (!intento.equals(contraseña)) {
				System.out.println("Incorrecta...");
				if (intento.compareTo(contraseña) < 0) {
					System.out.println("Tu palabra es mas pequeña, intentalo de nuevo");
				} else if (intento.compareTo(contraseña) > 0) {
					System.out.println("Tu palabra es mas grande, intentalo de nuevo");
				} else {
					System.out.println("Son iguales, sigue intentándolo");
				}
				intento = sc.nextLine();
			}
			System.out.println("Acertada");
		}
		
	}

}
