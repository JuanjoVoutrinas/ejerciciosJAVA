package horas;

public class Hora {
	protected int hora;
	protected int minuto;
	
	public Hora (int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
	}
	
	public void inc() {
		minuto++;
		if (minuto >= 60) {
			minuto = 0;
			hora++;
			
			if (hora >= 23) {
				hora = 0;
			}
		}
		
		
	}

	public int getHora() {
		return hora;
	}
	
	public boolean setHora(int hora) {
		if (hora < 24 && hora >= 0) {
			this.hora = hora;
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return String.format("%02d:%02d", hora, minuto);
	}

	public int getMinuto() {
		return minuto;
	}

	public boolean setMinuto(int minuto) {
		if (minuto < 60 && minuto >= 0) {
			this.minuto = minuto;
			return true;
		} else {
			return false;
		}
		
	}
	
	
	
	
	
	
	

}
