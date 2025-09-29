package com;
import java.util.Scanner;
public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime dos números enteros y te los ordenaré de forma decreciente, ahora, dime el primer número");
		
		int numero1 = sc.nextInt();
		
		System.out.println("Ahora dime el siguiente número");
		
		int numero2 = sc.nextInt();
		
		if (numero1 < numero2) {
			System.out.println("El orden de los números es: " + numero2 + ", " + numero1);
		
		} else {
			System.out.println("El orden de los números es: " + numero1 + ", " + numero2);
		}
		
		
		
	}

}
