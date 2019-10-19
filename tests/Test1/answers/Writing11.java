/*
*Challenge Bonus (20pts) Write a program that takes 3 numbers from a user and prints the
numbers out in order from greatest to least.
*/
import java.util.Scanner;

public class Writing11{
	public static void main(String [] args){

		int a, b, c;
		Scanner s = new Scanner(System.in);

		System.out.println("Please give me your first number");
		a = s.nextInt();
		s.nextLine();

		System.out.println("Please give me your second number");
		b = s.nextInt();
		s.nextLine();

		System.out.println("Please give me your third number");
		c = s.nextInt();
		s.nextLine();
		
		System.out.println("");
		System.out.println("");

		if(a > b){
      if(a > c){
        System.out.println(a);
        if(b > c) {
          System.out.println(b);
          System.out.println(c);
        } else{
          System.out.println(c);
          System.out.println(b);
        }
      }else{
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
      }
    }else{
      if(b > c){
        System.out.println(b);
        if(a > c){
          System.out.println(a);
          System.out.println(c);
        } else{
          System.out.println(c);
          System.out.println(a);
        }
      } else{
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
      }
    }

	}
}
