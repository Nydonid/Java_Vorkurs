import java.util.Scanner;
package aufgaben3;

public class Trinkgeld {

	public static void main(String[] args) {

		//Eingabe
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie den Rechenbetrag ein: ");
		double bill = scanner.nextDouble();
		
		System.out.println("Geben Sie das Trinkgeld in Prozent ein: ");
		double tipPercent = scanner.nextDouble();
		
		scanner.close();
		
		
		//Verarbeitung
		double tip = bill * tipPercent /100.0;
		double total = tip + bill;
		
		
		//Ausgabe
		System.out.println("Trinkgeld: " + tip + " HUF");
		System.out.println("Gesamtbetrag: " + total + " HUF");
		

	}

}

