package com;

import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero al cual desea hallarle su factorial");
		long n = sc.nextInt();
		long op = 1;
		for (long i = n; i > 0; i--) {
			op *= i;
		}
		System.out.println(n + "! = " + op);
		
		
		
	}

}
