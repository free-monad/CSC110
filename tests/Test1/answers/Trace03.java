public class Trace03 {
	public static void main (String [] args){
		int a = 10;
		int b = 20;
		int c = 30;

		if(a > b){
			if(a > c){
				System.out.println(a);
				if(b > c) {
					System.out.println(b);
					System.out.println(c);
				} else{
					System.out.println(c);
					System.out.println(b);
				}
			}else{
				System.out.println(c);
				System.out.println(a);
				System.out.println(b);	
			}
		}else{
			if(b > c){
				System.out.println(b);
				if(a > c){
					System.out.println(a);
					System.out.println(c);
				} else{
					System.out.println(c);
					System.out.println(a);
				}
			} else{
				System.out.println(c);
				System.out.println(b);
				System.out.println(a);
			}
		}
	}
}
