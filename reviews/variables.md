<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<h1> Variables </h1>
	<section>
		<p>
			A variable can be thought of as a container that holds data. The data is stored in the computer's RAM as a binary number and the variable name refers to the data's location. You can think of RAM as a large two-dimensional piece of grid paper that the computer can write on. The location of a variable's data in RAM is called its address. Since the name of the variable refers to the address at which the information is located, the variable can be used to store, retrieve, and alter the information at this location.
		</p>
		<p>
			Here is an example of a program that uses variables:
			<code>
				<pre>
public class VariableExample {
	public static void main(String [] args){
		String request;
		int happinessLevel;

		request = "Take me to my happy place!";
		happinessLevel = 7;

		System.out.println("My happiness level is " + happinessLevel);
		System.out.println(request);
		
		happinessLevel = 10;

		request = request + " Pleeeeaase!";

		System.out.println(request);
		System.out.println(happinessLevel);
		System.out.println("");
		System.out.println("... ... ...");
		System.out.println("...YES!");
	}
}
				</pre>
			</code>
		</p>
		<p>
			In this code, two variables are declared, a String, <code>request</code> and an integer, <code>happinessLevel</code>. This happens on lines 3 and 4. On lines 6 and 7, the variables are assigned data. <code>request</code> is assigned the String <code>"Take me to my happy place!"</code> and <code>happinessLevel</code> is assigned the integer 7. Not bad! Of course, things can always be better. After some output printing, <code>happinessLevel</code> is re-assigned a new value, <code>10</code> and the String <code>request</code> gets the word <code>Pleeeeaase!</code> appended to the end of it. The information is then reprinted using <code>println</code>.
		</p>
		<p>
			As you can imagine, variables can be really useful while writing computer programs. You can use them to store the results of computations or to pass literals or other data around to other parts of a program or even store input from the user. Just like in algebra, where equations with variables can capture the general form of an equation to capture a span of possible solutions, in a computer program, variables can be used to great effect to generalize your program so that it can solve a broader set of problems than the specific problem or smaller set of problems that a program without variables could solve.
		</p>
		<p>
			For example, you could create a program that adds the numbers 10 and 5 together and outputs the number 15. Or you could take input from a user and store that input in a variable. The new program, using two variables for each of the numbers would be able to solve any addition program, whereas the first program could only solve the addition problem 10 + 5.
		<p> Here is the first specific program that adds 10 and 5: </p>
<code>
	<pre>
public class AddTenAndFive{
	public static void main(String [] args){
		int sum = 10 + 5;
		System.out.prinln("The sum of 10 and 5 is " + sum);
	}
}
	</pre>
</code>
		<p> Here is the second more generalized program using variables and input from the user: </p>
<code>
	<pre>
import java.util.Scanner;

public class AddingProgram {
	public static void main(String [] args){

		int augend;
		int addend;
		int sum;

		Scanner in = new Scanner(Sytem.in); //we'll talk about this later

		System.out.println("Please give me an integer");
		augend = in.nextInt();

		System.out.println("Please give me a second integer");
		addend = in.nextInt();

		System.out.println("Adding the numbers together...");
		sum = augend + addend;

		System.out.println("...and the result is: ");
		System.out.println(augend + " " + addend + " = " + sum);
		
	}
}
	</pre>
</code>
		<p>
			As you can see, the second program is far more robust and general just by introducing a few variables. It stores the user input in the variables <code>augend</code> and <code>addend</code> and then adds them together and stores the result in the variable <code>sum</code>.
		</p>
		<p>
			You may or may not have noticed that there is a third variable in the program of type <em>Scanner</em> named <em>in</em>. This variable looks a bit different than the integers. This is because it is a variable that stores an object instead of a primitive literal value. Variables that store objects have a different notation. We won't go too far into it now. Just know that you can use variables to store objects also well as primitive data types.
		</p>
		<p>https://github.com/free-monad/CSC110/blob/master/reviews/types.md
In Java, there are many types of variables that each store different kinds of information. The type of variable determines how the binary information in RAM is interpretted. In the program above there are variables for integers and variables for objects. There are several different types. If you want to learn more, go to the review sheet on <a href="https://github.com/free-monad/CSC110/blob/master/reviews/types.md"> types </a>. You may also be interested in the review sheet on <a href="https://github.com/free-monad/CSC110/blob/master/reviews/primitives-vs-objects.md"> primitives vs objects </a>.
		</p>
</body>
</html>
