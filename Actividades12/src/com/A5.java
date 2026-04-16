package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class A5 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> listaPalabras = new HashMap<String, Integer>();
		try (BufferedReader br = new BufferedReader(new FileReader("Act5.txt"))) {
		String linea;
		String[] palabras = null;
		while((linea = br.readLine()) != null){
			palabras = linea.toLowerCase().split(" ");
		}
		br.close();
		for (int i = 0; i < palabras.length; i++) {
			
		}
		
		
		
		} catch (IOException e) {
			System.err.println("Error de lectura");
		}
		
		
		

	}

}
