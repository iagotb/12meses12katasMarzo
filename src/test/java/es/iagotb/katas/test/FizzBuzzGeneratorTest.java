package es.iagotb.katas.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestResult;
import es.iagotb.katas.FizzBuzzGenerator;

public class FizzBuzzGeneratorTest{
		
	private FizzBuzzGenerator juego;
	
	
	
	@Before
	public void setUp() throws Exception {
		// TODO Auto-generated method stub
		juego = new FizzBuzzGenerator(3,5);
	}
	@After
	public void tearDown() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	//Pensando:
	//Metodo para saber si es divisible por 3
	@Test
	public void TresIsFizzTest(){
		assertTrue(juego.isFizz(3));
	}
	
	@Test 
	public void TreceIsFizzTest()
	{
		assertTrue(juego.isFizz(13));
	}
	@Test
	//Metodo para saber si es divisible por 5
	public void CincoIsBuzzTest(){
		assertTrue(juego.isBuzz(5));
	}
	
	
	//Metodo que es divisible por 3 y 5
	@Test
	public void QuinceisFizzAndBuzzTest(){
		assertTrue(juego.isFizzAndBuzz(15));
	}
	
	public void startGameTest()
	{
		
	}
	@Test
	public void testIsFizz()
	{
	
	}
	
	
	 
	
}
