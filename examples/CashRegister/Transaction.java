import java.sql.Timestamp;
import java.time.Instant;

public class Transaction{

  public Transaction(int registerId, double amountPaid, double subTotal, double taxPaid, double changeGiven){
    this.registerId = registerId;
    this.momentOfPurchase = new Timestamp(System.currentTimeMillis());
    this.amountPaid = amountPaid;
    this.subTotal = subTotal;
    this.taxPaid = taxPaid;
    this.changeGiven = changeGiven;
  }

  public Transaction(Timestamp t, int registerId, double amountPaid, double subTotal, double taxPaid, double changeGiven){
    this(registerId, amountPaid, subTotal, taxPaid, changeGiven);
    momentOfPurchase = t;
  }

  public Transaction(String transactionStr){
    //break apart the string and construct the object
  }

  public int getRegisterId(){
    return registerId;
  }

  public String getTimestamp(){
    return momentOfPurchase.toString();
  }

  public double getAmountPaid(){
    return amountPaid;
  }

  public double getSubTotal(){
    return subTotal;
  }

  public double getTaxPaid(){
    return taxPaid;
  }


  public String toString(){
    return CSV_START_LINE + getTimestamp() + CSV_SEPARATOR + 
	                    registerId + CSV_SEPARATOR +
			    subTotal + CSV_SEPARATOR +
			    taxPaid + CSV_SEPARATOR + 
			    amountPaid + CSV_SEPARATOR + 
			    changeGiven + CSV_END_LINE;
  }

  public static final String CSV_START_LINE = "\"";
  public static final String CSV_SEPARATOR = "\", \"";
  public static final String CSV_END_LINE = "\"\n";
  public static final String TRANSACTION_CSV_HEADING = CSV_START_LINE +
	                                           "Moment of Purchase" + CSV_SEPARATOR +
						   "Register ID" + CSV_SEPARATOR +
						   "SubTotal" + CSV_SEPARATOR + 
						   "Tax Paid" + CSV_SEPARATOR +
						   "Amount Paid" + CSV_SEPARATOR + 
						   "Change Given" + CSV_END_LINE;


  private Timestamp momentOfPurchase;
  private int registerId;
  private double amountPaid;
  private double changeGiven;
  private double subTotal;
  private double taxPaid;
}

