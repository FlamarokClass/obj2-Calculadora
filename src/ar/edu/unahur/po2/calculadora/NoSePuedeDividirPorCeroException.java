package ar.edu.unahur.po2.calculadora;

public class NoSePuedeDividirPorCeroException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public NoSePuedeDividirPorCeroException(String mensaje) {
		super(mensaje);
	}


	
}
