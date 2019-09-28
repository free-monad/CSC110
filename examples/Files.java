import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Files{
	public static void main(String [] args) throws IOException{
		Scanner userIn = new Scanner(System.in);
		Scanner fileIn;
		File file;
		String nameOfFile = "";

		System.out.print("Enter the name of the file you would like to see the contents of:");
		nameOfFile = userIn.nextLine();
		file = new File(nameOfFile);
		fileIn = new Scanner(file);

		System.out.println("Here is the contents of the file:");

		while(fileIn.hasNext()){
			System.out.println(fileIn.nextLine());
		}
	}
}
