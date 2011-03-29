import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



public class PrimeFactorsTest {

	@Test
	public void testJUnit(){
		assertTrue("the complier is feeling well today ...", true);
	}
	@Test
	public void testOne(){
		assertEquals(list(),PrimeNumbers.generatePrimes(1) );
		}
	@Test
	public void testTwo(){
		assertEquals(list(2),PrimeNumbers.generatePrimes(2));
	}
	@Test
	public void testThree(){
		assertEquals(list(3),PrimeNumbers.generatePrimes(3));
	}
	@Test
	public void testFour(){
		assertEquals(list(2,2),PrimeNumbers.generatePrimes(4));
	}
	@Test
	public void testSix(){
		assertEquals(list(2,3),PrimeNumbers.generatePrimes(6));
	}
	@Test
	public void testEight(){
		assertEquals(list(2,2,2),PrimeNumbers.generatePrimes(8));
	}
	@Test
	public void testNine(){
		assertEquals(list(3,3),PrimeNumbers.generatePrimes(9));
	}
	@Test
	public void testTen(){
		assertEquals(list(2,5),PrimeNumbers.generatePrimes(10));
	}
	@Test
	public void testTwelve(){
		assertEquals(list(2,2,3),PrimeNumbers.generatePrimes(12));
	}
	@Test
	public void testBigNumber(){
		assertEquals(list(3,5,5,73,6373),PrimeNumbers.generatePrimes(34892175));
	}
	private ArrayList<Integer> list(int...ints){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i: ints){
			ret.add(i);
		}
		
		return ret;
	}
	
}
