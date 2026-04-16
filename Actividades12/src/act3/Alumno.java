package act3;

public class Alumno {
	private String nombre;
	private int nota;
	
	public Alumno (String nombre, int nota) {
		this.setNombre(nombre);
		this.setNota(nota);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	public boolean aprobado() {
		if (nota > 4) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return nombre + "[" + nota + "]";
	}
}
