package com;
import java.util.Scanner;
public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dígame su edad, caballero/damisela");
		
		Scanner sc = new Scanner(System.in);
		int edad = sc.nextInt();
		boolean mayor;
		if (edad >= 18) {
			mayor = true;
		System.out.println("Es usted mayor de edad, felicidades! Ojalá verlo en la cárcel");
		}else {
			mayor = false;
			System.out.println("Es usted menor");
		}
	}
 
		
		
		
		
		
}
