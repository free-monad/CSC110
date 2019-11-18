import java.util.Scanner;

public class Writing8{

  public static int INCHES_PER_FOOT = 12;

  public static void main(String [] args){

    Scanner s = new Scanner(System.in);

    String input;
    int feet, inches, inputAsInt;

    System.out.println("Give me the number of inches you would like to convert to feet.");
    input = s.nextLine();

    inputAsInt = Integer.parseInt(input);

    feet = inputAsInt / INCHES_PER_FOOT;
    inches = inputAsInt % INCHES_PER_FOOT;

    System.out.println(input + " inches is " + feet + "ft and " + inches + " inches.");
    

  }
}
