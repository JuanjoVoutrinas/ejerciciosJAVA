package com;

import java.util.Scanner;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el número");
		double numero = sc.nextDouble();
		
		try (FileOutputStream fos = new FileOutputStream("numero.bin");
			DataOutputStream dos = new DataOutputStream(fos)) {
			
			dos.writeDouble(numero);
			System.out.println("Número guardado");
			

		} catch (IOException e) {
			System.err.println("Error al escribir");	
		}
		
	}

}
