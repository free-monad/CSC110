public class Rectangle {
    
    public Rectangle(Point z, double l, double w){
       //this.corner = z; //this way, the data for the Rectangle's starting point will not be protected (objects are passed by reference)
       
       this.corner = new Point(z.getX(), z.getY()); //this way (shallow copy) the Rectangle's starting point is protected
       this.length = l;
       this.height = w;
    }
    
    public double getArea(){
        return this.length * this.height;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public double getLength(){
        return this.length;
    }
    
    public double getCornerX(){
        return corner.getX();
    }
    
    public double getCornerY(){
        return corner.getY();
    }
    
    public Point getStartingCorner(){
        return new Point(this.corner.getX(), this.corner.getY());
    }
    
    public Point getDiagonalPoint(){
        return new Point(this.corner.getX() + length, this.corner.getY() + height);
    }
    
    public Point getVerticalPoint(){
        return new Point(this.corner.getX(), this.corner.getY() + height);
    }
    
    public Point getHorizontalPoint(){
        return new Point(this.corner.getX() + length, this.corner.getY());
    }
    
    public boolean isSquare(){
        /*
         
         //the return statement is the same as this if
         if(length == width){
             return true;
         } else {
             return false;
         }
         
        */
        return length == height ? true : false;
    }
    
    public String toString(){
        return "[" + getStartingCorner() + ", " +  getVerticalPoint() + ", " + getDiagonalPoint() + ", " + getHorizontalPoint() + "]";
    }
    
    private Point corner;
    private double length;
    private double height;
}
