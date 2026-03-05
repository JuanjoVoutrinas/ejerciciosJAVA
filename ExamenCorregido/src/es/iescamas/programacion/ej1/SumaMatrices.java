package es.iescamas.programacion.ej1;

public class SumaMatrices {
	
	public int[][] matriz1;
	public int[][] matriz2;
	
	public SumaMatrices (int[][] matriz1, int[][] matriz2) { 
	
	this.matriz1 = matriz1;
	this.matriz2 = matriz2;
	}

	public int [][] matrizSumada(int [][] matriz1, int [][] matriz2) {
		int [][] matrizOperada = new int [3][3];
		
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				matrizOperada[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		
		return matrizOperada;
		
	}






}
