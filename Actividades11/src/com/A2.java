package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class A2 {

	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("numero.bin");
				DataInputStream dis = new DataInputStream(fis)) {
				double numero = dis.readDouble();
			System.out.println(numero);
			
		} catch (IOException e) {
			System.err.println("Error de lectura");
		}
		
		

	}

}
