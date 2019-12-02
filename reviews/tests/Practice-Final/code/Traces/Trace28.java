public class Trace28{
  public static void main(String [] args){
    String a = "";

    System.out.println("b4");

    do{
      System.out.println("inside");
      a += "a";
    }while (a.equals("a"));

    System.out.println("after");
  }
}
