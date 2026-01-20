package es.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName("Prueba del método sumar()")
	void test01_sumar() {
		int num1 = 1;
		int num2 = 2;
		int resultadoEsperado = -1;
		Calculadora.setNum1(num1);
		Calculadora.setNum2(num2);
		int resultado = Calculadora.restar();
		assertEquals(resultadoEsperado, resultado, "El resultado que se esperaba era -1");
		
	}

}
