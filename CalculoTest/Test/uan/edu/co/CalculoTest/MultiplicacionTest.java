package uan.edu.co.CalculoTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MultiplicacionTest {

	private static Calculo numeros;

	// Metodo Inicializacion
	@Before
	public void setUp() {
		System.out.println("Corriendo: setUp");
		numeros = new Calculo(3, 5);
	}

	@Test(expected = ArithmeticException.class)
	public void testMultiplicacionException() {
		int var = 0;
		Calculo.multiplicacion();
	}

	// test MULTIPLICACIÓN
	@Test
	public void testMultiplicacion() {
		System.out.println("Multiplicando dos números positivos ...");
		int total = 15;
		int multiplicacion = Calculo.multiplicacion();
		assertEquals(multiplicacion, total);
	}

	@Test
	public void testMultiplicacionFallida() {
		int total = 20;
		int multiplicacion = Calculo.multiplicacion();
		assertNotSame(multiplicacion, total);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Corriendo: tearDown");
		numeros = null;
	}
}
