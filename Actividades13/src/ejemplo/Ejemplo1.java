package ejemplo;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo1 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>(List.of(1,2,3,4,5));
		List<Integer> pares = numeros.stream()
				.filter(n -> n % 2 == 0).toList();
		System.out.println("Pares: " + pares);
		List<Integer> impares = numeros.stream()
				.filter(n -> n % 2 != 0).toList();
		System.out.println("Impares: " + impares);
		
		/*
		 * Mapeo (Transformar datos)
		 */
		List<String> nombres = List.of("Ana", "Juan", "Pedro");
		List<String> mayus = nombres.stream().filter(c -> c.startsWith("Pe")).map(n -> n.toUpperCase()).toList();
		
		System.out.println("Nombres: " + nombres);
		System.out.println("Nombres en mayuscula que empiezan por P: " + mayus);
		
		List<Integer> cuadrado_numeros = numeros.stream()
				.map(num -> num * num).toList();
		
		System.out.println("Cuadrado de nums: " + cuadrado_numeros);
	
		List<Integer> cuadrado_numeros_pares = numeros.stream()
				.filter(n -> n % 2 == 0).map(num -> num * num).toList();
		
		System.out.println("Cuadrado nums pares: " + cuadrado_numeros_pares);
		
		/*
		 * sum
		 */
		
		Integer suma = numeros.stream()
				.reduce(0, Integer::sum);
		System.out.println("Suma de numeros: " + suma);
		
		Integer multi = numeros.stream()
				.reduce(1, (x,y) -> x * y);
		System.out.println("Multiplicación de números: " + multi);
		
		// Maximo sin usar max
		
		int maximo = numeros.stream()
				.reduce(Integer::max).get();
		System.out.println("Máximo de numeros: " + maximo);
		
		//Ordenar --> Limitamos a algo --> a lista
		
		List<Integer> top3_peques = numeros.stream()
				.sorted().limit(3).toList();
		System.out.println("Top 3: " + top3_peques);
		
		
		
		
		
		
	}

}
