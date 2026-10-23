public class MainPolygon {
    public static void main(String[] args) {
        Point[] points = new Point[4];
        points[0] = new Point (2, 2);
        points[1] = new Point (4, 2);
        points[2] = new Point (4, 4);
        points[3] = new Point (2,4);

        Polygon polygon = new Polygon(points);

        System.out.println(polygon);
        System.out.println("This is the length of the points" + polygon.getLength());
        polygon.setOffset(5, 5);
        System.out.println(polygon);
    }
}
