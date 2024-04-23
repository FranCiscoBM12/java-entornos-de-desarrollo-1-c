package tests;

import Models.Person;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEdad {

	@Test
	void testEdad0() {
		Person p = new Person("Algel","Marin",0);
		String esperado = "Menor de edad";
		String obtenido = p.MostrarEdad();
		assertEquals(esperado,obtenido);
	}

	@Test
	void testEdad17() {
		Person p = new Person("Algel","Marin",17);
		String esperado = "Menor de edad";
		String obtenido = p.MostrarEdad();
		assertEquals(esperado,obtenido);
	}
	
	@Test
	void testEdad18() {
		Person p = new Person("Algel","Marin",18);
		String esperado = "Mayor de edad";
		String obtenido = p.MostrarEdad();
		assertEquals(esperado,obtenido);
	}
	
	@Test
	void testEdad64() {
		Person p = new Person("Algel","Marin",64);
		String esperado = "Mayor de edad";
		String obtenido = p.MostrarEdad();
		assertEquals(esperado,obtenido);
	}
	
	@Test
	void testEdad65() {
		Person p = new Person("Algel","Marin",65);
		String esperado = "Jubilado";
		String obtenido = p.MostrarEdad();
		assertEquals(esperado,obtenido);
	}
	
	@Test
	void testEdad130() {
		Person p = new Person("Algel","Marin",130);
		String esperado = "Jubilado";
		String obtenido = p.MostrarEdad();
		assertEquals(esperado,obtenido);
	}
	
	@Test
	void testEdadInvalida131() {
		Exception excepcion = assertThrows(IllegalArgumentException.class,
				() -> new Person("Algel","Marin",131));
		String esperada = "La edad debe estar entre 0 y 130";
		String obtenido = excepcion.getMessage();
		assertEquals(esperada,obtenido);
		}
}
