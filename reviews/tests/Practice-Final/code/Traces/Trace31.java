public class Trace31{
  public static void main(String [] args){
    String a = "";

    System.out.println("b4");

    int w = 1;

    while(!a.equals("aaaa")){
      System.out.println("inside" + w);

      for(int i=0; i<2; i++){
        System.out.println("w" + w + " loop iteration " + i);
        a += "a";
      }

      w++;
    }

    System.out.println("finished");
  }
}
