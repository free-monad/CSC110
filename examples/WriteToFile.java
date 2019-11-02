import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String [] args) throws IOException{
        //Scanner keyboard = new Scanner(System.in);
        
        //create file object
        File f = new File("bank-book.csv");
   
        Scanner fileIn;
	fileIn = new Scanner(f);
        int bankTotal = fileIn.nextInt(); //read from file
        System.out.println("Wow! There is " + bankTotal + " dollars in this bank! We're rich");
        
        //manipulate data from file in RAM
        bankTotal += 100;
        bankTotal += 50;
        
        //write the data back to the file
        try{
            PrintWriter x = new PrintWriter(f);
            x.println(bankTotal);
            x.close();
        } catch(IOException e){
            System.out.println("Oh no, something bad happened. Couldn't write to file unexpectedly!");
        } finally{
            //x.close();
        }
        
        System.out.println("File written successfully!");
    }
}
