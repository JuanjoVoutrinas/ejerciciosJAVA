package com;
import java.util.Scanner;
public class A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número del 0 al 99.999 y te diré cuantas cifras posee");
		
		int number = sc.nextInt();
		
		if (number < 0 || number > 99999) {
			System.out.println("Eres un tonto del nabo");
			
		} else {
			if (number < 10 && number > 0) {
				System.out.println("El número posee únicamente 1 cifra");
			}
		
			if (number < 100 && number > 9) {
				System.out.println("El número posee 2 cifras");
			}
			
			if (number < 1000 && number > 99) {
				System.out.println("El número posee 3 cifras");
			}
			
			if (number < 10000 && number > 999) {
				System.out.println("El número posee 4 cifras");
			}
			
			if (number < 100000 && number > 9999) {
				System.out.println("El número posee 5 cifras");
			}
			
			
			
			
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
	}

}
