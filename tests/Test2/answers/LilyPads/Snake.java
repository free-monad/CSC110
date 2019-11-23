public class Snake{

  public Snake(){
    eatCount = 0;
  }

  public void eat(Frog frog){
    if(frog != null){
      if(frog.getIsAlive()){
        frog.die();
        eatCount++;
      }
    }
  }


  public void swimForward(){
    if(lilypad.getNext() != null){
      this.lilypad.setSnake(null);
      this.lilypad = lilypad.getNext();
      this.lilypad.setSnake(this);
    }
  }


  public void swimBackward(){
    if(lilypad.getPrevious() != null){
      this.lilypad.setSnake(null);
      this.lilypad = lilypad.getPrevious();
      this.lilypad.setSnake(this);
    }
  }

   
  public int getEatCount(){
    return eatCount;
  }
  
  public LilyPad getLilyPad(){
    return lilypad;
  }

  public void setLilyPad(LilyPad l){
    this.lilypad = l;
  } 

  public String toString(){
    return "Snake hisses! It has eaten " + eatCount + " frogs.";
  }

  private int eatCount;
  private LilyPad lilypad;
}
