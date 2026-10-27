public class Main5 {
    public static void main(String[] args) {
        Point points[]= new Point[10];
        Rectangle rectangle[]= new Rectangle[10];
        int suma = 0;
        for (int i = 0; i < points.length; i++){
            points[i] = (new Point(i ,i));
            System.out.println(points[i]);
        }
        for (int i = 0; i< rectangle.length; i++){
            rectangle[i] = new Rectangle(points[i], 1, 1);
            System.out.println(rectangle[i]);
        }
    }
}
