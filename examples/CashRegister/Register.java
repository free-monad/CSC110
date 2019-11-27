public class Register{
  public Register(int registerId, ProductList products, double salesTax){
    this.registerId = registerId;
    this.products = products;
    this.salesTaxRate = salesTax;
    this.scannedProductIds = new int[MAX_PRODUCT_LIST_SIZE];
    this.indexOfNextProduct = 0;
    this.receipt = "\n\nReceipt\n\n";
    this.moneyInRegister = 0;
  }

  public Register(int registerId, ProductList products, double salesTax, double moneyInRegister){
    this(registerId, products, salesTax);
    this.moneyInRegister = moneyInRegister;
  }


  public double calculateTotal(){
    return salesTaxDue + subTotalDue;
  }

  public void scanProduct(int id){
    scannedProductIds[indexOfNextProduct] = id;
    indexOfNextProduct++; 

    double price = products.getPriceById(id);
    Product product = products.getProduct(id);

    subTotalDue += price;
    salesTaxDue += price * salesTaxRate;

    receipt += product;

  }

  public void acceptPayment(double amount){
    this.paymentAmount = amount;
  }

  public Transaction completeCheckout(){
    Transaction t = new Transaction(registerId, paymentAmount, subTotalDue, salesTaxDue, getChange());
    moneyInRegister += (paymentAmount - getChange());

    receipt += ("\nSubTotal: " + subTotalDue + "\n");
    receipt += ("Tax at " + salesTaxRate + "% :" + salesTaxDue + "\n");
    receipt += ("Total: " + calculateTotal() + "\n\n");
    receipt += "Thank You! Come again!\n\n";

    return t;
  }


  public void startNewCheckout(){
    clearCurrentCheckout();
  }


  private void clearCurrentCheckout(){
    scannedProductIds = new int[MAX_PRODUCT_LIST_SIZE];
    indexOfNextProduct = 0;
    salesTaxDue = 0;
    subTotalDue = 0;
    paymentAmount = 0;
    receipt = "\n\nReceipt\n\n";
  }

  public String getReceipt(){
    return receipt;
  }
  
  public double getChange(){
    return paymentAmount - calculateTotal();
  }

  public String toString(){
    return Util.CSV_START_LINE + registerId + Util.CSV_SEPARATOR + salesTaxRate + Util.CSV_SEPARATOR + moneyInRegister + Util.CSV_END_LINE;
  }

  public static final int MAX_PRODUCT_LIST_SIZE = 1000;

  private ProductList products;
  private int [] scannedProductIds;
  private int registerId;
  private double moneyInRegister;
  private double salesTaxRate;
  private int indexOfNextProduct;

  private double salesTaxDue;
  private double subTotalDue;
  private double paymentAmount;
  private String receipt;
}
