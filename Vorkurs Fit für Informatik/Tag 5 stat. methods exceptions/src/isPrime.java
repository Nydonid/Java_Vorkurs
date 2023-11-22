import java.util.Scanner;

public class isPrime {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Number to check: ");
        int userInput = scanner.nextInt();
        boolean Prime = isPrime(userInput);
        System.out.println("Your provided number is a Prime: " + Prime);
        scanner.close();
    }

    static boolean isPrime (int userInput) {
        for (int i=2; i<= userInput-1; i++) {
            int numberCheck = userInput%i;
            if (numberCheck == 0) {
                boolean Prime = true;
            }
        }
        return Prime;

    }
}
