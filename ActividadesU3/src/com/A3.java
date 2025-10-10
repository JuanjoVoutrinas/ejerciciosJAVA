package com;
import java.util.Scanner;
public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("He generado un número aleatorio, intenta acertarlo");
		int num, intento = 0;
		
		num = (int) (Math.random() * 100) +1;
		
		intento = sc.nextInt();
		while (intento >= 0 && intento != num) {
			
		
			if (intento < num) {
				System.out.println("Es mayor...");
			} if (intento > num) {
				System.out.println("Es menor");
			}
			
			intento = sc.nextInt();
		} 
		
		if (intento == num) {
			System.out.println("Congratulations!!!");
		} else {
			System.out.println("El número era " + num + ", :( \nSaliendo...");
		}
			
		
	}	
	

}


