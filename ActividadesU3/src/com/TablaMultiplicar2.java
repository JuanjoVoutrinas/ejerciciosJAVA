package com;
import java.util.Scanner;
public class TablaMultiplicar2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int i = 1;
		do {
			System.out.println(numero + " x " + i + " = " + numero * i);
			i++;
		} while (i <= 10);
	}

}
