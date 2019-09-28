<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<header>
		<h1> LifeSimulator</h1>
		<table>
			<tr>
				<td><strong>Skill</strong></td>
				<td><strong>Value</strong></td>
			</tr>
			<tr>
				<td>Logical Control Structures</td>
				<td>+10 Levels</td>
			</tr>
			<tr>
				<td>Using Primitive Variable Types</td>
				<td>+2 Levels </td>
			</tr>
		</table>
	</header>
	<main>
		<section>
			<h2> Objective </h2>
			<p>
				To write a computer program that accurately simulates all of your major life decisions.
			</p>
		</section>
		<section>
			<h2> Materials </h2>
			<p>
				String, Math.random(), if-else,, switch
			</p>	
		</section>
		<section>
			<h2> Methods </h2>
			<p>
				Write a computer program that steps a person through major life events. The major choices in life (inside the simulation) are as follows:
				<ul>
					<li> What job do you wish to have?
						<ul>
							<li>Business Man</li>
							<li>Artist </li>
							<li>Engineer</li>
							<li>Helping Profession</li>
						</ul>
					</li>
					<li> Do you wish to marry?</li>
					<li> Do you wish to have children? </li>
					<li> Do you wish to follow rules or do you wish to break them?</li>
					<li> Do you wish to keep in touch with your friends?</li>
					<li> Do you wish to meaningfully contribute to society?</li>
					<li> Do you wish to save money or spend lavishly?</li>
				</ul>
			</p>
			<p>
				Of course, we don't always get what we hope or plan for in life; in fact, more often than not we are treated to the unexpected. Your program will account for this using Math.random(). First your program will ask the person about their aspirations. You will want to start by asking the name of the person. Next you will ask each question above and catalog the answers. Note that there are only four choices for career. Based on their answers you will produce a life story for that person. The life story will be told in a paragraph that describes what happened in their life. The content of the text will be colored by how what they desired for their life contrasted with what eneded up actually happening. Developing this paragraph to be output to the screen will help you hone your logical operator and conditional statement skills. It will actually force you to master them.	
			</p>
			<p>
				Catalogued next are the probabilities:
			</p>
			<p>
				For each question you will invoke Math.random() to see if they get their chosen answer. Each outcome has a particular weight or chance of coming true. For the job, there is a 30% chance they will become a business man, a 30% chance they will be in the helping professions, a 10% chance they will become an artist, and a 5% chance they will become an engineer. There is also a 5% chance they will become chronically unemployed. If the person becomes a business man, there is an 70% chance they will become rich and a 30% chance they will become middle class. If they become an Artist there is a 90% chance they will be poor and a 10% chance they will become rich. If they become an engineer, there is a 100% chance they will become rich. If they join the helping professions, there is a 100% chance they will be middle class. The business man and the engineer have a 30% chance of having an existential crisis and living a meaningless life. The artist and the helping professionals have a 100% chance of living a meaningful life.
			</p>
			<p> There is a 50% chance the person will marry or not marry </p>
			<p> There is a 25% chance the person will get divorced </p>
			<p> There is a 30% chance they will have no children and a 10% chance of having 1 child, 10% of having 2 children, 10% chance of having 3 children, 10% chance of having 4 children, 10% chance of having 5 children, a 10% chance of having 6 children, and a 10% chance of having 7 children. Each child gets a gender and a name that must be described in the output. The gender and name is not chosen by the user but by the life simulator</p>
			<p> Whether or not they follow the rules always ends up happening as they choose 100% of the time.</p>
			<p> If the user chooses not to follow the rules, there is a 30% chance they will end up in jail but a 100% chance they will become rich. If they do follow the rules, there is a 1% chance they will end up in jail but there chances of becoming rich follow the same chances as their originally chosen profession.</p>
			<p>
				There is an 70% chance they will stay in touch with their friends.
			</p>
			<p>
				There is a 100% chance they will contribute or not contribute to society based on their choice. If they do not contribute to society there is a 20% increased risk of having an existential crisis and living a meaningless life. If they do contribute to society, there is a 20% reduced chance that they will be able to retire. If they become rich and they did not contribute to society, there is an 80% chance that they will be hated by everyone and go down poorly in history.
			</p>
			<p>
				There is a 100% chance they will save money or spend lavishly based on their choice. If they save money, there is a 100% chance they will have a home and have a nice retirement. If they spend lavishly, they will accumulate lots of nice things but there is a 10% chance they will become homeless and a 20% chance they will have nothing left for retirement and need to work to the end of their life.
			</p>
		</section>
		<section>
			<h2> Data </h2>
			<p>
				The choices and preferences of the user.
			</p>
		</section>
		<section>
			<h2> Results </h2>
			<p>
				A life well-lived. After asking all of the questions to the user. The program should calculate the life of the user based on the probabilities above. A paragraph should be produced describing the life the person lived. Anytime their life does not go the way they desired, you need to color the paragraph with happiness, disappointment, or compromising and rationalization to account for the success or failure of their dreams. Make sure the final paragraph contains the following:
				<ul>
					<li> The name of the person </li>
					<li> Whether or not they married and the name of their significant other </li>
					<li> The profession the person landed in </li>
					<li> Whether or not they became rich </li>
					<li> Whether or not they went to jail </li>
					<li> Whether or not they became homeless </li>
					<li> Whether or not they were able to retire </li>
					<li> Whether or not they had children, if so, how many, their genders and names </li>
					<li> Whether or not they stayed in touch with their friends</li>
					<li> Whether or not they contributed to society </li>
					<li> Whether or not society hates or loves them at the end of their life</li>
					<li> Whether they had lots of nice material posessions </li>
				</ul>
			</p>
		</section>
		<section>
			<h2> Analysis </h2>
			<p>
				There are a lot of ways to go about writing the logic for this program. The design is very much up to the individual programmer. That being said, there are easy ways to write the logic and there are hard ways, choose wisely!
			</p>
		</section>
		<section>
			<h2> Conclusion </h2>
			<p>
				 Congratulations you just wrote an interactive life simulator! In the process, you have mastered logical operators and conditionals!
			</p>
		</section>
	</main>
</body>
</html>
