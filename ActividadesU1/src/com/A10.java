package com;
import java.util.Scanner;
public class A10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TODASS LAS PREGUNTAS DEBEN SER RESPONDIDAS CON TRUE O FALSE");
		System.out.println("Has terminado las tareas?");
		Scanner sc = new Scanner(System.in);
		boolean lluvia, tarea, biblioteca, salir;
		System.out.println("Está lloviendo?");
		
		tarea = sc.nextBoolean();
		
		lluvia = sc.nextBoolean();
		
		System.out.println("Vas a la biblioteca?");
		biblioteca = sc.nextBoolean();
		
		salir = (!lluvia && tarea) || (biblioteca);
		System.out.println("Podrás salir? " + salir);
	}

}
