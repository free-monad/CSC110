public class Trace12{
  public static void main(String [] args){
   Circle bash = new Circle();
   bash.setRadius(16);
   
   Circle cshell = bash;
   
   cshell.setRadius(9);
   
   System.out.println(bash.getRadius());
   System.out.println(cshell.getRadius()); 
  }
}

class Circle{
  public void setRadius(int r){
    this.radius = r;
  }

  public int getRadius(){
    return this.radius;
  }

  private int radius;
}

