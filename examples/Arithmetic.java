/*
 * A first look at static methods and how they can be used in function composition
 */ 

public class Arithmetic {
	public static void main (String [] args){
		int a = sum(52, 100);
		int b = multiply(20, 100);
		int c = power(3,4);
		int d = sum(b,c);
		int e = multiply(a, 2);

		System.out.println("The sum of 52 and 100 is: " + a);
		System.out.println("The product of 20 and 100 is: " + b);
		System.out.println("3 to the 4th power is: " + c);
		System.out.println("The sum of " + b + " and " + c + "is: " + d);
		System.out.println("The product of " + a + " and 2 is: " + e);
	}

	public static int sum(int op1, int op2){
		return op1 + op2;
	}

	public static int multiply(int m1, int m2){
		int result = 0;

		for(int i = 0; i < m1; i++){
			result = sum(result, m2);
		}

		return result;
	}

	public static int power(int base, int exponent){
		int result = 1;

		for(int i = 0; i < exponent; i++){
			result = multiply(result, base);
		}

		return result;
	}
}
