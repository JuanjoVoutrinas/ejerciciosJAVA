package com;

import java.util.Arrays;
import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la primera tabla");
		int[] t1 = new int[6];
		for (int i1 = 0; i1 < t1.length; i1++) {
			t1[i1] = sc.nextInt();
		}
		Arrays.sort(t1);
		System.out.println(Arrays.toString(t1));
		System.out.println("---------------------------");
		System.out.println("Ahora la segunda");
		int[] t2 = new int[6];
		for (int i2 = 0; i2 < t1.length; i2++) {
			t2[i2] = sc.nextInt();
		}
		sc.nextLine();
		Arrays.sort(t2);
		System.out.println(Arrays.toString(t2));
		System.out.println("Tabla tercera generada \n PULSA ENTER PARA VERLA");
		sc.nextLine();
		int[] t3 = new int[t1.length + t2.length];
		int i1 = 0;
		int i2 = 0;
		for (int i3 = 0; i3 < t3.length; i3++) {
			if (i2 >= 6) t3[i3] = t1[i1];
			else if (i1 >= 6) t3[i3] = t2[i2];
			else if (t1[i1] >= t2[i2]) {
				t3[i3] = t2[i2];
				i2++;
			}
			else {
				t3[i3] = t1[i1];
				i1++;
			}
			
			
			
		}
		System.out.println("-----------------------------------");
		System.out.println(Arrays.toString(t3));
		
	}

}
