package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class A11 {

	public static void main(String[] args) {
		
		Map<String, Integer> nombre = new HashMap<String, Integer>();
		nombre.put("Pedro", 23);
		nombre.put("Juanjo", 99);
		nombre.put("Pepe", 50);
		
		Iterator<Entry<String, Integer>> it = nombre.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<String, Integer> entry = it.next();
			if (entry.getKey().contains("Pe")) {
				System.out.println("Lo contiene " + entry.getKey());
			}
			
		}
		
	}

}
