package com.ejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class SintonizadorTest {
	
	Sintonizador sintonizador;
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		sintonizador = new Sintonizador();
	}
	
	
	
	
	
	@Test
	@DisplayName("Prueba del constructor")
	void testConstructor() {
		double valorEsperado = 80.0;
		double valor = sintonizador.getFrecuencia();
	
		assertEquals(valorEsperado, valor, "Debería haber devuelto 80.0");
	}
	
	@Test
	@DisplayName("Prueba de Getters y Setters")
	void testGetterSetter() {
		double valorEsperado = 90.0;
		double valor = sintonizador.setFrecuencia(90.0);
		
		assertEquals(valorEsperado, valor, "Debería haber devuelto 90.0");
	}
	
	@Test
	void testUPLimiteFinal() {
		sintonizador.setFrecuencia(108.0);
		sintonizador.up();
	
		double valorEsperado = 80;
		double valor = sintonizador.getFrecuencia();
		
		assertEquals(valorEsperado, valor, "Debería haber devuelto 80.0");
	}
		
	
	@Test
	void testDOWNLimiteFinal() {
		sintonizador.setFrecuencia(80.0);
		sintonizador.up();
		
		double valorEsperado = 108.0;
		double valor = sintonizador.getFrecuencia();
	
		assertEquals(valorEsperado, valor, "Debería haber devuelto 108.0");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

