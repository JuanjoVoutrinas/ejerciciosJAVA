package com;

import java.util.Scanner;

public class A15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean primo;
		int n = sc.nextInt();
		for (int i = 2; i<=n; i++) {
			primo = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primo = false;
					break;
				}
				
				
				
			}
			System.out.println(i + " -> " + (primo ? " Es primo" : " No es primo"));
		}
		
		
		
		
		
		
		
		
		

	}

}
