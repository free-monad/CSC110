import java.util.Scanner;
/*
This is a multi-line comment.
Comments are for humans to read.
The compiler skips over them.
This class calls the String API to 
perform various operations on a String
*/
public class StringManipulation{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);

		String sentence = "";
		String whitespace = "        Hello there mimble wimble!        	";
		String fruit1 = "apple";
		String fruit2 = "apple";

		//This is a single line comment. Below is the String manipulation calls
		System.out.println("\n\n\n\n\n\n\n");
		System.out.println("Welcome to the String Manipulation demo!");
		System.out.println("");
		System.out.println("Please enter a sentence with full punctuation");
		sentence = s.nextLine();
		System.out.println("");
		System.out.println("This is the sentence with all capital letters:");
		System.out.println(sentence.toUpperCase());
		System.out.println("");
		System.out.println("This is the sentence with all lowercase letters:");
		System.out.println(sentence.toLowerCase());
		System.out.println("");
		System.out.println("This is the length of the String");
		System.out.println(sentence.length());
		System.out.println("");
		System.out.println("Here are the hashes of your String and the whitespace String:");
		System.out.println("Your string: " + sentence.hashCode());
		System.out.println("whitespace: " + whitespace.hashCode());

		System.out.println("");
		System.out.println("The following is the whitespace String, first as is, then trimmed");
		System.out.println(whitespace);
		System.out.println(whitespace.trim());
		System.out.println("");
		System.out.println("Now lets look at == vs. .equals() for Strings fruit1 and fruit2 which both contain the value 'apple': ");
		System.out.println(fruit1 == fruit2);
		System.out.println(fruit1.equals(fruit2));
		System.out.println("");

		System.out.println("Next we're going to store the value of two String variables at runtime and compare them using == and .equals(). Please enter the same string for both prompts:");

		System.out.println("Please enter the first String to test: ");
		String a = s.nextLine();
		System.out.println("");
		System.out.println("Please enter the second String to test: ");
		String b = s.nextLine();
		System.out.println("");
		System.out.println("Here are the two Strings comparing using .equals()");
		System.out.println(a.equals(b));
		System.out.println("");
		System.out.println("Here are the two Strings comparing using ==");
		System.out.println(a == b);
		System.out.println("");
		System.out.println("Note they are not equals. This is because == compares both Strings to see if they occupy the same space in memory. It is not concerned with the contents of the String variable. == only turns true when the memory address the Strings are stored at in RAM is the same!");
	}
}
