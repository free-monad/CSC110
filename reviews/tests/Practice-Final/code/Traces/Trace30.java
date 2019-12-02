public class Trace30{
  public static void main(String [] args){
    String a = "";

    System.out.println("b4");

    for(int i=0;i < 3; i++){
      for(int j=0;j < 2; j++){
        a += "a";
      }
    }

    System.out.println(a);
  }
}
