package com;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime 3 números y te diré cual es el mayor de todos ellos \nIntroduzca el primero");
		int num1 = sc.nextInt();
		System.out.println("Ahora el otro");
		int num2 = sc.nextInt();
		System.out.println("Y ahora el último");
		int num3 = sc.nextInt();
		
		System.out.println(mayor (num1, num2, num3));
	}
	
	public static int mayor (int num1, int num2, int num3) {
		
		if (num1 >= num2 && num1 >= num3) {
			return num1;
		} else if (num2 >= num1 && num2 >= num3) {
			return num2;
		} else {
			return num3;
		}
	
	
	}

}
