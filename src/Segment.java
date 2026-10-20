import org.w3c.dom.ls.LSOutput;

public class Segment {
    private Point startPoint;
    private Point endPoint;

    public Segment(){
        startPoint = new Point();
        endPoint = new Point();
    }

    public Segment(Point startPoint, Point endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double getModule(){
        int c1, c2;
        Math.sqrt(c1*c1+c2*c2);
    }


}
