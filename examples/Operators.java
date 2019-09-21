/*
	This program showcases commonly used operators
*/

import java.util.Scanner;

public class Operators{
	public static void main(String [] args){

		final int DAYS_PER_YEAR = 365;
		final int DAYS_PER_WEEK = 7;
		final int HOURS_PER_DAY = 24;
		final int MINUTES_PER_HOUR = 60;
		final int SECONDS_PER_MINUTE = 60;

		final double DISTANCE_TO_MOON_KM = 363104;

		Scanner scan = new Scanner(System.in);

		String hello = "Hola ";
		String world = "Mundo";
		String greeting = hello + world;

		double velocityInKilometersPerHour;

		double durationOfTripYears;
		double durationOfTripWeeks;
		double durationOfTripDays;
		double durationOfTripHours;
		double durationOfTripMinutes;
		double durationOfTripSeconds;

		double remainder;

		System.out.print("\n\n");
		System.out.println(greeting + "! Welcome to the moon trip calculator!");
		System.out.println("At what velocity do you plan on traveling to the moon?");
		velocityInKilometersPerHour = scan.nextDouble();
		System.out.println("");
		System.out.println("Thank you for that information. Let me cook up a few calculations...");
		System.out.println("");

		durationOfTripHours = DISTANCE_TO_MOON_KM / velocityInKilometersPerHour;
		durationOfTripMinutes = durationOfTripHours * MINUTES_PER_HOUR;
		durationOfTripSeconds = durationOfTripMinutes * SECONDS_PER_MINUTE; 

		durationOfTripDays = durationOfTripHours / HOURS_PER_DAY;
		durationOfTripWeeks = durationOfTripDays / DAYS_PER_WEEK;
		durationOfTripYears = durationOfTripWeeks / DAYS_PER_YEAR;


		System.out.println("The results are in: ");
		System.out.println("At a velocity of " + velocityInKilometersPerHour + "kilometers per hour, this trip will take you: ");
		System.out.println(durationOfTripYears + " years to complete OR");
		System.out.println(durationOfTripWeeks + " weeks to complete OR");
		System.out.println(durationOfTripDays + " days to complete OR");
		System.out.println(durationOfTripHours + " hours to complete OR");
		System.out.println(durationOfTripMinutes + " minutes to complete OR");
		System.out.println(durationOfTripSeconds + " seconds to complete");

		System.out.println("");
		System.out.println("In friendlier terms: ");

		System.out.println("Thanks for using the application! Good luck in your travels!");
		System.out.println("");
		System.out.println("");				
		

	}
}
