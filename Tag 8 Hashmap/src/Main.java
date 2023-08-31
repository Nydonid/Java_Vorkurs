import java.util.HashMap;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        dictionary.put("Stuhl", "Chair");
        dictionary.put("Tisch", "Table");
        dictionary.put("Mütze", "Cap");
        dictionary.put("Uhr", "Watch");

        Scanner scanner = new Scanner(System.in);
        dictionary.toEnglish(scanner.nextLine());
    }
}