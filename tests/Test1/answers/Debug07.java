public class Debug07{
	public static void main(String [] args){
		String a = "The best time to plant a tree is 20 years ago";
		String b = "The second best time is now.";

		for (int i = 20; i > 0; i--){
			System.out.println(a);
			if(i == 1){
				System.out.println(b);
			}
		}
	}
}

