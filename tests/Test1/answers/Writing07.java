/*
Write a program that prints out the following structure using a nested for loop:
v
vv
vvv
vvvv
*/
public class Writing07{
	public static void main(String [] args){

		for(int i = 0; i < 4; i++){

			for(int j = 0; j <= i; j++){
				System.out.print("v");
			}

			System.out.println("\n");
		}	

	}
}
