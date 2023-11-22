import java.util.Scanner;

public class Maler {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String QuestionL = "Enter the length of the room.";
        double length = getDoubleL(QuestionL, scanner);

        String QuestionW = "Enter the width of the room.";
        double width = getDoubleW(QuestionW, scanner);

        double nDispersion = output(length, width);
        System.out.println("You need " +nDispersion + "L of Dispersion.");
    }

    static Double getDoubleL(String QuestionL, Scanner scanner) {
        try {
            System.out.println(QuestionL);
            return scanner.nextDouble();
        } catch (Exception e2) {
            System.err.println("Note: a Double only contains numbers. ");
        }
        scanner.next();
        return getDoubleL(QuestionL, scanner);
    }
    static Double getDoubleW(String QuestionW, Scanner scanner) {
        try {
            System.out.println(QuestionW);
            return scanner.nextDouble();
        } catch (Exception e2) {
            System.err.println("Note: a Double only contains numbers. ");
        }
        scanner.next();
        return getDoubleW(QuestionW, scanner);
    }
    static double output(double length, double width) {
        double height = 2.35;
        double area = width*length*height;
        return area*0.2380952380952381;
    }
}
