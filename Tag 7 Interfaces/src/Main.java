import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Printable titleText = new Title("news");
        canonPrinter.execute(titleText);
        Printable content1 = new Paragraph("Heute in der Tagesschau");
        canonPrinter.execute(content1);
        Page page = new Page();
        page.add(new Paragraph("Schönes Wetter"));
        page.add(new Title("Sugus"));
        canonPrinter.execute(page);
    }
}