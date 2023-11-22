import java.util.Random;

public class RecursiveSum {
	public static void main(String[] args) {
		int[] series = randomSeries(1000);
		int sum = 0;

		// Compute the sum of the series recursively
		System.out.println(getSum(sum, series.length -1, series));
	}

	static int getSum (int sum, int index, int[] series) {

		sum += series[index];

		if (index >= 1) {
			return getSum(sum, --index, series);
		} else {
			return sum;
		}
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
