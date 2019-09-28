import java.util.Scanner;

public class Loops {

	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		String userInput = "";

		while(!userInput.equals("42")){
			System.out.println("What is the meaning of life, the universe, and everything?");
			userInput = scan.nextLine();

			if(userInput.equals("42")){
				System.out.println("That is CORRECT!");
			} else {
				System.out.println("Sorry bucko! You don't have a clue!");
			}			
		}
	}

}
