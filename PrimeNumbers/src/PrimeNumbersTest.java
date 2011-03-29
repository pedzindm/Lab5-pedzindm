import static org.junit.Assert.*;


import java.util.ArrayList;

import org.junit.Test;


public class PrimeNumbersTest {

	@Test
	public void testJUnit(){
		assertTrue("the complier is feeling well today ...", true);
	}
	@Test
	public void testOne(){
		assertEquals(list(),PrimeNumbers.numberGenerator(1));
	}
	@Test 
	public void testTwo(){
		assertEquals(list(),PrimeNumbers.numberGenerator(2));
	}
	@Test 
	public void testThree(){
		assertEquals(list(2),PrimeNumbers.numberGenerator(3));
	}
	@Test 
	public void testFour(){
		assertEquals(list(2,3),PrimeNumbers.numberGenerator(4));
	}
	@Test 
	public void testSix(){
		assertEquals(list(2,3,5),PrimeNumbers.numberGenerator(6));
	}
	@Test 
	public void testEight(){
		assertEquals(list(2,3,5,7),PrimeNumbers.numberGenerator(8));
	}
	private ArrayList<Integer> list(int...ints){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i: ints){
			ret.add(i);
		}
		
		return ret;
	}
}
