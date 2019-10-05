public class UnicodeTable {
	public static void main(String [] args){

		char c = '\u0000';

		for(int i = 0; i <= 65536; i++){	
			System.out.print(i + "\t");
			System.out.println(c);
			c++;
		}
	}
}
