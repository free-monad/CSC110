<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h1> Lecture 3 </h1>
<h2> Meeting Notes: </h2>
<ul>
	<li> We took roll call.</li> 
	<li> We went back over grading based on <a href="https://github.com/free-monad/CSC110/blob/master/course-documents/skills.md">skill levels</a> that are earned by completing <a href="https://github.com/free-monad/CSC110/tree/master/labs">labs</a> </li>
  	<li> We checked out the <a href="https://bbhosted.cuny.edu/webapps/gradebook/do/instructor/enterGradeCenter?course_id=_1757397_1&cvid=fullGC"> grading hub on Blackboard </a> which shows your skill level progress </li>
  	<li> We reviewed print/println, Scanner, console output with escape characters, int variables, and the multiplication and addition operators </p>
	<li> Next we began our units on variable types and operators </li>
	<li> Once finished we began work on the <a href="https://github.com/free-monad/CSC110/blob/master/labs/operators.md">lab</a></li>
	<li> After lab we took an optional 30 minute break. We returned for the next lecture sequence on if-else and switch statements used in tandem with booleans and logical operators</li>
	<li> We next looked at a few additional operators ++, --, -, +=, -=, *=, /=</li>
	<li> We then went over how to generate javadocs and looked at the JDK Documentation</li>
	<li> Next we delved into the <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/String.html">String class API</a> and the <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html">Math class API </a> </li>
	<li> There was no extra required lab for the second lab. We used the second lab as time to catch up on any incomplete labs or an opportunity to approach any of the extra credit labs </li>
</ul>
<h2> Important Concepts </h2>
<dl>
	<dt><h3>Variable Types</h3></dt>
	<dd>
		<h4> Two Kinds of Variable Types </h4>
		<dl>
			<dt> primitive types </dt>
			<dd> 
				Types that are not objects. Baked into the system. All other variable types reduce to sets of these
			</dd>
			<dt> Object types </dt>
			<dd> Instantiated from classes, these variables contain objects such as String or Scanner. They are composed of other variables and functions</dd>
		</dl>
		<h4> The Primitive Types </h4>
		<dl>
			<dt>number types</dt>
			<dd>
				<dl>
					<dt> integer types </dt>
					<dd>
						<p> *listed from smallest to largest </p>
						<ul>
							<li> byte </li>
							<li> short </li>
							<li> int </li>
							<li> long </li>
						</ul>
					</dd>
					<dt> floating point types </dt>
					<dd>
						<p> *listed from smallest to largest </p>
						<ul>
							<li>float</li>
							<li>double</li>
						</ul>
					</dd>
				</dl>
			</dd>
			<dt> letter types </dt>
			<dd>
				<ul>
					<li> ASCII and Unicode Mappings </li>
					<li> char </li>
					<li> String (String is not primitive)</li>
				</ul>
			</dd>
			<dt> boolean</dt>
			<dd>variables can take on the values true or false</dd>
		</dl>
		<h3> Some Object Types</h3>
		<ul>
			<li> <a href="https://docs.oracle.com/javase/9/docs/api/java/lang/String.html">String </a> </li>
			<li> <a href="https://docs.oracle.com/javase/9/docs/api/java/util/Scanner.html">Scanner</a> </li>
			<li> <a href="https://docs.oracle.com/javase/9/docs/api/java/util/ArrayList.html">ArrayList </a></li>
			<li> <a href="https://docs.oracle.com/javase/9/docs/api/java/util/HashSet.html">HashSet </a></li>
			<li> <a href="https://docs.oracle.com/javase/9/docs/api/java/util/TreeSet.html">TreeSet </a></li>
		</ul>
	</dd>
	<dt><h3>Operators</h3></dt>
	<dd>
		<p> They are just special functions that have the privilege of special infix notation </p>
		<dl>
			<dt>Arithmetic Operators </dt>
			<dd>
				<dl>
					<dt>+</dt>
					<dd>Addition</dd>
					<dt>-</dt>
					<dd>Subtraction</dd>
					<dt> - </dt>
					<dd> Unary Minus (negation, -a) </dd>
					<dt> * </dt>
					<dd> Multiplication</dd>
					<dt> / </dt>
					<dd> Division </dd>
					<dt> ++ </dt>
					<dd> Increment (same as x = x + 1)</dd>
					<dt> -- </dt>
					<dd> Decrement (same as x = x -1)</dd>
					<dt> () </dt>
					<dd>Parentheses</dd>
					<dt> % <dt>
					<dd> Modulus (returns the remainder in an integer division) </dd>
				</dl>
				<dl>
					<dt> += </dt>
					<dd> a += 5 //same as a = a + 5</dd>
					<dt> -= </dt>
					<dd> a -= 6 //same as a = a - 6</dd>
					<dt> *= </dt>
					<dd> a *= 7 //same as a = a * 7</dd>
					<dt> /= </dt>
					<dd> a /= 8 // same as a = a / 8</dd>
				</dl>	
			</dd>
			<dt>Logical Operators</dt>
			<dd>
				<dl>
					<dt> &lt </dt>
					<dd> Less Than</dd>
					<dt> &gt </dt>
					<dd> Greater Than </dd>
					<dt> &lt= </dt>
					<dd> Less Than or Equal To </dd>
					<dt> &gt= </dt>
					<dd> Greater Than or Equal To </dd>
					<dt> == </dt>
					<dd> Equality </dd>
					<dt> != </dt>
					<dd> Not Equal </dd>
					<dt> ! </dt>
					<dd> Not </dd>
					<dt> || </dt>
					<dd> Logical OR </dd>
					<dt> &amp&amp </dt>
					<dd> Logical AND </dd>
					<dt> &amp </dt>
					<dd> Bitwise AND </dd>
					<dt> | </dt>
					<dd> Bitwise OR </dt>
				</dl>
			</dd>
			<dt>Using Logical Operators with Boolean Variables</dt>
			<dd>Boolean variables and numbers are a natural fit for logical operators</dd>
		</dl>
	</dd>
	<dt><h3><a href="https://docs.oracle.com/javase/9/docs/api/java/lang/String.html">String Class</a></h3></dt>
	<dd>
		<ul>
			<li>toUpperCase()</li>
			<li>toLowerCase()</li>
			<li>trim()</li>
			<li>substring(start,end)</li>
			<li>length()</li>
			<li>valueOf(var)</li>
			<li>hashCode()</li>
		</ul>
	</dd>
	<dt<h3><a href="https://docs.oracle.com/javase/9/docs/api/java/lang/Math.html">Math Class</a></h3></dt>
	<dd>
		<ul>
			<li>Math.PI</li>
			<li>Math.E</li>
			<li>Math.pow(b,x)</li>
			<li>Math.ceil(n)</li>
			<li>Math.floor(n)</li>
			<li>Math.abs(n)</li>
			<li>Math.random()</li>
			<li>Math.sqrt(n)</li>
			<li>Math.sin(n)</li>
			<li>Math.cos(n)</li>
			<li>Math.tan(n)</li>
		</ul>
	</dd>
</dl>
</body>
</html>
