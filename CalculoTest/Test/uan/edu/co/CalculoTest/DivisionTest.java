package uan.edu.co.CalculoTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DivisionTest {

	private static Calculo numeros;
	// Metodo Inicializacion
	@Before
	public void setUp() {
		System.out.println("Corriendo: setUp");
		
		numeros = new Calculo(35, 7);
	}

	@Test(expected = ArithmeticException.class)
	public void testDivisionException() {
		int var = 0;
		Calculo.division();
	}

	// Prueba de tiempo aprobada (posible variacion en funcion del equipo)
	@Test(timeout = 20)
	public void testDivisionTime() {
		double result = 2;
		double var = 1000000;
		for (int i = 0; i < var; i++) {
			double val = Calculo.division();
			val = val * 2 - 45 / 45 * 83;
		}
		double val = Calculo.division();
		assertTrue("Correcto", result == val);
	}

	// test DIVISÓN
	@Test
	public void testDivision() {
		System.out.println("Dividiendo dos números positivos ...");
		int total = 5;
		int division = Calculo.division();
		assertEquals(division, total);
	}

	@Test
	public void testDivisionFallida() {
		int total = 20;
		int division = Calculo.division();
		assertNotSame(division, total);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Corriendo: tearDown");
		numeros = null ;
	}
}
