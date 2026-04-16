package act3;

import java.util.ArrayList;
import java.util.List;

public class Main {

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
		
		System.out.println("Aprobados :");
		for (Alumno alumno : listaAlumnos) {
			if (alumno.aprobado()) {
				System.out.println(alumno);
			}
		}
		
		System.out.println("\nMedia general: ");
		double media = 0.0;
		int total = 0;
		for (Alumno alumno : listaAlumnos) {
			total += alumno.getNota();
		}
		media = (double) total / listaAlumnos.size();
		System.out.println(media);
	}

}
