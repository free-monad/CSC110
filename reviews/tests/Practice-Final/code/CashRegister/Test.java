import java.sql.Timestamp;
import java.time.Instant;
import java.io.IOException;

public class Test{
  public static void main(String[] args) throws IOException {
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    System.out.println(timestamp);

    ProductList p = new ProductList("products.csv");
    TransactionList t = new TransactionList("transactions.csv");

    System.out.println(p);
    System.out.println(t);

    Register r = new Register(333, p, 0.06);

    System.out.println("Scanning products...");
    r.scanProduct(1);
    r.scanProduct(2);
    r.scanProduct(1);
    r.scanProduct(1);
    
    r.acceptPayment(r.calculateTotal() + 10);
    t.insertTransaction(r.completeCheckout());

    System.out.println("Your change is: " + r.getChange());

    System.out.println(r.getReceipt());

    System.out.println("Starting new checkout session...");
    r.startNewCheckout();

    System.out.println(t);

    t.saveTransactionList("transactions.csv");
  }
}
