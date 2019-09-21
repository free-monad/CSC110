/*ssisiiiisdf;;;;ii::
	This program showcases all of the different primitive variable types available.
*/
public class Types{
	public static void main(String [] args){

		//declare a variable for every primitive type and assign a neutral value
		byte b = 0;
		short sh = 0;
		int i = 0;
		long l = 0;
		
		float f = 0f;
		double d = 0.0;

		char c = 0;
		boolean tf = false;	

		System.out.println("Welcome to the primitive type testing program");
		System.out.println("Here are all of the variables, one for each primitive type in Java");
	
		//print values of variables	
		System.out.println("");
		System.out.println("byte b is: " + b);
		System.out.println("short sh is: " + sh);
		System.out.println("int i is: " + i);
		System.out.println("long l is: " + l);
		System.out.println("float f is: " + f);
		System.out.println("double d is: " + d);
		System.out.println("char c is: " + c);
		System.out.println("boolean tf is: " + tf);
		System.out.println("");
		//set all variables to their maximum possible value (except the char, float, boolean, and double)
		b = 127;
		sh = 32767;
		i = 2147483647;
		l = Long.MAX_VALUE;
		f = 3.1415f;
		d = 2.71828182845;
		c = 65;
		tf = true;

		//print values of variables
		System.out.println("");
		System.out.println("byte b is: " + b);
		System.out.println("short sh is: " + sh);
		System.out.println("int i is: " + i);
		System.out.println("long l is: " + l);
		System.out.println("float f is: " + f);
		System.out.println("double d is: " + d);
		System.out.println("char c is: " + c);
		System.out.println("boolean tf is: " + tf);
		System.out.println("");
		//increment each variable one value past their maximum value (except char, float, boolean, and double)
		b++;
		sh++;
		i++;
		l++;
		f++;
		d++;
		c++;
		tf = !tf;

		//print values of variables
		System.out.println("");
		System.out.println("byte b is: " + b);
		System.out.println("short sh is: " + sh);
		System.out.println("int i is: " + i);
		System.out.println("long l is: " + l);
		System.out.println("float f is: " + f);
		System.out.println("double d is: " + d);
		System.out.println("char c is: " + c);
		System.out.println("boolean tf is: " + tf);
		System.out.println("");
	}

	
}
