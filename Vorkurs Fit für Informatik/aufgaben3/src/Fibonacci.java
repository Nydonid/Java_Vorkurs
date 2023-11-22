package aufgaben3;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Geben Sie n für Fibonacci ein:");
		int n = scanner.nextInt();
		
		int z1 = 0;
		int z2 = 1;
		
		for (int i=0; i<n; i++) {
			System.out.println(z2);
			int z3 = z1 + z2;
			z1 = z2;
			z2 = z3;
		}
		
	}

}
