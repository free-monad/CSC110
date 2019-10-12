public class Test5{
	public static void main(String [] args){
		for(int i = 0; i < 10; i = i + 2){
          for(int j = 10; j > i; j--){
            System.out.print("*");
          }
          System.out.print("\n");
        }

	}
}
