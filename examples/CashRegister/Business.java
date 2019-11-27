import java.io.IOException;

public class Business{
  public static void main(String [] args) throws IOException{
      //generate registers, transactions, and product list from csvs 
      
      ProductList pList = new ProductList("products.csv");
      TransactionList tList = new TransactionList("transactions.csv");
      RegisterList rList = new RegisterList("registers.csv", pList);

      System.out.println(pList);
      System.out.println(tList);
      System.out.println(rList);

      rList.getRegister(0).scanProduct(0);
      rList.getRegister(0).scanProduct(1);
      rList.getRegister(0).scanProduct(0);

      rList.getRegister(1).scanProduct(2);
      rList.getRegister(1).scanProduct(2);

      rList.getRegister(2).scanProduct(2);
      rList.getRegister(2).scanProduct(0);

      rList.getRegister(0).acceptPayment(100);
      rList.getRegister(1).acceptPayment(20);
      rList.getRegister(2).acceptPayment(35.75);

      for(int i = 0; i < rList.length(); i++){
        tList.insertTransaction(rList.getRegister(i).completeCheckout());
	System.out.println("Your transaction at register " + i + " is complete!");
	System.out.println("Your change is: " + rList.getRegister(i).getChange());
	System.out.println(rList.getRegister(i).getReceipt());

	System.out.println("Starting new checkout session...");
	rList.getRegister(i).startNewCheckout();
      }

      tList.saveTransactionList("transaction.csv");
      rList.saveRegisterList("registers.csv");
  }
}
