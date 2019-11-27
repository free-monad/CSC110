public class Product{
  public Product(String name, double price){
    this.name = name;
    this.price = price;  
  }

  public String getName(){
    return name;
  }

  public double getPrice(){
    return price;
  }

  public String toString(){
    return "\"" + name + "\", '\"" + price + "\"\n";
  }

  private String name;
  private double price;
  private int productId;
}
