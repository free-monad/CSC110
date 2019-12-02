public class UseExisting01{
  public static void main(String [] args){
    ProductList pL = new ProductList();
    
    pL.insertProduct(new Product("apple", 2.90));
    pL.insertProduct(new Product("banana", 3.00));
    pL.insertProduct(new Product("carrot", 2.00));
    
    Register r = new Register(1, pL, 0.04);
  }
}
