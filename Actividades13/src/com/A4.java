package com;

import java.util.ArrayList;
import java.util.List;

public class A4 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>(List.of(1,2,3,4,5));
		Integer suma = numeros.stream()
				.reduce(0, Integer::sum);
		System.out.println("Suma de numeros: " + suma);

	}

}
