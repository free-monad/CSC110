import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class Trace35{
  public static void main(String [] args) throws IOException{
    PrintWriter x = new PrintWriter(new File("output.txt"));
    x.print("Remember when you were young, \nyou shone like the sun \n");
    x.print("Shine! On! You crazy diamond!");
    x.close();   
  }
}
