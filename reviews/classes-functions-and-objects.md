<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h1> Classes, Functions, and Objects</h1>
<p>
	<table>
		<tr>
			<th><strong>Prerequisites</strong></th>
		</tr>
		<tr>
			<td> <a href="https://github.com/free-monad/CSC110/blob/master/reviews/variables.md">Variables </td>
		</tr>
		<tr>
			<td> <a href="https://github.com/free-monad/CSC110/blob/master/reviews/operators.md">Operators </a> </td>
		</tr>
		<tr>
			<td> <a href="https://github.com/free-monad/CSC110/blob/master/reviews/functions.md">Functions</a> </td>
		</tr>
	</table>
</p>
<p>
	Dividing programs up into <code>objects</code> and <code>classes</code> is the primary way Java programs are organized. This is in contrast to some other languages, such as C, where the primary way to divide up the tasks of a program is by placing common sets of instructions inside another kind of unit called a <code>function</code>.
</p>
<p>
	Before waxing philosophical, let's take a look at our HelloWorld program from the very first class and look for <code> objects </code>, <code>classes </code>, and <code>functions</code>. Don't worry if some of the punctuation or purpose isn't yet clear. You will come to an in-depth understanding over time. For now, let's just establish recognition.
<code>
<pre>
package CSC110;

public class HelloWorld {
	public static void main(String args[]){
		System.out.println("Hello World!");
		System.out.println("Goodbye World!");
	}
}

</pre>
</code>
	In this program, the line <code>public class HelloWorld</code> declares the existence of a class called HelloWorld. Everything between the curly braces after HelloWorld is part of the class definition. Programs can have more than one class, as we saw with <a href="https://github.com/PeterAdamson/CS2043-StringSorter">Peter Adamson's StringSorter program</a>, but traditionally in Java, there is only one class per file. For now, you can think of a class as a kind of container that helps to organize a program by grouping common data and operations or functions that need to be performed on that data.
</p>
<p>
	The next line in our program, <code>public static void main(String args[])</code> declares the existence of a function named main. It is actually a very special function that always acts as the entry point into any Java program. Everything between the main function's curly braces comprises the main function's definition. The very first line where the main function is declared is sometimes called the signature or head and the code between the curly braces where all the work happens is often called the function body.
<p>
</p>
	Because the main function is inside of the class definition for HelloWorld, main is said to belong to the HelloWorld class.
<p>
	Inside the main function are two more lines of code:
	<ul>
		<li><code>System.out.println("Hello World!");</code></li>
		<li><code>System.out.println("Goodbye World!");</code></li>
	</ul>
	Both of these lines are called function calls. A function call is a way of requesting the code inside a function definition to execute. Whenever you see a function name with parentheses at the end, a function is being called to execute whatever lines are contained within its curly braces. The name of the function in this case is called <code>println()</code>. As we know, its job is to print out whatever text is passed to it inside the parentheses. After these two function calls execute, your terminal screen will look like this:
<code>
<pre>
Hello World!
Goodbye World!
</pre>
</code>
Though we don't see it in this file, <code>println</code> does have a function declaration and a function definition within the Java SDK. Our HelloWorld code is relying on packages of pre-written Java classes to do a lot of the heavy-lifting for us so that we can get up and running quickly.
<p>
When we run our Java program, the <code>main</code> function is called. <code>main</code> then calls both of our <code>println</code> functions. <code>println</code> is being called from a class named <code>System</code> that owns an object named <code>out</code> which itself owns the function named <code>println</code> (in case you were curious). I know that's a mouthful. The important thing to remember is that:
	<ol>
		<li> <code>println</code> belongs to a kind of container called an object </li>
		<li> you don't need to know very much about how <code>println</code> works in order to use it </li>
	</ol>
