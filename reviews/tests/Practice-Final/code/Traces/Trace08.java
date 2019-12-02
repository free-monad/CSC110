public class Trace08{
  public static void main(String [] args){
    if(7 < 9 && true){
      System.out.println("H");
      if(!(false || false)){
        System.out.println("A");
      } else{
        System.out.println("B");
      }
    } else {
      System.out.println("Q");
    }
  }
}
