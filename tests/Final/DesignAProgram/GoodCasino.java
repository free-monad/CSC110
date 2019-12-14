import java.util.Scanner;
import java.io.IOException;

public class GoodCasino{
  public static void main(String [] args) throws IOException{
    Customer c = new Customer("customer.txt");
    SlotMachine s = new SlotMachine("slot-machine.txt");
    
    Scanner scan = new Scanner(System.in);

    String input = "";

    System.out.println("Welcome to the Good Casino where we strive to make you a millionaire!");

    while(!input.trim().toLowerCase().equals("quit") && s.getMoneyPot() != 0 && c.checkWallet() != 0){
      System.out.println("You currently have $" + c.checkWallet() + ". Please place a bet! Or type quit if you would like to exit.");
      input = scan.nextLine();
     
      if(input.trim().toLowerCase().equals("quit")){
        break;
      }	

      double jackpot = play(c, s, Double.parseDouble(input));
      c.receive(jackpot);
      System.out.println("");
      System.out.println(s);
      System.out.println("");
      System.out.println("You won $" + jackpot);
    }

    c.save("customer.txt");
    s.save("slot-machine.txt");    
  }

  public static double play(Customer c, SlotMachine s, double bet){
    return s.pullLever(c.spend(bet));
  }
}
