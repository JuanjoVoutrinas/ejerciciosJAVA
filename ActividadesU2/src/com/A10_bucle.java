package com;
import java.util.Scanner;
public class A10_bucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*######################################
		 * ###############HOLA##################
		 * #####################################
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número del 1 al 9999 si desea saber si es capicua");
		
		int numero = sc.nextInt();
		int unidades = numero % 10;
		int decenas = numero / 10;
		int centenas = numero / 100;
		int millares = numero /1000;
		if (numero <10) {
			System.out.println("Tiene una cifra, no es capicua");
		} else if (numero < 100) {
			if (unidades == decenas) {
				System.out.println("El número " + numero + " es capicua");
			} else {
				System.out.println("No es capicua");
			}
		} else if (numero < 1000) {
			if (unidades == centenas) {
				System.out.println("El número " + numero + " es capicua");
			} else {
				System.out.println("No es capicua");
			}
		} else if (numero < 10000) {
			if (unidades == millares) {
				System.out.println("El número " + numero + " es capicua");
			} else {
				System.out.println("No es capicua");
			}
		}
				
				
				
				
	}

}
