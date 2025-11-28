package com;

import java.util.Scanner;

public class A9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dime las notas del primer trimestre de todos los alumnos");
		int[][] tabla = new int [5][3];
		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + "º Alumno: ");
			tabla [i][0] = sc.nextInt();
			if (tabla [i][0] > 10 || tabla [i][0] < 1) {
				System.out.println("Nota no válida, introduzca de nuevo");
				i--;
			}
			
		}
			
		System.out.println("Ahora, introduce las del segundo trimestre");
		for (int j = 0; j < 5; j++) {
			System.out.print(j + 1 + "º Alumno: ");
			tabla [j][1] = sc.nextInt();
			if (tabla [j][1] > 10 || tabla [j][1] < 1) {
				System.out.println("Nota no válida, introduzca de nuevo");
				j--;
			}
		}
		
		System.out.println("Por último, las del tercer trimestre");
		for (int k = 0; k < 5; k++) {
			System.out.print(k + 1 + "º Alumno ");
			tabla [k][2] = sc.nextInt();
			if (tabla [k][1] > 10 || tabla [k][1] < 1) {
				System.out.println("Nota no válida, introduzca de nuevo");
				k--;
			}
			
		}
		
		media (tabla);
		
		
		
		
	}
	
	public static void media (int[][] tabla) {
		int suma1 = tabla[0][0] + tabla[1][0] + tabla[2][0] + tabla[3][0] + tabla[4][0];
		int suma2 = tabla[0][1] + tabla[1][1] + tabla[2][1] + tabla[3][1] + tabla[4][1];
		int suma3 = tabla[0][2] + tabla[1][2] + tabla[2][2] + tabla[3][2] + tabla[4][2];
		
		int media1 = suma1 / 5;
		int media2 = suma2 / 5;
		int media3 = suma3 / 5;
			
		System.out.println("Media primer trimestre " + media1);
		System.out.println("Media segundo trimestre " + media2);
		System.out.println("Media tercer trimestre " + media3);
	}
	
	
	
}
