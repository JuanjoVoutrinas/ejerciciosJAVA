package com;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Te voy a decir los múltiplos de 7 menores que 100");
		System.out.println("Presiona ENTER");
		sc.nextLine();
		int num = 7;
		int cociente = 0;
		int producto = 0;
		while (producto < 100) {
			cociente++;
			System.out.println(producto);
			producto = num * cociente;
		}
		
		
	}

}
