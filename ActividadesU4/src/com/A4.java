package com;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 2 números y te diré cual es el mayor \nDiga el primero");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println("Son iguales");
		} else {
			System.out.println(mayor (num1, num2) + " es mayor.");
		}
	
	}

	public static int mayor (int num1, int num2) {
		
		if (num1 > num2) {
			return num1;
		} else if (num1 == num2){
			return 0;
		} else {
			return num2;
		}
	}
	
}
