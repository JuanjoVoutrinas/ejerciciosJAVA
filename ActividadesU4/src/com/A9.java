package com;

import java.util.Scanner;

public class A9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número y te diré sus divisores primos");
		int num = sc.nextInt();
		
		divPrimos (num);
	}
		public static void divPrimos (int num) {
			boolean primo;
			int cantidad = 0;
			for (int i = 2; i < num; i++) {
				primo = true;
				for (int j = 2; j < i; j++) {
					
					if (i % j == 0) {
						primo = false;
						break;
					}
				}
				
				if (primo && num % i == 0) {
					System.out.println(i);
					
				}
			}
			
		}
}
