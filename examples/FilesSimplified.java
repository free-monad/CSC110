import java.util.Scanner;

public class FilesSimplified{
  public static void main(String [] args){
    Scanner fileIn = new Scanner(new File("example.txt"));
    
    while(fileIn.hasNext()){
      System.out.println(fileIn.nextLine());
    }
  }
}
