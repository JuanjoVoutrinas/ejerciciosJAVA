package com;
import java.util.Scanner;
public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Le voy a calcular la media aritmética de dos notas, quiere?");
Scanner sc = new Scanner(System.in);
String linea = sc.nextLine();
System.out.println("Póngame la primera nota");
		int nota1 = sc.nextInt();
		System.out.println("Ahora la segunda");
		int nota2 = sc.nextInt();
double media = (nota1 + nota2) / 2.0;
System.out.println("Chacho, tu media es de: " + media);
		
		
		
		
	}

}
