package aufgaben3;

import java.util.Arrays;
import java.util.Random;

public class ArrayInverter {

	public static void main(String[] args) {

		// Erstellung zufälliges Array aA
		int[] aA = new int [10];
		Random random = new Random();
		for (int i = 0; i < aA.length; i++) {

			aA[i] = random.nextInt(101);
		}

		// Erstellung von Array aB
		int[] aB = new int [10];

		// Invertierung Array
		for (int i = 0; i < aA.length; i++) {
			aB[aA.length - i -1] = aA[i];
		}

		// Print Array aA und aB
		System.out.println(Arrays.toString(aA));
		System.out.println(Arrays.toString(aB));

	}
}
