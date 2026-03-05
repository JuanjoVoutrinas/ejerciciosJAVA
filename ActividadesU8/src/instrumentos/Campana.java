package instrumentos;

public class Campana extends Instrumento {
	
	public Campana (int MAX, Nota[] melodia, int numNotas) {
		super(MAX, melodia, numNotas);
	}
	@Override
	public void interpretar() {
		System.out.println("Campana: " + melodia);
	}
	
	
	
	
	
	
	
	
}
