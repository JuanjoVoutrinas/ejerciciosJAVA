package com;
import java.util.Scanner;
public class A14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Póngame una fecha y te contestaré yo con la fecha del dia siguiente");
		System.out.println("Dia: ");
		int dia = sc.nextInt();
		
		System.out.println("Mes: ");
		int mes = sc.nextInt();
		
		System.out.println("Año: ");
		int año = sc.nextInt();
		
		int diamax = 0;
		
		switch (mes) {
			
			case 1, 3, 5, 7, 8, 10, 12:
				if (dia > 0 && dia < 32) {
					diamax = 31;
				} else {
					System.out.println("No existe el día de este mes");
				}
			
				break;
			
			case 2:
				if (dia > 0 && dia < 29) {
					diamax = 28;
				} else {
					System.out.println("No existe el dia de este mes");
				}
					
				break;
				
			case 4, 6, 9 ,11:
				if (dia > 0 && dia < 31) {
					diamax = 30;
				} else {
					System.out.println("No existe el día del mes");
				}
				
				break;
				
		
		};
		
		
		
		if (mes <= 12 && mes >= 1) {
			
			dia++;
			
			if (mes == 2 && dia == 29) {
				mes = 3;
				dia = 1;
			}
			
			if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10)&& dia == 32) {
				mes++;
				dia = 1;
			}
			
			if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia == 31) {
				mes++;
				dia = 1;
			}
			
			if (mes == 12 && dia == 32) {
				año++;
				mes = 1;
				dia = 1;
			}
			if (diamax >=  dia) {
			System.out.println("La fecha de mañana es " + dia + "/" + mes + "/" + año);
			}
		}
		
		
		}
	
	}



