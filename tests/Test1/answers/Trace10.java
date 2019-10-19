public class Trace10 {
	public static void main (String [] args){
		int number = -17490;

		while(number % 10 == 0){
			number /= 10;
		}

		int length = (int) (Math.log10(Math.abs(number)) + 1);
		int current = number;
		int q, r;
		int answer = 0;

		for(int i = length; i > 0; i--){
			q = current / 10;
			r = current % 10;

			answer += r * Math.pow(10, i - 1);
		
			current = q;
		}

		System.out.println(answer);
	}
}
