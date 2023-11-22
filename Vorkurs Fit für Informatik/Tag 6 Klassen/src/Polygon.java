import java.util.ArrayList;

public class Polygon {
    private ArrayList<Point> points = new ArrayList<>();

    public void addPoint(Point point) {
        points.add(point);
    }
    public double circum() {
        double sumCircum =0;
        for (int i=0; i<points.size()-1; i++) {
            Point p1 = points.get(i);
            Point p2 = points.get(i+1);
            sumCircum += p1.distance(p2);
        }
        Point pFirst = points.get(0);
        Point pLast = points.get(points.size()-1);
        sumCircum = sumCircum + pLast.distance(pFirst);
        return sumCircum;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "points=" + points +
                '}';
    }
}
