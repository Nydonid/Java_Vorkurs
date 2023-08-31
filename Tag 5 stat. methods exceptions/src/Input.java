import java.util.Scanner;

public class Input {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Question1 = "Enter a entire Number: ";
        int userInput1 = getInt(Question1, scanner);
        System.out.println("Input: " + userInput1);

        String Question2 = "Enter a rational Number: ";
        double userInput2 = getDouble(Question2, scanner);
        System.out.println("Input: " + userInput2);

        scanner.close();
    }
    static Integer getInt(String Question1, Scanner scanner){
        try {
            System.out.println(Question1);
            int userInput1 = scanner.nextInt();
            return userInput1;
        } catch (Exception e1) {
            System.err.println("Note: a Integer only contains entire Numbers ");
        }
        scanner.next();
        return getInt(Question1, scanner);
    }
    static Double getDouble(String Question2, Scanner scanner){
        try {
            System.out.println(Question2);
            double userInput2 = scanner.nextDouble();
            return userInput2;
        } catch (Exception e2) {
            System.err.println("Note: a Double only contains numbers. ");
        }
        scanner.next();
        return getDouble(Question2, scanner);
    }
}
