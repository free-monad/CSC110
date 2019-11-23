public class LilyPad{

  public LilyPad(){

  }


  public void setPrevious(LilyPad lilypad){
    previous = lilypad;
  }


  public void setNext(LilyPad lilypad){
    next = lilypad;
  }
 

  public LilyPad getNext(){
    return next;
  }


  public LilyPad getPrevious(){
    return previous;
  }


  public void setSnake(Snake snake){
    this.snake = snake;

    if(snake != null){
      this.snake.setLilyPad(this);
    }
  }


  public void setFrog(Frog frog){
    this.frog = frog;

    if(frog != null){
      this.frog.setLilyPad(this);
    }
  }


  public void setFly(Fly fly){
    this.fly = fly;

    if(fly != null){
      this.fly.setLilyPad(this);
    }
  } 

  
  public Snake getSnake(){
    return snake;
  }

  public Fly getFly(){
    return fly;
  }

  public Frog getFrog(){
    return frog;
  }

  public int chainSize(){
    int i = 0;
    LilyPad l = this;
    i++;

    while(this.getNext() != null){
     l = this.getNext();
     i++;
    }

    return i;
  }


  public String toString(){
   String result = "";

   result += "Lilypad: ";

   if(fly != null){
     result += fly;
   }

   if(frog != null){
     result += frog;
   }

   if(snake != null){
     result += snake;
   }

   result += "\n";
   return result;
  }

  private LilyPad previous;
  private LilyPad next;
  private Fly fly;
  private Frog frog;
  private Snake snake;

}
