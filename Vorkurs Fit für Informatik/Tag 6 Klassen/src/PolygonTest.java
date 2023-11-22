public class PolygonTest {
    public static void main (String[] args) {
        Point point1 = new Point(0,100);
        Point point2 = new Point(100,100);
        Point point3 = new Point(100,0);
        Point point4 = new Point(0,0);

        Polygon polygon = new Polygon();
        polygon.addPoint(point1);
        polygon.addPoint(point2);
        polygon.addPoint(point3);
        polygon.addPoint(point4);

        System.out.println("Polygon: "+ polygon);
        System.out.println("Circumference: "+ polygon.circum());
    }
}