If you know what kind of data the function wants you to pass into it and what the function is supposed to  output, you are all set to use that function. It is one of the great advantages of dividing programs up into functions, classes, and objects.
</p>
<p>
	But now you may be wondering, knowing that objects, classes, and functions are kinds of containers, what in the world the difference between them is. Fear not, we're about to explain!
</p>
<p>
	Let's look at a more elaborate version of a class in order to get a stronger grasp on the concepts. 
</p>
<p>
	Before continuing, make sure you review the concept of <a href="https://github.com/free-monad/CSC110/blob/master/reviews/variables.md">variables</a> and the concept of <a href="https://github.com/free-monad/CSC110/blob/master/reviews/operators.md">operators</a> to get the most out of the example below. As a quick reminder, variables store data for later use. Operators perform operations on variables or other data and produce a result (very much like a function. In fact, under the hood that is what operators are-- functions that get to be written in a special way).
</p>
<p>
The example:
</p>
<p>
	<code>
		<pre>
package CSC110;

public class Calculator{

	public static void main(String args[]){

				Calculator.doArithmetic();
				System.out.println("");
				System.out.println("");
				Calcultor.doArithmetic();

	}

	public static double add(double augend, double addend){
		double answer = augend + addend;

		return answer;
	}

	public static double subtract(double minuend, double subtrahend){
		double answer = minuend = subtrahend;

		return answer;
	}

	public static double multiply(double multiplicand, double multiplier){
		double answer = multiplicand * multiplier;

		return answer;
	} 

	public static double divide(double dividend, double divisor) {
		double answer = dividend / divisor;

		return answer;
	}

	public static void doArithmetic(){
		double operand1 = 100;
		double operand2 = 5;

		double sum = Calculator.add(operand1, operand2);
		double difference = Calculator.subtract(operand1, operand2);
		double product = Calculator.multiply(operand1, operand2);
		double quotient = Calculator.divide(operand1, operand2);

		double sum2 = Calculator.add(100, 50);

		System.out.println("Our two operand are: " + operand1 + " and " + operand2);
		System.out.println("The output of our add function is: " + sum);
		System.out.println("The output of our subtract function is: " + difference);
		System.out.println("The output of our multiply function is: " + product);
		System.out.println("The output of our divide function is: " + quotient);
		System.out.println("");
		System.out.println("The output of our second sum is: " + sum2);
		System.out.println("");
		System.out.println("");
		System.out.println("Thank you for running the Calculator program!");
		System.out.println("");
	}
}
		</pre>
	</code>
</p>
<p>
	Here is the resulting output of that code:
</p>
<code>
<pre>
//insert output here
</pre>
</code>
	You'll want to draw your attention to a few things here. 
	<ol>
		<li> The main function, where all of the code starts has only four lines. It calls a function named <code>doArithmetic()</code> twice. It also calls <code>println()</code> twice as well.</li>
		<li> The <code>doArithmetic()</code> function is prefixed with the name of our class, <code>Calculator</code>. This is because all of our functions are owned by this class. From inside the class, we could choose to omit this prefix, but if we were ever to use these functions outside of this class, the prefix would be required, just like it is for <code>System.out.println()</code></li>
		<li> There are four custom-made functions: <code> add()</code>, <code>subtract()</code>, <code>multiply</code>, and <code>divide()</code> that are called from inside <code>doArithmetic()</code>
		<li> Inside the body of the <code>doArithmetic()</code> function there are a lot of instructions. This function calls <code>add(), subtract(), multiply(), and divide()</code> with <code>add()</code> being called twice, each time with different input parameters. It then takes the results of all of those function calls and prints them to the screen</li>
		<li> There are two variables at the start of <code>doArithmetic()</code> named <code>operand1</code> and <code>operand2</code>. The data stored in these variables, 100 and 5 respectively, is passed to each of our arithmetic functions to be processed and the answer returned</li>
		<li> In the output section, all of the <code>println</code> statements happen twice. This is because we called <code>doArithmetic</code> two times </li>
		<li> There is a keyword <code>static</code> preceding all of the function names. We'll discuss why later. </li>
	</ol>
