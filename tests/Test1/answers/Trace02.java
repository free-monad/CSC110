import java.util.Scanner;

public class Trace02 {
	public static void main (String [] args){
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		String throw_away = s.nextLine(); //if you don't know why this line is here ignore it		
		int b = s.nextInt();

		System.out.println(a + b);
		String n = Integer.toString(b);
		System.out.println(n + a);
		System.out.println(n + b);
	}
}
