import java.util.Scanner;

/*
	This program takes two integer inputs from the user and adds them together.
*/
public class UserInput{

	public static void main(String [] args){

		Scanner in = new Scanner(System.in); 	//create a Scanner variable for processing input
		int operand1;	 												//the first number the user enters
		int operand2; 												//the second number the user enters
		int sum; 															//the sum of the numbers the user enters

		System.out.print("\n\n\n\n");
		System.out.println("Welcome to our basic addition program!");
		System.out.print("Please enter your first integer: ");
		operand1 = in.nextInt();
		System.out.println("");

		System.out.print("Please enter your second integer: ");
		operand2 = in.nextInt();
		System.out.println("");

		sum = operand1 + operand2; //add the two user numbers together and assign it to the sum variable

		System.out.println("You entered the numbers " + operand1 + " and " + operand2);
		System.out.println("Their sum is: " + sum);

		System.out.println("Thank you for using our program!");
		System.out.print("\n\n\n\n");
	}
}
