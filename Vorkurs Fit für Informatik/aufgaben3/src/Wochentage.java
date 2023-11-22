import java.lang.reflect.Array;

public class Wochentage {

	public static void main(String[] args) {
		String[] weekdays = {"Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"}; 	
		
		for (int i=0; i<weekdays.length; i++) {
			System.out.println("Normal Days: " + weekdays[i]);
		}
		
		for (String days : weekdays) {
			System.out.println("Kurznotation Days: " + days);
		}

		int i=0;
		while (i < weekdays.length) {
			System.out.println("Whileloop Days: " + weekdays[i]);
			i++;
		}
	}
}	
