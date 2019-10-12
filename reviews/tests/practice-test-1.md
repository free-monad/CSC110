<!DOCTYPE html>
<html>
<head>
<title>Practice Test 1</title>
<link rel="stylesheet" type="text/css" media="all" href="https://github.com/free-monad/CSC110/blob/master/reviews/tests/test.css" />
</head>
<body>
<header>
	<div>
		<p>Name______________</p>
		<p>CSC110</p>
		<p>Fall 2019</p>
	</div>
	<div>
		<h1>Practice Test 1</h1>
		<h3> 250pts </h3>
	</div>
	<div>
		<p>Professor Conroy</p>
		<p> 12 October 2019 </p>
	</div>
	<p> Topics: Output to Screen, accepting user input, storing information in variables, using operators, if statements, loops, and reading from a file </p>
</header>
<main>
	<section>
		<h2> Tracing Code (40pts) </h2>
		<p> 
			Write what output will appear in the box provided. If there is screen output and file output, be sure to place output for each in their correct boxes. Also, make sure you keep track of your variable states as you trace through the code. There are boxes provided for these also, please us them. It will be best to cross out old values as you update them rather than delete them as this will help you maintain a version history in case you need to retrace your steps.
		</p>
		<mc-question points="5" type="trace">
			1.
			<code>
				<pre>
				System.out.print("Hey there! ");
				System.out.println("Won't you be \"my neighbor?\\\" \n");
				System.out.print("Good bye!");
				</pre>
			</code>	
		</mc-question>
		<mc-question points="5" type="trace">
			<p>2. The user enters in the value 'Hi' for the first input and '5' for the second input. </p>
			<code>
			<pre>
				Scanner s = new Scanner(System.in);
				String a = s.nextLine();
				String b = s.nextLine();
				System.out.println(a + b);
				int n = Integer.parseInt(b) + 2;
				System.out.println(b + n);
				System.out.println(n + n);
			</pre>
			</code>
		</mc-question>
		<mc-question points="5" type="trace">
			3.
			<code>
			<pre>
				int x = 12;
				int y = 5;
				System.out.println(x / y);
				System.out.println(x (double) / y);
				x = x + y;
				y = x - y;
				x = x - y;
				System.out.println("x: " + x);
				System.out.println("y: " + y);				
				char c = 'A';
				c += 1;
				System.out.println(c);
			</pre>
			</code>
		</mc-question>
		<mc-question points="5" type="trace">
			4.
			<code>
			<pre>
				final double p = 3;
				double f = Math.pow(4, p);
				double fp = f / p;
				int  q = (int) f / (int) p;
				double r = f % p;
				System.out.println(f);
				System.out.println(fp);
				System.out.println(q);
				System.out.println(r);
				</pre>
			</code>
		</mc-question>
		<mc-question points="5" type="trace">
			5.
			<code>
			<pre>
				int t = 30;
				int u = 40;
				int v = 50;
				if(t < v - u || t > u + v){
					System.out.println("success!");
				} else if (t == u){
					System.out.println("invalid input");
				} else if (t * 3 == u + v){
					System.out.println("shhhh...");
				}	else {
					System.out.println("failure");
				}
			</pre>
			</code>
		</mc-question>
		<mc-question points="5" type="trace">
			6.
			<code>
			<pre>
				String abracadabra = "abracadabra";
				String p = "abracadabra";
				while(abracadabra.equals("abracadabra")){
					System.out.println("Waiting...");
					abracadabra = p;
					p += "abracadabra";
				}
				System.out.println("Phew! We made it out!");
			</pre>
			</code>
		</mc-question>
		<mc-question points="5" type="trace">
			7.
			<code>
			<pre>
				for(int i = 0; i < 10; i = i + 2){
					for(int j = 10; j > i; j--){
						System.out.print("*");
					}
					System.out.print("\n");
				}	
			</pre>
			</code>
		</mc-question>
		<mc-question points="5" type="trace">
			8.
			<code>
			<pre>
				java.util.Scanner;
				java.io.File;
				java.io.IOException;
				public class Homoiconic throws IOException{
					public static void main(String [] args){
						Scanner fileIn = new Scanner(new File("Homoiconic.java"));
    				while(fileIn.hasNext()){
      				System.out.println(fileIn.nextLine());
    				}
					}
				}
			</pre>
			</code>
		</mc-question>
	</section>
	<section>
		<h2>Debugging Code (28pts)</h2>
		<p> There are 2 mistakes in each of these code samples. Find and correct them. Each bug and its correction is worth 2pts. </p>
		<mc-question points="4" type="debug">
			1.
			<code>
			<pre>
				System.out.print('One, Two, Three, let's jam')			
			</pre>
			</code>
		</mc-question>
		<mc-question points="4" type="debug">
			2.
			<code>
			<pre>
				int x = 3.2;
				print(x);
			</pre>
			</code>
		</mc-question>
		<mc-question points="4" type="debug">
			3.
			<code>
			<pre>
				String j = "happy";
				String k = "";
				Scanner s == new Scanner(System.in);
				j = s.nextLine();
				if(j == k){
					System.out.println("The strings are the same");
				} else{
					System.out.println("The strings are different");
				}
			</pre>
			</code>
		</mc-question>
		<mc-question points="4" type="debug">
		4.
			<code>
			<pre>
				for(i = 0; i < 10; i++)
					System.out.println("yes");
			</pre>
			</code>
		</mc-question>
		<mc-question points="4" type="debug">
			5.
			<code>
				<pre>
				char c = "Everything looks just fine here. ";
				System.out.println(c + 'Is everything ok?');
			</pre>
			</code>
		</mc-question>
		<mc-question points="4" type="debug">
			6.
			<code>
				<pre>
				String lie = "This statement is false."
				/* if (lie.equals("This statement is false.") {
							System.out.println(lie);
					} else {
						System.out.println("This statement is true");
					} endif
				</pre>
			</code>
		</mc-question>
		<mc-question points="4" type="debug">
			7.
			<code>
				<pre>
				boolean true = true;
				while(true){
					System.out.println("It's true!");
					true = false;
				}
				System.out.println("It's no longer true!");
				</pre>
			</code>
		</mc-question>
	</section>
	<section>
		<h2> Concepts (56pts) </h2>
		<mc-question points="4" type="concepts">
			<p>What is an algorithm?</p>
		</mc-question>
		<mc-question points="4" type="concepts">
			<p>What is git for?	</p>
		</mc-question>
		<mc-question points="4" type="concepts">
			<p>What is free and open-source software?</p>
		</mc-question>
		<mc-question points="4" type="concepts">
			<p>What does it mean to compile a program?</p>
		</mc-question>
		<mc-question points="4" type="concepts">
			<p>What is Java?</p>
		</mc-question>
		<mc-question points="4" type="concepts">
			<p>What is a computer?</p>
		</mc-question>
		<mc-question points="4" type="concepts">
			<p>What is ASCII and Unicode?</p>
		</mc-question>
		<mc-question points="4" type="concepts">
			<p>What is the difference between types int and long?</p>
		</mc-question>
		<mc-question points="4" type="concepts">
			<p>What is the difference between RAM and secondary storage (hard drives/thumb drives)?</p>
		</mc-question>
		<mc-question points="4" type="concepts">
			<p>What is a computer program?	</p>
		</mc-question>
		<mc-question points="4" type="concepts">
			<p>What is the difference between type char and type String?	</p>
		</mc-question>
		<mc-question points="4" type="concepts">
			<p>When do you use a loop?</p>
		</mc-question>
		<mc-question points="4" type="concepts">
			<p>What are variable types?</p>
		</mc-question>
		<mc-question points="4" type="concepts">
			<p>What are the two types of comments and what are they for?</p>
		</mc-question>
	</section>
	<section>
		<h2> Writing Programs (90pts) </h2>
		<mc-question points="10" type="program">
			<p>Write a program that stores two numbers each in their own variable. Print each number to the screen. Next swap the numbers so that the first variable has the number from the second variable and the second variable has the number from the first variable. Print them to the screen again after the swap.	</p>
		</mc-question>
		<mc-question points="10" type="program">
			<p>Write a program that keeps asking for a user response until the user types the word 'no', 'No', or 'NO'. Make sure to account for leading or trailing spaces.</p>
		</mc-question>
		<mc-question points="10" type="program">
			<p>Write a program that asks what day of the week it is and then tells the user what day of the week it will be 23 days later.</p>
		</mc-question>
		<mc-question points="10" type="program">
		<p>	Write a program that asks the user for input and shouts "Off with their head!" to the user if any portion of the user's input contains the word 'heart'. So for instance, if the user types in "I don't have the heart to coninue". The program will respond "off with their head!". </p>
		</mc-question>
		<mc-question points="10" type="program">
			<p>Write a program that returns a random number 1 and 10.</p>
		</mc-question>
		<mc-question points="10" type="program">
		<p>	Write a program that asks for a number and then tells the user if the number is greater than 50 and whether or not the number is even or odd.</p>
		</mc-question>
		<mc-question points="10" type="program">
			<p>Write a program that reads numbers from a file (the file will have one number per line) and adds them all together and prints out a result.</p>
		</mc-question>
		<mc-question points="10" type="program">
			<p>Write a program that prints out 10 asterisks to the screen using a for loop.</p>
		</mc-question>
		<mc-question points="10" type="program">
			<p>Write a program that tells a user they are awesome no matter what they type in the terminal. Never let the program end.</p>
		</mc-question>
	</section>
	<section>
		<h2> Assignment (54pts) </h2>
		<p> Write a program that keeps asking a user for numbers until the user types the word 'done'. Add up all the numbers and print the result for the user at the end. Make sure the program accounts for leading and trailing spaces. Also make sure the program ignores case so that 'dOne', 'DONE', or 'DONe' are all excepted as the command to end the program. If the user types something besides the word done or a number, kindly tell the user that what they typed was not a known command and that no number was added. Before closing the program, print a number of asterisks equal to the final sum. Thank the user for using the program and exit. The program should be able to add floating point numbers as well as integers.
	</section>
</main>
</body>
</html>

<!--
Topics:
Output to Screen
User input
Variables
Operators
if statements
loops
reading files
-->
