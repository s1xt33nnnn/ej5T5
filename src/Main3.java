public class Main3 {
    public static void main(String[] args) {
        Segment segment = new Segment(new Point(4, 5), new Point(6, 8));
        segment.setOffset(4, 4);
        System.out.println(segment.toString());
        System.out.println(segment.getModule());
    }
}
