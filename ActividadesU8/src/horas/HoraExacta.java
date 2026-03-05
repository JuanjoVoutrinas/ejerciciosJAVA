package horas;

public class HoraExacta extends Hora{
	private int segundo;
	
	public HoraExacta (int hora, int minuto, int segundo) {
		super(hora, minuto);
		this.segundo = segundo;
	}
	
	public int getSegundo() {
		return segundo;
	}
	
	public boolean setSegundo(int segundo) {
		if (segundo >= 0 && segundo < 60) {
			return true;
		} else {
			return false;
		}
	}
	
	public void inc() {
		segundo++;
		if (segundo >= 60) {
			segundo = 0;
			super.inc();
		}
	}
	
	public boolean iguales(HoraExacta otraHora) {
		if (otraHora == null) return false;
		
		if (this.hora == otraHora.hora && this.minuto == otraHora.minuto && this.segundo == otraHora.segundo) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", hora, minuto, segundo);
	}
	
	
	
}
