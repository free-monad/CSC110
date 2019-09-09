<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<header>
		<h1> Hello World</h1>
		<table>
			<tr>
				<td>
					<strong>Skill:</strong>
				</td>
				<td>
					Compiling Java Projects
				</td>
			</tr>
			<tr>
				<td>
					<strong>Value </strong>
				</td>
				<td>
					+3 Levels
				</td>
			</tr>
		</table>
	</header>
	<main>
		<section>
			<h2>Objective</h2>
			<p>
				To compile a simple Java program to learn the process of writing and running a program.
			</p>
		</section>
		<section>
			<h2> Materials </h2>
			<p>
				List the tools and resources you will be using.
			</p>	
		</section>
		<section>
			<h2> Methods </h2>
			<p>
				<ol>
					<li> Open the terminal for your operating system. </li>
					<li> 
						<p>
							Type:
						</p>
						<code>
							java -version
						</code>
						<p> And press ENTER. Make sure that you get a message displaying what version of Java you have. If not you will need to install the Java Standard Edition SDK and set your JAVA_HOME and PATH variables as we did in class. There should be a review sheet available describing this process that you may consult. </p>
					</li>
					<li>
						<p> Create a new file named HelloWorld.java and open the file for editting in your favorite basic text editor or IDE. Note that the name of the file must match the name of the class you declare at the beginning of your code.</p>
						<p> Place the following code inside the file: </p>
						<code>
							<pre>
								public class HelloWorld {
									public static void main(String [] args) {
										System.out.println("Hello World!");
									}
								}	
							</pre>
						</code>
						<p> When you are finished, save the file </p>
					</li>
					<li>
						<p> Next we are going to compile your human-readable code file into a computer program your computer can understand. In your terminal, navigate to the location of your HelloWorld.java file. Once there, type: </p>
						<code>
							javac HelloWorld.java
						</code>
						<p> If you don't see any error messages, then congratulations! You have successfully compiled your first Java program. The javac command turns your human-readable text file into binary. Just to be sure, look inside the directory where your HelloWorld.java file is. You should see an additional file named HelloWorld.class. This new file is the binary executable file that the computer will read to run your computer program. </p>
					</li>
					<li>
						<p> Next, we are going to execute the binary file HelloWorld.class. To do this, we simply need to type one more command. Please type:  </p>
						<code>
							java HelloWorld
						</code>
						<p> You should see the words <output> Hello World! </output> print to the screen. If so, you have just completed the lab! </p>
					</li>
				</ol>
			</p>
		</section>
		<section>
					<h2> Conclusion </h2>
			<p>
				You now have a sense of the process for writing and compiling computer programs. You started by creating a file and filling it with code. Then you compiled the code into an executable. After this you ran the code and witnessed the output. 
			</p>
		</section>
		</main>
</body>
</html>
