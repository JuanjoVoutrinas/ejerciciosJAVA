package com.ejemplo;

public class Sintonizador {

		private double frecuencia;
		private final double MAX_FRECUENCIA = 108.0;
		private final double MIN_FRECUENCIA = 80.0;
		private final double SALTO = 0.5;
		
		public Sintonizador() {
			super();
			frecuencia = 80.0;
		}
		
		public double getFrecuencia() {
			return frecuencia;
		}

		public double setFrecuencia (double frecuencia) {
			this.frecuencia = frecuencia;
			return frecuencia;
		}

		public void up() {
			if (frecuencia + SALTO > MAX_FRECUENCIA) {
				frecuencia = MIN_FRECUENCIA;
			} else {
				frecuencia += SALTO;
			}
		}

		public void down() {
			if (frecuencia - SALTO < MIN_FRECUENCIA) {
				frecuencia = MAX_FRECUENCIA;
			} else {
				frecuencia -= SALTO;
			}
		}

		public void display() {
			System.out.println(this.frecuencia + " MGz");
		}
		


}
