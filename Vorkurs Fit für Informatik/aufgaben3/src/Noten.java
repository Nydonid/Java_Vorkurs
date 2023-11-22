import java.util.Scanner;

public class Noten {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double average = 0;
		double gradeSum = 0;
		
		int students = 5;


		for (int i = 1; i <= students; i++) {
			System.out.println("Enter Grade Nr " + i + ":");
			
			gradeSum = gradeSum + scanner.nextDouble(); 
		}
		
		scanner.close();
		
		average = gradeSum/students;
		
		System.out.println("Notenschnitt: " + average);
		
	}

}
