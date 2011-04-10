package es.iagotb.katas;

public class FizzBuzzGenerator {
	
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
			if (juego.isFizzAndBuzz(i))
			{
				System.out.println("FizzBuzz");
			}
			else if (juego.isFizz(i))
			{
				System.out.println("Fizz");
			}
			else if (juego.isBuzz(i))
			{
				System.out.println("Buzz");
			}
			else
			System.out.println(i);
		}
	}

	/*
	 * Comprueba si numero contiene el numero i como parte suya.
	 */
	private boolean tieneNumero(Integer numero, Integer i) {
		// TODO Auto-generated method stub
		String numero_string = numero.toString();
		if (numero_string.indexOf(i.toString()) != -1)
			return true;
		else return false;
	}

	
}
