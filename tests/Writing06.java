import java.util.Scanner;

public class Writing06{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);

		System.out.println("Please provide an even number:");
		int a  = s.nextInt();

		if(a % 2 == 0){
			System.out.println("Thank you so much!");
		} else{
			System.out.println("What the heck is the matter with you? If you don't wise up, I'm going to throw chairs at you!");
		}	
	}
}
