public class Person{

  public Person(String name){
    population++;
    this.name = name;
  }


  public boolean isZombie(){
    return isZombie;
  }


  public static int getPopulation(){
    return population;
  }


  public String getName(){
    return name;
  }


  public void becomeZombie(){
    this.isZombie = true;
    population--;
    zombieCount++;
  }


  public void die(){
    if(!isZombie){
      population--;
    }
  }


  public void bite(Person p){
    if(this.isZombie){
      p.becomeZombie();
    }
  }


  private boolean isZombie;
  private static int population;
  private static int zombieCount;
  private String name;
}
