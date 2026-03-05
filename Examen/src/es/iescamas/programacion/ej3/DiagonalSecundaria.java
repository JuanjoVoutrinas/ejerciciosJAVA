package es.iescamas.programacion.ej3;

public class DiagonalSecundaria {

	public int[][] matriz;

	public DiagonalSecundaria(int[][] matriz) {
		this.matriz = matriz;
	}

	public int SumaDiagonalSec(int[][] matriz) {

		int acumulacion = matriz.length - 1;
		int suma = 0;
		for (int i = 0; i < matriz.length; i++) {
			suma += matriz[i][acumulacion];
			acumulacion--;
		}
		return suma;
	}
}
