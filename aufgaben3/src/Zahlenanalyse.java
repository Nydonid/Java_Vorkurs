package aufgaben3;

import java.util.Scanner;

public class Zahlenanalyse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Geben Sie eine Zahl ein: ");
		int userInput = scanner.nextInt();
		
		String unGerade;
		String posNeg;
		
		if (userInput %2 == 0) {
			unGerade = "gerade";
		} else {
			unGerade = "ungerade";
		}
		if (userInput >= 0) {
			posNeg = "positiv";
		} else {
			posNeg = "negativ";
		}
		
		System.out.println("Die Zahl ist " + unGerade + " und " + posNeg + ".");
		
	}

}
