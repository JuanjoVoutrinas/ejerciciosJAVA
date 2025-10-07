package com;
import java.util.Scanner;
public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Aprenderemos a contar, juntos... /nPonme un número");
		int num = sc.nextInt();
		int numero = 0;
		while (numero < num) {
			numero++;
			System.out.println(numero);
		}
		
		
	}

}