package instrumentos;

public class Piano extends Instrumento {
	
	public Piano (int MAX, Nota[] melodia, int numNotas) {
		super(MAX, melodia, numNotas);
	}
	
	@Override
	public void interpretar() {
		System.out.println("Piano: " + melodia);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
