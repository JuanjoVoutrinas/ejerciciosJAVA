package com;

import java.util.Arrays;
import java.util.Scanner;

public class A11 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce los valores de la matriz 4x4");
		int valorMagico = 0;
		int [][] m = new int[4][4];
		leerMatriz(m);
		
		sumaFila(m);
		sumaColumna(m);
		if (valorMagico == sumaFila(m) && valorMagico == sumaColumna(m)) {
			System.out.println("La matriz es mágica");
		} else {
			System.out.println("La matriz no es mágica");
		}
	}	
		
		
	public static void leerMatriz(int[][] m) {
		for (int f = 0; f < 4; f++) {
			System.out.println("Introduce la fila " + (f + 1));
			for (int c = 0; c < 4; c++) {
				m [f][c] = sc.nextInt();
		}
		
		}
		
		System.out.println(Arrays.toString(m [0]) + "\n" + Arrays.toString(m[1]) + "\n" + Arrays.toString(m[2]) + "\n" + Arrays.toString(m[3]));	
		
	}	
		
	public static int sumaFila(int[][] m) {
		
		int total1 = m[0][0];
		for (int c = 1; c < 4; c++) {
			total1 += m[0][c];
		}
		int total2 = m[1][0];
		for (int c = 1; c < 4; c++) {
			total2 += m[1][c];
		}
		int total3 = m[2][0];
		for (int c = 1; c < 4; c++) {
			total3 += m[2][c];
		}
		int total4 = m[3][0];
		for (int c = 1; c < 4; c++) {
			total4 += m[3][c];
		}
		int confirmacionMagica = 0;
		if (total1 != total2 || total1 != total3 || total1 != total4) {
			confirmacionMagica = 1;
		}
		return confirmacionMagica;
		
		}
	
	public static int sumaColumna (int[][] m) {
		
		int total1 = m[0][0];
		for (int c = 1; c < 4; c++) {
			total1 += m[c][0];
		}
		int total2 = m[0][1];
		for (int c = 1; c < 4; c++) {
			total2 += m[c][1];
		}
		int total3 = m[0][2];
		for (int c = 1; c < 4; c++) {
			total3 += m[c][2];
		}
		int total4 = m[0][3];
		for (int c = 1; c < 4; c++) {
			total4 += m[c][3];
		}
		int confirmacionMagica = 0;
		if (total1 != total2 || total1 != total3 || total1 != total4) {
			confirmacionMagica = 1;
		}
		return confirmacionMagica;
		
	}


}
	


