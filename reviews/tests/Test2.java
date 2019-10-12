public class Test2{
	public static void main (String [] args){

		final double p = 3;

    double f = Math.pow(4, p);
    double fp = f / p;
    int  q = (int) f / (int) p;
    double r = f % p;

    System.out.println(f);
    System.out.println(fp);
    System.out.println(q);
    System.out.println(r);
	}
}
