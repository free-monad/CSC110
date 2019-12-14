import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class Customer{

  public Customer(){
    wallet = 500.00;
  }

  public Customer(String filename) throws IOException{
    Scanner s = new Scanner(new File(filename));
    wallet = s.nextDouble();
  }

  public double spend(double amount){
    boolean isGoodForIt = wallet > amount;
    double amountSpent = isGoodForIt ? amount : wallet;

    wallet = isGoodForIt ? wallet - amount : 0;
    
    return amountSpent;
  }

  public void receive(double amount){
    wallet += amount;
  }

  public double checkWallet(){
    return wallet;
  }

  public void save(String filename) throws IOException{
    PrintWriter w = new PrintWriter(new File(filename));
    w.print(wallet);
    w.close();
  }

  private double wallet;
}
