package com;
import java.util.Scanner;
public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ponme un número y te muestro la tabla de multiplicar de ese número");
		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
				
		}		
	}

}
