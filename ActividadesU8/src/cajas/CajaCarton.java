package cajas;

public class CajaCarton extends Caja {

	public CajaCarton(int ancho, int alto, int fondo) {
		super(ancho, alto, fondo, Unidades.cm);
		
	}

	@Override
	public double getVolumen() {
		
		return super.getVolumen() * 0.8;
	}

	@Override
	public String toString() {
		
		return "Volumen: " + getVolumen() + "\n Superficie: " + getSuperficie();
	}
	
	public double getSuperficie() {
		return 2 * (fondo * ancho + fondo * alto + ancho * alto);
	}
	
	
	
}
