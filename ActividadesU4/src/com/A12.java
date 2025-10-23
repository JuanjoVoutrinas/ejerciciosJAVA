package com;

import java.util.Scanner;

public class A12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer entero:");
		int a = sc.nextInt();
		System.out.println("Introduce el segundo entero:");
		int b = sc.nextInt();
		System.out.println("Operación \n|1|: Suma \n|2|: Resta \n|3|: Multiplicación \n|4|: División");
		int operacion = sc.nextInt();
		System.out.println(calculadora(a,b,operacion));
	}
	
	public static double calculadora(int a, int b, int operacion) {
		if (operacion == 1) {
			int total = a + b;
			return total;
		} else if (operacion == 2) {
			int total = a - b;
			return total;
		} else if (operacion == 3) {
			int total = a * b;
			return total;
		} else if (operacion == 4) {
			double total = a / b;
			return total;
		} else {
			return 0;
		}
			
	}
}
