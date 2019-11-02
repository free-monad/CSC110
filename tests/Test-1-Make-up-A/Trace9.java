import java.util.Scanner;

public class Trace9 {
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);

		String secret = "Melts in your mouth not in your hand";
		String mask = "x";

		System.out.println("Welcome to censor.exe");
		String input = s.nextLine();

		do{
			secret = secret.replace(input.charAt(0), 'x');
			System.out.println(secret);
			System.out.println("");
			input = s.nextLine();
		} while(!input.equals("done"));

		System.out.println("Thanks for censoring content!");
		System.out.println("Here is your final censored document:" );
		System.out.println("");
		System.out.println(secret);
		
	}
}
