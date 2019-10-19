public class Trace09 {
	public static void main (String [] args){
		String str = "murder";
		char left, right;

		for(int i = 0; i < str.length() / 2; i++){
			left = str.charAt(i);
			right = str.charAt(str.length() - 1 - i);

			str = str.substring(0, i) 
						+ right 
						+ str.substring(i + 1);

			str = str.substring(0, str.length() - 1 -i) 
						+ left 
						+ str.substring(str.length() - i);
		}

		System.out.println(str);
	}
}
