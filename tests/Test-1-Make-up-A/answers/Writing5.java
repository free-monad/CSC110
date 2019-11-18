public class Writing5 {
  public static void main(String [] args){
    for(int i = 0; i < 5; i++){

      boolean isRowIndexOdd = i % 2 == 1;

      if(isRowIndexOdd){
       System.out.print(" ");
      }

      for(int j = 0; j < 3; j++){
        System.out.print("x ");
      }

      if(!isRowIndexOdd){
        System.out.print("x ");
      }
     
      System.out.print("\n");
    }
  }
}
