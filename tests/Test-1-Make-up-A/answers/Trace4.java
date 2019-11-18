public class Trace4{
	public static void main(String [] args){
		for(int i = 5; i > 1; i--){
			for(int j = 1; j < i; j++){
				System.out.print("\u263A" + "\u263A" + " "); //unicode for smiley face \u263A
			}
				System.out.print("\n");
		}
	}
}
