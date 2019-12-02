public class Trace32{
  public static void main(String [] args){
    Trace32 n = new Trace32(5);
    System.out.println(n.getXxx());
    n.increment();
    System.out.println(n.toString());
  }

  public Trace32(int q){
    xxx = q;
  }

  public int getXxx(){
    return xxx;
  }

  public void increment(){
    xxx++;
  }

  public String toString(){
    return Integer.toString(getXxx());
  }

  private int xxx;
}
