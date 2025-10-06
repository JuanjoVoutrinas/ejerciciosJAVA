package com;
import java.util.Scanner;
public class A16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ponme un número del 1 al 99");
		int numero = sc.nextInt();
		
		
		
		
		if (numero < 1 || numero > 99) {
			System.out.println("Número no válido");
		
		} else {
			
		String unidades = switch (numero) {
			case 31,41,51,61,71,81,91  -> " y uno";
			case 32,42,52,62,72,82,92 -> " y dos";
			case 33,43,53,63,73,83,93 -> " y tres";
			case 34,44,54,64,74,84,94-> " y cuatro";
			case 35,45,55,65,75,85,95 -> " y cinco";
			case 36,46,56,66,76,86,96 -> " y seis";
			case 37,47,57,67,77,87,97 -> " y siete";
			case 38,48,58,68,78,88,98 -> " y ocho";
			case 39,49,59,69,79,89,99 -> " y nueve";
			case 21 -> "uno";
			case 22 -> "dos";
			case 23 -> "tres";
			case 24 -> "cuatro";
			case 25 -> "cinco";
			case 26 -> "seis";
			case 27 -> "siete";
			case 28 -> "ocho";
			case 29 -> "nueve";
			
			default -> " ";
		
		};
		
		String decenas = switch (numero) {
			case 1 -> "Uno";
			case 2 -> "Dos";
			case 3 -> "Tres";
			case 4 -> "Cuatro";
			case 5 -> "Cinco";
			case 6 -> "Seis";
			case 7 -> "Siete";
			case 8 -> "Ocho";
			case 9 -> "Nueve";
			case 10 -> "Diez";
			case 11 -> "Once";
			case 12 -> "Doce";
			case 13 -> "Trece";
			case 14 -> "Catorce";
			case 15 -> "Quince";
			case 16 -> "Dieciseis";
			case 17 -> "Diecisiete";
			case 18 -> "Dieciocho";
			case 19 -> "Diecinueve";
			case 20 -> "Veinte";
			case 30 -> "Treinta";
			case 40 -> "Cuarenta";
			case 50 -> "Cincuenta";
			case 60 -> "Sesenta";
			case 70 -> "Setenta";
			case 80 -> "Ochenta";
			case 90 -> "Noventa";
			case 21,22,23,24,25,26,27,28,29 -> "Veinti";
			case 31,32,33,34,35,36,37,38,39 -> "Treinta";
			case 41,42,43,44,45,46,47,48,49 -> "Cuarenta";
			case 51,52,53,54,55,56,57,58,59 -> "Cincuenta";
			case 61,62,63,64,65,66,67,68,69 -> "Sesenta";
			case 71,72,73,74,75,76,77,78,79 -> "Setenta";
			case 81,82,83,84,85,86,87,88,89 -> "Ochenta";
			case 91,92,93,94,95,96,97,98,99 -> "Noventa";
	
			default -> "Error";
		};
		
		
		
		System.out.println(decenas + unidades);
		
		
		}
		
		
		
		
		
		
	}

}
