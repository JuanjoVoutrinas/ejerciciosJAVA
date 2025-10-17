package com;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		eco (n);
	}
	
	public static void eco (int n) {
		while (n>0) {
			System.out.println("Eco...");
			n--;
		}
	}
		
	
	
	
	
}
