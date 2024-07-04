package ar.edu.unahur.po2.calculadora;

/*
 Calculadora con 2 constructores, uno con parametros y otro sin, ambos funcionan 
 y corren adecuadamente.
 */
public class Calculadora {
	
	private Integer i;
	private Integer j;
	
	public Calculadora() {  // escribir con corrección
		this.i = 0;
		this.j = 0;
	}

	public Calculadora(Integer i, Integer j) {
		this.i =i;
		this.j = j;
	}
	
	public Calculadora(String i, String j) {  // los errores lo muestra en consola.
		try {
			this.i = Integer.parseInt(i);
			this.j = Integer.parseInt(j);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public Integer sumar(Integer unNumero, Integer otroNumero) {
		return unNumero + otroNumero;
	}

	public Integer sumar() {
		return this.i + this.j;
	}

	/*
	 * Solucion para la el test queNoPuedaDividirPorCero() 
	public Integer dividir(Integer dividendo, Integer divisor) {
		if(divisor != 0) {
			return dividendo/divisor;
		}
		return 0 ;
	}
	*/
	
	// Solucion correcta
	
	public Integer dividir(Integer dividendo, Integer divisor) throws Exception {
		if(divisor != 0) {
			return dividendo/divisor;
		}
		throw new NoSePuedeDividirPorCeroException("No se puede dividir por cero");
	}
}
