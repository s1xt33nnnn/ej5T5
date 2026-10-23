public class Main4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println("This is the 1st rectangle: " + r);
        r.moveTo(4, 7);
        System.out.println("This is the 1st rectangle with move: " + r);
        r.toString();
        Rectangle r2 = new Rectangle(new Point(1,1), 8, 6);
        System.out.println("This is the 2nd rectangle: " + r2);
        Rectangle r3 = new Rectangle(new Point(2, 0), new Point(4, 2));
        System.out.println("This is the 3rd rectangle: " + r3);
        System.out.println("This is the area of the 2nd rectangle: " + r2.getArea());
    }
}
