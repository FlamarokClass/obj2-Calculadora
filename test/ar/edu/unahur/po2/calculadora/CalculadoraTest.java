package ar.edu.unahur.po2.calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void queSePuedaSumar() {
		Calculadora calcu = new Calculadora();
		Integer valorEsperado = 3;
		Integer valorObtenido = calcu.sumar(1,2);
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queSePuedaSumarPorParametros() {
		Calculadora calcu = new Calculadora(1,2);
		Integer valorEsperado = 3;
		Integer valorObtenido = calcu.sumar();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queSePuedaSumarPorParametrosString() {
		Calculadora calcu = new Calculadora("1","2");
		Integer valorEsperado = 3;
		Integer valorObtenido = calcu.sumar();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	// El siguiente test da error y lo muestra en consola 
	@Test
	public void queSePuedaSumarSoloEnterosYLanceUnaExcepcionEImprimaLaTrazaDelError() {
		Calculadora calcu = new Calculadora("1","DOS");
		Integer valorEsperado = 3;
		Integer valorObtenido = calcu.sumar();
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void quePuedaDividir() throws Exception {
		Calculadora calcu = new Calculadora();
			Integer dividendo = 5;
			Integer divisor = 5 ;
			Integer valorEsperado = 1;
			Integer valorObtenido = calcu.dividir(dividendo,divisor);
			assertEquals(valorEsperado, valorObtenido);
	}
	
	/*
	@Test
	public void queNoPuedaDividirPorCero() throws Exception {
		Calculadora calcu = new Calculadora();
			Integer dividendo = 5;
			Integer divisor = 0 ;
			Integer valorEsperado = 0;
			Integer valorObtenido = calcu.dividir(dividendo,divisor);
			assertEquals(valorEsperado, valorObtenido);
	}
	*/
	
	@Test (expected = NoSePuedeDividirPorCeroException.class)
	public void queNoPuedaDividirSiElDividendoEsCero() throws Exception {
			Calculadora calcu = new Calculadora();
			Integer dividendo = 5;
			Integer divisor = 0 ;
			calcu.dividir(dividendo, divisor);
	}
	
	
	/*
	Trato la excepcion
	
	@Test 
	public void queNoPuedaDividirSiElDividendoEsCero() {
		Calculadora calcu = new Calculadora();
			Integer dividendo = 0;
			Integer divisor = 5 ;
			try {
				calcu.dividir(dividendo, divisor);
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
	*/
}
