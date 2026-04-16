package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import act3.Alumno;

public class A7 {

	public static void main(String[] args) {
		
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>(
				List.of(
						new Alumno("Pedro", 8),
						new Alumno("Cerdo", 1),
						new Alumno("Pillo", 5),
						new Alumno("Alba", 10),
						new Alumno("Juan", 3)
						)
				)
		;
		//--------------------------------------clase ::valor por el cual se ordena
		listaAlumnos.sort(Comparator.comparing(Alumno::getNota));
		System.out.println(listaAlumnos);
		
	}

}
