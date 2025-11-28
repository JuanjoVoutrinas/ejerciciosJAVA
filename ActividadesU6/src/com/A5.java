package com;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Soy un chulo, pon tu nombre y apellidos");
		String nombre = sc.nextLine();
		
		nombre = nombre.replaceAll("[ÁAáaÉEéeÍIíiÓOóoÚUúu]", "");
		
		
		System.out.println("Ahora te llamas así: \n" + nombre);
		
		
	}

}
