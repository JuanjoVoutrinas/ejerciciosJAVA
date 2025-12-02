package com;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		//Soy medio subnormal, podría haber reducido todo este bloque poniéndolo en la clase CuentaCorriente
		CuentaCorriente pedro = new CuentaCorriente(5000, "Pedro", "77982547L", -50);
		pedro.mostrarInfo();
		System.out.println("\n ¿Desea ingresar dinero? \n[1] Sí \n[2] No");
		int opcion = sc.nextInt();
		if (opcion == 1) {
			System.out.println("¿Cuanto?");
			float cantidad = sc.nextFloat();
			pedro.ingresarDinero(cantidad);
			System.out.println("Ha depositado " + cantidad + "€. \n Tiene usted " + pedro.getSaldo() + "€");
	}
		System.out.println("\n ¿Desea sacar dinero? \n[1] Sí \n[2] No");
		opcion = sc.nextInt();
		if (opcion == 1) {
			System.out.println("¿Cuanto?");
			float cantidad = sc.nextInt();
			pedro.sacarDinero(cantidad);
			pedro.cambioNombreBanco();
		}
	
		CuentaCorriente alba = new CuentaCorriente(70000);
			alba.mostrarInfo();
			System.out.println("\n ¿Desea ingresar dinero? \n[1] Sí \n[2] No");
			opcion = sc.nextInt();
			if (opcion == 1) {
				System.out.println("¿Cuanto?");
				float cantidad = sc.nextFloat();
				alba.ingresarDinero(cantidad);
				System.out.println("Ha depositado " + cantidad + "€. \n Tiene usted " + alba.getSaldo() + "€");
			}
			System.out.println("\n ¿Desea sacar dinero? \n[1] Sí \n[2] No");
			opcion = sc.nextInt();
			if (opcion == 1) {
				System.out.println("¿Cuanto?");
				float cantidad = sc.nextInt();
				alba.sacarDinero(cantidad);
			}
	
		CuentaCorriente juanjo = new CuentaCorriente(4000, "87453761L", 50);
			juanjo.mostrarInfo();
			juanjo.mostrarInfo();
			System.out.println("\n ¿Desea ingresar dinero? \n[1] Sí \n[2] No");
			opcion = sc.nextInt();
			if (opcion == 1) {
				System.out.println("¿Cuanto?");
				float cantidad = sc.nextFloat();
				juanjo.ingresarDinero(cantidad);
				System.out.println("Ha depositado " + cantidad + "€. \n Tiene usted " + juanjo.getSaldo() + "€");
			}
			System.out.println("\n ¿Desea sacar dinero? \n[1] Sí \n[2] No");
			opcion = sc.nextInt();
			if (opcion == 1) {
				System.out.println("¿Cuanto?");
				float cantidad = sc.nextInt();
				juanjo.sacarDinero(cantidad);
			}
			
			
			
	}
	
}
