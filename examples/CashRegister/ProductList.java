import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;

public class ProductList{
  public ProductList(String filename) throws IOException {
    Scanner scan = new Scanner(new File(filename));
    products = new Product[1000];
    this.length = 0;

    int i = 0;

    while(scan.hasNext()){
      String line = scan.nextLine();

      if(i != 0){
        String [] fields = line.split(",");
        
        String nameField = fields[0].replace("\"", "").trim();
        double priceField = Double.parseDouble(fields[1].replace("\"", "").trim());

        products[i - 1] = new Product(nameField, priceField);	
      }

      i++;
    }

    if(i > 0){
      this.length = i - 1;
    }

  }

  public ProductList(Product [] list){
    products = list;
  }

  public Product getProduct(int index){
    return products[index];
  }

  public double getPriceById(int id){
    return products[id].getPrice();
  }

  public String getNameById(int id){
    return products[id].getName();
  }

  public int length(){
    return length;
  }

  public void insertProduct(Product p){
    products[length] = p;
    length++;
  }

  public String toString(){
    String result = PRODUCTS_HEADER;
    
    for(int i = 0; i < length; i++){
      result += products[i];
    }

    return result;
  }

  public void saveProductList(String filename) throws IOException{
    File f = new File(filename);
    PrintWriter x = new PrintWriter(f);
    x.print(this);
    x.close();
  }

  public static final String CSV_START_LINE = "\"";
  public static final String CSV_SEPARATOR = "\", \"";
  public static final String CSV_END_LINE = "\"\n";
  public static final String PRODUCTS_HEADER = CSV_START_LINE +
	                                       "Name" + CSV_SEPARATOR +
					       "Price" + CSV_END_LINE;
  public static final int MAX_PRODUCTS = 1000;
  private Product [] products;
  private int length;
}
