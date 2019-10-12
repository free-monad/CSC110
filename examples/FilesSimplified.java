import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class FilesSimplified throws IOException{
  public static void main(String [] args){
    Scanner fileIn = new Scanner(new File("example.txt"));
    
    while(fileIn.hasNext()){
      System.out.println(fileIn.nextLine());
    }
  }
}
