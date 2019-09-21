/*
	This program is a demo of print and println along with the behavior of the escape charaters
*/
public class PrintAndPrintln{
	public static void main(String [] args){
		System.out.println("This is an example of a println output command");
		System.out.println("Notice how each call starts on a new line");
		System.out.println("");
		System.out.print("This is a print statement");
		System.out.print(".  Notice how the output stays on the same line with each successive call...");
		System.out.println("");
		System.out.println("There are a lot of escape characters. Watch these in action below: ");
		System.out.println("");
		System.out.println("Here is \\t which represents a tab \t notice the spacing \t here!");
		System.out.println("Here is \\n for newline \n notice \n each \n word\n is \n on \n a \n new \n line!");
		System.out.println("Here is the backspace character... \\b ............. \b\b\b\b\b\b\b\b hmmmmm");
		System.out.println("Here is \\f for form feed \f notice \f the \f motion \f of \f the \f text");
		System.out.println("Here is \\r for return carriage, let's see what is does on the next line:");
		System.out.println("I will write \r and it will be \r over-written");
		System.out.println("Here is how we represent a quote, \\\" notice my quote \"To be or not to be...\"");
		System.out.println("And last but not least, here is how we represent a backslash \\\\, \\  see it in action?");
	}
}
