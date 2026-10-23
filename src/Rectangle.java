public class Rectangle extends Point{
    private int width;
    private int height;

    public Rectangle(){
        super();
        width = 0;
        height = 0;
    }

    public Rectangle(Point point, int width, int height){
        super(point.getX(), point.getY());
        this.height = height;
        this.width = width;
    }

    public Rectangle(Point p1, Point p2){
        super(p1.getX(), p2.getY());
        width = p2.getX() - p1.getX();
        height = p2.getY() - p1.getY();
    }

    public Rectangle(Segment segment){
        super(segment.getStartPoint(),segment.getEndPoint());
    }


    @Override
    public String toString() {
        String s = " ";
        return super.toString() + " width: "+ width +", "+ "height: " + height;
    }
}
