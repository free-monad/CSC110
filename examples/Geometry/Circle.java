public class Circle {
    
    //examples of overloading the constructor
    public Circle(double x, double y){
        this.radius = 1;
        this.center = new Point(x,y);
    }
    
    public Circle(double x, double y, double radius){
        this.radius = radius;
        this.center = new Point(x, y);
    }
    
    public Circle(double radius){
        this.radius = radius;
        this.center = new Point(0,0);
    }
    
    public Circle(Point p){
        this.radius = 0;
        this.center = new Point(p.getX(), p.getY());
    }
    
    public Circle(Point p, double radius){
        this.radius = radius;
        this.center = new Point(p.getX(), p.getY());
    }
    
    public Circle(double radius, Point p){
        this.radius = radius;
        this.center = new Point(p.getX(), p.getY());
    }
    
    public Circle(){
        radius = 1;
        center = new Point(0,0);
    }
    
    public double getArea(){
        return Math.pow(radius, 2) * Math.PI;
    }
    
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public Point getCenter(){
        return new Point(center.getX(), center.getY());
    }
    
    public String toString(){
        return "[radius: " + radius + ", center: " + center + "]";
    }
    
    private double radius;
    private Point center;
}
