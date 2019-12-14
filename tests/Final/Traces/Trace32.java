public class Trace32 {
  public static void main(String [] args){
    Trace32 westwing = new Trace32(5);
    System.out.println(westwing.getCommunity());
    westwing.increment();
    System.out.println(westwing.toString());
  }

  public Trace32(int firefly){
    community = firefly;
  }

  public int getCommunity(){
    return community;
  }

  public void increment(){
    community++;
  }

  public String toString(){
    return Integer.toString(getCommunity());
  }

  private int community;
}

