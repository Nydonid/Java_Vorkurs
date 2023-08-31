import java.util.Scanner;

public class Dreieck {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Eingabe
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein: ");
        int n = scanner.nextInt();
        scanner.close();
        for (int j = 0; j < n; j++) {
            int count = j*2+1;
            int leer = n - j-1;
            for (int i = 0; i < leer; i++) {
                System.out.print(' ');
            }
            for (int i = 0; i < count; i++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

}