import java.io.IOException;

public class UseExisting05{
  public static void main(String [] args) throws IOException{
    Register [] registers = new Register[100];
    ProductList ps = new ProductList("key-foods-products.csv");
    
    for(int i=0; i < 100; i++){
      registers[i] = new Register(i, ps, 0.04); 
    }
    
    for(int i=0; i < ps.length(); i++){
      for(int j=0; j < registers.length; j++){
         registers[j].scanProduct(i); 
      }
    }
    
    for(int j=0; j < registers.length; j++){
       registers[j].acceptPayment(1000);
       registers[j].completeCheckout();
       registers[j].getChange();
       System.out.println(registers[j].getReceipt());
       registers[j].startNewCheckout();
    }
  }
}
