public class MainPolygon {
    public static void main(String[] args) {
        Point[] points = new Point[4];
        points[0] = new Point (3,4);
        points[1] = new Point (4,5);
        points[2] = new Point (5,2);
        points[3] = new Point (5,4);

        Polygon p = new Polygon(points);
        System.out.println(p);
    }
}
