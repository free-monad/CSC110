public class Writing1{
  public static void main(String [] args){
    /*most efficient way*/
    for(int i = 4; i <= 100; i += 4){
      System.out.println(i);
		}

    /*Alternative but more computationally expensive way*/
    for(int i = 1; i <= 100; i++){
     if(i % 4 == 0){
       System.out.println(i);
     }
	  }
  }
}
