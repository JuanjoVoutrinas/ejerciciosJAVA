package com;
import java.util.Scanner;
public class A14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Hola, me presento, soy una máquina de redondeo potente y bien engrasada. Ponme un número cualquiera y te lo hago");
		float numero = sc.nextFloat();
		System.out.println("El número redondeado es: " + Math.round(numero));
		
	}

}
