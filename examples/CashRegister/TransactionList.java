import java.io.File;
import java.sql.Timestamp;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;

public class TransactionList{
  public TransactionList(String filename) throws IOException {
    Scanner scan = new Scanner(new File(filename));
    transactions = new Transaction[MAX_TRANSACTIONS];
    this.length = 0;

    int i = 0;

    while(scan.hasNext()){
      String line = scan.nextLine();

      if(i != 0){
        String [] fields = line.split(",");

	Timestamp  momentOfPurchase = Util.convertStringToTimestamp(fields[0].replace("\"", ""));
	int registerId = Util.cleanFieldToInt(fields[1]);
	double amountPaid = Util.cleanFieldToDouble(fields[2]);
	double changeGiven = Util.cleanFieldToDouble(fields[3]);
	double subTotal = Util.cleanFieldToDouble(fields[4]);
	double taxPaid = Util.cleanFieldToDouble(fields[5]);

	transactions[i - 1] = new Transaction(momentOfPurchase, registerId, amountPaid, changeGiven, subTotal, taxPaid);

      }

      i++;
    }

    if(i > 0){
      this.length = i - 1;
    }

  }

  public Transaction getTransaction(int index){
    return transactions[index];
  }

  public void insertTransaction(Transaction t){
    transactions[length] = t;
    length++;
  }

  public int length(){
    return length;
  }

  public String toString(){
    String result = Transaction.TRANSACTION_CSV_HEADING;

    for(int i = 0; i < length; i++){
      result += transactions[i];
    }
    return result;

  }

  public void saveTransactionList(String filename) throws IOException{
    File f = new File(filename);
    PrintWriter x = new PrintWriter(f);
    x.print(this);
    x.close();
  }

  public static final int MAX_TRANSACTIONS = 11600;
  private Transaction [] transactions;
  private int length;

}

