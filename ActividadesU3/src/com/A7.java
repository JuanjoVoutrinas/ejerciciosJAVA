package com;

public class A7 {

	public static void main(String[] args) {
		
		int n = 1, producto = 1; 
		System.out.println("Inmpares : " + n);
		while (n < 20) {
			
			
			System.out.println("Inmpares : " + n);
			producto *= n;
			n += 2;
		}
			
		System.out.println("El producto da: " + producto);
		
	}

}
