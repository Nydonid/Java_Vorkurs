import java.util.Arrays;

public class StaticAnalysis {
    public static void main (String[] args) {
        double[] a = {2,4,6}; //initialize array

        double n = a.length; //get length of array

        double min = a[0];      //get min value of array
        for (int i = 0; i <n; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }

        double max = a[0];      //get max value of array
        for (int i = 0; i <n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }

        double average = 0;     //get average of array
        for (int i = 0; i <n; i++) {
            average += a[i];
        }
        average = average/n;

        double var = 0;         //get variance
        for (int i = 0; i<n; i++) {
                var += (a[i] - average) * (a[i] - average); // Quadrierte Abweichung zu var hinzufügen
        }
        var /= n;

        double st_dev = Math.sqrt(var); // get standard deviation

        System.out.println(min);
        System.out.println(max);
        System.out.println(average);
        System.out.println(var);
        System.out.println(st_dev);

    }
}
