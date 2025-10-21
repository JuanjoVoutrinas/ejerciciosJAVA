package com;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int pruebas = numero - 1;
	
		if (esPrimo(numero, pruebas)) {
			System.out.println(numero + " ---> Es primo");
		} else {
			System.out.println(numero + " ---> No es primo");
		}
	}
	
	public static boolean esPrimo (int numero, int pruebas) {
		boolean primo = true;
		while (pruebas > 1) {
			if (numero % pruebas == 0) {
				
				primo = false;
				break;
			}
			pruebas--;
		}
				
		return primo;
				
				
			
	}
	
	
	
	
	
	
}

