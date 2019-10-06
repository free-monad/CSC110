
import java.util.Scanner;

public class UserInputValidation{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);

		String pizzaOrWings = "";
		String cokeOrPepsi = "";
		String hotMediumOrMild = "";
		String smallMediumOrLarge = "";
		String isOrderCorrect = "";
		String orderDescription = "";

		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("Welcome to the Pizza and Wings Food Ordering Kiosk");
		System.out.println("We're here to serve you!");
		System.out.println("");
		System.out.println("");			

		while(!isOrderCorrect.toLowerCase().equals("yes")){
			//get pizza or wings
			while(!(pizzaOrWings.toLowerCase().equals("pizza") || pizzaOrWings.toLowerCase().equals("wings"))){
				System.out.println("\nWould you like pizza or wings?");
				pizzaOrWings = s.nextLine();
	
				if(!(pizzaOrWings.toLowerCase().equals("pizza") || pizzaOrWings.toLowerCase().equals("wings"))){
					System.out.println("");
					System.out.println("I'm sorry I didn't quite catch that, try again please.");
				}
			}

			//check if they ordered wings
			if(pizzaOrWings.equals("wings")){
				//get hot, medium, or mild wings
				System.out.println("\n\n");
				while(!(hotMediumOrMild.toLowerCase().equals("hot") || 
								hotMediumOrMild.toLowerCase().equals("medium") || 
								hotMediumOrMild.toLowerCase().equals("mild"))){
					
					System.out.println("Would you like your wings hot, medium, or mild?");
					hotMediumOrMild = s.nextLine();

					if(!(hotMediumOrMild.toLowerCase().equals("hot") || 
								hotMediumOrMild.toLowerCase().equals("medium") || 
								hotMediumOrMild.toLowerCase().equals("mild"))){
						System.out.println("");
						System.out.println("I'm sorry I didn't quite catch that, try again please.");
					}
				}
			}

			//get coke or pepsi
			System.out.println("");
			System.out.println("");
			while(!(cokeOrPepsi.toLowerCase().equals("coke") || cokeOrPepsi.toLowerCase().equals("pepsi"))){
				System.out.println("\nWould you like coke or pepsi?");
				cokeOrPepsi = s.nextLine();

				if(!(cokeOrPepsi.toLowerCase().equals("coke") || cokeOrPepsi.toLowerCase().equals("pepsi"))){
					System.out.println("");
					System.out.println("I'm sorry I didn't quite catch that, try again please.");
				}
			}	

			//get small medium or large
			System.out.println("\n\n");
			while(!(smallMediumOrLarge.toLowerCase().equals("small") || 
							smallMediumOrLarge.toLowerCase().equals("medium") || 
							smallMediumOrLarge.toLowerCase().equals("large"))){
				
				System.out.println("Would you like your drink small, medium, or large?");
				smallMediumOrLarge = s.nextLine();

				if(!(smallMediumOrLarge.toLowerCase().equals("small") || 
							smallMediumOrLarge.toLowerCase().equals("medium") || 
							smallMediumOrLarge.toLowerCase().equals("large"))){
					System.out.println("");
					System.out.println("I'm sorry I didn't quite catch that, try again please.");
				}
			}

			//prepare order description
			orderDescription += "You ordered ";

			if(pizzaOrWings.toLowerCase().equals("wings")){
				orderDescription += hotMediumOrMild + " ";
			}

			orderDescription += pizzaOrWings + " with a " + smallMediumOrLarge + " " + cokeOrPepsi.substring(0, 1).toUpperCase() + cokeOrPepsi.substring(1) + ".";

			System.out.println(orderDescription);
			System.out.println("IS this correct? (yes/no)");
			isOrderCorrect = s.nextLine();

			//validate order
			while(!(isOrderCorrect.toLowerCase().equals("yes") || isOrderCorrect.toLowerCase().equals("no"))){
				System.out.println("\nIs this correct? (yes/no)");
				isOrderCorrect = s.nextLine();
	
				if(!(isOrderCorrect.toLowerCase().equals("yes") || isOrderCorrect.toLowerCase().equals("no"))){
					System.out.println("");
					System.out.println("I'm sorry I didn't quite catch that, try again please.");
				}
			}

			if(isOrderCorrect.toLowerCase().equals("no")){
				pizzaOrWings = "";
		 		cokeOrPepsi = "";
		 		hotMediumOrMild = "";
		 		smallMediumOrLarge = "";
		 		isOrderCorrect = "";
		   	orderDescription = "";
			}
			
		} //end is order correct

		System.out.println("Thank you for ordering! Your meal will be ready shortly, enjoy! Please come again soon!\n\n\n");
	} //end main
} //end class
