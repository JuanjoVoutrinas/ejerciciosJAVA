package com;

import java.util.Scanner;

public class A13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] t = {2,6,3,8,44,7,20};
		System.out.println("Te diré el número mayor \nPULSA ENTER PARA VERLO");
		sc.nextLine();
		
		System.out.println(maximo(t));

	}
	public static int maximo(int[] t) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < 6; i++) {
			if(t[i] >= max) max = t[i];
		}
		return max;
	}

}
