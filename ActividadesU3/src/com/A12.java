package com;
import java.util.Scanner;
public class A12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca las 5 notas");
		int aprobados = 0;
		int numNotas = 1;
		int nota = 0;
		int suspensos = 0;
		
			while (numNotas <= 5) {
				nota = sc.nextInt();
				if (nota >= 0 && nota <= 10) {

					if (nota < 5) {
					suspensos++;
					} else {
					aprobados++;
					}
				
					numNotas++;
				} else {
					System.out.println("Nota no válida");
					break;
				}
			}
		
			
			
			
			
			System.out.println("Hay " + suspensos + " suspensos y " + aprobados + " aprobados.");
			
		
		
		

	}

}
