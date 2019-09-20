package uan.edu.co.CalculoTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SumaTest {

	private static Calculo numeros;

	// Metodo Inicializacion
	@Before
	public void setUp() {
		System.out.println("Corriendo: setUp");
		numeros = new Calculo(10, 25);
	}

	@Test(expected = ArithmeticException.class)
	public void testSumaException() {
		int var = 0;
		Calculo.suma();
	}

	// test SUMA
	@Test
	public void testSuma() {
		System.out.println("Sumando dos números positivos ...");
		int total = 35;
		int suma = Calculo.suma();
		assertEquals(suma, total);
	}

	@Test
	public void testSumaFallida() {
		try {
			int total = 15;
			int suma = Calculo.suma();
			assertNotSame(suma, total);
		} catch (Exception fallo) {
			fail("ERROR");
		}
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Corriendo: tearDown");
		numeros = null;
	}
}
