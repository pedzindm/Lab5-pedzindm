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
		assertEquals(new ArrayList<Integer>(),PrimeNumbers.numberGenerator(1));
	}
	private ArrayList<Integer> list(int...ints){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i: ints){
			ret.add(i);
		}
		
		return ret;
	}
}
