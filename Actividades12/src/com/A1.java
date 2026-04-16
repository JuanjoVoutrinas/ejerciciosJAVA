package com;

import java.util.ArrayList;
import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		System.out.println("Añade 10 números");
		int num;
		
		for (int i = 0; i < 10; i++) {
			num = sc.nextInt();
			lista.add(num);
		}
		System.out.println("Lista: " + lista);
		System.out.println("Suma: " + suma(lista));
		System.out.println("Media: " + media(lista));
	}
	
	public static int suma(ArrayList<Integer> lista) {
		Integer suma = 0;
		for (Integer num : lista) {
			suma += num;
		}
		return suma;
	}
	
	public static double media(ArrayList<Integer> lista) {
		double media = (double) suma(lista) / lista.size(); 
		return media;
	}
	
}


