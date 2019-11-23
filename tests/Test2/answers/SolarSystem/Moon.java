public class Moon {
  public Moon(String name, String color){
    this.name = name;
    this.color = color;
  }

  public String getName(){
    return name;
  }

  public String getColor(){
    return color;
  }

  public String toString(){
    return "Moon: " + color + " " + name;
  }

  private String name;
  private String color;
}
