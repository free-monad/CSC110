public class Planet{
  public Planet(String name, String color){
    this.name = name;
    this.color = color;
  }

  public String getName(){
    return name;
  }

  public String getColor(){
    return color;
  }

  public void setMoon1(Moon m){
    this.moon1 = m;
  }

  public void setMoon2(Moon m){
    this.moon2 = m;
  }

  public Moon getMoon1(){
    return moon1;
  }

  public Moon getMoon2(){
    return moon2;
  }

  public String toString(){
    String result = "Planet: " + color + " " + name + " ";
    result = result + moon1 + " " + moon2;

    return result;
  }

  private String name;
  private String color;
  private Moon moon1;
  private Moon moon2;

}
