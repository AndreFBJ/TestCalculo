package uan.edu.co.CalculoTest;

import static org.junit.Assert.*;	
import org.junit.Test;

public class CalculoTest {
	
	//test SUMA
	@Test
	public void testSuma() {
		int total = 35;
		int suma = Calculo.suma();
		assertEquals(suma, total);
	}
	
	@Test
	public void testSumaFallida() {
		int total = 15;
		int suma = Calculo.suma();
		assertNotSame(suma, total);
	}
	
	//test RESTA
	@Test
	public void testResta() {
		int total = 15;
		int resta = Calculo.resta();
		assertEquals(resta, total);
	}
	
	@Test
	public void testRestaFallida() {
		int total = 15;
		int resta = Calculo.resta();
		assertNotSame(resta, total);
	}
	
	//test MULTIPLICACIÓN
	@Test
	public void testMultiplicacion() {
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
	
	//test DIVISÓN
	@Test
	public void testDivision() {
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

	//Test RAIZ CUADRADA
	@Test
	public void testRaiz() {
		double total = 5;
		double raiz = Calculo.raiz();
		assertEquals(raiz, total, total );
	}

	@Test
	public void testRaizFallida() {
		double total = 10;
		double raiz = Calculo.raiz();
		assertNotSame(raiz, total);
	}
}
