public class Eratosthenes {
	private static final int PRIMES_UP_TO = 100;

	public static void main(String[] args) {
		print(sieveArray(initializeArray(), -1));

	}
	static int[] initializeArray () {
		// The numbers in the sieve start with 2,
		// so we reduce the array length accordingly.
		int[] sieve = new int[PRIMES_UP_TO - 1];
		for (int i = 0; i < sieve.length; i++) {
			sieve[i] = i + 2;
		}
		return sieve;
	}
	static int[] sieveArray (int[] sieve, final int crossedNumber) {
	// Now let's look at each number in the array:
		for (int i = 0; i < sieve.length; i++) {
			int primeNumber = sieve[i];

			// Has the number already been crossed out?
			if (primeNumber == crossedNumber) {
				continue;
			}

			int numberToCross = primeNumber * 2;
			while (numberToCross <= PRIMES_UP_TO) {
				// Since their numbers and indices differ
				// by two, we have to calculate the index:
				int indexToCross = numberToCross - 2;
				// An int[] always needs to contain a valid
				// int, we can't really cross an item, but
				// instead set a special value:
				sieve[indexToCross] = crossedNumber;
				// And we continue with the next number:
				numberToCross += primeNumber;
			}
		}
		return sieve;
	}
	static void print (int[] sieve) {
		System.out.print("Found the following prime numbers: ");
		boolean markFirstPrime = true;

		for (int i = 0; i < sieve.length; i++) {

			int primeNumber = sieve[i];
			if (primeNumber == -1) {
				continue;
			}

			if (!markFirstPrime) {
				System.out.print(", ");
			} else {
				markFirstPrime = false;
			}
			System.out.print(primeNumber);

		}
	}
}