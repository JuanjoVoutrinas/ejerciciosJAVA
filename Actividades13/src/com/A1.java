package com;

import java.util.ArrayList;
import java.util.List;

public class A1 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10));
		
		List<Integer> mostrarLista = lista.stream().toList();
		System.out.println("Lista: " + mostrarLista);
	}

}
