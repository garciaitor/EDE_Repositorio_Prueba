package calculadoroPack;

import static org.junit.Assert.*;

import javax.swing.SingleSelectionModel;

import org.junit.Test;

public class CalculadoroTest {

	@Test
	public void testSuma() {
		Calculadoro calcu = new Calculadoro(20, 10);
		int resultado = calcu.suma();
		assertEquals(30, resultado);
	}

	@Test
	public void testResta() {
		Calculadoro calcu = new Calculadoro(15, 5);
		int resultado = calcu.resta();
		assertEquals(10, resultado);
	}

	@Test
	public void testMultiplica() {
		Calculadoro calcu = new Calculadoro(5, 6);
		int resultado = calcu.multiplica();
		assertEquals(30, resultado);
	}

	@Test
	public void testDivide() {
		Calculadoro calcu = new Calculadoro(50, 10);
		int resultado = calcu.divide();
		assertEquals(5, resultado);
	}
	
	@Test
	public void testDivideExcept() {
		try {
			Calculadoro calcu = new Calculadoro (20, 0);
			int resultado = calcu.divide();
			assertEquals(10,resultado);
			fail("Fallo, Debería haber lanzado la xcepción");
		}
		catch (ArithmeticException e) {
			System.out.println("PRUEBA satisfactoria");
		}
		
	
	}

}