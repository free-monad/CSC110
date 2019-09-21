import java.util.Scanner;

public class IfElse{

	public static void main(String [] args){
		final int BABY_MAX_AGE = 3;
		final int KID_MAX_AGE = 12;
		final int TEENAGER_MAX_AGE = 19;
		final int ADULT_MIN_AGE = 20;
	

		int age;
		String name;
		String career;
		String school;
		
		String babyMessage = "You're such a cute little baby!";
		String kidMessage = "My you're getting so big!";
		String teenagerMessage = "What school do you go to?";
		String adultMessage = "What is your career?";

		Scanner scan = new Scanner(System.in);

		System.out.println("BEEP! BOP! I'm the dinner party conversation bot!");
		System.out.println("What is your name?");
		name = scan.nextLine();
		System.out.println("What is your age?");
		age = Integer.parseInt(scan.nextLine());

		if(age <= BABY_MAX_AGE){
			System.out.println(babyMessage);
		} else if (age <= KID_MAX_AGE){
			System.out.println(kidMessage);
		} else if (age <= TEENAGER_MAX_AGE){
			System.out.println(teenagerMessage);
			school = scan.nextLine();
			
			if(school.equals("BMCC")){
				System.out.println("What an excellent institution!");
			} else{
				System.out.println("Oh, I'm sorry, I'm not familiar with that school");
			}
		} else {
			System.out.println(adultMessage);
			career = scan.nextLine();
			if(career.equals("Software Developer")){
				System.out.println("My oh my, things must be looking nothing but up for you!");
			} else {
				System.out.println("It's okay, we can't all write software for a living!");
			}
		}
		
		System.out.println("");
		System.out.println("");
	}
}

