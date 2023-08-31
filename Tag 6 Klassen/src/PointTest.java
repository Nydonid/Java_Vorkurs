public class PointTest {
    public static void main (String[] args) {
        Point point1 = new Point(4,3);
        Point point2 = new Point(4,3);
        System.out.println(point1.toString());
        System.out.println(point1.distance(point2));

    }

}
