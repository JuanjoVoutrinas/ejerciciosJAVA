package com;

import java.util.Scanner;

public class A14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el valor al que desea hallarle su factorial");
		int n = sc.nextInt();
		System.out.println(f(n));
	}
	
	public static int f(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return f(n-1) + f(n-2);
		}
	}

}


