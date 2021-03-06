<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<header>
		<h1> Evil Casino</h1>
		<table>
			<tr>
				<td><strong>Skill</strong></td>
				<td><strong>Value</strong></td>
			</tr>
			<tr>
				<td>Loops</td>
				<td>+10 Levels</td>
			</tr>
			<tr>
				<td>Using Primitive Variable Types</td>
				<td>+4 Levels</td>
			</tr>
			<tr>
				<td>Working with Files</td>
				<td>+6 Levels</td>
			</tr>
		</table>
	</header>
	<main>
		<section>
			<h2> Objective </h2>
			<p>
				To design a slot machine program that takes away all of the user's money!
			</p>
		</section>
		<section>
			<h2> Materials </h2>
			<p>
				Math.random(), for loops, while loops, if-else
			</p>	
		</section>
		<section>
			<h2> Methods </h2>
			<p>
				Your first order of business will be to greet the customer in a friendly manner to earn their trust and put them in a relaxed and happy state. You can then ask for there name and ask them how much money they will be putting into the machine. From here, they are your victim and you can have your way with them.
			</p>
			<p> The slot machine works this way. There are 3 boxes on the face of the machine that can land on any of 10 symbols. If the person gets 3 identical symbols they win a jackpot, otherwise, they lose the money they bet for that round. Three 3's are worth triple the amount of money they put down. Any other 3 of a kind (&#x2764,&#x2764,&#x2764) or (&#x263a;,&#x263a;,&#x263a;) for instance is worth double of the amount of money they put down for that round. </p> 
			<p>The table of symbols in the slot machine are as follows:</p>
			<table>
				<tr>
					<th>Name</th>
					<th>Symbol</th>
					<th>Unicode</th>
				</tr>
				<tr>
					<td>smiley face</td>
					<td>&#x263a</td>
					<td>\u263A</td>
				</tr>
				<tr>
					<td>heart</td>
					<td>&#x2764</td>
					<td>\u2764</td>
				</tr>
				<tr>
					<td>seven</td>
					<td>&#x0037</td>
					<td>\u0037</td>
				</tr>
				<tr>
					<td>three</td>
					<td>&#x0033</td>
					<td>\u0033</td>
				</tr>
				<tr>
					<td>frown face</td>
					<td>&#x2639</td>
					<td>\u2639</td>
				</tr>
				<tr>
					<td>diamond</td>
					<td>&#x2666</td>
					<td>\u2666</td>
				</tr>
				<tr>
					<td>ex</td>
					<td>&#x2743</td>
					<td>\u2743</td>
				</tr>
				<tr>
					<td>copyright</td>
					<td>&#x00a9</td>
					<td>\u00A9</td>
				</tr>
				<tr>
					<td>check</td>
					<td>&#x2713</td>
					<td>\u2713</td>
				</tr>
				<tr>
					<td>dollar</td>
					<td>&#x0024</td>
					<td>\u0024</td>
				</tr>
			</table>
			<p>
				Each time before they play, the slot machine prompts them to place a bet. They can put up any amount of money they like but not more money than they have in the machine. After they place their bet. Two out of the three digits show up on the machine. At this point, the player has the opportunity to double or triple their bet. If they choose to double their bet, they can win twice as much money as they would have with their original bet if a jackpot comes up, if they triple their bet, they can win three times as much money as they would have with their original bet. Unfortunately for the player, if the jackpot does not come up, they will lose twice or three times as much money as they otherwise would have :(
			</p>
			<p>
				When the betting is over and all three slot machine digits have been drawn, the reward or punishment is used to adjust how much money they have remaining. The casino itself will have a bank book that stores how much money they have taken from the user in a file named bank-book.csv. The bank-book.csv file will start with $100,000. Anytime the user earns money, the casino removes money from its own bank account. Anytime the user loses money, the casino adds money to its own bank account. The user's own balance is of course updated accordingly as well. The amount of money the casino has persists long after the program ceases to execute because the amount of money the casino has is stored in this file. The player is not allowed to insert more the 1/3 of the amount of money in the casino bank account at the start of the game. If the player takes all of the casino's money, the program ends and the casino closes forever. If the player runs out of money, the casino asks the player to put more money in and asks them how much and then play continues.</p>
			<p> Once all accounts are settled, the slot machine asks the player if they would like to go again. If the player says yes, the play sequence starts over. If the player says no, the casino cashes out the user's money as a certificate, thanks them for playing, says good bye and good luck, and closes.</p>
		</section>
		<section>
			<h2> Data </h2>
			<p>
				The user will input how much money they would like to play with. The amount of money the casino has will be drawn from a file named bank-book.csv. Store the slot machine digits as type char encoding the symbols with the unicode format \u0000, where the 0's can be any hexadecimal digit.
			</p>
		</section>
		<section>
			<h2> Results </h2>
			<p>
				The program continues indefinitely until the player decides to leave, the casino goes bankrupt or the player runs out of money.
			</p>
		</section>
		<section>
			<h2> Analysis </h2>
			<p>
				Calculuate the odds of the game. Who is going to win most of the time and how much more frequently will they win?
			</p>
		</section>
		<section>
			<h2> Conclusion </h2>
			<p>
				Congratulations! You just built a pretty comprehensive app with lots of looping and file manipulation! You should be very proud of yourself, this is a fully competent game you've built here. All it needs now is a shiny graphical interface!
			</p>
		</section>
	</main>
</body>
</html>

