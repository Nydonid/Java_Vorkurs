import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Fakultaet {
    public static void main(String[] args) {
        System.out.println("Enter your value for n:");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int product = 1;

        for (int i =0; i < n; i++) {
             product *= i;
        }

        System.out.println("The faculty of n is: " + product);
    }
}