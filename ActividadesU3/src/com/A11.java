package com;
import java.util.Scanner;
public class A11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("PRESIONA ENTER PARA MOSTRAR LAS TABLAS DE MULTIPLICAR DE LOS PRIMEROS 10 NÚMEROS");
		sc.nextLine();
		int numero = 1;
		if (numero >= 1 && numero <= 10) {
			while (numero <=10 && numero >= 1) {
			
				for (int i = 1; i <= 10; i++) {
					System.out.println(numero + " x " + i + " = " + numero * i);
					
				}
				System.out.println("-----------------");
				numero++;
			}
			
		} else {
			System.out.println("No válido");
		}
		
		
		
		

	}

}
