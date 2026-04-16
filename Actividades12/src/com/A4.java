package com;

import java.util.HashMap;
import java.util.Map;

public class A4 {

	public static void main(String[] args) {
		Map<String, String> diccionario = new HashMap<String, String>();
		diccionario.put("Hola", "Hello");
		diccionario.put("Manzana", "Apple");
		diccionario.put("Mañana", "Tomorrow");
		diccionario.put("Hoy", "Today");
		diccionario.put("Ayer", "Yesterday");
		diccionario.put("Adiós", "Bye");
		diccionario.put("Cerveza", "Beer");
		diccionario.put("Bastardo", "Bastard");
		diccionario.put("Perro", "Dog");
		diccionario.put("Gato", "Cat");
		
		System.out.println(diccionario.get("Cerveza"));
		
	}

}
