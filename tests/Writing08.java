import java.util.Scanner;

public class Writing08{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String answer = "";

		while(!answer.equals("42")){
			System.out.println("What is the meaning of life?");
			answer = s.nextLine();
		}		

	}
}
