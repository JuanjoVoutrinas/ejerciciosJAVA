package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class A2 {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>(List.of(1,2,2,2,3,6,7,7,8,4,3));
		HashSet<Integer> lista2 = new HashSet<Integer>(lista);
		ArrayList<Integer> listaOrdenada = new ArrayList<Integer>(lista2);
		System.out.println("Lista sin repetidos: " + listaOrdenada);
	}

}
