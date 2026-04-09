package com;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce enteros positivos para guardarlos en el archivo A3.txt y cuando acabes, introduce un negativo");
		
		try (FileOutputStream fos = new FileOutputStream("numero.bin");
				DataOutputStream dos = new DataOutputStream(fos)) {
			
		} catch (IOException e) {
			
		}
		
		
	}

}
