public class Trace10{
	public static void main(String [] args){

		String one =   "xxxxx";
		String two =   "xxx";
		String res = "";

		for(int i = 0; i < one.length(); i++){
			for(int j = 0; j < two.length(); j++){
				res += "x";
			}
		}

		System.out.println(res.length());
	}
}
