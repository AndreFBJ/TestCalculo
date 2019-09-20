package uan.edu.co.CalculoTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Assert;
import org.junit.Test;

public class RestaTest {

	private static Calculo numeros;

	// Metodo Inicializacion
	@Before
	public void setUp() {
		System.out.println("Corriendo: setUp");
		numeros = new Calculo(25, 10);
	}

	@Test(expected = ArithmeticException.class)
	public void testRestaException() {
		int var = 0;
		Calculo.resta();
	}

	// test RESTA
	@Test
	public void testResta() {
		System.out.println("Restando dos números positivos ...");
		int total = 15;
		int resta = Calculo.resta();
		assertEquals(resta, total);
	}

	@Test
	public void testRestaFallida() {
		try {
			int total = 10;
			int resta = Calculo.resta();
			assertNotSame(resta, total);

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
