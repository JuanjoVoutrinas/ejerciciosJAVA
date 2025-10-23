package com;

import java.util.Scanner;

public class A11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Ponga la base del número:");
		double base = sc.nextInt();
		System.out.println("Ponga el exponente:");
		int expo = sc.nextInt();
		System.out.println(potenciaIterativa(base,expo));
		System.out.println();
		System.out.println(potenciaRecursiva(base,expo));
	}
	
	//Iterative
	public static double potenciaIterativa(double base,int expo) {
		double total = 1;
		for (int i = expo; i > 0; i--) {
			total *= base;
		}
		return total;
	}	
	
	//Recursive
	public static double potenciaRecursiva(double base, int expo) {
		if (expo == 0) 
			return 1;
		 else 
			return base * potenciaRecursiva(base,expo - 1);
			
	}
}




