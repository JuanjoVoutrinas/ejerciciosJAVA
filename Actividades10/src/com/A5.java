package com;

import java.io.BufferedReader;
import java.io.FileReader;

public class A5 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader (new FileReader("numeros.txt"))) {
			
			String linea; 
			boolean primeraLinea = true;
			int mayor = 0, menor = 0;
			
			
			while ((linea = br.readLine()) != null) {
				Integer num = Integer.parseInt(linea);
				if (primeraLinea) {
					 mayor = num;
					 menor = num;
					 primeraLinea = false;
					 continue;
				 }
				if (mayor < num) {
					mayor = num;
				}
				if (menor > num) {
					menor = num;
				}
			 }
			
			System.out.println("Número mayor: " + mayor + "\nNúmero menor: " + menor);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("---------\nTerminado");
		}
	}
}
