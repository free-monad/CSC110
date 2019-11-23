public class Die{

  public Die(int numberOfSides, String name){
    this.numberOfSides = numberOfSides;
    this.name = name;
  }


  public Die(int numberOfSides){
    this.numberOfSides = numberOfSides;
  }


  public int roll(){
    this.currentSide = (int) Math.ceil((Math.random() * numberOfSides));
    return this.currentSide;
  }


  public int getCurrentSide(){
    return currentSide;
  }


  public int getNumberOfSides(){
    return numberOfSides;
  }


  public String getName(){
    return name;
  }


  public String toString(){
    return name + " " + currentSide;
  }


  public int getMaxRoll(){
    return numberOfSides;
  }


  private int currentSide;
  private int numberOfSides;
  private String name;
}
