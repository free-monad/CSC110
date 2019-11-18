public class RussianDoll{
  
  public RussianDoll(String name){
    this.name = name;
  }


  public RussianDoll(String name, RussianDoll r){
    this.name = name;
    this.r = r;
  }


  public RussianDoll getDoll(){
    return r;
  }


  public String getName(){
    return name;
  }


  public void insertDoll(RussianDoll r){
    this.r = r;
  }


  public String toString(){
    return this.name;
  }


  private String name;
  private RussianDoll r;

}
