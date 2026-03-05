package es.iescamas.programacion.ej1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int [][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int [][] matriz2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
		
		SumaMatrices matriz = new SumaMatrices(matriz1, matriz2);
		
		System.out.println(Arrays.deepToString(matriz.matrizSumada(matriz1, matriz2)));
		
	
	}
}
