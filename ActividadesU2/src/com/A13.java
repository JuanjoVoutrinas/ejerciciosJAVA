package com;
import java.util.Scanner;
public class A13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Te voy a preguntar la hora y te la voy a dar un segundo mas tarde");
		System.out.println("¿Segundos?");
		int seg = sc.nextInt();
		
		System.out.println("¿Minutos?");
		int min = sc.nextInt();
		
		System.out.println("¿Horas?");
		int hora = sc.nextInt();
		
		
	
		
		
		
		if (hora >= 24 || min >= 60 || seg >= 60) {
			System.out.println("La hora no es válida");
		
		} else {
		seg++;
		
		if (seg == 60) {
			min++;
			seg = 0;
			
			if (min == 60) {
				hora++;
				min = 0;
				seg = 0;
				
				if (hora == 24) {
					hora = 0;
					min = 0;
					seg = 0;
				}
			}
		}
		 System.out.println("La hora dentro de un segundo es: " + hora + ":" + min + ":" + seg);
		}
		
		
		
		
		
		
		
			
		
		}
		
		
	}


