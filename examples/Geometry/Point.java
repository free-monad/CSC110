public class Point {
    
    public Point(double a, double b){
        this.x = a;
        this.y = b;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public void setX(double a){
        this.x = a;
    }
    
    public void setY(double b){
        this.y = b;
    }
    
    public void setCoordinate(double a, double b){
        this.x = a;
        this.y = b;
    }
    
    public void setCoordinate(Point b){
        this.x = b.getX();
        this.y = b.getY();
    }
    
    public String toString(){
        return "(" + this.getX() + ", " + this.getY() + ")";
    }
    
    private double x;
    private double y;
}
