package CalculadoraPack;

import static org.junit.Assert.*;

import javax.swing.SingleSelectionModel;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora calcu = new Calculadora(20, 10);
		int resultado = calcu.suma();
		assertEquals(30, resultado);
	}

	@Test
	public void testResta() {
		Calculadora calcu = new Calculadora(15, 5);
		int resultado = calcu.resta();
		assertEquals(10, resultado);
	}

	@Test
	public void testMultiplica() {
		Calculadora calcu = new Calculadora(5, 6);
		int resultado = calcu.multiplica();
		assertEquals(30, resultado);
	}

	@Test
	public void testDivide() {
		Calculadora calcu = new Calculadora(50, 10);
		int resultado = calcu.divide();
		assertEquals(5, resultado);
	}
	
	@Test
	public void testDivideExcept() {
		try {
			Calculadora calcu = new Calculadora (20, 0);
			int resultado = calcu.divide();
			assertEquals(10,resultado);
			fail("Fallo, Deber�a haber lanzado la xcepci�n");
		}
		catch (ArithmeticException e) {
			System.out.println("PRUEBA satisfactoria");
		}
		
	
	}

}