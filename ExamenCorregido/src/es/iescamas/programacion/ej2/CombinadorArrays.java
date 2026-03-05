package es.iescamas.programacion.ej2;

public class CombinadorArrays {

	public char [] t1;
	public char [] t2;
	
	public CombinadorArrays(char[] t1, char[] t2) {
		this.t1 = t1;
		this.t1 = t2;
	}
	
	public char [] Mezclador(char[] t1, char[] t2) {
		int j = 0;
		String t1String = new String(t1);
		String t2String = new String(t2);
		t1String = t1String.toLowerCase();
		t2String = t2String.toLowerCase();
		char [] t1Buena = t1String.toCharArray();
		char [] t2Buena = t2String.toCharArray();
		char [] combinacion = new char [t1.length + t2.length];
		for (int i = 0; i < combinacion.length; i++) {
			
			combinacion[i] = t1Buena[j];
			i++;
			combinacion[i] = t2Buena[j];
			j++;
		}
		
		
		return combinacion;
	}
	
	
	
	
	
	
	
	
}
