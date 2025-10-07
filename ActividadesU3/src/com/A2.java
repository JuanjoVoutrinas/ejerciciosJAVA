package com;
import java.util.Scanner;
public class A2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ponme las edades de los alumnos y te daré la suma de todas, la media, cuantos son mayores de edad y la cantidad de alumnos que introduzcas");
		
		int edad, contador = 0, mayorEdad = 0, total = 0, media;
		edad = sc.nextInt();
		
		do { 
			
			
			if (edad >= 18) {
				mayorEdad++;
			}
			
			total += edad;
			contador++;
			media = total / contador;
			
			System.out.println("--------");
			edad = sc.nextInt();
			
			
		} while (edad > 0);
		
		System.out.println("Edades introducidas: " + contador);
		System.out.println("Suma de las edades: " + total);
		System.out.println("Mayores de edad: " + mayorEdad);
		System.out.println("Media de edades: " + media);
		
		
		
	}

}
