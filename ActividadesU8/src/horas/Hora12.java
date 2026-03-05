package horas;



public class Hora12 extends Hora{
	protected Periodo periodo;
	
	public Hora12 (int hora, int minuto, Periodo periodo) {
		super(hora, minuto);
		this.periodo = periodo;
		
	}
	
	public void inc() {
		minuto++;
		if (minuto == 60) {
			minuto = 0;
			hora++;
			
			if (hora > 12 && periodo.equals(Periodo.AM)) {
				hora = 1;
				periodo = Periodo.PM;
			}	
		
			if (hora > 12 && periodo.equals(Periodo.PM)) {
				hora = 1;
				periodo = Periodo.AM;
			}
		}
	}
	
	public String toString() {
		return String.format("%02d:%02d", hora, minuto);
	}
	
	
	
	
	
	
}
