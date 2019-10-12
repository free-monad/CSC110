public class Test4{
	public static void main(String [] args){
		String abracadabra = "abracadabra";
        String p = "abracadabra";

        while(abracadabra.equals("abracadabra")){
          System.out.println("Waiting...");
          abracadabra = p;
          p += "abracadabra";
        }
        System.out.println("Phew! We made it out!");

	}
}
