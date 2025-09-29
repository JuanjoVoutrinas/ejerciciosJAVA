package com;
import java.util.Scanner;
public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insterta un número, te diré si es par o inpar");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("El número " + numero + " es par");
		} else {
			System.out.println("El número " + numero + " es impar");
		}
		
		
		
		
	}

}
