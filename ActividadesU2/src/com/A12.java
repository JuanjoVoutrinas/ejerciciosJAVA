package com;
import java.util.Scanner;
public class A12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime una fecha, te diré si existe o no");
		System.out.println("Dime el día (en número)");
		
		int  dia, mes, año;
				
				dia = sc.nextInt();
				
		System.out.print("Dime el mes (número también)");
		
				mes = sc.nextInt();
				
		System.out.println("Dime el año");
		
				año = sc.nextInt();
				
				
				
				
				
		switch (mes) {
		
		
			case 1, 3, 5, 7, 8, 10, 12:
			if (dia > 0 && dia < 31) {
				System.out.println("Existe el día de este mes");
			} else {
				System.out.println("No existe el día de este mes");
			}
			
			break;
			
			case 2:
			if (dia > 0 && dia < 28) {
				System.out.println("Existe el dia");
			} else {
				System.out.println("No existe el dia de este mes");
			}
				
			break;
			
			case 4, 6, 9 ,11:
			if (dia > 0 && dia < 30) {
				System.out.println("Existe el día");
			} else {
				System.out.println("No existe el día del mes");
			}
			
			break;
				
		}
		
		if (mes > 0 && mes < 12) {
			System.out.println("Existe el mes");
		} else {
			System.out.println("No existe el mes");
		}
		 
		
		
	
		}
		
				
				
				
				
			
		
		
		
		
		
		
		
		
		
		
}


