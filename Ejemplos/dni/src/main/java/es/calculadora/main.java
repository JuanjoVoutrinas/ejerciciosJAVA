package es.calculadora;

import java.util.Scanner;

public class main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("###### CALCULADORA ######");
		System.out.println("Introduzca los dos números que desea operar: \nPrimero:");
		int numero1 = sc.nextInt();
		System.out.println("Segundo:");
		int numero2 = sc.nextInt();
		System.out.println("[1]Sumar [2]Restar\n[3]Multiplicar [4]Dividir");
		int eleccion = sc.nextInt();
		while (eleccion < 1 || eleccion > 4) {
			System.out.println(eleccion + " no es una opción válida");
			eleccion = sc.nextInt();
		}
		Calculadora bicha = new Calculadora (numero1, numero2);
		if (eleccion == 1) System.out.println(bicha.sumar());
		if (eleccion == 2) System.out.println(bicha.restar());
		if (eleccion == 3) System.out.println(bicha.multiplicar());
		if (eleccion == 4) System.out.println(bicha.dividir());
		
	}

}
