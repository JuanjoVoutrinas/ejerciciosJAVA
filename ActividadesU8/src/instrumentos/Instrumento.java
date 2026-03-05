package instrumentos;

import java.util.Arrays;

public abstract class Instrumento {
	protected int MAX = 100;
	protected Nota[] melodia;
	protected int numNotas = melodia.length;
	
	public Instrumento (int MAX, Nota[] melodia, int numNotas) {
		this.melodia = melodia;
		this.MAX = MAX;
		this.numNotas = numNotas;
	}
	
	public boolean add(Nota nota) {
		
		if (numNotas >= MAX) {
			Arrays.copyOf(melodia, numNotas + 1);
			melodia[numNotas - 1] = nota;
			return true;
		} else {
			return false;
		}
		
	}
	
	public abstract void interpretar();
	
	
	
	
	
	
}
