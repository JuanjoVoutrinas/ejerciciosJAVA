package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;


public class A8 {

	public static void main(String[] args) {
		String [] personas = new String[0];
		String linea;
		
		try (BufferedReader br = new BufferedReader(new FileReader("perso1.txt"))){
			while ((linea = br.readLine()) != null) {
				personas = Arrays.copyOf(personas, personas.length + 1);
				personas[personas.length - 1] = linea;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try (BufferedReader br = new BufferedReader(new FileReader("perso2.txt"))){
			while ((linea = br.readLine()) != null) {
				personas = Arrays.copyOf(personas, personas.length + 1);
				personas[personas.length - 1] = linea;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("todos.txt"))) {
			Arrays.sort(personas);
			for (int i = 0; i < personas.length; i ++) {
				writer.write(personas[i]);
				writer.newLine();
			}
			
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}

}
