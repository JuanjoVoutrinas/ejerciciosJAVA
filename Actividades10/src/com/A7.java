package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try (BufferedReader br = new BufferedReader(new FileReader("more.txt"))) {
			String linea;
			int opcion = 0, contador = 0;
			do {
				while ((linea = br.readLine()) != null) {
					System.out.println(linea);
					contador++;
					if (contador == 24) {
						break;
					}
				}
				System.out.println("Desea continuar?\n1) Sí\n2) No");
				opcion = sc.nextInt();

			} while (opcion != 2);
			System.out.println("Saliendo...");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
