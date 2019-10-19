import java.util.Scanner;

public class Assignment{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);

		String input = "";
		String result = "";
		int inputAsInt;
		char c;

		while(!input.equals("done")){
			System.out.println("Please provide an integer");
			input = s.nextLine().toLowerCase().trim();
		
			if(input.equals("done")){
				break;
			}

			inputAsInt = Integer.parseInt(input);
			
			if(inputAsInt % 2 == 0){
				c = (char) inputAsInt;
				result = result + c;
			}	
		}
		
		System.out.println(result);
	}
}
