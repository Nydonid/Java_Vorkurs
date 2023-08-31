package aufgaben3;

import java.util.Random;

public class minMax {
	public static void main (String[] args) {
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		
		Random random = new Random();
		for (int i =0; i<=9; i++) {
			
		a[i] = random.nextInt(101);
		System.out.println(a[i]);
		}
		
		int min = a[0];
		for (int i = 1; i <a.length; i++) {
	           if (a[i] < min) {
	               min = a[i]; 
	           	}
			}
		
		int max = a[0];
		for (int i = 1; i <a.length; i++) {
	           if (a[i] > max) {
	               max = a[i]; 
	           	}
			}
	               
		System.out.println("Kleinste Zahl: " + min);
		System.out.println("Grösste Zahl: " + max);
	}
}
