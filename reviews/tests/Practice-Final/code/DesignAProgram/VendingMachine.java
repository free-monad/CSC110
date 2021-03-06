import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;


public class VendingMachine{
  public static void main(String[] args) throws IOException{
   VendingMachine v = new VendingMachine();
   
   v.getCandyInfo("A", "1");
   v.processPayment("B", "1", 10.00);

   v.saveVendingMachine();

  }

  public VendingMachine() throws IOException{
    File f = new File(FILENAME); 

    c1 = new Candy("snickers", 1.00, "A", "1");
    c2 = new Candy("skittles", 1.25, "A", "2");
    c3 = new Candy("twix", 0.75, "B", "1");
    c4 = new Candy("pretzels", 0.85, "B", "2");


    if (f.exists()){
      Scanner s = new Scanner(f);

      moneyMade = Double.parseDouble(s.nextLine());

      c1.setItemsRemaining(Integer.parseInt(s.nextLine()));
      c2.setItemsRemaining(Integer.parseInt(s.nextLine()));
      c3.setItemsRemaining(Integer.parseInt(s.nextLine()));
      c4.setItemsRemaining(Integer.parseInt(s.nextLine()));
    } 
    else{
      moneyMade = 0.00;
    }
  }

  public double processPayment(String row, String column, double amountPaid){
    Candy c = getCandy(row, column);
    double returnAmount = 0.00;

    if(acceptRequest(row, column)){
      if(amountPaid > c.getCost()){
        c.reduceItemsRemaining();
        moneyMade += c.getCost();
        returnAmount = amountPaid - c.getCost();
      } else{
        System.out.println("Insufficient Funds. Add more cash.");
	returnAmount = amountPaid;
      }
    } else{
      System.out.println("There is none of that candy left");
      returnAmount = amountPaid;
    }

    return returnAmount;
  }

  public String getCandyInfo(String row, String column){
    return getCandy(row, column).toString();
  }

  public void fill(){
    c1.fill();
    c2.fill();
    c3.fill();
    c4.fill();
  }

  public void saveVendingMachine() throws IOException{
    File f = new File(FILENAME);
    PrintWriter x = new PrintWriter(f);
    x.print(this.moneyMade + "\n");

    x.print(this.c1.itemCount() + "\n");
    x.print(this.c2.itemCount() + "\n");
    x.print(this.c3.itemCount() + "\n");
    x.print(this.c4.itemCount() + "\n");

    x.close();
  }

  private boolean acceptRequest(String row, String column){
    return getCandy(row, column).hasItemsRemaining(); 
  }

  private Candy getCandy(String row, String column){
    Candy c = null;

    if(c1.isMatch(row, column)){
      c = c1;  
    }else if(c2.isMatch(row, column)){
      c = c2;
    }else if(c3.isMatch(row, column)){
      c = c3;
    }else if(c4.isMatch(row, column)){
      c = c4;
    }

    return c;

  }

  public static final String FILENAME = "vending-machine.txt";
  private Candy c1;
  private Candy c2;
  private Candy c3;
  private Candy c4;
  
  private double moneyMade;
}
