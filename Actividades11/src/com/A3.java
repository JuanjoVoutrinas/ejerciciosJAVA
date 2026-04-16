package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce enteros positivos para guardarlos en el archivo A3.txt y cuando acabes, introduce un negativo");
		
		try (FileOutputStream fos = new FileOutputStream("numero.bin");
				DataOutputStream dos = new DataOutputStream(fos)) {
			System.out.println("Introduce números: ");
			double num = sc.nextDouble();
			while (num >= 0) {
				dos.writeDouble(num);
				System.out.println("Número guardado");
				num = sc.nextDouble();
			}
			System.out.println("Guardado terminado, mostrando: ");
			try (FileInputStream fis = new FileInputStream("numero.bin");
				DataInputStream dis = new DataInputStream(fis)) {
				double numero = dis.readDouble();
			System.out.println(numero);
			} catch (IOException e) {
				System.err.println("Error de lectura del archivo");
			}
			
		} catch (IOException e) {
			System.err.println("Error de lectura");
		}
		
		
	}

}
