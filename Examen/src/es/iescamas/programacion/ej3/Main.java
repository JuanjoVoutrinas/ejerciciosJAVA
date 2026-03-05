package es.iescamas.programacion.ej3;

public class Main {

	public static void main(String[] args) {
		int[][] matriz = { { 9, 8, 0 }, { 6, 5, 4 }, { 3, 2, 1 } };
		DiagonalSecundaria prueba = new DiagonalSecundaria(matriz);
		System.out.println(prueba.SumaDiagonalSec(matriz));
		// Da 15, bien hecho
	}

}
