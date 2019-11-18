public class Ecosystem{

  public static void main(String [] args){
	  
  Deer b = new Deer("b", 0, 0);
  Deer c = new Deer("c", 0, 1);
  Deer d = new Deer("d", 1, 0);
  Lion l1 = new Lion("l1", 0, -1);
  Lion l2 = new Lion("l2", -1, 0);

  System.out.println("Starting the simulation...");
  for(int i = 0; i < 20; i++){
    System.out.println("Processing ecosystem turn " + i +"...");
    
    System.out.println("Moving deer and lions around...");
    b.move(generateDirection());
    c.move(generateDirection());
    d.move(generateDirection());
    l1.move(generateDirection());
    l2.move(generateDirection());

    System.out.println("The first lion is hunting...");
    hunt(l1, b);
    hunt(l1, c);
    hunt(l1, d);

    System.out.println("The second lion is hunting...");
    hunt(l2, b);
    hunt(l2, c);
    hunt(l2, d);

    System.out.println("");
    System.out.println("");
  }


  }

  public static void hunt(Lion l, Deer d){
    if(isInSameSpace(l, d)){
      l.eat(d);
    }
  }
 
  public static boolean isInSameSpace(Lion l, Deer d){
    return l.getX() == d.getX() && l.getY() == d.getY();
  }

  public static String generateDirection(){
    int d = (int)Math.ceil(Math.random() * 4);
    String dir = "";

    switch(d){
      case 1:
        dir = "north";
        break;

      case 2:
        dir = "south";
        break;

      case 3:
        dir = "east";
        break;

      case 4:
        dir = "west";
        break;
    }

    return dir;
  }
}
