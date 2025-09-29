package com;
import java.util.Scanner;
public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime dos numeros iguales, me doy cuenta de las mentiras, dime el primero anda");
		int numero1 = sc.nextInt();
		
		System.out.println("ahora dime el siguiente");
		int numero2 = sc.nextInt();
		
		if (numero1 == numero2) {
			System.out.println("Son iguales, gracias por decir la verdad");
		
		} else {
			System.out.println("Has faltado a la verdad, mereces castigo divino");
		}
		
		
		
	}

}
