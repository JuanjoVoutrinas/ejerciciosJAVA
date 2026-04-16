package com;

import java.util.ArrayList;
import java.util.List;

public class A3 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>(List.of(1,2,3,4,5));
		List<Integer> cuadrado_numeros = numeros.stream()
				.map(num -> num * num).toList();
		
		System.out.println("Cuadrado de nums: " + cuadrado_numeros);

	}

}
