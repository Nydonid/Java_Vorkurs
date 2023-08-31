public class mean {
    public static void main (String[] args) {
        double[] a = {0.89, 0.93, 4.34, 6, 7.8, 1.20, 3.04, 2.77};
        System.out.println(mean(a));
    }
    static double mean(double[] a){
        double sum = 0;
        double avrg;
        try {
            for (int i = 0; i< a.length; i++) {
                sum += a[i];
            }
            avrg = sum / a.length;
            return avrg;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 800;
    }
}
