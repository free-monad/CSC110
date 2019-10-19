/*
Write a program that asks a user for a number and then prints out the corresponding ASCII
character for that number.
*/
import java.util.Scanner;

public class Writing09{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Give us a number");
		int n = s.nextInt();

		char c = (char) n;

		System.out.println(c);
	
	}
}
