package test;

import util.Algoritmos;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAlgoritmo {

	@Test
	void sumatorio() {
		 int sumaEsperada=10;
		 int sumaObtenida =Algoritmos.sumatorio(4);
		 assertEquals(sumaEsperada,sumaObtenida);
	}
	
	@Test
	void sumatoriParamnIncorrecto() {
		Exception excepcion = assertThrows(IllegalArgumentException.class,
		() -> Algoritmos.sumatorio(-1));
		
		String esperado = "El numero debe ser igual que 0 o superior";
		String obtenido = excepcion.getMessage();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	void factorial() {
		 int factorialEsperada=24;
		 int factorialObtenida =Algoritmos.factorial(4);
		 assertEquals(factorialEsperada, factorialObtenida);
	}

}
