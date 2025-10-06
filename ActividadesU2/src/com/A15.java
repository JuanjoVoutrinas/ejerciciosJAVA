package com;
import java.util.Scanner;
public class A15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número de día a la semana (1-7)");
		int dia = sc.nextInt();
		
			String nombreDia = switch (dia) {
			case 1 -> "Lunes";
			case 2 -> "Martes";
			case 3 -> "Miércoles";
			case 4 -> "Jueves";
			case 5 -> "Viernes";
			case 6 -> "Sábado";
			case 7 -> "Domingo";
			default -> "Error";
			
			};
		System.out.println(nombreDia);
		
		
		
	}

}
