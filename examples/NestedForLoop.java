public class NestedForLoop{
  public static void main (String [] args){
    
    for(int i = 0; i < 5; i++){
      for(int j = 0; j < 3; j++){
        System.out.print("*");
       }
       System.out.print("\n");
     }
		 

		System.out.println("\n\n\n");

		for(int i = 0; i < 7; i++){
			for(int j = 1; j < i; j++){
				System.out.print("#");
			}
			System.out.print("\n");
		}
       
  }
}
