import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a number to begin the operation: ");
            stack.push(scanner.nextDouble());
            System.out.println("And the second value of your operation: ");
            stack.push(scanner.nextDouble());
            System.out.println("Enter now the operation-sign of your operation: ");
            calculator.opSign = scanner.nextLine();

        System.out.println(Calculator.operation());
        //System.out.println(stack);
        //System.out.println("size " + stack.size(stack.x));
        //System.out.println("pop " + stack.pop(stack.x));
        //System.out.println("size " + stack.size(stack.x));
        //System.out.println(stack);


    }
}