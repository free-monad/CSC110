public class Fly{

  public Fly(){
    isAlive = true;
  }

  public void setLilyPad(LilyPad l){
    lilypad = l;
  }
  public void flyForward(){
    if(lilypad.getNext() != null){
      this.lilypad.setFly(null);
      this.lilypad = lilypad.getNext();
      this.lilypad.setFly(this);
    }
  }


  public void flyBackward(){
    if(lilypad.getPrevious() != null){
      this.lilypad.setFly(null);
      this.lilypad = lilypad.getPrevious();
      this.lilypad.setFly(this);
    }
  }

  public void die(){
    isAlive = false;
  }
 
  public boolean getIsAlive(){
    return isAlive;
  }

  public String toString(){
    return isAlive ? "Fly buzzes!" : "...";
  }

  private boolean isAlive;
  private LilyPad lilypad;
}
