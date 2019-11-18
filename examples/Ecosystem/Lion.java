public class Lion {

  public Lion(String name, int x, int y){
    this.name = name;
    this.x = x;
    this.y = y;
  }


  public int getX(){
    return x;
  }


  public int getY(){
    return y;
  }


  public String getName(){
    return name;
  }


  public void move(String direction){
    switch(direction){
      case "north":
        this.y++;
	break;
      
      case "south":
	this.y--;
	break;

      case "east":
	this.x++;
	break;

      case "west":
	this.x--;
	break;
    }
  }


  public boolean eat(Deer d){
    boolean justAte = false;

    if(d.getX() == this.x && d.getY() == this.y){
      System.out.println(name + " has eaten " + d.getName());
      justAte = true;
      this.hasEaten = true;
    }

    return justAte;
  }


  public boolean hasEaten(){
    return hasEaten;
  }


  public void makeHungry(){
    this.hasEaten = false;
  }


  private boolean hasEaten;
  private String name;
  private int x;
  private int y;

}
