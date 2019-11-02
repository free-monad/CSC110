public class Trace2{
  public static void main(String [] args){
    int x = 32;
    int y = 55;
    int z = 0;
    int i = -1;
    boolean is = false;

    if(x > y || z > i){
      if(i > 0){
        System.out.print("a");
      } else if (i == -1){
        System.out.print("p");
        if(!is){
          System.out.print("i");
        } else {
          System.out.print("p");
        }
	 if(true){ 
	  System.out.println("p");
	 }
      } else{
        System.out.println("d");
        if(x == 32 && y == 55 && z == 0){
          System.out.print("You made it!");
        } else {
          System.out.print("Next time...");
        }
      }
    } else {
      System.out.print("x is less than y");
    }
  }
}
