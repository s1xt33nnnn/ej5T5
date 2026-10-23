public class Rectangle extends Point{
    private int width;
    private int height;

    public Rectangle(){
        super();
        width = 0;
        height = 0;
    }

    public Rectangle(Point point, int newWidth, int newHeight){
        super(point.getX(), point.getY());
        height = newHeight;
        width = newWidth;
    }

    public Rectangle(Point p1, Point p2){
        super(p1.getX(), p2.getY());
        width = p2.getX() - p1.getX();
        height = p2.getY() - p1.getY();
    }

    public Rectangle(Segment segment){
        super();
        int x,y;
        if(segment.getStartPoint().getX()< segment.getEndPoint().getX()){
            x = (segment.getStartPoint().getX());
        } else {
            x = (segment.getEndPoint().getX());
        }

        if (segment.getStartPoint().getY() < segment.getEndPoint().getY()){
            y = (segment.getStartPoint().getY());
        } else{
            y = (segment.getEndPoint().getY());
        }
        setX(x);
        setY(y);
    }




    @Override
    public String toString() {
        String s = " ";
        return super.toString() + " width: "+ width +", "+ "height: " + height;
    }

    public int getArea(){
        return width*height;
    }

    public int getPoint(){
        return
    }

}
