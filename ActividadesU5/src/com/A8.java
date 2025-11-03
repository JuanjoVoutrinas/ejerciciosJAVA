package com;

import java.util.Arrays;

public class A8 {

	public static void main(String[] args) {
		int[] tabla = {2,6,6,7,7,9,10,10,20};
		
		System.out.println("Tabla: " + Arrays.toString(tabla));
		System.out.println("Tabla eliminando valores repetidos: " + Arrays.toString(sinRepetidos(tabla)));
		
	}
	public static int[] sinRepetidos (int tabla[]) {
		int [] res = {tabla[0]};
		
		for (int i = 1; i < tabla.length; i++) {
			boolean repetido = false;
			for (int j = 0; j < res.length; j++) {
				if (tabla[i] == res[j]) {
					repetido = true;
					break;
				}
			}
			if (!repetido) res = insertar(res, tabla[i]);
			
		}
		return res;
	}
	
	public static int[] insertar(int[] res, int valor) {
		res = Arrays.copyOf(res, res.length + 1);
		res[res.length - 1] = valor;
		return res;
	}
}
