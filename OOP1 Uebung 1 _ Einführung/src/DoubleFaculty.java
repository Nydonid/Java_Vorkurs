import java.util.Scanner;

public class DoubleFaculty {
    public static void main (String[] args) {
        System.out.println("Enter your value for n:");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int product = 1;
        scanner.close();

        if (n < 0) {
            System.out.println("Value must be positive.");
        } else if (n%2 != 0) {
            for (int i = 1; i <= n; i=i+2) {
                product *= i;
            }
            System.out.println("The double faculty of n is: " + product);
        } else {
            product = 2;
            for (int i = 2; i <= n; i=i+2) {
                product *= i;
            }
            product /= 2;
            System.out.println("The double faculty of n is: " + product);
        }
    }
}
