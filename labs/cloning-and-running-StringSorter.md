<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<header>
		<h1> Cloning and Running String Sorter</h1>
		<table>
			<tr>
				<th><strong>Skill</strong></th>
				<th><strong>Value</strong></th>
			</tr>
			<tr>
				<td>Using Git and GitHub</td>
				<td>+1 Level</td>
			</tr>
			<tr>
				<td>Compiling Java </td>
				<td>+1 Level</td>
			</tr>
			<tr>
				<td>Packages</td>
				<td>+1 Level </td>
			</tr>
		</table>
	</header>
	<main>
		<section>
			<h2> Objective </h2>
			<p>
				To clone Peter Adamson's StringSorter repository, compile his code, and run his program.
			</p>
		</section>
		<section>
			<h2> Materials </h2>
			<p>
				<ul>
					<li> Access to GitHub </li>
					<li> Git installed on your local machine </li>
					<li> Java Standard Edition JDk </li>
					<li> Your PATH and JAVA_HOME variables set </li>
					<li> Access to java and javac on your operating system's terminal </li>
				</ul>
			</p>	
		</section>
		<section>
			<h2> Methods </h2>
			<p>
				<ol>	
					<li> 
						Clone the repository located at <a href="https://github.com/PeterAdamson/CS2043-StringSorter">https://github.com/PeterAdamson/CS2043-StringSorter </a> . It is a computer program written in Java that sorts Strings in a file.
					</li>
					<li>
						To compile the code, move to the directory in your terminal and type:
						<code>
							javac -d . *.java
						</code>
						The -d is called a flag. It instructs the compiler to compile the .java files into something called a package, a module that groups multiple files together. The . after the -d flag tells the compiler that we want to work from the current director, it is equivalent to './' The next bit, *.java uses the * wildcard. It simply means 'list all of the files that end with .java'. The name of the file can be anything. For our purposes, we are simply wanting to compile every .java file. You may be wondering why we are suddenly dealing with these new entities called packages. Apart from being a nice way of organizing your code, We are using packages in this compile process because the StringSorter code files contain a line at the beginning of each file that asserts that they each belong to a particular package. The line is: <code>package pja.assn1;</code> It instructs the compiler to place each of these files in a package called pja.assn1.
					</li>
					<li>
						After running the javac command, if you inspect the directory, you should now see a new directory named pja with another directory named assn1 which contains a .class file for each .java file we started with. These 3 files are our executable. The file StringSorterDriver.java was the file with our main class inside it. The main class is the main entry point of the computer program. This is the file where the execution of the computer program begins. The other two files, StringSorter.java and StringSorterCLI.java are the two files on which StringSorterDriver.java depends. StringSorterDriver.java uses the code in the other two files to run. Verify now that you have all of the class files in the package folder.
					</li>
					<li>
						Before you run the program, you will need to create a .txt file with strings in it. The StringSorter program requests that you 
						provide it with a filename. The file should contain a list of strings to sort, one string per line. Below in the data section
						is an example file named strings.txt with a list of movies. Create your file now. I placed my strings.txt file in the same directory as the 
						.java files.
					</li>
					<li>
						Next you will want to execute the StringSorterDriver.class file. To do this type the following from the original base of the repo directory:
						<code>
							java pja.assn1.StringSorterDriver
						</code>
						Notice how the name of the binary is prefixed with the two directories that represent the Java package structure. Also notice that I did not include the .class extension, which is implicit.
					</li>
					<li>
						When prompted, provide the name of the input file as well as the name of an output file. The program will then get to work algorithmically sorting the string in your input file and writing them to your output file, which it will create on the fly.
					</li>
					<li>
						After the program completes execution, check your output file and verify that the strings are in alphabetical order and that they are all there. If your strings are sorted, congratulations! You've just finished the lab!
					</li>
				</ol>
			</p>
		</section>
		<section>
			<h2> Data </h2>
			<p>
				<h3> strings.txt </h3>
				<code>
					<pre>
						BladeRunner
						American Beauty
						E.T.
						Jaws
						Magnolia
						Stand By Me
						Greenbook
						Ready Player One
						The Favorite
						Roma
						Coco
						Once Upon a Time in Hollywood
						Into the Spiderverse
						Dunkirk
						Whiplash
						Birdman
						A Star is Born						
						Downton Abbey
					</pre>
				</code>
			</p>
		</section>
		<section>
			<h2> Output </h2>
			<p>
				<code>
					<pre>
please enter the name of the input file
strings.txt
please enter the name of the output file
output.txt
					</pre>
				</code>
			</p>
		</section>
		<section>
			<h2> Data Output </h2>
			<code>
				<pre>
A Star is Born
American Beauty
Birdman
BladeRunner
Coco
Downton Abbey
Dunkirk
E.T.
Greenbook
Into the Spiderverse
Jaws
Magnolia
Once Upon a Time in Hollywood
Ready Player One
Roma
Stand By Me
The Favorite
Whiplash
				</pre>
			</code>
		</section>
		<section>
			<h2> Analysis </h2>
			<p>
				Packages are a way of grouping Java executable files together into groups to help organize your project. The StringSorter program relies on a packaging scheme to organize itself into a module.
			</p>
		</section>
		<section>
			<h2> Conclusion </h2>
			<p>
				Congratulations! You've successfully compiled someone else's code repository from source and run a useful computer program! You've also had your first acquaintance with packages!
			</p>
		</section>
		<section>
			<h2> References </h2>
			<p>
				This lab was made possible by the StringSorter code from Peter Adamson located at <a href="https://github.com/PeterAdamson/CS2043-StringSorter">https://github.com/PeterAdamson/CS2043-StringSorter </a>
			</p>
		</section>
	</main>
</body>
</html>
