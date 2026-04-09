package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eleccion = 0;
		String linea;
		try (BufferedReader br = new BufferedReader (new FileReader("firmas.txt"))) {
			do {
				System.out.println("Elija una opción");
				System.out.println("1) Ver firmas\n2) Insertar firma\n3) Salir");
				
				
				eleccion = sc.nextInt();
				if (eleccion == 1) {					
					 Path ruta = Path.of("firmas.txt");
			            String contenido = Files.readString(ruta);
			            System.out.println(contenido);
				} else if (eleccion == 2) {
					sc.nextLine();
					String nombre = sc.nextLine();
					boolean repetido = false;
					while ((linea = br.readLine()) != null) {
						if (nombre.equals(linea)) {
							repetido = true;
						}
					}
					if (repetido) {
						System.out.println("Nombre ya inscrito");
					} else {
						try {
							Path ruta = Path.of("firmas.txt");
				            Files.writeString(
				                ruta,
				                nombre + "\n",
				                StandardOpenOption.CREATE,
				                StandardOpenOption.APPEND
				            );
				            System.out.println("Texto añadido.");
				        } catch (Exception e) {
				            System.out.println("Error: " + e.getMessage());
				        }
						
						
						System.out.println("Nombre inscrito exitosamente");
					
				}
			
			} else if (eleccion < 3 || eleccion > 3){
				System.err.println("Número no válido");
			}
			} while (eleccion != 3);
		System.out.println("Saliendo...");
		
			} catch (Exception e) {
				e.printStackTrace();
		}
	}
}