/*
Write a program that asks a user for integers over and over again until they type in the word ‘done’.
Convert the even numbers into ASCII characters, build a String out of the converted numbers, and print
that String to the screen. For instance, if a user enters 66 as the first input and then 69, 70, and 70 for
the next 3 inputs. The program would convert 66 to the letter B and add it to the final String, it would
discard 69, and then it would convert each of the 70’s to a letter F and add each of those to the end of
the String. It would then print out: BFF and the program would end.
Make sure your program takes numbers to be converted to letters from the user until they type done.
When the user types ‘done’ make sure you can account for the user typing in mixed case and various
amounts of whitespace. Things like:
‘DONE’
‘Done’
‘
done
‘
and
‘
DOne’
should work just fine in your program (the single quotes are there to show you whitespace in the input).
*/
import java.util.Scanner;

public class Assignment{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);

		String input = "";
		String result = "";
		int inputAsInt;
		char c;

		while(!input.equals("done")){
			System.out.println("Please provide an integer");
			input = s.nextLine().toLowerCase().trim();
		
			if(input.equals("done")){
				break;
			}

			inputAsInt = Integer.parseInt(input);
			
			if(inputAsInt % 2 == 0){
				c = (char) inputAsInt;
				result = result + c;
			}	
		}
		
		System.out.println(result);
	}
}
