/*
Write a program that takes two numbers from a user and prints out a number of asterisks
equal to whichever number input by the user was the smallest.
*/
import java.util.Scanner;

public class Writing02{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		s.nextLine();
		int b = s.nextInt();		

		if(a < b){
			for(int i = 0; i < a; i++){
				System.out.println("*");
			}
		} else{
			for(int i = 0; i < b; i++){
				System.out.println("*");
			}
		}
	}
}
