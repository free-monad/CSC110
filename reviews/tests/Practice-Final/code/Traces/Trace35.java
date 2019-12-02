public class Trace35{
  public static void main(String [] args){
    String abc = "abc";
    char a = 'a';

    System.out.println(f1(f2(abc), 3));
    System.out.println(f2(f1(abc, 3)));

    System.out.println(f1(f2(a), 3));
    System.out.println(f2(f1(a,3)));
  }

  public static String f1(char c, int n){
   String result = Character.toString(c);

   for(int i = 0; i < n; i++){
     result += Character.toString(c);
   }

   return result;
  }

  public static String f1(String c, int n){
    String result = c;

    for(int i = 0; i < n; i++){
      result += c;
    }

    return result;
  }

  public static String f2(String s){
   return s + s;
  }

  public static String f2(char c){
    return Character.toString(c) + Character.toString(c);
  }

}
