package tests;
import util.Algoritmos;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAlgoritmos {

	@Test
	void fibonacci() {
		double fibonacciEsperada = 2;
		double fibonacciObtenida =Algoritmos.fibonacci(3);
		assertEquals(fibonacciEsperada, fibonacciObtenida);
	}
	
	@Test
	void factorial() {
		double factorialEsperada = 6;
		double factorialObtenida =Algoritmos.factorial(3);
		assertEquals(factorialEsperada, factorialObtenida);
	}
	
	@Test
	void esPrimo() {
		boolean esPrimoEsperada = true;
		boolean esPrimoObtenida =Algoritmos.esPrimo(7);
		assertEquals(esPrimoEsperada, esPrimoObtenida);
	}

}
