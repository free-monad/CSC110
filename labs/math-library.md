<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<header>
		<h1> MathLibrary </h1>
		<table>
			<tr>
				<td><strong>Skill</strong></td>
				<td><strong>Value</strong></td>
			</tr>
			<tr>
				<td>Using Operators</td>
				<td>+6 Levels</td>
			</tr>
			<tr>
				<td>Reading User Input</td>
				<td>+2 Levels</td>
			</tr>
			<tr>
				<td>Making Code Documentation with Markdown and Javadocs</td>
				<td>+2 Levels</td>
			</tr>
			<tr> 
				<td> Using Primitive Variable Types</td>
				<td>+4 Levels</td>
			</tr>
		</table>
	</header>
	<main>
		<section>
			<h2> Objective </h2>
			<p>
				<ul>
					<li>To calculate what day of the week it is after so many days have passed.</li>
					<li>To calculate the circumference of a circle</li>
					<li>To calculate how much money in interest you earn based on a given investment after a certain period of time</li>
				</ul>
			</p>
		</section>
		<section>
			<h2> Materials </h2>
			<p>
				You will need the modulus operator (%), Math.PI, Math.E, the formula for the circumference of a circle (C = PI * d), the formula for continuously compounding interest A = Pe^(rt)
			</p>	
		</section>
		<section>
			<h2> Methods </h2>
			<p>
				Write a computer program that calculates what days of the week it is x days into the future. Let the user of the program decide how many days into the future will be calculated for. For this problem, you will want to use integers and the modulus operator. Recall that modulus returns an integer remainder from a division problem. To know what day of the week it is, you simply need to know the remainder of days into the future % 7. You can use this remainder along with what day of the week it is currently to figure out what day of the week it will be.
			</p>
			<p> In the same, or a separate program, write code that takes the diameter of a circle from a user and then calculates the circumference of the circle. </p>
			<p> In the same, or a separate program, write code that takes as input an amount of money,an interest rate, and an amount of time the user would like to invest that money. Use this input along with the formula for continuous interest to calculate how much money they will earn on their investment. Remember that the formula for continuous interest is Amount = Principle * e^(rate * time). The principle, time, and rate will be provided by the user, the principle being the amount of money they put down, the rate being the interest rate (as either a percent or a decimal value less than 1), and the time being how long the user keeps the money invested. A of course, is the answer, the amount of money the user will make on their investment. You can find Euler's number, the constant e, in the Java Math library.</p>
			<p> Since this program is larger and more complex than those we've done previously, please comment your code (using // and /* */) with helpful details to make sure other people reading your program understand what your intentions are </p>
		</section>
		<section>
			<h2> Data </h2>
			<p>
				You will need the constant values of pi and e.
			</p>
		</section>
		<section>
			<h2> Results </h2>
			<p>
				You will be entrusted with designing a user-friendly interface for the user to interact with.
			</p>
		</section>
		<section>
			<h2> Analysis </h2>
			<p>
				Because there are 3 calculations in a single program, you may want to break your program up into several pieces. In the coming chapters we will talk about ways of doing this and probably have a lab breaking this program up into pieces.
			</p>
		</section>
		<section>
			<h2> Conclusion </h2>
			<p>
				Congratulations! You just did some really Math-heavy programming. Pat yourself on the back! Next time will get into some more linguistic territory!
			</p>
		</section>
	</main>
</body>
</html>
