package es.calculadora;

public class Calculadora {
	private static int num1;
	private static int num2;


	public static int sumar() {
		return num1 + num2;
	}
	public static int restar() {
		return num1 - num2;
	}
	public static int multiplicar() {
		return num1 * num2;
	}
	public static double dividir() throws Exception {
		if (num2 == 0) throw new Exception("No se puede dividir entre 0");
		else return num1 / num2;
	}
	
	public Calculadora (int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public static void setNum1(int num12) {
		
		
	}
	public static void setNum2(int num22) {
		// TODO Auto-generated method stub
		
	}
	
	
}