</p>
<p>
	This version of our program is organized into separate functions, much more like a C program. There is nothing wrong with this. It is a completely fine design. But this doesn't help us learn about objects and classes. Fortunately, we can change that. Simply by moving a few things around, we can organize our program into an object-oriented design.
</p>
<p>
Before going further though lets talk about what object and classes are at a high level. Like functions, classes group related sets of instructions together within curly braces (inside the class definition's body). Classes themselves often own many functions. In the above program, for instance, the class Calculator owns the functions add(), subtract(), multiply(), divide(), and doArithmetic(). Of course, if this was all a class did, they wouldn't be much more than a nice way of packaging functions into groups. Classes have two other crucial abilities that radically alter the way programmers organize their code. 
	<ol>
		<li>Classes can own data (stored in variables)</li>
		<li>Classes can construct objects</li>
	</ol>
</p>
<p>
	You can think of classes as a template that defines a new type of variable. You can then use this template to construct new variables of that type. The new variable or object can own a group of other variables as well as a group of functions. The class defines what these variables and functions are that belong to the new object and is also responsible for creating the object. In some ways the class is simultaneously a blue-print for how to make an object and a factory that builds the object.
</p>
<p>
	Before going on further, let's look at the object-oriented redesign of Calculator so that we can analyze it:
	<code>
		<pre>
package CSC110;

public class Calculator{

  public static void main(String args[]){
		System.out.println("Welcome to the Calculator main function!");

		//create two new objects of type Calculator
		Calculator calculateByTen = new Calculator(2, 10);
		Calculator calculator2 = new Calculator();

		//set the member variables of the second object
		calculator2.setOperands(3,5);

		//call doArithmetic on both objects
		calculateByTen.doArithmetic();
		calculator2.doArithmetic();

		//change the values of the variables of the second object
		calculator2.setOperands(20, 5);
		calculator2.doArithmetic();

		//call do arithmetic for the first object again to show that it's values remain the same
		calculateByTen.doArithmetic();

		System.out.println("The program is complete! Thanks for using!");
  }

	public Calculator(){
		this.operand1 = 0;
		this.operand2 = 0;
	}

	public Calculator(double op1, double op2){
		this.operand1 = op1;
		this.operand2 = op2;
	}

	public double getOperand1(){
		return this.operand1;
	}

	public double getOperand2(){
		return this.operand2;
	}

	public void setOperand1(double val){
		this.operand1 = val;
	}
	
	public void setOperand2(double val){
		this.operand2 = val;
	}

	public void setOperands(double val1, double val2){
		this.operand1 = val1;
		this.operand2 = val2;
	}

  public double add(){
    double answer = this.operand1 + this.operand2;

    return answer;
  }

  public double subtract(){
    double answer = this.operand1 - this.operand2;

    return answer;
  }

  public double multiply(){
    double answer = this.operand1 * this.operand2;

    return answer;
  }

  public double divide() {
    double answer = this.operand1 / this.operand2;

    return answer;
  }

  public void doArithmetic(){

    double sum = this.add(); 
    double difference = this.subtract(); 
    double product = this.multiply();
    double quotient = this.divide();

		System.out.println("");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println(" calculator output:");
		System.out.println("-----------------------------------------------------------------------------");
    System.out.println("Our two operands are: " + this.getOperand1() + " and " + this.getOperand2());
    System.out.println("The output of our add function is: " + sum);
    System.out.println("The output of our subtract function is: " + difference);
    System.out.println("The output of our multiply function is: " + product);
    System.out.println("The output of our divide function is: " + quotient);
    System.out.println("");
    System.out.println("");
    System.out.println("doArithmetic() is complete!");
    System.out.println("");
  }

	private double operand1;
	private double operand2;
}
		</pre>
	</code>
</p>		
</body>
</html>
