public class RecursiveFactorial {
	public static void main(String[] args) {
        System.out.println(recursiveFactorial(5, 1));
	}
	static int recursiveFactorial(int n, int product) {
        if (n > 0) {
            product *= n;
            n = n - 2;
            return recursiveFactorial(n, product);
        }
        return product;
    }
}
