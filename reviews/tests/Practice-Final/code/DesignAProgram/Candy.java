public class Candy{

  public Candy(String name, double price, String row, String column){
    this.name = name;
    this.price = price;
    this.row = row;
    this.column = column;
    this.itemsRemaining = 3;
  }

  public void setItemsRemaining(int x){
    itemsRemaining = x;
  }

  public void reduceItemsRemaining(){
    itemsRemaining--;
  }

  public int itemCount(){
    return itemsRemaining;
  } 

  public String getRow(){
    return row;
  }

  public String getColumn(){
    return column;
  }

  public double getCost(){
    return price;
  }

  public boolean isMatch(String row, String column){
    return this.row.equals(row) && this.column.equals(column);
  }

  public boolean hasItemsRemaining(){
    return itemsRemaining > 0;
  }

  public void fill(){
    itemsRemaining = MAX;
  }

  public String toString(){
    return name + " " + price + " " + itemsRemaining + " remaining.";
  }

  public static final int MAX = 3;
  private String name;
  private double price;
  private String row;
  private String column;
  private int itemsRemaining;  
}
