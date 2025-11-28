package com;

import java.util.Arrays;
import java.util.Scanner;

public class A15 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Dime el tamaño de la tabla");
		int tam = sc.nextInt();
		int[] t = new int[tam];
		System.out.println(Arrays.toString(rellenaPares(t)));
	}
		
	public static int[] rellenaPares(int[] t) {
		int impares = 0;
		int valor = 0;
		
		for (int i = 0; i < t.length; i++) {
			valor = sc.nextInt();
			if (valor % 2 == 0) {
				t[i] = valor;
			} else {
				impares++;
				i--;
			}
			System.out.println("Impares: " + impares);
		}
		return t;
	}
}
