public class Deer {

  public Deer(String name, int x, int y){
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


  void move(String direction){
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


  private String name;
  private int x;
  private int y;

}
