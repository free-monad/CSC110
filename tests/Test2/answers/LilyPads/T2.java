public class T2{
  public static void main (String [] args){
    LilyPad lily1 = new LilyPad();
    LilyPad lily2 = new LilyPad();
    
    lily1.setNext(lily2);
    lily2.setPrevious(lily1);
    
    Fly f1 = new Fly();
    Fly f2  = new Fly();
    Snake s1 = new Snake();
    Frog frog = new Frog();
    
    lily1.setFly(f1);
    lily2.setFly(f2);
    lily1.setFrog(frog);
    lily1.setSnake(s1);
    
    frog.eat(lily1.getFly());
    
    Lake lake = new Lake(lily1, s1, f1, f2, frog);
    
    System.out.println(lake);
  }
}
