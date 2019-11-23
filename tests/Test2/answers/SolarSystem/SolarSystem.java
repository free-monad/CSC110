public class SolarSystem{
  public static void main(String [] args){
    Star sun = new Star("sun", "yellow");

    Planet mercury = new Planet("mercury", "gray");
    Planet venus = new Planet("venus", "red");
    Planet earth = new Planet("earth", "blue");

    Moon m1 = new Moon("m1", "black");
    Moon m2 = new Moon("m2", "black");

    Moon v1 = new Moon("v1", "green");
    Moon v2 = new Moon("v2", "green");
    
    Moon e1 = new Moon("e1", "gray");
    Moon e2 = new Moon("e2", "gray");

    sun.setPlanet1(mercury);
    sun.setPlanet2(venus);
    sun.setPlanet3(earth);

    mercury.setMoon1(m1);
    mercury.setMoon2(m2);

    venus.setMoon1(v1);
    venus.setMoon2(v2);

    earth.setMoon1(e1);
    earth.setMoon2(e2);

    System.out.println(sun);
  }
}
