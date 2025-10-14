package com;

import java.util.Scanner;

public class A13 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca las 6 notas");
		int nota = 0;
		int condicionados = 0;
		int aprobados = 0;
		int numNotas = 1;
		int suspensos = 0;
		if (nota >= 0 && nota <= 10) {
			while (numNotas <= 6) {
				if (nota >= 0 && nota <= 10) {
					nota = sc.nextInt();
				
				if (nota >= 5) {
					aprobados++;
				}
				if (nota == 4){
					condicionados++;
				}
				if (nota < 4) {
					suspensos++;
				}
				numNotas++;
				
				}else {
					System.out.println("Nota no válida");
				 break;
				}
			}
		System.out.println("Hay " + suspensos + " suspensos, " + aprobados + " aprobados y " + condicionados + " condicionados.");
			
		} else {
			System.out.println("Nota no válida");
		}
		
		
		
		
		
		
		
		
		
	}

}
