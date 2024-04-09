package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.Algoritmos;

class TestSumatrio {

	@Test
	void Suma() {
		double SumatorioEsperada = 10;
		double SumatorioObtenida = Algoritmos.sumatorio(4);
		assertEquals(SumatorioEsperada, SumatorioObtenida);
	}
	
	@Test
	void Factorial() {
		double FactorialEsperada = 24;
		double FactorialObtenida = Algoritmos.factorial(4);
		assertEquals(FactorialEsperada, FactorialObtenida);
	}
}
