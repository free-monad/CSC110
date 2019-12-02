import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterList{

  public RegisterList(String filename, ProductList pList) throws IOException{
    Scanner scan = new Scanner(new File(filename));
    registers = new Register[MAX_REGISTERS];
    this.length = 0;

    int i = 0;

    while(scan.hasNext()){
      String line = scan.nextLine();

      if(i !=0){
        String [] fields  = line.split(",");
        
	int registerId = Util.cleanFieldToInt(fields[0]);
        double salesTaxRate = Util.cleanFieldToDouble(fields[1]);
	double moneyInRegister = Util.cleanFieldToDouble(fields[2]);

	registers[i - 1] = new Register(registerId, pList, salesTaxRate, moneyInRegister);
      }

      i++;
    }

    if(i > 0){
     this.length = i - 1;
    }
  }

  public void insertRegister(Register r){
    registers[length] = r;
    length++;
  }

  public Register getRegister(int index){
    return registers[index];
  }


  public String toString(){
    String result = REGISTERS_HEADER;

    for(int i = 0; i < length; i++){
      result += registers[i];
    }

    return result;
  }
 
  public int length(){
    return length;
  }

  public void saveRegisterList(String filename) throws IOException{
    File f = new File(filename);
    PrintWriter x = new PrintWriter(f);
    x.print(this);
    x.close();
  }

  private Register [] registers;
  private int length;

  public static final int MAX_REGISTERS = 100;
  public static final String REGISTERS_HEADER = Util.CSV_START_LINE + "Register Id" + Util.CSV_SEPARATOR + "Sales Tax Rate" + Util.CSV_SEPARATOR + "Money in Register" + Util.CSV_END_LINE;
}
