package cajas;

public class Caja {
	protected int ancho;
	protected int alto;
	protected int fondo;
	protected Unidades u;
	
	public Caja (int ancho, int alto, int fondo, Unidades u) {
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		
	}
	
	public double getVolumen() {
		return ancho * alto * fondo;
	}

	@Override
	public String toString() {
		return "Caja [ancho=" + ancho + ", alto=" + alto + ", fondo=" + fondo + ", volumen= " + getVolumen() + ", u=" + u + "]";
	}
	
	
	
	

	
	
}
