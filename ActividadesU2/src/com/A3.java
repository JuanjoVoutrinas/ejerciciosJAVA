package com;
import java.util.Scanner;
public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime dos números distintos y te diré cual es el menor, ahora dime el primero");
		int numero1 = sc.nextInt();
		
		System.out.println("Dime el segundo");
		int numero2 = sc.nextInt();
		
		if (numero1 < numero2) {
			System.out.print("El número " + numero2 + " es el mayor");
		} else {
			System.out.println("El número " + numero1 + " es el mayor");
			
		}
		
		
		
		
	}

}
