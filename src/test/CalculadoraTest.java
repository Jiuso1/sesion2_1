package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sesion2_1.Calculadora;

class CalculadoraTest {

	//Valores de prueba:
	private int value1;
	private int value2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
		//Asignamos valores a los valores de prueba.
		value1 = 5;
		value2 = 3;
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}

	@Test
	void testSum() {
		int expected = 8;
		int actual = Calculadora.sum(value1, value2);
		assertEquals(expected, actual);
	}

	@Test
	void testResta() {
		int expected = 2;
		int actual = Calculadora.resta(value1, value2);
		assertEquals(expected, actual);
	}

	@Test
	void testMultiplica() {
		int expected = 15;
		int actual = Calculadora.multiplica(value1, value2);
		assertEquals(expected, actual);
	}

	@Test
	void testDivide() {
		int expected = 1;
		int actual = Calculadora.divide(value1, value2);
		assertEquals(expected, actual);
	}
	
	@Test 
	void testDivideEntre0() {//No olvidar nunca el @Test.
		int expected = -1;
		value2 = 0;
		int actual = Calculadora.divide(value1, value2);
		assertEquals(expected, actual);
	}

}
