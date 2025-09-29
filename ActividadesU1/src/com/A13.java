package com;
import java.util.Scanner;
public class A13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Te voy a calcular la media de cualquier asignatura, sólo ponme la nota del primer trimestre");
		double nota1 = sc.nextDouble();
		System.out.println("Ahora la del segundo trimestre");
		double nota2 = sc.nextDouble();
		System.out.println("Y por último, la del tercer trimestre");
		double nota3 = sc.nextDouble();
		
		System.out.println("Tu calificación en el boletín de notas será " + (Math.round(nota1) + Math.round(nota2) + Math.round(nota3)) / 3);
		
		System.out.println("Tu calificación en el expediente académico será " + (nota1 + nota2 + nota3) / 3);
		
	}

}
