package com;

import java.io.BufferedReader;
import java.io.FileReader;


public class A4 {

	public static void main(String[] args) {
		String linea;
		int carac = 0;
		int palab = 0;
		int numLinea = 0;
		
		try (BufferedReader br = new BufferedReader (new FileReader("carta.txt"))) {
            while ((linea = br.readLine()) != null) {
            	numLinea++;
                for (int i = 0; i < linea.length(); i++) {
                	if (linea.trim().charAt(i) != ' ') {
                		carac++;
                	} else {
                		palab++;
                	}
                }
            palab++;
            }
            
            System.out.println("Número de líneas: " + numLinea + "\nNúmero de palabras: " + palab + "\nNúmero de caracteres: " + carac);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Ejecutado");
		}
		
		
		

	}

}
