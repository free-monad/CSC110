public class Frog{

  public Frog(){
    eatCount = 0;
    isAlive = true;
  }

  public void setLilyPad(LilyPad l){
    this.lilypad = l;
  }
  
  public void eat(Fly fly){
    if(fly != null){
      if(fly.getIsAlive()){
        fly.die();
        eatCount++;
      }
    }
  }


  public void jumpForward(){
    if(lilypad.getNext() != null){
      this.lilypad.setFrog(null);
      this.lilypad = lilypad.getNext();
      this.lilypad.setFrog(this);
    }
  }


  public void jumpBackward(){
    if(lilypad.getPrevious() != null){
      this.lilypad.setFrog(null);
      this.lilypad = lilypad.getPrevious();
      this.lilypad.setFrog(this);
    }
  }

   
  public int getEatCount(){
    return eatCount;
  }
  
  public void die(){
    isAlive = false;
  } 

  public boolean getIsAlive(){
    return isAlive;
  }

  public LilyPad getLilyPad(){
    return lilypad;
  }

  public String toString(){
    //same as if(isAlive){ return "Frog says, ribbit!"} else { return "..."}
    return isAlive ? "Frog says, ribbit! It has eaten " + eatCount + " flies." : "...";
  }

  private boolean isAlive;
  private int eatCount;
  private LilyPad lilypad;
}
