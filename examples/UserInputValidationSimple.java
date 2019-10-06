
import java.util.Scanner;

public class UserInputValidationSimple{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);

		String pizzaOrWings = "";
		String orderDescription = "";

		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("Welcome to the Pizza and Wings Food Ordering Kiosk");
		System.out.println("We're here to serve you!");
		System.out.println("");
		System.out.println("");			

		//get pizza or wings
		while(!(pizzaOrWings.toLowerCase().equals("pizza") || pizzaOrWings.toLowerCase().equals("wings"))){
			System.out.println("\nWould you like pizza or wings?");
			pizzaOrWings = s.nextLine();

			if(!(pizzaOrWings.toLowerCase().equals("pizza") || pizzaOrWings.toLowerCase().equals("wings"))){
				System.out.println("");
				System.out.println("I'm sorry I didn't quite catch that, try again please.");
			}
		}

		//prepare order description
		orderDescription += "You ordered ";


		orderDescription += pizzaOrWings + ".";

		System.out.println(orderDescription);

		System.out.println("Thank you for ordering! Your meal will be ready shortly, enjoy! Please come again soon!\n\n\n");
	} //end main
} //end class
