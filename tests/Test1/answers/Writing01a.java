/*
Write a program that stores two numbers each in their own variable. Print each number to the
screen. Next swap the numbers so that the first variable has the number from the second variable and
the second variable has the number from the first variable. Print them to the screen again after the
swap.
*/
public class Writing01a{
	public static void main(String [] args){
		int x = 30;
		int y = 40;
		int temp;

		System.out.println("x: " + x);
		System.out.println("y: " + y);		

		temp = x;
		x = y;
		y = temp;

		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}
}
