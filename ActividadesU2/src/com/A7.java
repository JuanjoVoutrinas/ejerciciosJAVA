package com;
import java.util.Scanner;
public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Te voy a ordenar tres números enteros que tú me digas");
		
		System.out.println("Primer número:");
		int numero1 = sc.nextInt();
		
		System.out.println("Ahora el segundo");
		int numero2 = sc.nextInt();
		
		System.out.println("Y por último, el tercero");
		int numero3 = sc.nextInt();
		
		
		if (numero1 < numero2 && numero2 > numero3 && numero1 < numero3) {
			System.out.println("El orden de los números es el siguiente: " + numero2 + ", " + numero3 + ", " + numero1);
		}
		
		if (numero1 < numero2 && numero2 > numero3 && numero1 > numero3) {
			System.out.println("El orden de los números es el siguiente: " + numero2 + ", " + numero1 + ", " + numero3);
		}
		
		if (numero1 > numero2 && numero1 > numero3 && numero2 < numero3) {
			System.out.println("El orden de los números es el siguiente: " + numero1 + ", " + numero3 + ", " + numero2);
		}
		
		if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
			System.out.println("El orden de los números es el siguiente: " + numero1 + ", " + numero2 + ", " + numero3);
		}
		
		if (numero3 > numero2 && numero3 > numero1 && numero1 > numero2) {
			System.out.println("El orden de los números es el siguiente: " + numero3 + ", " + numero1 + ", " + numero2);
		}
		
		if (numero3 > numero2 && numero3 > numero1 && numero2 > numero1) {
			System.out.println("El orden de los números es el siguiente: " + numero3 + ", " + numero2 + ", " + numero1);
		}
		
		
		
	}

}
