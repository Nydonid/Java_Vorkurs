package aufgaben3;

import java.util.Random;
import java.util.Scanner;

public class Ratespiel {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		Random random = new Random();
		int pcRandom = random.nextInt(101);
		
		System.out.println("Errate die gleiche Zahl wie der PC: ");
		int userGuess = scanner.nextInt();
		
		int i = 1;

			while (userGuess != pcRandom) {
				if (userGuess > pcRandom) {
					System.out.println("Youre Guess was too high. Try again: ");
					i++;
					userGuess = scanner.nextInt();
				} else {
					System.out.println("Youre Guess was too low. Try again: ");
					i++;
					userGuess = scanner.nextInt();
			}
		}
		System.out.println("Youre Guess was PeRfEcT!! The Number was: " + userGuess + " and you needed " + i + " tries.");
	}	
}
	