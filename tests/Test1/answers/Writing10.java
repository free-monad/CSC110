/*
Write a program that takes input from the user, converts all of the letters to lowercase, and
removes any whitespace from the edges.
*/
import java.util.Scanner;

public class Writing10{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);

		String str = s.nextLine();
		str = str.toLowerCase().trim();

		System.out.println(str);	
	}
}
