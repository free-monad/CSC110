<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h1> Lecture 2 </h1>
<h2> Meeting Notes: </h2>
<ul>
	<li> We went over the location of important documents on www.github.com/free-monad/CSC110 including where the <a href="https://github.com/free-monad/CSC110/blob/master/course-documents/syllabus-CSC110-Fall-2019.pdf">syllabus</a>, <a href="https://github.com/free-monad/CSC110/blob/master/course-documents/syllabus.md">second syllabus</a>, <a href="https://github.com/free-monad/CSC110/blob/master/course-documents/semester-schedule.md">semester course schedule</a>, and <a href="https://github.com/free-monad/CSC110/blob/master/course-documents/Fall-2019-Tutoring-Schedule.pdf">tutoring schedule</a> is as well as essential class reviews </li>
	<li> We reviewed computation, <a href="https://github.com/free-monad/CSC110/blob/master/reviews/algorithms.md">algorithms</a>, Java, and <a href="https://github.com/free-monad/CSC110/blob/master/labs/hello-world.md">HelloWorld</a> from the last class. </li>
	<li> We reviewed formatting screen output in preparation for the day's lab</li>
	<li> We did a run through of <a href="https://github.com/PeterAdamson/CS2043-StringSorter">StringSorter</a> that still didn't work in NetBeans </li>
	<li> We went to lab. We did the lab, <a href="https://github.com/free-monad/CSC110/blob/master/labs/formatting-console-output.md">formatting-console-output</a> </li>
	<li> In class two we went over variables and excepting input from the user </li>
	<li> We engaged in a tentative preliminary discussion about classes and object variables </li>
	<li> We went over a program that would accept input from the user and print the sum of the input to the screen </li>
	<li> We took time for the next lab about variables and accepting user input. It is about calculating your weight on other planets. It was called <a href="https://github.com/free-monad/CSC110/blob/master/labs/variables.md">variables</a> </li>
</ul>
<h2> Important Concepts </h2>
<ul>
	<li> You can print output to the screen using <code>print</code>, <code>println</code>, and <code>printf</code> </li>
	<li> <code>print</code> prints text to the screen, <code>println</code> prints text to the screen and then moves to a new line, <code>printf</code> prints to the screen with special formatting considerations</li>
	<li> 
			<p>There are some important escape characters that can only be printed when using a special combination of letters. These are:</p>
			<dl>
				<dt><code>\n</code></dt>
				<dd>Moves the cursor to a new line</dd>
				<dt><code>\t</code></dt>
				<dd>Inserts a TAB</dd>
				<dt><code>\"</code></dt>
				<dd>Inserts a double quote</dd>
				<dt><code>\'</code></dt>
				<dd>Inserts a single quote</dd>
				<dt><code>\\</code></dt>
				<dd>Inserts a backslash</dd>
				<dt>\r</dt>
				<dd>Carriage return</dd>
				<dt>\f</dt>
				<dd>Form feed</dd>
				<dt>\b</dt>
				<dd>Inserts a backspace</dd>
			</dl>
	</li>
	<li> We can use the + operator to concatenate <code>Strings</code> together</li>
	<li> We can also use the <code>+</code> operator to add two numbers together or to concatenate a number onto a String </li>
	<li>
		<p> Before Java programs are compiled to bytecode, they are broken into tokens when they are parsed. Here are the kinds of tokens in a program </p>
		<dl>
			<dt> keywords </dt>
			<dd> These are <a href="https://github.com/free-monad/CSC110/blob/master/reviews/cheatsheets/java-keywords.md">reserved words</a> that the compiler considers special for all Java programs. They indicate certain commands to be issued (<code> class, public, static, int, double, if, for</code></dd>
			<dt> identifiers </dt>
			<dd> Identifiers are user defined words that are special to a particular program. They can indicate variables, class names, and function/method names. For instance, <code>HelloWorld</code>, <code>main</code>, <code>String</code>, and <code>args</code> are identifiers
 </dd>
			<dt> separators </dt>
			<dd> These are various forms of punctuation that mark the beginning and end of a segment of code. Some of these include:
				<dl>
					<dt><code> ()</code> </dt>
					<dd> marks the beginning and end of a list of parameters passed into a function </dd>
					<dt><code> {} </code> </dt>
					<dd> marks the beginning and end of a block of code grouped by class, function, or control structure</dd>
					<dt><code> ;</code> </dt>
					<dd> marks the end of a statement (a sentence or unit of code) </dd>
					<dt> <code> /*     */    // </code> </dt>
					<dd> marks a block of code that is a comment for human readers</dd>
					<dt> <code> []</code></dt>
					<dd> Indicates a series of values inside an array (something we won't be discussing until way later)</dd>
				</dl>
			</dd>
			<dt> <a href="https://github.com/free-monad/CSC110/blob/master/reviews/operators.md">operators</a> </dt>
			<dd>These are special symbols that invoke function calls to return a value. Here is a <a href="https://github.com/free-monad/CSC110/blob/master/reviews/cheatsheets/operator-precedence.md">list of operators</a> with their precedence</dd>. Some common operators are . + - ! || && == != / % and ()</dd>
		</dl>
	<li> You can download, compile and run Java source programs from GitHub or any other source code repository online </li>
	<li> You can download extra source code libraries to use as extra tools in your code (without compiling)</li>
	<li> When we write programs, we often start out solving a specific problem and then generalize it into something that solves a larger set of problems </li>
	<li> One way to make your computer programs solve more general problems is to take input from the user. Typically you 	
</ul>
</body>
</html>
