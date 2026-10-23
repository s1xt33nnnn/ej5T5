public class Polygon {
    private Point[] points;

    public  Polygon(Point[] points){
        this.points = points;
    }

    public Polygon(){
        points = new Point[100];
        for(int i = 0; i < points.length;i++){
            points[i] = null;
        }
    }

    @Override
    public String toString(){
        String s =" ";
        for (int j = 0; j< points.length; j++){
            s = s + points[j] +" - ";
        }
        s = s + points[0];
        return s;
    }

    public double getLength(){
        double length = 0;
        for (int l=0; l < points.length - 1; l++){
            Segment side = new Segment(points[l], points[l + 1]) ;
            length += side.getModule();
        }
        Segment side = new Segment(points[points.length - 1], points[0]);
        length += side.getModule();
        return length;
    }
        public void setOffset (int offX,int offY){
         for (int o = 0; o < points.length; o++){
            points[o].setOffset(offX,offY);
         }
        }
}
