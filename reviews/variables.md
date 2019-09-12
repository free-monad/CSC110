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
	public static void main(String args[]){
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
			As you can imagine, variables can be really useful while writing computer programs. 
		</p>
		<p>
In Java, there are many types of variables that each store different kinds of information. The type of variable determines how the binary information in RAM is interpretted.
		</p>
</body>
</html>
