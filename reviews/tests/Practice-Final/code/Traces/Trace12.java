public class Trace12{
  public static void main(String [] args){
    Square a = new Square();
    a.setLength(3);

    Square b = a;

    b.setLength(4);

    System.out.println(a.getLength());
    System.out.println(b.getLength());
  }

  
}

class Square{
    public Square(){
      this.length = 1;
    }

    public int getLength(){
      return this.length;
    }

    public void setLength(int x){
      this.length = x;
    }

    private int length;
}
