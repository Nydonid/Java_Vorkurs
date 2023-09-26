import java.util.Scanner;

public class PrimeNumber {
    public static void main (String[] args) {
        System.out.println("Enter the number to check to be prime: ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int checkCurrent;
        boolean prime = true;

        for (int i = 2; i < (n-1); i++) {
            if (n%i == 0) {
                prime = false;
            }
        }
        System.out.println("Your given number is prime: " + prime);
    }
}
