package com;

import java.util.ArrayList;
import java.util.List;

public class A5 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>(List.of(1,2,3,4,5,12,16,77,9,19));
		
		List<Integer> numMayoresDe10 = numeros.stream()
				.filter(n -> n > 10).toList();
		System.out.println("Números mayores de 10: " + numMayoresDe10);
	}

}
