public class Trace5 {
	public static void main(String [] args){
		String test = "";
		int n = 3;

		if(true && true && true && true && false){
			test += "Do you ";
		} else {
			test += "understand ";
		}

		if(n == 1 + 1 + 1){
			test += "the risks ";
			n--;
		}

		for(int i = 0; i < n; i++){
			test += "you should \n";
		}
		
		System.out.println(test);
	}
}
