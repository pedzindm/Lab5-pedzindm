import java.util.ArrayList;
import java.util.Collections;

public class PrimeNumbers {

	public static ArrayList<Integer> generatePrimes(int i) {

		ArrayList<Integer> ret = new ArrayList<Integer>();

		for (int candiate = 2; i > 1; candiate++) {

			for (; i % candiate == 0; i /= candiate) {
				ret.add(candiate);

			}
		}

		return ret;
	}

	public static ArrayList<Integer> numberGenerator(int i) {

		ArrayList<Integer> retThis = new ArrayList<Integer>();
		int prime = i;
		prime--;
		while (prime >= 2) {
			ArrayList<Integer> generatePrimes = PrimeNumbers
					.generatePrimes(prime);

			Integer lowerprime = generatePrimes.remove(0);

			if (!retThis.contains(lowerprime)) {
				retThis.add(lowerprime);
			}
			prime--;
		}
		Collections.sort(retThis);
		
		return retThis;

	}

}
