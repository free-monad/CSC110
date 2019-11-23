public class Star {
  public Star(String name, String color){
    this.name = name;
    this.color = color;
  }

  public void setPlanet1(Planet p1){
    this.planet1 = p1;
  }

  public void setPlanet2(Planet p2){
    this.planet2 = p2;
  }

  public void setPlanet3(Planet p3){
    this.planet3 = p3;
  }

  public Planet getPlanet1(){
    return planet1;
  }

  public Planet getPlanet2(){
    return planet2;
  }

  public Planet getPlanet3(){
    return planet3;
  }

  public String getName(){
    return name;
  }

  public String getColor(){
    return color;
  }

  public String toString(){
    String result = "Star: " + color + " " + name;
    result = result + "\n" + planet1 + "\n" + planet2 + "\n" + planet3;

    return result;
  }

  private String name;
  private String color;
  private Planet planet1;
  private Planet planet2;
  private Planet planet3;
}
