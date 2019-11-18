import java.util.Scanner;

public class Writing9{
  public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    String input = s.nextLine();
    String reversed = "";

    System.out.println("Give us a string: ");

    for(int i = input.length() - 1; i >= 0; i--){
      reversed += input.charAt(i);
    }

    System.out.println(reversed);
  }
}
