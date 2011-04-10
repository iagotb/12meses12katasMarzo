package es.iagotb.katas;

public class FizzBuzzGenerator {
	
	private static final String BUZZ = "Buzz";
	private static final String FIZZ = "Fizz";
	private int segundo_numero;
	private int primer_numero;

	public boolean isFizz(Integer numero)
	{		
		if (esDivisor(numero, primer_numero) || tieneNumero(numero,primer_numero)) return true;
		else return false;
	}
	

	public FizzBuzzGenerator(int primer_numero,int segundo_numero) {
		super();
		this.segundo_numero = segundo_numero;
		this.primer_numero = primer_numero;
	}


	public boolean isBuzz(Integer numero)
	{	
		if (esDivisor(numero,segundo_numero) || tieneNumero(numero,segundo_numero)) return true;
		else return false;
	}


	/**
	 * @param numero
	 * @return
	 */
	private boolean esDivisor(Integer numero,Integer divisor) {
		return numero % divisor == 0;
	}
	
	public boolean isFizzAndBuzz(Integer numero)
	{
		if (isFizz(numero) && isBuzz(numero)) return true;
		else return false;
	}

	public static void main(String[] args) {
		FizzBuzzGenerator juego = new FizzBuzzGenerator(5,3);
		for (int i = 1; i <= 100; i++) 
		{
			System.out.println(juego.sayFizzBuzz(i));
		}
	}


	/**
	 * @param juego
	 * @param numero
	 */
	public String sayFizzBuzz(Integer numero) {
		if (isFizzAndBuzz(numero))
		{
			return FIZZ+BUZZ;
		}
		else if (isFizz(numero))
		{
			return FIZZ;
		}
		else if (isBuzz(numero))
		{
			return BUZZ;
		}
		else
		return numero.toString();
	}

	/*
	 * Comprueba si numero contiene el numero i como parte suya.
	 */
	private boolean tieneNumero(Integer numero, Integer i) {
		// TODO Auto-generated method stub
		String numero_string = numero.toString();
		if (numero_string.contains(i.toString()))
			return true;
		else return false;
	}

	
}
