import java.util.Scanner;

public class Writing7{
  public static void main(String [] args){
    Scanner s = new Scanner(System.in);

    double amount = 0;
    double total = amount;

    while(amount != 3.50){
      System.out.println("I'm a poor computer program, please give me some money!");
      amount = Double.parseDouble(s.nextLine());
      total += amount;
    }  

    System.out.println("Thank you so much for your generous contribution!");
		System.out.println("The total amount of money given was $" + total);
  }
}
