import java.util.ArrayList;

public class PrimeNumbers {

	public static ArrayList<Integer> generatePrimes(int i) {

		ArrayList<Integer> ret = new ArrayList<Integer>();

		for (int candiate = 2; i > 1; candiate++) {

			for(;i % candiate == 0;i /= candiate) {
				ret.add(candiate);
				
			}
		}
		
		return ret;
	}
	public static ArrayList<Integer> numberGenerator(int i){
		return new ArrayList<Integer>();
		
	}
	
}
