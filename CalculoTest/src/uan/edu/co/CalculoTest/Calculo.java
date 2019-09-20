package uan.edu.co.CalculoTest;

public class Calculo {
	
	private static int a;
	private static int b;
	
	public Calculo(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public static int suma () {
		return a + b;
	}
	
	public static int resta () {
		return a - b;
	}
	
	public static int multiplicacion () {
		return a * b;
	}
	
	public static int division () {
		return a / b;
	}
	
	public static double raiz () {
		return Math.sqrt(a);
	}
}
