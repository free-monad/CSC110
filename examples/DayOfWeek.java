import java.util.Scanner;

public class DayOfWeek{

	public static void main(String [] args) throws Exception{
		final int NUMBER_OF_DAYS_PER_WEEK = 7;
		
		String dayOfWeekStr;
		int dayOfWeekInt;
		int daysLater;
		int daysLaterRemainder;

		int dayOfWeekInFutureInt;
		String dayOfWeekInFutureStr;

		Scanner s = new Scanner(System.in);

		System.out.println("What day of the week is today?");
		dayOfWeekStr = s.nextLine();

		System.out.println("How may days into the future would you like to know the day of the week?");
		daysLater = s.nextInt();

		switch(dayOfWeekStr){
			case "Sunday":
				dayOfWeekInt = 1;
				break;
			case "Monday":
				dayOfWeekInt = 2;
				break;
			case "Tuesday":
				dayOfWeekInt = 3;
				break;
			case "Wednesday":
				dayOfWeekInt = 4;
				break;
			case "Thursday":
				dayOfWeekInt = 5;
				break;
			case "Friday":
				dayOfWeekInt = 6;
				break;
			case "Saturday":
				dayOfWeekInt = 7;
				break;
			default:
				throw new Exception("Not a valid day of the week");
		}

		daysLaterRemainder = daysLater % NUMBER_OF_DAYS_PER_WEEK;
		dayOfWeekInFutureInt = (dayOfWeekInt + daysLaterRemainder) % NUMBER_OF_DAYS_PER_WEEK;

		switch(dayOfWeekInFutureInt){
			case 1:
				dayOfWeekInFutureStr = "Sunday";
				break;
			case 2:
				dayOfWeekInFutureStr = "Monday";
				break;
			case 3:
				dayOfWeekInFutureStr = "Tuesday";
				break;
			case 4:
				dayOfWeekInFutureStr = "Wednesday";
				break;
			case 5:
				dayOfWeekInFutureStr = "Thursday";
				break;
			case 6:
				dayOfWeekInFutureStr = "Friday";
				break;
			case 7:
				dayOfWeekInFutureStr = "Saturday";
				break;
			default:
				throw new Exception("The formulate for day of the week conversion has failed to map to a day");
		}

		System.out.println("The day of the week " + daysLater + " days from today is " + dayOfWeekInFutureStr + "!");
	}
}
