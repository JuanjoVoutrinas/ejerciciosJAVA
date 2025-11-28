package com;

import java.util.Scanner;

public class A14 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("introduzca su apuesta (5 dígitos)");
		int[] ganadora = {2,2,0,9,8};
		int[] apuesta = new int[5];
		
		
		
		int aciertos = 0;
		while (aciertos < 5) {
			aciertos = 0;	
			for (int i = 0; i < 5; i++) {
				apuesta [i] = sc.nextInt();
			}
			for (int j = 0; j < 5; j++) {
				if (apuesta[j] == ganadora[j]) {
					aciertos++;
				}
			
			}
			System.out.println("aciertos: " + aciertos);
		}
		System.out.println("Si, era ese");
	}

}
