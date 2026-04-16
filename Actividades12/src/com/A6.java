package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A6 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>(List.of(1,4,5,6,7,8));
		Iterator<Integer> it = lista.iterator();
		
		while(it.hasNext()) {
			Integer num = it.next();
			if (num % 2 == 0) {
				it.remove();
			}
		}
		System.out.println("Lista alterada: " + lista);
		
	}

}
