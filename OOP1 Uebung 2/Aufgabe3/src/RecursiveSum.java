import java.util.Random;

public class RecursiveSum {
	public static void main(String[] args) {
		int[] series = randomSeries(1000);
		// Compute the sum of the series recursively
	}
	
	static int[] randomSeries(int amount) {
		Random random = new Random(4711);
		int[] series = new int[amount];
		for (int index = 0; index < amount; index++) {
			series[index] = random.nextInt(10);
		}
		return series;
	}
}
