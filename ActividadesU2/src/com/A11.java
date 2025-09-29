package com;
import java.util.Scanner;

public class A11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime cuanto has sacado de nota");
		int nota = sc.nextInt();
		
		if (nota >= 0 && nota <= 4) {
			System.out.println("La has liado buena, Insuficiente");
		}
		
		if (nota == 5 ) {
			System.out.println("Bueno, suficiente");
		}
		
		if (nota == 6 ) {
			System.out.println("Bien");
		}
		
		if (nota >= 7 && nota <=8) {
			System.out.println("Bomba, notable");
		}
		
		if (nota >= 9 && nota <=10) {
			System.out.println("Genio, sobresaliente");
		}
		
		
		
		
		
		
		
		
	}

}
