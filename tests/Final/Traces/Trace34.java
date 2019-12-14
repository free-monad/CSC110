public class Trace34{
  public static void main(String [] args){
    System.out.println(build("ab"));
  }

  public static String build(String s)
  {
    if (s.length() > 10){
        System.out.println(s);
        return s;
    }else{
        System.out.println(s);
	String t = s;
        return build(t + t);
    }
  }
}
