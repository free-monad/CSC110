public class Test{
public static void main (String [] args){
	String a = "Hi";
	String b = "5";

	System.out.println(a + b);
	int n = Integer.parseInt(b) + 2;
	System.out.println(b + n);
	System.out.println(n + n);

	int x = 12;
	int y = 5;

	System.out.println(12 / 5);
	System.out.println((double)12 / 5);

	x = x + y;
	y = x - y;
	x = x - y;

	System.out.println("x: " + x);
	System.out.println("y: " + y);

	char c = 'A';
	c += 1;

	System.out.println(c);
}
}
