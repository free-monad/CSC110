public class Geometry {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Point p = new Point(4,5);
        Point s = new Point(1,2);
        
        /*
        p.getX();
        p.getY();
        
        double sss = 42;
        double ttt = 43;
        
        p.setX(sss);
        p.setY(ttt);
        
        System.out.print(p);
        */
        
        System.out.println("Welcome to Geometry");
        System.out.println("");
        
       
        System.out.println("Point p: " + p);
        System.out.println("Point s: " + s);
        System.out.println("");
        System.out.println("Setting the coordinates of p to those of s...");
        p.setCoordinate(s);
        System.out.println("Point p's new coordinates are: " + p);
        
        
        Point n = new Point(6,8);
        n.setCoordinate(9,3);
        
        double length = 10;
        double height = 7;
        
        Rectangle r = new Rectangle(s, length, height);
        
        //System.out.println(r);
        
        System.out.println(r.getStartingCorner());
        System.out.println(r.getLength());
        System.out.println(r.getHeight());
        
        length = 22;
        height = 23;
        s.setCoordinate(999, 1024);
        
        System.out.println(r.getStartingCorner());
        System.out.println(r.getLength());
        System.out.println(r.getHeight());
        
        //pass by value and pass by reference
        //primitives are passed by value
        //objects are passed by reference
        
        Circle c = new Circle(3.0, n);
        System.out.println(c);
    }
}
