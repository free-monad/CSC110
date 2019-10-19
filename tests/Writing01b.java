public class Writing01b{
	public static void main(String [] args){
		int x = 30;
		int y = 40;

		System.out.println("x: " + x);
		System.out.println("y: " + y);

		x = y - x;
		y = y - x;
		x = x + y;

		System.out.println("x: " + x);
		System.out.println("y: " + y);		
	}
}
