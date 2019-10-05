public class UnicodeTable {
	public static void main(String [] args){

		char c = '\u0000';

		for(int i = 0; i <= 65535; i++){	
			System.out.println(c);
			c++;
		}
	}
}
