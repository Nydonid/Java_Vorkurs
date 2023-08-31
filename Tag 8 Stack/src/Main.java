import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("End the operation with 'Q': ");
        while (true) {
            System.out.println("Enter a number to begin the operation, and the second after your operation: ");
            stack.push(scanner.nextDouble());
            stack.push(scanner.nextDouble());
            System.out.println("Enter your operation attribute (+,-,*,/): ");
            String op = scanner.nextLine();
            stack.pop(0);
            stack.pop(1);
            calculator.operation(op);
            System.out.print;
            stack.push(67);
            stack.push(45);
        }

        //System.out.println(stack);
        //System.out.println("size " + stack.size(stack.x));
        //System.out.println("pop " + stack.pop(stack.x));
        //System.out.println("size " + stack.size(stack.x));
        //System.out.println(stack);



    }
}