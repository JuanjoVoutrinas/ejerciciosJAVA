package com;

import java.util.Scanner;

public class A10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número del cual desea hallar su tabla de multiplicar hasta 10");
		int numero = sc.nextInt();
		
		if (numero >= 1 && numero <= 10) {
			
			for (int i = 0; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
			}
		
		} else {
			System.out.println("No válido");
		}
		
		
		
		
		
	}

}
