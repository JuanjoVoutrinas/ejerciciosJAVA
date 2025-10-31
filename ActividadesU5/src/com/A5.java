package com;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("EL JUEGO DE LA CÁMARA SECRETA \nPULSA ENTER PARA EMPEZAR");
		sc.nextLine();
		System.out.println("Indique el tamaño de la tabla que desea resolver");
		int longitud = sc.nextInt();
		int[] combinacion = new int[longitud];
		
		for (int i = 0; i < combinacion.length; i++) {
			combinacion[i] = (int) (Math.random() * 5 + 1);
		}
		System.out.println("Tabla generada, procede con su adivinación");
		int fallos = 1;
		while (fallos != 0) {
			fallos = 0;
			for ( int i = 0; i < combinacion.length; i++) {
				int intento = sc.nextInt();
				if (intento > combinacion[i]) {
					System.out.println(i + 1 + ". Menor");
					fallos++;
				} else if ( intento < combinacion[i]) {
					System.out.println(i + 1 + ". Mayor");
					fallos++;
				} else {
					System.out.println(i + 1 + ". Correcto");
					
				}
			}
			if (fallos != 0) System.out.println("-----------¡Otra ronda!-----------");
		}
		System.out.println("¡Felicidades! ¡Has ganado!");
		
	}

}
