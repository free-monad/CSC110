public class Test3{
	public static void main(String [] args){

        int t = 30;
        int u = 40;
        int v = 50;

        if(t < v - u || t > u + v){
          System.out.println("success!");
        } else if (t == u){
          System.out.println("invalid input");
        } else if (t * 3 == u + v){
          System.out.println("shhhh...");
        } else {
          System.out.println("failure");
        }
	}
}	
