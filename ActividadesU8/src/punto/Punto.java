package punto;

public class Punto {

	protected double x;
	protected double y;
	
	public Punto (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void desplazaX(double x2) {
		x += x2;
	}
	
	
	public void desplazaXY(double x2, double y2) {
		x += x2;
		y += y2;
	}
	
	public double distanciaEuclidea(Punto otro) {
		return Math.sqrt(Math.pow(otro.x - x, 2) + Math.pow(otro.y - y, 2));
	}
	
	public void muestra() {
		System.out.println("(" + x + ", " + y + ")");
	}
}
