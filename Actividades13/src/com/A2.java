package com;

import java.util.ArrayList;
import java.util.List;

public class A2 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>(List.of(1,2,3,4,5));
		List<Integer> pares = numeros.stream()
				.filter(n -> n % 2 == 0).toList();
		System.out.println("Pares: " + pares);

	}

}
