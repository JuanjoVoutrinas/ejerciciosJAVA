package com;

import java.util.Scanner;

public class A10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los dos enteros y te diré si son amigos. \nEl primero:");
		int num1 = sc.nextInt();
		System.out.println("El segundo:");
		int num2 = sc.nextInt();
		amigo(num1, num2);
		
	}
	public static void amigo (int num1, int num2) {
		int total1 = 0;
		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				total1 += i;
			}
		}
		int total2 = 0;
		for (int j = 1; j < num2; j++) {
			if (num2 % j == 0) {
				total2 += j;
			}
		}
		if (total1 == num2 && total2 == num1) {
			System.out.println("Son colegas");
		} else {
			System.out.println("No son colegas (Rubén devuelveme mi euro)");
		}
	
	
	
	
	}
}
