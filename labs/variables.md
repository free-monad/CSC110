<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<header>
		<h1> Variables, Literals, and Constants </h1>
		<table>
			<tr>
				<td><strong>Skill</strong></td>
				<td>Value</td>
			</tr>
			<tr>
				<td><strong>Reading User Input</strong></td>
				<td>+3 Levels</td>
			</tr>
			<tr>
				<td><strong>Using Operators</strong></td>
				<td>+1 Level </td>
			</tr>
			<tr>
				<td><strong>Using Primitive Variable Types</strong></td>
				<td>+3 Levels </td>
			</tr>
			<tr>
				<td><strong>Formatting Console Output</strong></td>
				<td>+3 Levels </td>
			</tr>
			<tr>
				<td> </td>
				<td> </td>
			</tr>
		</table>
	</header>
	<main>
		<section>
			<h2> Objective </h2>
			<p>
				To write a computer program that prints out the weight of a person on the Moon, Mars, and Jupiter
			</p>
		</section>
		<section>
			<h2> Materials </h2>
			<p>
				<ol>
					<li> A working Java environment </li>
					<li> printf</li>
					<li> The masses of Jupiter, Mars, the Moon, and the weight of few friends on Earth</li>
					<li> Knowledge of Java primitive data types </li>
					<li> Basic knowledge of using Java operators on primitive data types </li>
				</ol>
			</p>	
		</section>
		<section>
			<h2> Methods </h2>
			<p>
				Use your Java development environment to write a computer program that takes a person's name, age, and weight as input (using the Scanner class) and outputs the following pieces of information:
				<ul>
					<li> A greeting with their name inside it </li>
					<li> A comment about their age </li>
					<li> A formatted output showing their original weight on Earth along with their weight on the Moon, Mars, and Jupiter. Please label each weight with the planet it comes from and keep the layout and formatting nice using printf(). Make sure the names of the bodies are left-aligned and that the weights always have two decimaal places in their answer, event if the answer is a well-rounded integer. Make sure the numbers are right-aligned</li>
					<li> Please write helpful comments in your code as well</li>
					<li> Include a README.md file that uses markdown notation or standard html for pleasant formatting</li>
				</ul>
				To calculate the weight of a person on another body, all you have to do is take their original weight and multiply it by the Earth mass ratio of the other body. The answer will be that person's weight on the other planet.
			</p>
		</section>
		<section>
			<h2> Data </h2>
			<p>
				<table>
					<tr>
						<th> Body </th>
						<th> Earth Mass ratio </th>
					</tr>
					<tr>
						<td> Earth </td>
						<td> 1 </td>
					</tr>
					<tr>
						<td> the Moon </td>
						<td> 0.16 </td>
					</tr> 
					<tr>
						<td> Mars </td>
						<td> 0.37 </td>
					</tr>
					<tr>
						<td> Jupiter </td>
						<td> 2.364 </td>
					</tr>
				</table>
			</p>
		</section>
		<section>
			<h2> Results </h2>
			<p>
				<code>
					<pre>
//SAMPLE OUTPUT

Welcome to the mass calculator, what is your name?
Matt

Hi Matt! How old are you?
35

My, you're getting younger and younger! You sure are looking good for your age! Would you be so kind as to tell me your weight? (on Earth please!)
195

Let me do a bit of analysis...

All done! Here are the results:

Earth:        195.00
The Moon:      32.30
Mars:          73.50
Jupiter:      460.98

Phew! That was a work-out! Please come back again sometime!
					</pre>
				</code>
			</p>
		</section>
		<section>
			<h2> Analysis </h2>
			<p>
				Please write a README.md file describing what your program is and how to use it. Talk about any difficult decisions you made about the way the program works, what it can do, and what some of its limitations or desired improvements might be. Please format your document using markdown notation or standard html.
			</p>
		</section>
		<section>
			<h2> Conclusion </h2>
			<p>
				Congratulations! You just learned to take input from the user, store it in variables, and use this as an approach for generalizing computer programs! You also earned some experience formatting console output with printf, commenting your code to make it easier for other programmers to read, and generating a well-formatted readme file for end-users!
			</p>
		</section>
		<section>
			<h2> References </h2>
			<p>
				The following url was used to get the Earth mass ratios for various bodies: <a href="http://www.seasky.org/solar-system/planet-weight-calculator.html">http://www.seasky.org/solar-system/planet-weight-calculator.html</a>
			</p>
		</section>
	</main>
</body>
</html>
