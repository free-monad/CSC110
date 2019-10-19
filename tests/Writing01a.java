public class Writing01a{
	public static void main(String [] args){
		int x = 30;
		int y = 40;
		int temp;

		System.out.println("x: " + x);
		System.out.println("y: " + y);		

		temp = x;
		x = y;
		y = temp;

		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}
}
