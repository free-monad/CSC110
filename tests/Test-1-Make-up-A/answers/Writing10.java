
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Writing10 {
   public static void main(String [] args) throws IOException{
 	Scanner fileIn = new Scanner(new File("elon-musk.csv"));

	while(fileIn.hasNext()){
 		System.out.println(fileIn.nextLine());
 	}
   }
}
