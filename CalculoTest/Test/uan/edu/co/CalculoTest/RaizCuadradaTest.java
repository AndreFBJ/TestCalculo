package uan.edu.co.CalculoTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RaizCuadradaTest {

	private static Calculo numeros;

	// Metodo Inicializacion
	@Before
	public void setUp() {
		System.out.println("Corriendo: setUp");
		numeros = new Calculo (25, 30);
	}

	@Test(expected = ArithmeticException.class)
	public void testRaizException() {
		Calculo.raiz();
	}

	// Test RAIZ CUADRADA
	@Test
	public void testRaiz() {
		System.out.println("Raiz de un numero positivo ...");
		double total = 5;
		double raiz = Calculo.raiz();
		assertEquals(raiz, total, total);
	}

	@Test
	public void testRaizFallida() {
		double total = 10;
		double raiz = Calculo.raiz();
		assertNotSame(raiz, total);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Corriendo: tearDown");
		numeros = null;
	}
}
