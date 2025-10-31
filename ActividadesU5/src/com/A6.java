package com;

import java.util.Arrays;
import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la puntuación de los programadores (Son 5)");
		int[] puntos = new int[5];
		for (int i = 0; i < puntos.length; i++) {
			System.out.print(i + 1 + ": ");
			puntos[i] = sc.nextInt();
		}
		Arrays.sort(puntos);
		System.out.println(Arrays.toString(puntos));
		System.out.println("Introduzca los puntos de los programadores de exhibición");
		int numex = 1;
		for (int j = 0; j <= 2; j++) {
			System.out.print(j + 1 + ":");
			numex = sc.nextInt();
			if (numex < 0) break; 
			puntos = Arrays.copyOf(puntos, puntos.length+1);
			puntos [puntos.length - 1] = numex;
			
		}
		Arrays.sort(puntos);
		System.out.println("----" + Arrays.toString(puntos) + "----");
		
	}
	

}
