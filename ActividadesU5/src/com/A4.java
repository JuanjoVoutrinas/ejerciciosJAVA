package com;

import java.util.Arrays;
import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tabla = {2,6,13,17,22,98,69,67};
		System.out.println("Introduce la posición del número que desea borrar, contando que el de más hacia la izquierda es 0");
		System.out.println(Arrays.toString(tabla));
		int pos = sc.nextInt();
		
		while (pos >= 0 && tabla.length >= 1) {
			if (pos > tabla.length - 1) {
				System.out.println("Error, intentelo de nuevo");
				pos = sc.nextInt();
			} else if (pos < 0) {
				break;
			} else {
				tabla = borrarElemento(tabla,pos);
				System.out.println(Arrays.toString(tabla));
				pos = sc.nextInt();
				
			}
		}
			
	}
	
	public static int[] borrarElemento(int[] tabla, int pos) {
		tabla[pos] = tabla[tabla.length-1];
		return Arrays.copyOf(tabla,tabla.length-1);
	}
}
