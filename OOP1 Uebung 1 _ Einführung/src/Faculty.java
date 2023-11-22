import java.util.Scanner;

public class Faculty {
    public static void main(String[] args) {
        System.out.println("Enter your value for n:");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int product = 1;
        scanner.close();

        if (n < 0) {
            System.out.println("Value must be positive.");
        } else if (n > 12) {
            System.out.println("Value must be smaller than 13.");
        } else {
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            System.out.println("The faculty of n is: " + product);

        }
    }
}
