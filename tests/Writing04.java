import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Writing04{
	public static void main(String [] args) throws IOException{
		Scanner fileIn = new Scanner(new File("jokes.json"));

		while(fileIn.hasNext()){
			System.out.println(fileIn.nextLine());
		}				
	}
}
