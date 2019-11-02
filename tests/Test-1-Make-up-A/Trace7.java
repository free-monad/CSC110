public class Trace7{
	public static void main(String [] args){
		String tape = "aabbabaab";
		String output = "";

		for(int i = 0; i < tape.length(); i++){
			char c = tape.charAt(i);

			if(c == 'a'){
				output += 'b';
			}

			if(c == 'b'){
				output += 'a';
			}
		}		

		System.out.println(output);
	}
}
