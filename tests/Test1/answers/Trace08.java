import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Trace08 {
	public static void main (String [] args) throws IOException {
		Scanner fileIn = new Scanner(new File("Trace08.java"));

		while(fileIn.hasNext()){
			System.out.println(fileIn.nextLine());
		}
	}
}
