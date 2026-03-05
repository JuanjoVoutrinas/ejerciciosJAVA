package es.iescamas.programacion.ej2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		char [] t1 = {'P', 'e', 'd', 'r', 'o'};
		char [] t2 = {'J', 'u', 'a', 'n'};
		CombinadorArrays mezclaTest = new CombinadorArrays(t1, t2);
		
		System.out.println(Arrays.toString(mezclaTest.Mezclador(t1, t2)));
		
		
		
		
	}
}
