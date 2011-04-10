package es.iagotb.katas.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
	public void IsFizzTest(){
		assertTrue(juego.isFizz(3));
		assertTrue(juego.isFizz(13));
		assertFalse(juego.isFizz(2));
		assertFalse(juego.isFizz(5));
	}
		
	@Test
	//Metodo para saber si es divisible por 5
	public void IsBuzzTest(){
		assertTrue(juego.isBuzz(5));
		assertFalse(juego.isBuzz(2));
		assertFalse(juego.isBuzz(9));
	}
	
	
	//Metodo que es divisible por 3 y 5
	@Test
	public void isFizzAndBuzzTest(){
		assertTrue(juego.isFizzAndBuzz(15));
		assertTrue(juego.isFizzAndBuzz(35));
		assertTrue(juego.isFizzAndBuzz(53));
		assertFalse(juego.isFizzAndBuzz(33));
		assertFalse(juego.isFizzAndBuzz(18));
		assertFalse(juego.isFizzAndBuzz(10));
	}
	
	public void startGameTest()
	{
		
	}
	@Test
	public void testIsFizz()
	{
	
	}
	@Test
	public void testSayFizzBuzz()
	{
		assertEquals("1",juego.sayFizzBuzz(1));
		assertEquals("2",juego.sayFizzBuzz(2));
		assertEquals("4",juego.sayFizzBuzz(4));
		assertEquals("41",juego.sayFizzBuzz(41));
		assertEquals("Fizz",juego.sayFizzBuzz(3));
		assertEquals("Fizz",juego.sayFizzBuzz(9));
		assertEquals("Fizz",juego.sayFizzBuzz(93));
		assertEquals("Fizz",juego.sayFizzBuzz(31));
		assertEquals("Buzz",juego.sayFizzBuzz(5));
		assertEquals("Buzz",juego.sayFizzBuzz(10));
		assertEquals("Buzz",juego.sayFizzBuzz(59));
		assertEquals("FizzBuzz?",juego.sayFizzBuzz(35));
		assertEquals("FizzBuzz?",juego.sayFizzBuzz(15));
		assertEquals("FizzBuzz?",juego.sayFizzBuzz(55333555));
		
		
	}
	
	
	 
	
}
