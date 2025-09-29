package com;
import java.util.Scanner;
public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Quieres hacer una ecuación de segundo grado de manera fácil y rápida? Si es el caso,");
		System.out.println("a = ");
		int a = sc.nextInt();
		
		System.out.println("b = ");
		int b = sc.nextInt();
		
		System.out.println("c = ");
		int c = sc.nextInt();
		
		double raiz = (Math.sqrt((b * b) - 4 * a * c));
		if (b * b - (4 * a * c) < 0) {
			System.out.println("No hay solución real");
		} else {
			double x1 = ((-b + raiz) / 2 * a);
			
			double x2 = ((-b - raiz) / 2 * a);
		System.out.println("Las dos raíces del polinomio de grado 2 son: " + x1 + " y " + x2);
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
