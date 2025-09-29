package com;
import java.util.Scanner;
public class Actividad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Introduzca su año de nacimiento: ");
Scanner sc = new Scanner(System.in);
int year = sc.nextInt();
System.out.println ("introduzca el año actual: ");
	int actualYear = sc.nextInt();
	int userAge = actualYear - year;
System.out.println("Su edad es de " + userAge + " años");
		
	}

}
