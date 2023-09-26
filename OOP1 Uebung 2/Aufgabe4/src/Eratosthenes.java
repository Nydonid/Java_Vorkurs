public class Eratosthenes {
	private static final int PRIMES_UP_TO = 100;
	
	public static void main(String[] args) {
		// The numbers in the sieve start with 2,
		// so we reduce the array length accordingly.
		int[] sieve = new int[PRIMES_UP_TO - 1];
		for(int i = 0; i < sieve.length; i++) {
			sieve[i] = i + 2;
		}

		// Now let's look at each number in the array:
		for(int i = 0; i < sieve.length; i++) {
			int primeNumber = sieve[i];

			// Has the number already been crossed out?
			if(primeNumber == -1) {
				continue;
			}

			int numberToCross = primeNumber * 2;
			while(numberToCross <= PRIMES_UP_TO) {
				// Since ther numbers and indices differ
				// by two, we have to calculate the index:
				int indexToCross = numberToCross - 2;
				// An int[] always needs to contain a valid
				// int, we can't really cross an item, but
				// instead set a special value:
				sieve[indexToCross] = -1;
				// And we continue with the next number:
				numberToCross += primeNumber;
			}
		}

		System.out.print("Found the following prime numbers: ");

		for(int i = 0; i < sieve.length; i++) {
			int primeNumber = sieve[i];
			if(primeNumber == -1) {
				continue;
			}				
			System.out.print(primeNumber + ", ");
		}
	}
}
