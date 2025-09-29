package com;
import java.util.Scanner;
public class A11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuántos kilos de peras has vendido en el primer semestre?");
		int perasprimero = sc.nextInt();
		System.out.println("¿Cuántos kilos de manzanas has vendido en el primer semestre?");
		int manzanasprimero = sc.nextInt();
		System.out.println("¿Cuántos kilos de peras has vendido en el segundo semestre?");
		int perassegundo = sc.nextInt();
		System.out.println("¿Cuántos kilos de manzanas has vendido en el segundo semestre");
		int manzanassegundo = sc.nextInt();
		
		final double precioKgPeras = 1.95;
		final double precioKgManzanas = 2.35;
		
		System.out.println("Has obtenido de beneficio en peras: " + ((perasprimero + perassegundo) * precioKgPeras));
		System.out.println("Has obtenido de beneficio en manzanas: " + ((manzanasprimero + manzanassegundo) * precioKgManzanas));
		double total = ((perasprimero + perassegundo) * precioKgPeras) + ((manzanasprimero + manzanassegundo) * precioKgManzanas);
		System.out.println("El beneficio total es: " + total);
	}

}
