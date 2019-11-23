public class T1 {
  public static void main(String [] args){
    LilyPad a = new LilyPad();
    a.setFly(new Fly());

    LilyPad b = a;
    b.setFrog(new Frog());

    System.out.println(a);
  }
}
