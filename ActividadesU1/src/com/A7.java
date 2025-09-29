package com;
import java.util.Scanner;
public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Introduzca la medida del radio de la circunferencia que desea realizar");
float radio = sc.nextFloat();
float longitud = 2.00F * 3.14F * radio;
float area = 3.14F * radio * radio;
System.out.println("el área de la circunferencia de radio " + radio + "son, respectivamente, " + longitud + " y " + area);
		
		
	}

}
