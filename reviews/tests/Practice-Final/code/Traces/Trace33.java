public class Trace33 {
  public static void main(String [] args){
    String t = "two";
    String s = "socks";
    String u = "_";

    System.out.println(Trace33.concat(t, s));

    Trace33 t33 = new Trace33(t, u);

    System.out.println(t33.concat(s));
  }
  
  public Trace33(String x, String y){
   str = x;
   separator = y;
  }
  
  public static String concat(String a, String b){
    return a + b;
  }
  
  public String concat(String a){
   return this + separator + a;
  }
  
  public String toString(){
    return str;
  }
  
        
  private String str;
  private String separator;
}
