public class Lake{
  public static void main (String [] args){
     Lake lake = createLake();
     
     System.out.println(lake);
     lake.step();
     System.out.println(lake);
     lake.step();
     System.out.println(lake);
     lake.step();
     System.out.println(lake);
  }

  private static Lake createLake(){
    LilyPad l1 = new LilyPad();
    LilyPad l2 = new LilyPad();
    LilyPad l3 = new LilyPad();
    LilyPad l4 = new LilyPad();

    Fly f1 = new Fly();
    Fly f2 = new Fly();

    Snake s1 = new Snake();

    Frog frog = new Frog();

    l1.setNext(l2);
    l2.setPrevious(l1);
    l2.setNext(l3);
    l3.setPrevious(l2);
    l3.setNext(l4);
    l4.setPrevious(l3);

    l2.setFly(f1);
    l4.setFly(f2);

    l3.setSnake(s1);

    l1.setFrog(frog);
    return new Lake(l1, s1, f1, f2, frog);
  }


  public Lake(LilyPad lilypad, Snake snake, Fly f1, Fly f2, Frog frog){
    this.lilypad = lilypad;
    this.snake = snake;
    this.f1 = f1;
    this.f2 = f2;
    this.frog = frog;
  }

  public void step(){
    snake.swimForward();
    frog.jumpForward();

    frog.eat(frog.getLilyPad().getFly());
    snake.eat(snake.getLilyPad().getFrog());
  }


  public int chainSize(){
    int i = 0;
    LilyPad l = this.lilypad;
    i++;

    while(l.getNext() != null){
     l = l.getNext();
     i++;
    }

    return i;
  }


  public LilyPad padAt(int index){
    LilyPad l = this.lilypad;

    for(int i = index; i > 0; i--){
      if(l.getNext() != null){
        l = l.getNext();
      }
    }

    return l;
  }


  public String toString(){
    String result = "Lake state: \n";

    for(int i = 0; i < this.chainSize(); i++){
      result += padAt(i); 
    }

    result += "\n";
    return result;
  }


  

  
  private LilyPad lilypad;
  private Snake snake;
  private Fly f1;
  private Fly f2;
  private Frog frog;
}
