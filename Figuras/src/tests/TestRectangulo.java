package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import APP.Rectangulo;

class TestRectangulo {

	static Rectangulo r1;
	static Rectangulo r2;
	
	@BeforeAll
	static void setup() {
		r1 = new Rectangulo();
		r2 = new Rectangulo(2,3);
	}
	
	@Test
	void area() {
		double areaEsperada = 1;
		double areaObtenida =r1.area();
		assertEquals(areaEsperada, areaObtenida);
	}
	
	@Test
	void area2() {
		double areaEsperada = 6;
		double areaObtenida =r2.area();
		assertEquals(areaEsperada, areaObtenida);
	}
	
	@Test
	void perimetro() {
		double perimetroEsperada = 4;
		double perimetroObtenida =r1.perimetro();
		assertEquals(perimetroEsperada, perimetroObtenida);
	}
	
	@Test
	void perimetro2() {
		double perimetroEsperada = 10;
		double perimetroObtenida =r2.perimetro();
		assertEquals(perimetroEsperada, perimetroObtenida);
	}
	
}
