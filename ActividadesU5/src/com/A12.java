package com;

import java.util.Arrays;
import java.util.Scanner;

public class A12 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] m = new int [5][5];
		
			
			
		
		for (int f = 0; f < 5; f++) {
			for (int c = 0; c < 5; c++) {
				m[f][c] = f + c;
			}
		}
		mostrarMatriz(m);
	}
	
	
	public static void mostrarMatriz(int [][] m) {
		for (int f = 0; f < 5; f++) {
			System.out.println(Arrays.toString(m[f]));
		}
	}
	
}
		

